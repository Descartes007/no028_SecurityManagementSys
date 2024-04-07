package com.entity.view;

import com.entity.PeixunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 培训信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
@TableName("peixunxinxi")
public class PeixunxinxiView  extends PeixunxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeixunxinxiView(){
	}
 
 	public PeixunxinxiView(PeixunxinxiEntity peixunxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, peixunxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
