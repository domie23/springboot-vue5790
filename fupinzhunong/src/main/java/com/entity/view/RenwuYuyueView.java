package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.RenwuYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 任务报名
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("renwu_yuyue")
public class RenwuYuyueView extends RenwuYuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 审核状态的值
	*/
	@ColumnInfo(comment="审核状态的字典表值",type="varchar(200)")
	private String renwuYuyueYesnoValue;

	//级联表 任务信息
		/**
		* 任务标题
		*/

		@ColumnInfo(comment="任务标题",type="varchar(200)")
		private String renwuName;
		/**
		* 任务介绍图
		*/

		@ColumnInfo(comment="任务介绍图",type="varchar(200)")
		private String renwuPhoto;
		/**
		* 职位
		*/

		@ColumnInfo(comment="职位",type="varchar(200)")
		private String renwuZhiwei;
		/**
		* 报酬
		*/
		@ColumnInfo(comment="报酬",type="decimal(10,2)")
		private Double renwuBaocou;
		/**
		* 工作时间
		*/

		@ColumnInfo(comment="工作时间",type="varchar(200)")
		private String renwuShijian;
		/**
		* 任务
		*/

		@ColumnInfo(comment="任务",type="longtext")
		private String renwuText;
		/**
		* 起止时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="起止时间",type="timestamp")
		private Date renwuTime;
		/**
		* 工作地点
		*/

		@ColumnInfo(comment="工作地点",type="varchar(200)")
		private String renwuAddress;
		/**
		* 负责人
		*/

		@ColumnInfo(comment="负责人",type="varchar(200)")
		private String renwuFuzhenr;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String renwuPhone;
		/**
		* 报名信息
		*/

		@ColumnInfo(comment="报名信息",type="varchar(200)")
		private String renwuBaoming;
		/**
		* 任务类型
		*/
		@ColumnInfo(comment="任务类型",type="int(11)")
		private Integer renwuTypes;
			/**
			* 任务类型的值
			*/
			@ColumnInfo(comment="任务类型的字典表值",type="varchar(200)")
			private String renwuValue;
		/**
		* 结束时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="结束时间",type="timestamp")
		private Date jieshuTime;
		/**
		* 任务状态
		*/
		@ColumnInfo(comment="任务状态",type="int(11)")
		private Integer zhugtaiTypes;
			/**
			* 任务状态的值
			*/
			@ColumnInfo(comment="任务状态的字典表值",type="varchar(200)")
			private String zhugtaiValue;
		/**
		* 任务介绍
		*/

		@ColumnInfo(comment="任务介绍",type="longtext")
		private String renwuContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer renwuDelete;
	//级联表 用户
		/**
		* 用户名称
		*/

		@ColumnInfo(comment="用户名称",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 年龄
		*/

		@ColumnInfo(comment="年龄",type="int(11)")
		private Integer yonghuAge;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer yonghuDelete;



	public RenwuYuyueView() {

	}

	public RenwuYuyueView(RenwuYuyueEntity renwuYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, renwuYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 审核状态的值
	*/
	public String getRenwuYuyueYesnoValue() {
		return renwuYuyueYesnoValue;
	}
	/**
	* 设置： 审核状态的值
	*/
	public void setRenwuYuyueYesnoValue(String renwuYuyueYesnoValue) {
		this.renwuYuyueYesnoValue = renwuYuyueYesnoValue;
	}


	//级联表的get和set 任务信息

		/**
		* 获取： 任务标题
		*/
		public String getRenwuName() {
			return renwuName;
		}
		/**
		* 设置： 任务标题
		*/
		public void setRenwuName(String renwuName) {
			this.renwuName = renwuName;
		}

		/**
		* 获取： 任务介绍图
		*/
		public String getRenwuPhoto() {
			return renwuPhoto;
		}
		/**
		* 设置： 任务介绍图
		*/
		public void setRenwuPhoto(String renwuPhoto) {
			this.renwuPhoto = renwuPhoto;
		}

		/**
		* 获取： 职位
		*/
		public String getRenwuZhiwei() {
			return renwuZhiwei;
		}
		/**
		* 设置： 职位
		*/
		public void setRenwuZhiwei(String renwuZhiwei) {
			this.renwuZhiwei = renwuZhiwei;
		}

		/**
		* 获取： 报酬
		*/
		public Double getRenwuBaocou() {
			return renwuBaocou;
		}
		/**
		* 设置： 报酬
		*/
		public void setRenwuBaocou(Double renwuBaocou) {
			this.renwuBaocou = renwuBaocou;
		}

		/**
		* 获取： 工作时间
		*/
		public String getRenwuShijian() {
			return renwuShijian;
		}
		/**
		* 设置： 工作时间
		*/
		public void setRenwuShijian(String renwuShijian) {
			this.renwuShijian = renwuShijian;
		}

		/**
		* 获取： 任务
		*/
		public String getRenwuText() {
			return renwuText;
		}
		/**
		* 设置： 任务
		*/
		public void setRenwuText(String renwuText) {
			this.renwuText = renwuText;
		}

		/**
		* 获取： 起止时间
		*/
		public Date getRenwuTime() {
			return renwuTime;
		}
		/**
		* 设置： 起止时间
		*/
		public void setRenwuTime(Date renwuTime) {
			this.renwuTime = renwuTime;
		}

		/**
		* 获取： 工作地点
		*/
		public String getRenwuAddress() {
			return renwuAddress;
		}
		/**
		* 设置： 工作地点
		*/
		public void setRenwuAddress(String renwuAddress) {
			this.renwuAddress = renwuAddress;
		}

		/**
		* 获取： 负责人
		*/
		public String getRenwuFuzhenr() {
			return renwuFuzhenr;
		}
		/**
		* 设置： 负责人
		*/
		public void setRenwuFuzhenr(String renwuFuzhenr) {
			this.renwuFuzhenr = renwuFuzhenr;
		}

		/**
		* 获取： 联系方式
		*/
		public String getRenwuPhone() {
			return renwuPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setRenwuPhone(String renwuPhone) {
			this.renwuPhone = renwuPhone;
		}

		/**
		* 获取： 报名信息
		*/
		public String getRenwuBaoming() {
			return renwuBaoming;
		}
		/**
		* 设置： 报名信息
		*/
		public void setRenwuBaoming(String renwuBaoming) {
			this.renwuBaoming = renwuBaoming;
		}
		/**
		* 获取： 任务类型
		*/
		public Integer getRenwuTypes() {
			return renwuTypes;
		}
		/**
		* 设置： 任务类型
		*/
		public void setRenwuTypes(Integer renwuTypes) {
			this.renwuTypes = renwuTypes;
		}


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

		/**
		* 获取： 结束时间
		*/
		public Date getJieshuTime() {
			return jieshuTime;
		}
		/**
		* 设置： 结束时间
		*/
		public void setJieshuTime(Date jieshuTime) {
			this.jieshuTime = jieshuTime;
		}
		/**
		* 获取： 任务状态
		*/
		public Integer getZhugtaiTypes() {
			return zhugtaiTypes;
		}
		/**
		* 设置： 任务状态
		*/
		public void setZhugtaiTypes(Integer zhugtaiTypes) {
			this.zhugtaiTypes = zhugtaiTypes;
		}


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

		/**
		* 获取： 任务介绍
		*/
		public String getRenwuContent() {
			return renwuContent;
		}
		/**
		* 设置： 任务介绍
		*/
		public void setRenwuContent(String renwuContent) {
			this.renwuContent = renwuContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getRenwuDelete() {
			return renwuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setRenwuDelete(Integer renwuDelete) {
			this.renwuDelete = renwuDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户名称
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户名称
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 年龄
		*/
		public Integer getYonghuAge() {
			return yonghuAge;
		}
		/**
		* 设置： 年龄
		*/
		public void setYonghuAge(Integer yonghuAge) {
			this.yonghuAge = yonghuAge;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}


	@Override
	public String toString() {
		return "RenwuYuyueView{" +
			", renwuYuyueYesnoValue=" + renwuYuyueYesnoValue +
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
			", jieshuTime=" + DateUtil.convertString(jieshuTime,"yyyy-MM-dd") +
			", renwuContent=" + renwuContent +
			", renwuDelete=" + renwuDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuAge=" + yonghuAge +
			", yonghuEmail=" + yonghuEmail +
			", yonghuDelete=" + yonghuDelete +
			"} " + super.toString();
	}
}
