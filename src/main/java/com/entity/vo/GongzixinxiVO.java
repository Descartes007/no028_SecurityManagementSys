package com.entity.vo;

import com.entity.GongzixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 工资信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public class GongzixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 基本工资
	 */
	
	private Integer jibengongzi;
		
	/**
	 * 奖励奖金
	 */
	
	private Integer jianglijiangjin;
		
	/**
	 * 应扣费用
	 */
	
	private Integer yingkoufeiyong;
		
	/**
	 * 实际工资
	 */
	
	private Float shijigongzi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
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
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：奖励奖金
	 */
	 
	public void setJianglijiangjin(Integer jianglijiangjin) {
		this.jianglijiangjin = jianglijiangjin;
	}
	
	/**
	 * 获取：奖励奖金
	 */
	public Integer getJianglijiangjin() {
		return jianglijiangjin;
	}
				
	
	/**
	 * 设置：应扣费用
	 */
	 
	public void setYingkoufeiyong(Integer yingkoufeiyong) {
		this.yingkoufeiyong = yingkoufeiyong;
	}
	
	/**
	 * 获取：应扣费用
	 */
	public Integer getYingkoufeiyong() {
		return yingkoufeiyong;
	}
				
	
	/**
	 * 设置：实际工资
	 */
	 
	public void setShijigongzi(Float shijigongzi) {
		this.shijigongzi = shijigongzi;
	}
	
	/**
	 * 获取：实际工资
	 */
	public Float getShijigongzi() {
		return shijigongzi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
