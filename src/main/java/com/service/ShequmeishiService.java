package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequmeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequmeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequmeishiView;


/**
 * 社区美食
 *
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public interface ShequmeishiService extends IService<ShequmeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequmeishiVO> selectListVO(Wrapper<ShequmeishiEntity> wrapper);
   	
   	ShequmeishiVO selectVO(@Param("ew") Wrapper<ShequmeishiEntity> wrapper);
   	
   	List<ShequmeishiView> selectListView(Wrapper<ShequmeishiEntity> wrapper);
   	
   	ShequmeishiView selectView(@Param("ew") Wrapper<ShequmeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequmeishiEntity> wrapper);
   	
}

