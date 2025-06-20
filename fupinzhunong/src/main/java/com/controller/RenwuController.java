
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 任务信息
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/renwu")
public class RenwuController {
    private static final Logger logger = LoggerFactory.getLogger(RenwuController.class);

    private static final String TABLE_NAME = "renwu";

    @Autowired
    private RenwuService renwuService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private ChatService chatService;//客服聊天
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private ForumService forumService;//论坛
    @Autowired
    private NewsService newsService;//扶贫公告
    @Autowired
    private RenwuYuyueService renwuYuyueService;//任务报名
    @Autowired
    private XinwenService xinwenService;//新闻信息
    @Autowired
    private XinwenCollectionService xinwenCollectionService;//新闻收藏
    @Autowired
    private XinwenLiuyanService xinwenLiuyanService;//新闻留言
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("renwuDeleteStart",1);params.put("renwuDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = renwuService.queryPage(params);

        //字典表数据转换
        List<RenwuView> list =(List<RenwuView>)page.getList();
        for(RenwuView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        RenwuEntity renwu = renwuService.selectById(id);
        if(renwu !=null){
            //entity转view
            RenwuView view = new RenwuView();
            BeanUtils.copyProperties( renwu , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody RenwuEntity renwu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,renwu:{}",this.getClass().getName(),renwu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<RenwuEntity> queryWrapper = new EntityWrapper<RenwuEntity>()
            .eq("renwu_name", renwu.getRenwuName())
            .eq("renwu_zhiwei", renwu.getRenwuZhiwei())
            .eq("renwu_shijian", renwu.getRenwuShijian())
            .eq("renwu_address", renwu.getRenwuAddress())
            .eq("renwu_fuzhenr", renwu.getRenwuFuzhenr())
            .eq("renwu_phone", renwu.getRenwuPhone())
            .eq("renwu_baoming", renwu.getRenwuBaoming())
            .eq("renwu_types", renwu.getRenwuTypes())
            .eq("zhugtai_types", renwu.getZhugtaiTypes())
            .eq("renwu_delete", 1)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        RenwuEntity renwuEntity = renwuService.selectOne(queryWrapper);
        if(renwuEntity==null){
            renwu.setRenwuDelete(1);
            renwu.setInsertTime(new Date());
            renwu.setCreateTime(new Date());
            renwuService.insert(renwu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody RenwuEntity renwu, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,renwu:{}",this.getClass().getName(),renwu.toString());
        RenwuEntity oldRenwuEntity = renwuService.selectById(renwu.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(renwu.getRenwuPhoto()) || "null".equals(renwu.getRenwuPhoto())){
                renwu.setRenwuPhoto(null);
        }

            renwuService.updateById(renwu);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<RenwuEntity> oldRenwuList =renwuService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<RenwuEntity> list = new ArrayList<>();
        for(Integer id:ids){
            RenwuEntity renwuEntity = new RenwuEntity();
            renwuEntity.setId(id);
            renwuEntity.setRenwuDelete(2);
            list.add(renwuEntity);
        }
        if(list != null && list.size() >0){
            renwuService.updateBatchById(list);
        }

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<RenwuEntity> renwuList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            RenwuEntity renwuEntity = new RenwuEntity();
//                            renwuEntity.setRenwuName(data.get(0));                    //任务标题 要改的
//                            renwuEntity.setRenwuPhoto("");//详情和图片
//                            renwuEntity.setRenwuZhiwei(data.get(0));                    //职位 要改的
//                            renwuEntity.setRenwuBaocou(data.get(0));                    //报酬 要改的
//                            renwuEntity.setRenwuShijian(data.get(0));                    //工作时间 要改的
//                            renwuEntity.setRenwuText(data.get(0));                    //任务 要改的
//                            renwuEntity.setRenwuTime(sdf.parse(data.get(0)));          //起止时间 要改的
//                            renwuEntity.setRenwuAddress(data.get(0));                    //工作地点 要改的
//                            renwuEntity.setRenwuFuzhenr(data.get(0));                    //负责人 要改的
//                            renwuEntity.setRenwuPhone(data.get(0));                    //联系方式 要改的
//                            renwuEntity.setRenwuBaoming(data.get(0));                    //报名信息 要改的
//                            renwuEntity.setRenwuTypes(Integer.valueOf(data.get(0)));   //任务类型 要改的
//                            renwuEntity.setJieshuTime(sdf.parse(data.get(0)));          //结束时间 要改的
//                            renwuEntity.setZhugtaiTypes(Integer.valueOf(data.get(0)));   //任务状态 要改的
//                            renwuEntity.setRenwuContent("");//详情和图片
//                            renwuEntity.setRenwuDelete(1);//逻辑删除字段
//                            renwuEntity.setInsertTime(date);//时间
//                            renwuEntity.setCreateTime(date);//时间
                            renwuList.add(renwuEntity);


                            //把要查询是否重复的字段放入map中
                                //联系方式
                                if(seachFields.containsKey("renwuPhone")){
                                    List<String> renwuPhone = seachFields.get("renwuPhone");
                                    renwuPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> renwuPhone = new ArrayList<>();
                                    renwuPhone.add(data.get(0));//要改的
                                    seachFields.put("renwuPhone",renwuPhone);
                                }
                        }

                        //查询是否重复
                         //联系方式
                        List<RenwuEntity> renwuEntities_renwuPhone = renwuService.selectList(new EntityWrapper<RenwuEntity>().in("renwu_phone", seachFields.get("renwuPhone")).eq("renwu_delete", 1));
                        if(renwuEntities_renwuPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(RenwuEntity s:renwuEntities_renwuPhone){
                                repeatFields.add(s.getRenwuPhone());
                            }
                            return R.error(511,"数据库的该表中的 [联系方式] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        renwuService.insertBatch(renwuList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = renwuService.queryPage(params);

        //字典表数据转换
        List<RenwuView> list =(List<RenwuView>)page.getList();
        for(RenwuView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        RenwuEntity renwu = renwuService.selectById(id);
            if(renwu !=null){


                //entity转view
                RenwuView view = new RenwuView();
                BeanUtils.copyProperties( renwu , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody RenwuEntity renwu, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,renwu:{}",this.getClass().getName(),renwu.toString());
        Wrapper<RenwuEntity> queryWrapper = new EntityWrapper<RenwuEntity>()
            .eq("renwu_name", renwu.getRenwuName())
            .eq("renwu_zhiwei", renwu.getRenwuZhiwei())
            .eq("renwu_shijian", renwu.getRenwuShijian())
            .eq("renwu_text", renwu.getRenwuText())
            .eq("renwu_address", renwu.getRenwuAddress())
            .eq("renwu_fuzhenr", renwu.getRenwuFuzhenr())
            .eq("renwu_phone", renwu.getRenwuPhone())
            .eq("renwu_baoming", renwu.getRenwuBaoming())
            .eq("renwu_types", renwu.getRenwuTypes())
            .eq("zhugtai_types", renwu.getZhugtaiTypes())
            .eq("renwu_delete", renwu.getRenwuDelete())
//            .notIn("renwu_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        RenwuEntity renwuEntity = renwuService.selectOne(queryWrapper);
        if(renwuEntity==null){
            renwu.setRenwuDelete(1);
            renwu.setInsertTime(new Date());
            renwu.setCreateTime(new Date());
        renwuService.insert(renwu);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

