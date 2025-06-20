package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 任务信息
 *
 * @author 
 * @email
 */
@TableName("renwu")
public class RenwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public RenwuEntity() {

	}

	public RenwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 任务标题
     */
    @ColumnInfo(comment="任务标题",type="varchar(200)")
    @TableField(value = "renwu_name")

    private String renwuName;


    /**
     * 任务介绍图
     */
    @ColumnInfo(comment="任务介绍图",type="varchar(200)")
    @TableField(value = "renwu_photo")

    private String renwuPhoto;


    /**
     * 职位
     */
    @ColumnInfo(comment="职位",type="varchar(200)")
    @TableField(value = "renwu_zhiwei")

    private String renwuZhiwei;


    /**
     * 报酬
     */
    @ColumnInfo(comment="报酬",type="decimal(10,2)")
    @TableField(value = "renwu_baocou")

    private Double renwuBaocou;


    /**
     * 工作时间
     */
    @ColumnInfo(comment="工作时间",type="varchar(200)")
    @TableField(value = "renwu_shijian")

    private String renwuShijian;


    /**
     * 任务
     */
    @ColumnInfo(comment="任务",type="longtext")
    @TableField(value = "renwu_text")

    private String renwuText;


    /**
     * 起止时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="起止时间",type="timestamp")
    @TableField(value = "renwu_time")

    private Date renwuTime;


    /**
     * 工作地点
     */
    @ColumnInfo(comment="工作地点",type="varchar(200)")
    @TableField(value = "renwu_address")

    private String renwuAddress;


    /**
     * 负责人
     */
    @ColumnInfo(comment="负责人",type="varchar(200)")
    @TableField(value = "renwu_fuzhenr")

    private String renwuFuzhenr;


    /**
     * 联系方式
     */
    @ColumnInfo(comment="联系方式",type="varchar(200)")
    @TableField(value = "renwu_phone")

    private String renwuPhone;


    /**
     * 报名信息
     */
    @ColumnInfo(comment="报名信息",type="varchar(200)")
    @TableField(value = "renwu_baoming")

    private String renwuBaoming;


    /**
     * 任务类型
     */
    @ColumnInfo(comment="任务类型",type="int(11)")
    @TableField(value = "renwu_types")

    private Integer renwuTypes;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="结束时间",type="timestamp")
    @TableField(value = "jieshu_time")

    private Date jieshuTime;


    /**
     * 任务状态
     */
    @ColumnInfo(comment="任务状态",type="int(11)")
    @TableField(value = "zhugtai_types")

    private Integer zhugtaiTypes;


    /**
     * 任务介绍
     */
    @ColumnInfo(comment="任务介绍",type="longtext")
    @TableField(value = "renwu_content")

    private String renwuContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "renwu_delete")

    private Integer renwuDelete;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="发布日期",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间     homeMain
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间     homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间     homeMain
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Renwu{" +
            ", id=" + id +
            ", renwuName=" + renwuName +
            ", renwuPhoto=" + renwuPhoto +
            ", renwuZhiwei=" + renwuZhiwei +
            ", renwuBaocou=" + renwuBaocou +
            ", renwuShijian=" + renwuShijian +
            ", renwuText=" + renwuText +
            ", renwuTime=" + DateUtil.convertString(renwuTime,"yyyy-MM-dd") +
            ", renwuAddress=" + renwuAddress +
            ", renwuFuzhenr=" + renwuFuzhenr +
            ", renwuPhone=" + renwuPhone +
            ", renwuBaoming=" + renwuBaoming +
            ", renwuTypes=" + renwuTypes +
            ", jieshuTime=" + DateUtil.convertString(jieshuTime,"yyyy-MM-dd") +
            ", zhugtaiTypes=" + zhugtaiTypes +
            ", renwuContent=" + renwuContent +
            ", renwuDelete=" + renwuDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
