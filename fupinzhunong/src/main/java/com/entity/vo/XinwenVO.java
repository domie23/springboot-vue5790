package com.entity.vo;

import com.entity.XinwenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 新闻信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinwen")
public class XinwenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 新闻标题
     */

    @TableField(value = "xinwen_name")
    private String xinwenName;


    /**
     * 新闻封面
     */

    @TableField(value = "xinwen_photo")
    private String xinwenPhoto;


    /**
     * 视频
     */

    @TableField(value = "xinwen_video")
    private String xinwenVideo;


    /**
     * 新闻类型
     */

    @TableField(value = "xinwen_types")
    private Integer xinwenTypes;


    /**
     * 新闻热度
     */

    @TableField(value = "xinwen_clicknum")
    private Integer xinwenClicknum;


    /**
     * 新闻介绍
     */

    @TableField(value = "xinwen_content")
    private String xinwenContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "xinwen_delete")
    private Integer xinwenDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：新闻标题
	 */
    public String getXinwenName() {
        return xinwenName;
    }


    /**
	 * 获取：新闻标题
	 */

    public void setXinwenName(String xinwenName) {
        this.xinwenName = xinwenName;
    }
    /**
	 * 设置：新闻封面
	 */
    public String getXinwenPhoto() {
        return xinwenPhoto;
    }


    /**
	 * 获取：新闻封面
	 */

    public void setXinwenPhoto(String xinwenPhoto) {
        this.xinwenPhoto = xinwenPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getXinwenVideo() {
        return xinwenVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setXinwenVideo(String xinwenVideo) {
        this.xinwenVideo = xinwenVideo;
    }
    /**
	 * 设置：新闻类型
	 */
    public Integer getXinwenTypes() {
        return xinwenTypes;
    }


    /**
	 * 获取：新闻类型
	 */

    public void setXinwenTypes(Integer xinwenTypes) {
        this.xinwenTypes = xinwenTypes;
    }
    /**
	 * 设置：新闻热度
	 */
    public Integer getXinwenClicknum() {
        return xinwenClicknum;
    }


    /**
	 * 获取：新闻热度
	 */

    public void setXinwenClicknum(Integer xinwenClicknum) {
        this.xinwenClicknum = xinwenClicknum;
    }
    /**
	 * 设置：新闻介绍
	 */
    public String getXinwenContent() {
        return xinwenContent;
    }


    /**
	 * 获取：新闻介绍
	 */

    public void setXinwenContent(String xinwenContent) {
        this.xinwenContent = xinwenContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getXinwenDelete() {
        return xinwenDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setXinwenDelete(Integer xinwenDelete) {
        this.xinwenDelete = xinwenDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
