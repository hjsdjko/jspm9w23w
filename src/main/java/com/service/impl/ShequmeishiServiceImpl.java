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


import com.dao.ShequmeishiDao;
import com.entity.ShequmeishiEntity;
import com.service.ShequmeishiService;
import com.entity.vo.ShequmeishiVO;
import com.entity.view.ShequmeishiView;

@Service("shequmeishiService")
public class ShequmeishiServiceImpl extends ServiceImpl<ShequmeishiDao, ShequmeishiEntity> implements ShequmeishiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequmeishiEntity> page = this.selectPage(
                new Query<ShequmeishiEntity>(params).getPage(),
                new EntityWrapper<ShequmeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequmeishiEntity> wrapper) {
		  Page<ShequmeishiView> page =new Query<ShequmeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequmeishiVO> selectListVO(Wrapper<ShequmeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequmeishiVO selectVO(Wrapper<ShequmeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequmeishiView> selectListView(Wrapper<ShequmeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequmeishiView selectView(Wrapper<ShequmeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
