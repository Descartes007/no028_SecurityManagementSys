package com.entity.view;

import com.entity.KaohexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考核信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
@TableName("kaohexinxi")
public class KaohexinxiView  extends KaohexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaohexinxiView(){
	}
 
 	public KaohexinxiView(KaohexinxiEntity kaohexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, kaohexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
