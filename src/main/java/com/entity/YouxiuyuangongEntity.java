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
 * 优秀员工
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
@TableName("youxiuyuangong")
public class YouxiuyuangongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YouxiuyuangongEntity() {
		
	}
	
	public YouxiuyuangongEntity(T t) {
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
	 * 评选名称
	 */
					
	private String pingxuanmingcheng;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	/**
	 * 相片
	 */
					
	private String xiangpian;
	
	/**
	 * 个人格言
	 */
					
	private String gerengeyan;
	
	/**
	 * 评选内容
	 */
					
	private String pingxuanneirong;
	
	/**
	 * 评选日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pingxuanriqi;
	
	
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
	 * 设置：评选名称
	 */
	public void setPingxuanmingcheng(String pingxuanmingcheng) {
		this.pingxuanmingcheng = pingxuanmingcheng;
	}
	/**
	 * 获取：评选名称
	 */
	public String getPingxuanmingcheng() {
		return pingxuanmingcheng;
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
	/**
	 * 设置：相片
	 */
	public void setXiangpian(String xiangpian) {
		this.xiangpian = xiangpian;
	}
	/**
	 * 获取：相片
	 */
	public String getXiangpian() {
		return xiangpian;
	}
	/**
	 * 设置：个人格言
	 */
	public void setGerengeyan(String gerengeyan) {
		this.gerengeyan = gerengeyan;
	}
	/**
	 * 获取：个人格言
	 */
	public String getGerengeyan() {
		return gerengeyan;
	}
	/**
	 * 设置：评选内容
	 */
	public void setPingxuanneirong(String pingxuanneirong) {
		this.pingxuanneirong = pingxuanneirong;
	}
	/**
	 * 获取：评选内容
	 */
	public String getPingxuanneirong() {
		return pingxuanneirong;
	}
	/**
	 * 设置：评选日期
	 */
	public void setPingxuanriqi(Date pingxuanriqi) {
		this.pingxuanriqi = pingxuanriqi;
	}
	/**
	 * 获取：评选日期
	 */
	public Date getPingxuanriqi() {
		return pingxuanriqi;
	}

}
