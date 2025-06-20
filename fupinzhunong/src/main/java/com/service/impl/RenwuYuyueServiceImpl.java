package com.service.impl;

import com.utils.StringUtil;
import com.service.DictionaryService;
import com.utils.ClazzDiff;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import com.dao.RenwuYuyueDao;
import com.entity.RenwuYuyueEntity;
import com.service.RenwuYuyueService;
import com.entity.view.RenwuYuyueView;

/**
 * 任务报名 服务实现类
 */
@Service("renwuYuyueService")
@Transactional
public class RenwuYuyueServiceImpl extends ServiceImpl<RenwuYuyueDao, RenwuYuyueEntity> implements RenwuYuyueService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<RenwuYuyueView> page =new Query<RenwuYuyueView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
