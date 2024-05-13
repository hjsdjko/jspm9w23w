package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShequxinwenDao;
import com.entity.ShequxinwenEntity;
import com.service.ShequxinwenService;
import com.entity.vo.ShequxinwenVO;
import com.entity.view.ShequxinwenView;

@Service("shequxinwenService")
public class ShequxinwenServiceImpl extends ServiceImpl<ShequxinwenDao, ShequxinwenEntity> implements ShequxinwenService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequxinwenEntity> page = this.selectPage(
                new Query<ShequxinwenEntity>(params).getPage(),
                new EntityWrapper<ShequxinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequxinwenEntity> wrapper) {
		  Page<ShequxinwenView> page =new Query<ShequxinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequxinwenVO> selectListVO(Wrapper<ShequxinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequxinwenVO selectVO(Wrapper<ShequxinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequxinwenView> selectListView(Wrapper<ShequxinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequxinwenView selectView(Wrapper<ShequxinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
