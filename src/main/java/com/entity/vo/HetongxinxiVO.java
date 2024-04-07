package com.entity.vo;

import com.entity.HetongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 合同信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public class HetongxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 业务类型
	 */
	
	private String yewuleixing;
		
	/**
	 * 费用
	 */
	
	private String feiyong;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 预约备注
	 */
	
	private String yuyuebeizhu;
		
	/**
	 * 下单时间
	 */
	
	private String xiadanshijian;
		
	/**
	 * 合同名称
	 */
	
	private String hetongmingcheng;
		
	/**
	 * 合同附件
	 */
	
	private String hetongfujian;
		
	/**
	 * 签订日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qiandingriqi;
		
	/**
	 * 签订备注
	 */
	
	private String qiandingbeizhu;
				
	
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
	 
	public void setFeiyong(String feiyong) {
		this.feiyong = feiyong;
	}
	
	/**
	 * 获取：费用
	 */
	public String getFeiyong() {
		return feiyong;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：预约备注
	 */
	 
	public void setYuyuebeizhu(String yuyuebeizhu) {
		this.yuyuebeizhu = yuyuebeizhu;
	}
	
	/**
	 * 获取：预约备注
	 */
	public String getYuyuebeizhu() {
		return yuyuebeizhu;
	}
				
	
	/**
	 * 设置：下单时间
	 */
	 
	public void setXiadanshijian(String xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	
	/**
	 * 获取：下单时间
	 */
	public String getXiadanshijian() {
		return xiadanshijian;
	}
				
	
	/**
	 * 设置：合同名称
	 */
	 
	public void setHetongmingcheng(String hetongmingcheng) {
		this.hetongmingcheng = hetongmingcheng;
	}
	
	/**
	 * 获取：合同名称
	 */
	public String getHetongmingcheng() {
		return hetongmingcheng;
	}
				
	
	/**
	 * 设置：合同附件
	 */
	 
	public void setHetongfujian(String hetongfujian) {
		this.hetongfujian = hetongfujian;
	}
	
	/**
	 * 获取：合同附件
	 */
	public String getHetongfujian() {
		return hetongfujian;
	}
				
	
	/**
	 * 设置：签订日期
	 */
	 
	public void setQiandingriqi(Date qiandingriqi) {
		this.qiandingriqi = qiandingriqi;
	}
	
	/**
	 * 获取：签订日期
	 */
	public Date getQiandingriqi() {
		return qiandingriqi;
	}
				
	
	/**
	 * 设置：签订备注
	 */
	 
	public void setQiandingbeizhu(String qiandingbeizhu) {
		this.qiandingbeizhu = qiandingbeizhu;
	}
	
	/**
	 * 获取：签订备注
	 */
	public String getQiandingbeizhu() {
		return qiandingbeizhu;
	}
			
}
