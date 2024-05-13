package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequgonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequgonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequgonggaoView;


/**
 * 社区公告
 *
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public interface ShequgonggaoService extends IService<ShequgonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequgonggaoVO> selectListVO(Wrapper<ShequgonggaoEntity> wrapper);
   	
   	ShequgonggaoVO selectVO(@Param("ew") Wrapper<ShequgonggaoEntity> wrapper);
   	
   	List<ShequgonggaoView> selectListView(Wrapper<ShequgonggaoEntity> wrapper);
   	
   	ShequgonggaoView selectView(@Param("ew") Wrapper<ShequgonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequgonggaoEntity> wrapper);
   	
}

