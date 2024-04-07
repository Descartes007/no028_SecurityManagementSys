package com.entity.vo;

import com.entity.KaohexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 考核信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public class KaohexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
