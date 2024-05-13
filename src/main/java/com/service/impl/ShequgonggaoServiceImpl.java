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


import com.dao.ShequgonggaoDao;
import com.entity.ShequgonggaoEntity;
import com.service.ShequgonggaoService;
import com.entity.vo.ShequgonggaoVO;
import com.entity.view.ShequgonggaoView;

@Service("shequgonggaoService")
public class ShequgonggaoServiceImpl extends ServiceImpl<ShequgonggaoDao, ShequgonggaoEntity> implements ShequgonggaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequgonggaoEntity> page = this.selectPage(
                new Query<ShequgonggaoEntity>(params).getPage(),
                new EntityWrapper<ShequgonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequgonggaoEntity> wrapper) {
		  Page<ShequgonggaoView> page =new Query<ShequgonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequgonggaoVO> selectListVO(Wrapper<ShequgonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequgonggaoVO selectVO(Wrapper<ShequgonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequgonggaoView> selectListView(Wrapper<ShequgonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequgonggaoView selectView(Wrapper<ShequgonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
