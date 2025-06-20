package com.entity.model;

import com.entity.RenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 任务信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class RenwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 任务标题
     */
    private String renwuName;


    /**
     * 任务介绍图
     */
    private String renwuPhoto;


    /**
     * 职位
     */
    private String renwuZhiwei;


    /**
     * 报酬
     */
    private Double renwuBaocou;


    /**
     * 工作时间
     */
    private String renwuShijian;


    /**
     * 任务
     */
    private String renwuText;


    /**
     * 起止时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date renwuTime;


    /**
     * 工作地点
     */
    private String renwuAddress;


    /**
     * 负责人
     */
    private String renwuFuzhenr;


    /**
     * 联系方式
     */
    private String renwuPhone;


    /**
     * 报名信息
     */
    private String renwuBaoming;


    /**
     * 任务类型
     */
    private Integer renwuTypes;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jieshuTime;


    /**
     * 任务状态
     */
    private Integer zhugtaiTypes;


    /**
     * 任务介绍
     */
    private String renwuContent;


    /**
     * 逻辑删除
     */
    private Integer renwuDelete;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow homeMain
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：任务标题
	 */
    public String getRenwuName() {
        return renwuName;
    }


    /**
	 * 设置：任务标题
	 */
    public void setRenwuName(String renwuName) {
        this.renwuName = renwuName;
    }
    /**
	 * 获取：任务介绍图
	 */
    public String getRenwuPhoto() {
        return renwuPhoto;
    }


    /**
	 * 设置：任务介绍图
	 */
    public void setRenwuPhoto(String renwuPhoto) {
        this.renwuPhoto = renwuPhoto;
    }
    /**
	 * 获取：职位
	 */
    public String getRenwuZhiwei() {
        return renwuZhiwei;
    }


    /**
	 * 设置：职位
	 */
    public void setRenwuZhiwei(String renwuZhiwei) {
        this.renwuZhiwei = renwuZhiwei;
    }
    /**
	 * 获取：报酬
	 */
    public Double getRenwuBaocou() {
        return renwuBaocou;
    }


    /**
	 * 设置：报酬
	 */
    public void setRenwuBaocou(Double renwuBaocou) {
        this.renwuBaocou = renwuBaocou;
    }
    /**
	 * 获取：工作时间
	 */
    public String getRenwuShijian() {
        return renwuShijian;
    }


    /**
	 * 设置：工作时间
	 */
    public void setRenwuShijian(String renwuShijian) {
        this.renwuShijian = renwuShijian;
    }
    /**
	 * 获取：任务
	 */
    public String getRenwuText() {
        return renwuText;
    }


    /**
	 * 设置：任务
	 */
    public void setRenwuText(String renwuText) {
        this.renwuText = renwuText;
    }
    /**
	 * 获取：起止时间
	 */
    public Date getRenwuTime() {
        return renwuTime;
    }


    /**
	 * 设置：起止时间
	 */
    public void setRenwuTime(Date renwuTime) {
        this.renwuTime = renwuTime;
    }
    /**
	 * 获取：工作地点
	 */
    public String getRenwuAddress() {
        return renwuAddress;
    }


    /**
	 * 设置：工作地点
	 */
    public void setRenwuAddress(String renwuAddress) {
        this.renwuAddress = renwuAddress;
    }
    /**
	 * 获取：负责人
	 */
    public String getRenwuFuzhenr() {
        return renwuFuzhenr;
    }


    /**
	 * 设置：负责人
	 */
    public void setRenwuFuzhenr(String renwuFuzhenr) {
        this.renwuFuzhenr = renwuFuzhenr;
    }
    /**
	 * 获取：联系方式
	 */
    public String getRenwuPhone() {
        return renwuPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setRenwuPhone(String renwuPhone) {
        this.renwuPhone = renwuPhone;
    }
    /**
	 * 获取：报名信息
	 */
    public String getRenwuBaoming() {
        return renwuBaoming;
    }


    /**
	 * 设置：报名信息
	 */
    public void setRenwuBaoming(String renwuBaoming) {
        this.renwuBaoming = renwuBaoming;
    }
    /**
	 * 获取：任务类型
	 */
    public Integer getRenwuTypes() {
        return renwuTypes;
    }


    /**
	 * 设置：任务类型
	 */
    public void setRenwuTypes(Integer renwuTypes) {
        this.renwuTypes = renwuTypes;
    }
    /**
	 * 获取：结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }


    /**
	 * 设置：结束时间
	 */
    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 获取：任务状态
	 */
    public Integer getZhugtaiTypes() {
        return zhugtaiTypes;
    }


    /**
	 * 设置：任务状态
	 */
    public void setZhugtaiTypes(Integer zhugtaiTypes) {
        this.zhugtaiTypes = zhugtaiTypes;
    }
    /**
	 * 获取：任务介绍
	 */
    public String getRenwuContent() {
        return renwuContent;
    }


    /**
	 * 设置：任务介绍
	 */
    public void setRenwuContent(String renwuContent) {
        this.renwuContent = renwuContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getRenwuDelete() {
        return renwuDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setRenwuDelete(Integer renwuDelete) {
        this.renwuDelete = renwuDelete;
    }
    /**
	 * 获取：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布日期
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow homeMain
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
