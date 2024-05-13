package com.entity.vo;

import com.entity.ShequmeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 社区美食
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public class ShequmeishiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 经营类型
	 */
	
	private String jingyingleixing;
		
	/**
	 * 美食图片
	 */
	
	private String meishitupian;
		
	/**
	 * 店铺地址
	 */
	
	private String dianpudizhi;
		
	/**
	 * 营业时间
	 */
	
	private String yingyeshijian;
		
	/**
	 * 主打美食
	 */
	
	private String zhudameishi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
				
	
	/**
	 * 设置：经营类型
	 */
	 
	public void setJingyingleixing(String jingyingleixing) {
		this.jingyingleixing = jingyingleixing;
	}
	
	/**
	 * 获取：经营类型
	 */
	public String getJingyingleixing() {
		return jingyingleixing;
	}
				
	
	/**
	 * 设置：美食图片
	 */
	 
	public void setMeishitupian(String meishitupian) {
		this.meishitupian = meishitupian;
	}
	
	/**
	 * 获取：美食图片
	 */
	public String getMeishitupian() {
		return meishitupian;
	}
				
	
	/**
	 * 设置：店铺地址
	 */
	 
	public void setDianpudizhi(String dianpudizhi) {
		this.dianpudizhi = dianpudizhi;
	}
	
	/**
	 * 获取：店铺地址
	 */
	public String getDianpudizhi() {
		return dianpudizhi;
	}
				
	
	/**
	 * 设置：营业时间
	 */
	 
	public void setYingyeshijian(String yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	
	/**
	 * 获取：营业时间
	 */
	public String getYingyeshijian() {
		return yingyeshijian;
	}
				
	
	/**
	 * 设置：主打美食
	 */
	 
	public void setZhudameishi(String zhudameishi) {
		this.zhudameishi = zhudameishi;
	}
	
	/**
	 * 获取：主打美食
	 */
	public String getZhudameishi() {
		return zhudameishi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
			
}
