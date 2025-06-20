package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XinwenCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 新闻收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xinwen_collection")
public class XinwenCollectionView extends XinwenCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String xinwenCollectionValue;

	//级联表 新闻信息
		/**
		* 新闻标题
		*/

		@ColumnInfo(comment="新闻标题",type="varchar(200)")
		private String xinwenName;
		/**
		* 新闻封面
		*/

		@ColumnInfo(comment="新闻封面",type="varchar(200)")
		private String xinwenPhoto;
		/**
		* 视频
		*/

		@ColumnInfo(comment="视频",type="varchar(200)")
		private String xinwenVideo;
		/**
		* 新闻类型
		*/
		@ColumnInfo(comment="新闻类型",type="int(11)")
		private Integer xinwenTypes;
			/**
			* 新闻类型的值
			*/
			@ColumnInfo(comment="新闻类型的字典表值",type="varchar(200)")
			private String xinwenValue;
		/**
		* 新闻热度
		*/

		@ColumnInfo(comment="新闻热度",type="int(11)")
		private Integer xinwenClicknum;
		/**
		* 新闻介绍
		*/

		@ColumnInfo(comment="新闻介绍",type="longtext")
		private String xinwenContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer xinwenDelete;
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



	public XinwenCollectionView() {

	}

	public XinwenCollectionView(XinwenCollectionEntity xinwenCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, xinwenCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getXinwenCollectionValue() {
		return xinwenCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setXinwenCollectionValue(String xinwenCollectionValue) {
		this.xinwenCollectionValue = xinwenCollectionValue;
	}


	//级联表的get和set 新闻信息

		/**
		* 获取： 新闻标题
		*/
		public String getXinwenName() {
			return xinwenName;
		}
		/**
		* 设置： 新闻标题
		*/
		public void setXinwenName(String xinwenName) {
			this.xinwenName = xinwenName;
		}

		/**
		* 获取： 新闻封面
		*/
		public String getXinwenPhoto() {
			return xinwenPhoto;
		}
		/**
		* 设置： 新闻封面
		*/
		public void setXinwenPhoto(String xinwenPhoto) {
			this.xinwenPhoto = xinwenPhoto;
		}

		/**
		* 获取： 视频
		*/
		public String getXinwenVideo() {
			return xinwenVideo;
		}
		/**
		* 设置： 视频
		*/
		public void setXinwenVideo(String xinwenVideo) {
			this.xinwenVideo = xinwenVideo;
		}
		/**
		* 获取： 新闻类型
		*/
		public Integer getXinwenTypes() {
			return xinwenTypes;
		}
		/**
		* 设置： 新闻类型
		*/
		public void setXinwenTypes(Integer xinwenTypes) {
			this.xinwenTypes = xinwenTypes;
		}


			/**
			* 获取： 新闻类型的值
			*/
			public String getXinwenValue() {
				return xinwenValue;
			}
			/**
			* 设置： 新闻类型的值
			*/
			public void setXinwenValue(String xinwenValue) {
				this.xinwenValue = xinwenValue;
			}

		/**
		* 获取： 新闻热度
		*/
		public Integer getXinwenClicknum() {
			return xinwenClicknum;
		}
		/**
		* 设置： 新闻热度
		*/
		public void setXinwenClicknum(Integer xinwenClicknum) {
			this.xinwenClicknum = xinwenClicknum;
		}

		/**
		* 获取： 新闻介绍
		*/
		public String getXinwenContent() {
			return xinwenContent;
		}
		/**
		* 设置： 新闻介绍
		*/
		public void setXinwenContent(String xinwenContent) {
			this.xinwenContent = xinwenContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getXinwenDelete() {
			return xinwenDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setXinwenDelete(Integer xinwenDelete) {
			this.xinwenDelete = xinwenDelete;
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
		return "XinwenCollectionView{" +
			", xinwenCollectionValue=" + xinwenCollectionValue +
			", xinwenName=" + xinwenName +
			", xinwenPhoto=" + xinwenPhoto +
			", xinwenVideo=" + xinwenVideo +
			", xinwenClicknum=" + xinwenClicknum +
			", xinwenContent=" + xinwenContent +
			", xinwenDelete=" + xinwenDelete +
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
