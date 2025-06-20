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
 * 新闻信息
 *
 * @author 
 * @email
 */
@TableName("xinwen")
public class XinwenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinwenEntity() {

	}

	public XinwenEntity(T t) {
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
     * 新闻标题
     */
    @ColumnInfo(comment="新闻标题",type="varchar(200)")
    @TableField(value = "xinwen_name")

    private String xinwenName;


    /**
     * 新闻封面
     */
    @ColumnInfo(comment="新闻封面",type="varchar(200)")
    @TableField(value = "xinwen_photo")

    private String xinwenPhoto;


    /**
     * 视频
     */
    @ColumnInfo(comment="视频",type="varchar(200)")
    @TableField(value = "xinwen_video")

    private String xinwenVideo;


    /**
     * 新闻类型
     */
    @ColumnInfo(comment="新闻类型",type="int(11)")
    @TableField(value = "xinwen_types")

    private Integer xinwenTypes;


    /**
     * 新闻热度
     */
    @ColumnInfo(comment="新闻热度",type="int(11)")
    @TableField(value = "xinwen_clicknum")

    private Integer xinwenClicknum;


    /**
     * 新闻介绍
     */
    @ColumnInfo(comment="新闻介绍",type="longtext")
    @TableField(value = "xinwen_content")

    private String xinwenContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "xinwen_delete")

    private Integer xinwenDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：新闻标题
	 */
    public String getXinwenName() {
        return xinwenName;
    }
    /**
	 * 设置：新闻标题
	 */

    public void setXinwenName(String xinwenName) {
        this.xinwenName = xinwenName;
    }
    /**
	 * 获取：新闻封面
	 */
    public String getXinwenPhoto() {
        return xinwenPhoto;
    }
    /**
	 * 设置：新闻封面
	 */

    public void setXinwenPhoto(String xinwenPhoto) {
        this.xinwenPhoto = xinwenPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getXinwenVideo() {
        return xinwenVideo;
    }
    /**
	 * 设置：视频
	 */

    public void setXinwenVideo(String xinwenVideo) {
        this.xinwenVideo = xinwenVideo;
    }
    /**
	 * 获取：新闻类型
	 */
    public Integer getXinwenTypes() {
        return xinwenTypes;
    }
    /**
	 * 设置：新闻类型
	 */

    public void setXinwenTypes(Integer xinwenTypes) {
        this.xinwenTypes = xinwenTypes;
    }
    /**
	 * 获取：新闻热度
	 */
    public Integer getXinwenClicknum() {
        return xinwenClicknum;
    }
    /**
	 * 设置：新闻热度
	 */

    public void setXinwenClicknum(Integer xinwenClicknum) {
        this.xinwenClicknum = xinwenClicknum;
    }
    /**
	 * 获取：新闻介绍
	 */
    public String getXinwenContent() {
        return xinwenContent;
    }
    /**
	 * 设置：新闻介绍
	 */

    public void setXinwenContent(String xinwenContent) {
        this.xinwenContent = xinwenContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXinwenDelete() {
        return xinwenDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setXinwenDelete(Integer xinwenDelete) {
        this.xinwenDelete = xinwenDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xinwen{" +
            ", id=" + id +
            ", xinwenName=" + xinwenName +
            ", xinwenPhoto=" + xinwenPhoto +
            ", xinwenVideo=" + xinwenVideo +
            ", xinwenTypes=" + xinwenTypes +
            ", xinwenClicknum=" + xinwenClicknum +
            ", xinwenContent=" + xinwenContent +
            ", xinwenDelete=" + xinwenDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
