package com.dao;

import com.entity.YiliaofuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiliaofuwuVO;
import com.entity.view.YiliaofuwuView;


/**
 * 医疗服务
 * 
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public interface YiliaofuwuDao extends BaseMapper<YiliaofuwuEntity> {
	
	List<YiliaofuwuVO> selectListVO(@Param("ew") Wrapper<YiliaofuwuEntity> wrapper);
	
	YiliaofuwuVO selectVO(@Param("ew") Wrapper<YiliaofuwuEntity> wrapper);
	
	List<YiliaofuwuView> selectListView(@Param("ew") Wrapper<YiliaofuwuEntity> wrapper);

	List<YiliaofuwuView> selectListView(Pagination page,@Param("ew") Wrapper<YiliaofuwuEntity> wrapper);
	
	YiliaofuwuView selectView(@Param("ew") Wrapper<YiliaofuwuEntity> wrapper);
	
}
