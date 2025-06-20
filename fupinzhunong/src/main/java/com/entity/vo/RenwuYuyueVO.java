package com.entity.vo;

import com.entity.RenwuYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 任务报名
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("renwu_yuyue")
public class RenwuYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 任务
     */

    @TableField(value = "renwu_id")
    private Integer renwuId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 审核状态
     */

    @TableField(value = "renwu_yuyue_yesno_types")
    private Integer renwuYuyueYesnoTypes;


    /**
     * 审核回复
     */

    @TableField(value = "renwu_yuyue_yesno_text")
    private String renwuYuyueYesnoText;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：任务
	 */
    public Integer getRenwuId() {
        return renwuId;
    }


    /**
	 * 获取：任务
	 */

    public void setRenwuId(Integer renwuId) {
        this.renwuId = renwuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getRenwuYuyueYesnoTypes() {
        return renwuYuyueYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setRenwuYuyueYesnoTypes(Integer renwuYuyueYesnoTypes) {
        this.renwuYuyueYesnoTypes = renwuYuyueYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getRenwuYuyueYesnoText() {
        return renwuYuyueYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setRenwuYuyueYesnoText(String renwuYuyueYesnoText) {
        this.renwuYuyueYesnoText = renwuYuyueYesnoText;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
