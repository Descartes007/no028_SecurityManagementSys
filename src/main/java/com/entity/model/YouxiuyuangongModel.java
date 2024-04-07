package com.entity.model;

import com.entity.YouxiuyuangongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 优秀员工
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public class YouxiuyuangongModel  implements Serializable {
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingxuanriqi;
				
	
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
