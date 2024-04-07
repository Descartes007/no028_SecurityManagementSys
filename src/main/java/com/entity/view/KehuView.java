package com.entity.view;

import com.entity.KehuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客户
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:00
 */
@TableName("kehu")
public class KehuView  extends KehuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KehuView(){
	}
 
 	public KehuView(KehuEntity kehuEntity){
 	try {
			BeanUtils.copyProperties(this, kehuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
