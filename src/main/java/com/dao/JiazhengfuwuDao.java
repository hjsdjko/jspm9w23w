package com.dao;

import com.entity.JiazhengfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhengfuwuVO;
import com.entity.view.JiazhengfuwuView;


/**
 * 家政服务
 * 
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public interface JiazhengfuwuDao extends BaseMapper<JiazhengfuwuEntity> {
	
	List<JiazhengfuwuVO> selectListVO(@Param("ew") Wrapper<JiazhengfuwuEntity> wrapper);
	
	JiazhengfuwuVO selectVO(@Param("ew") Wrapper<JiazhengfuwuEntity> wrapper);
	
	List<JiazhengfuwuView> selectListView(@Param("ew") Wrapper<JiazhengfuwuEntity> wrapper);

	List<JiazhengfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhengfuwuEntity> wrapper);
	
	JiazhengfuwuView selectView(@Param("ew") Wrapper<JiazhengfuwuEntity> wrapper);
	
}
