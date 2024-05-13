package com.entity.view;

import com.entity.ShequxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区新闻
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
@TableName("shequxinwen")
public class ShequxinwenView  extends ShequxinwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequxinwenView(){
	}
 
 	public ShequxinwenView(ShequxinwenEntity shequxinwenEntity){
 	try {
			BeanUtils.copyProperties(this, shequxinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
