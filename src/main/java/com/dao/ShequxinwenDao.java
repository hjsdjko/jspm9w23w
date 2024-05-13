package com.dao;

import com.entity.ShequxinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequxinwenVO;
import com.entity.view.ShequxinwenView;


/**
 * 社区新闻
 * 
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public interface ShequxinwenDao extends BaseMapper<ShequxinwenEntity> {
	
	List<ShequxinwenVO> selectListVO(@Param("ew") Wrapper<ShequxinwenEntity> wrapper);
	
	ShequxinwenVO selectVO(@Param("ew") Wrapper<ShequxinwenEntity> wrapper);
	
	List<ShequxinwenView> selectListView(@Param("ew") Wrapper<ShequxinwenEntity> wrapper);

	List<ShequxinwenView> selectListView(Pagination page,@Param("ew") Wrapper<ShequxinwenEntity> wrapper);
	
	ShequxinwenView selectView(@Param("ew") Wrapper<ShequxinwenEntity> wrapper);
	
}
