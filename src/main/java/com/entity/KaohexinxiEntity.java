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
 * 考核信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
@TableName("kaohexinxi")
public class KaohexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaohexinxiEntity() {
		
	}
	
	public KaohexinxiEntity(T t) {
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
	 * 考核名称
	 */
					
	private String kaohemingcheng;
	
	/**
	 * 考核内容
	 */
					
	private String kaoheneirong;
	
	/**
	 * 考核结果
	 */
					
	private String kaohejieguo;
	
	/**
	 * 考核日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaoheriqi;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	
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
	 * 设置：考核名称
	 */
	public void setKaohemingcheng(String kaohemingcheng) {
		this.kaohemingcheng = kaohemingcheng;
	}
	/**
	 * 获取：考核名称
	 */
	public String getKaohemingcheng() {
		return kaohemingcheng;
	}
	/**
	 * 设置：考核内容
	 */
	public void setKaoheneirong(String kaoheneirong) {
		this.kaoheneirong = kaoheneirong;
	}
	/**
	 * 获取：考核内容
	 */
	public String getKaoheneirong() {
		return kaoheneirong;
	}
	/**
	 * 设置：考核结果
	 */
	public void setKaohejieguo(String kaohejieguo) {
		this.kaohejieguo = kaohejieguo;
	}
	/**
	 * 获取：考核结果
	 */
	public String getKaohejieguo() {
		return kaohejieguo;
	}
	/**
	 * 设置：考核日期
	 */
	public void setKaoheriqi(Date kaoheriqi) {
		this.kaoheriqi = kaoheriqi;
	}
	/**
	 * 获取：考核日期
	 */
	public Date getKaoheriqi() {
		return kaoheriqi;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：员工姓名
	 */
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}

}
