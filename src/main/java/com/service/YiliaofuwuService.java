package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiliaofuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiliaofuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiliaofuwuView;


/**
 * 医疗服务
 *
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public interface YiliaofuwuService extends IService<YiliaofuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiliaofuwuVO> selectListVO(Wrapper<YiliaofuwuEntity> wrapper);
   	
   	YiliaofuwuVO selectVO(@Param("ew") Wrapper<YiliaofuwuEntity> wrapper);
   	
   	List<YiliaofuwuView> selectListView(Wrapper<YiliaofuwuEntity> wrapper);
   	
   	YiliaofuwuView selectView(@Param("ew") Wrapper<YiliaofuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiliaofuwuEntity> wrapper);
   	
}

