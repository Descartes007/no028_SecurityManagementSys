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
 * 岗点信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
@TableName("gangdianxinxi")
public class GangdianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GangdianxinxiEntity() {
		
	}
	
	public GangdianxinxiEntity(T t) {
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
	 * 岗点名称
	 */
					
	private String gangdianmingcheng;
	
	/**
	 * 岗点图片
	 */
					
	private String gangdiantupian;
	
	/**
	 * 岗点地址
	 */
					
	private String gangdiandizhi;
	
	/**
	 * 岗点简介
	 */
					
	private String gangdianjianjie;
	
	
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
	 * 设置：岗点名称
	 */
	public void setGangdianmingcheng(String gangdianmingcheng) {
		this.gangdianmingcheng = gangdianmingcheng;
	}
	/**
	 * 获取：岗点名称
	 */
	public String getGangdianmingcheng() {
		return gangdianmingcheng;
	}
	/**
	 * 设置：岗点图片
	 */
	public void setGangdiantupian(String gangdiantupian) {
		this.gangdiantupian = gangdiantupian;
	}
	/**
	 * 获取：岗点图片
	 */
	public String getGangdiantupian() {
		return gangdiantupian;
	}
	/**
	 * 设置：岗点地址
	 */
	public void setGangdiandizhi(String gangdiandizhi) {
		this.gangdiandizhi = gangdiandizhi;
	}
	/**
	 * 获取：岗点地址
	 */
	public String getGangdiandizhi() {
		return gangdiandizhi;
	}
	/**
	 * 设置：岗点简介
	 */
	public void setGangdianjianjie(String gangdianjianjie) {
		this.gangdianjianjie = gangdianjianjie;
	}
	/**
	 * 获取：岗点简介
	 */
	public String getGangdianjianjie() {
		return gangdianjianjie;
	}

}
