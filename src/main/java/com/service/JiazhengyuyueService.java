package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhengyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhengyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhengyuyueView;


/**
 * 家政预约
 *
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public interface JiazhengyuyueService extends IService<JiazhengyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhengyuyueVO> selectListVO(Wrapper<JiazhengyuyueEntity> wrapper);
   	
   	JiazhengyuyueVO selectVO(@Param("ew") Wrapper<JiazhengyuyueEntity> wrapper);
   	
   	List<JiazhengyuyueView> selectListView(Wrapper<JiazhengyuyueEntity> wrapper);
   	
   	JiazhengyuyueView selectView(@Param("ew") Wrapper<JiazhengyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhengyuyueEntity> wrapper);
   	
}

