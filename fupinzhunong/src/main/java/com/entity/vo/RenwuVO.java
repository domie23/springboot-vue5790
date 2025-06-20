package com.entity.vo;

import com.entity.RenwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 任务信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("renwu")
public class RenwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 任务标题
     */

    @TableField(value = "renwu_name")
    private String renwuName;


    /**
     * 任务介绍图
     */

    @TableField(value = "renwu_photo")
    private String renwuPhoto;


    /**
     * 职位
     */

    @TableField(value = "renwu_zhiwei")
    private String renwuZhiwei;


    /**
     * 报酬
     */

    @TableField(value = "renwu_baocou")
    private Double renwuBaocou;


    /**
     * 工作时间
     */

    @TableField(value = "renwu_shijian")
    private String renwuShijian;


    /**
     * 任务
     */

    @TableField(value = "renwu_text")
    private String renwuText;


    /**
     * 起止时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "renwu_time")
    private Date renwuTime;


    /**
     * 工作地点
     */

    @TableField(value = "renwu_address")
    private String renwuAddress;


    /**
     * 负责人
     */

    @TableField(value = "renwu_fuzhenr")
    private String renwuFuzhenr;


    /**
     * 联系方式
     */

    @TableField(value = "renwu_phone")
    private String renwuPhone;


    /**
     * 报名信息
     */

    @TableField(value = "renwu_baoming")
    private String renwuBaoming;


    /**
     * 任务类型
     */

    @TableField(value = "renwu_types")
    private Integer renwuTypes;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jieshu_time")
    private Date jieshuTime;


    /**
     * 任务状态
     */

    @TableField(value = "zhugtai_types")
    private Integer zhugtaiTypes;


    /**
     * 任务介绍
     */

    @TableField(value = "renwu_content")
    private String renwuContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "renwu_delete")
    private Integer renwuDelete;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow homeMain
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：任务标题
	 */
    public String getRenwuName() {
        return renwuName;
    }


    /**
	 * 获取：任务标题
	 */

    public void setRenwuName(String renwuName) {
        this.renwuName = renwuName;
    }
    /**
	 * 设置：任务介绍图
	 */
    public String getRenwuPhoto() {
        return renwuPhoto;
    }


    /**
	 * 获取：任务介绍图
	 */

    public void setRenwuPhoto(String renwuPhoto) {
        this.renwuPhoto = renwuPhoto;
    }
    /**
	 * 设置：职位
	 */
    public String getRenwuZhiwei() {
        return renwuZhiwei;
    }


    /**
	 * 获取：职位
	 */

    public void setRenwuZhiwei(String renwuZhiwei) {
        this.renwuZhiwei = renwuZhiwei;
    }
    /**
	 * 设置：报酬
	 */
    public Double getRenwuBaocou() {
        return renwuBaocou;
    }


    /**
	 * 获取：报酬
	 */

    public void setRenwuBaocou(Double renwuBaocou) {
        this.renwuBaocou = renwuBaocou;
    }
    /**
	 * 设置：工作时间
	 */
    public String getRenwuShijian() {
        return renwuShijian;
    }


    /**
	 * 获取：工作时间
	 */

    public void setRenwuShijian(String renwuShijian) {
        this.renwuShijian = renwuShijian;
    }
    /**
	 * 设置：任务
	 */
    public String getRenwuText() {
        return renwuText;
    }


    /**
	 * 获取：任务
	 */

    public void setRenwuText(String renwuText) {
        this.renwuText = renwuText;
    }
    /**
	 * 设置：起止时间
	 */
    public Date getRenwuTime() {
        return renwuTime;
    }


    /**
	 * 获取：起止时间
	 */

    public void setRenwuTime(Date renwuTime) {
        this.renwuTime = renwuTime;
    }
    /**
	 * 设置：工作地点
	 */
    public String getRenwuAddress() {
        return renwuAddress;
    }


    /**
	 * 获取：工作地点
	 */

    public void setRenwuAddress(String renwuAddress) {
        this.renwuAddress = renwuAddress;
    }
    /**
	 * 设置：负责人
	 */
    public String getRenwuFuzhenr() {
        return renwuFuzhenr;
    }


    /**
	 * 获取：负责人
	 */

    public void setRenwuFuzhenr(String renwuFuzhenr) {
        this.renwuFuzhenr = renwuFuzhenr;
    }
    /**
	 * 设置：联系方式
	 */
    public String getRenwuPhone() {
        return renwuPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setRenwuPhone(String renwuPhone) {
        this.renwuPhone = renwuPhone;
    }
    /**
	 * 设置：报名信息
	 */
    public String getRenwuBaoming() {
        return renwuBaoming;
    }


    /**
	 * 获取：报名信息
	 */

    public void setRenwuBaoming(String renwuBaoming) {
        this.renwuBaoming = renwuBaoming;
    }
    /**
	 * 设置：任务类型
	 */
    public Integer getRenwuTypes() {
        return renwuTypes;
    }


    /**
	 * 获取：任务类型
	 */

    public void setRenwuTypes(Integer renwuTypes) {
        this.renwuTypes = renwuTypes;
    }
    /**
	 * 设置：结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }


    /**
	 * 获取：结束时间
	 */

    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 设置：任务状态
	 */
    public Integer getZhugtaiTypes() {
        return zhugtaiTypes;
    }


    /**
	 * 获取：任务状态
	 */

    public void setZhugtaiTypes(Integer zhugtaiTypes) {
        this.zhugtaiTypes = zhugtaiTypes;
    }
    /**
	 * 设置：任务介绍
	 */
    public String getRenwuContent() {
        return renwuContent;
    }


    /**
	 * 获取：任务介绍
	 */

    public void setRenwuContent(String renwuContent) {
        this.renwuContent = renwuContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getRenwuDelete() {
        return renwuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setRenwuDelete(Integer renwuDelete) {
        this.renwuDelete = renwuDelete;
    }
    /**
	 * 设置：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布日期
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow homeMain
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
