package com.entity.view;

import com.entity.ShequmeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区美食
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
@TableName("shequmeishi")
public class ShequmeishiView  extends ShequmeishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequmeishiView(){
	}
 
 	public ShequmeishiView(ShequmeishiEntity shequmeishiEntity){
 	try {
			BeanUtils.copyProperties(this, shequmeishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
