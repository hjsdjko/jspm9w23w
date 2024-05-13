package com.entity.view;

import com.entity.ShequgonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
@TableName("shequgonggao")
public class ShequgonggaoView  extends ShequgonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequgonggaoView(){
	}
 
 	public ShequgonggaoView(ShequgonggaoEntity shequgonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, shequgonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
