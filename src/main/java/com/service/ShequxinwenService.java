package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequxinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequxinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequxinwenView;


/**
 * 社区新闻
 *
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public interface ShequxinwenService extends IService<ShequxinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequxinwenVO> selectListVO(Wrapper<ShequxinwenEntity> wrapper);
   	
   	ShequxinwenVO selectVO(@Param("ew") Wrapper<ShequxinwenEntity> wrapper);
   	
   	List<ShequxinwenView> selectListView(Wrapper<ShequxinwenEntity> wrapper);
   	
   	ShequxinwenView selectView(@Param("ew") Wrapper<ShequxinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequxinwenEntity> wrapper);
   	
}

