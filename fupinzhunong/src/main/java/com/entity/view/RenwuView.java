package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.RenwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 任务信息
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("renwu")
public class RenwuView extends RenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 任务类型的值
	*/
	@ColumnInfo(comment="任务类型的字典表值",type="varchar(200)")
	private String renwuValue;
	/**
	* 任务状态的值
	*/
	@ColumnInfo(comment="任务状态的字典表值",type="varchar(200)")
	private String zhugtaiValue;




	public RenwuView() {

	}

	public RenwuView(RenwuEntity renwuEntity) {
		try {
			BeanUtils.copyProperties(this, renwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 任务类型的值
	*/
	public String getRenwuValue() {
		return renwuValue;
	}
	/**
	* 设置： 任务类型的值
	*/
	public void setRenwuValue(String renwuValue) {
		this.renwuValue = renwuValue;
	}
	//当前表的
	/**
	* 获取： 任务状态的值
	*/
	public String getZhugtaiValue() {
		return zhugtaiValue;
	}
	/**
	* 设置： 任务状态的值
	*/
	public void setZhugtaiValue(String zhugtaiValue) {
		this.zhugtaiValue = zhugtaiValue;
	}




	@Override
	public String toString() {
		return "RenwuView{" +
			", renwuValue=" + renwuValue +
			", zhugtaiValue=" + zhugtaiValue +
			"} " + super.toString();
	}
}
