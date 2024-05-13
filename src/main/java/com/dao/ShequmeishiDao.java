package com.dao;

import com.entity.ShequmeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequmeishiVO;
import com.entity.view.ShequmeishiView;


/**
 * 社区美食
 * 
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public interface ShequmeishiDao extends BaseMapper<ShequmeishiEntity> {
	
	List<ShequmeishiVO> selectListVO(@Param("ew") Wrapper<ShequmeishiEntity> wrapper);
	
	ShequmeishiVO selectVO(@Param("ew") Wrapper<ShequmeishiEntity> wrapper);
	
	List<ShequmeishiView> selectListView(@Param("ew") Wrapper<ShequmeishiEntity> wrapper);

	List<ShequmeishiView> selectListView(Pagination page,@Param("ew") Wrapper<ShequmeishiEntity> wrapper);
	
	ShequmeishiView selectView(@Param("ew") Wrapper<ShequmeishiEntity> wrapper);
	
}
