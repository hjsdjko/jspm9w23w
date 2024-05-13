package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhengfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhengfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhengfuwuView;


/**
 * 家政服务
 *
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public interface JiazhengfuwuService extends IService<JiazhengfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhengfuwuVO> selectListVO(Wrapper<JiazhengfuwuEntity> wrapper);
   	
   	JiazhengfuwuVO selectVO(@Param("ew") Wrapper<JiazhengfuwuEntity> wrapper);
   	
   	List<JiazhengfuwuView> selectListView(Wrapper<JiazhengfuwuEntity> wrapper);
   	
   	JiazhengfuwuView selectView(@Param("ew") Wrapper<JiazhengfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhengfuwuEntity> wrapper);
   	
}

