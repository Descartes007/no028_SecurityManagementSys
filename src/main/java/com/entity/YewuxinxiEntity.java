package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 业务信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
@TableName("yewuxinxi")
public class YewuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YewuxinxiEntity() {
		
	}
	
	public YewuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 业务名称
	 */
					
	private String yewumingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：业务名称
	 */
	public void setYewumingcheng(String yewumingcheng) {
		this.yewumingcheng = yewumingcheng;
	}
	/**
	 * 获取：业务名称
	 */
	public String getYewumingcheng() {
		return yewumingcheng;
	}
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
