package com.entity.view;

import com.entity.YewushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业务申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
@TableName("yewushenqing")
public class YewushenqingView  extends YewushenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YewushenqingView(){
	}
 
 	public YewushenqingView(YewushenqingEntity yewushenqingEntity){
 	try {
			BeanUtils.copyProperties(this, yewushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
