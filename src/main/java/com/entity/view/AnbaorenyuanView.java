package com.entity.view;

import com.entity.AnbaorenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 安保人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:00
 */
@TableName("anbaorenyuan")
public class AnbaorenyuanView  extends AnbaorenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public AnbaorenyuanView(){
	}
 
 	public AnbaorenyuanView(AnbaorenyuanEntity anbaorenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, anbaorenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
