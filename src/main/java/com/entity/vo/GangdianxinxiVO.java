package com.entity.vo;

import com.entity.GangdianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 岗点信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public class GangdianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
