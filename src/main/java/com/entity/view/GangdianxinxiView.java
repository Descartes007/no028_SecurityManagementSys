package com.entity.view;

import com.entity.GangdianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 岗点信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
@TableName("gangdianxinxi")
public class GangdianxinxiView  extends GangdianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GangdianxinxiView(){
	}
 
 	public GangdianxinxiView(GangdianxinxiEntity gangdianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gangdianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
