package com.entity.vo;

import com.entity.PeixunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 培训信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public class PeixunxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 培训地点
	 */
	
	private String peixundidian;
		
	/**
	 * 培训日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date peixunriqi;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 培训内容
	 */
	
	private String peixunneirong;
				
	
	/**
	 * 设置：培训地点
	 */
	 
	public void setPeixundidian(String peixundidian) {
		this.peixundidian = peixundidian;
	}
	
	/**
	 * 获取：培训地点
	 */
	public String getPeixundidian() {
		return peixundidian;
	}
				
	
	/**
	 * 设置：培训日期
	 */
	 
	public void setPeixunriqi(Date peixunriqi) {
		this.peixunriqi = peixunriqi;
	}
	
	/**
	 * 获取：培训日期
	 */
	public Date getPeixunriqi() {
		return peixunriqi;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：培训内容
	 */
	 
	public void setPeixunneirong(String peixunneirong) {
		this.peixunneirong = peixunneirong;
	}
	
	/**
	 * 获取：培训内容
	 */
	public String getPeixunneirong() {
		return peixunneirong;
	}
			
}
