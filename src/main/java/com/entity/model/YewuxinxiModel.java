package com.entity.model;

import com.entity.YewuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 业务信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public class YewuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 业务封面
	 */
	
	private String yewufengmian;
		
	/**
	 * 业务类型
	 */
	
	private String yewuleixing;
		
	/**
	 * 费用
	 */
	
	private Integer feiyong;
		
	/**
	 * 业务简介
	 */
	
	private String yewujianjie;
		
	/**
	 * 业务详情
	 */
	
	private String yewuxiangqing;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：业务封面
	 */
	 
	public void setYewufengmian(String yewufengmian) {
		this.yewufengmian = yewufengmian;
	}
	
	/**
	 * 获取：业务封面
	 */
	public String getYewufengmian() {
		return yewufengmian;
	}
				
	
	/**
	 * 设置：业务类型
	 */
	 
	public void setYewuleixing(String yewuleixing) {
		this.yewuleixing = yewuleixing;
	}
	
	/**
	 * 获取：业务类型
	 */
	public String getYewuleixing() {
		return yewuleixing;
	}
				
	
	/**
	 * 设置：费用
	 */
	 
	public void setFeiyong(Integer feiyong) {
		this.feiyong = feiyong;
	}
	
	/**
	 * 获取：费用
	 */
	public Integer getFeiyong() {
		return feiyong;
	}
				
	
	/**
	 * 设置：业务简介
	 */
	 
	public void setYewujianjie(String yewujianjie) {
		this.yewujianjie = yewujianjie;
	}
	
	/**
	 * 获取：业务简介
	 */
	public String getYewujianjie() {
		return yewujianjie;
	}
				
	
	/**
	 * 设置：业务详情
	 */
	 
	public void setYewuxiangqing(String yewuxiangqing) {
		this.yewuxiangqing = yewuxiangqing;
	}
	
	/**
	 * 获取：业务详情
	 */
	public String getYewuxiangqing() {
		return yewuxiangqing;
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
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
