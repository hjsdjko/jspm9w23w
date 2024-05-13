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


import com.dao.JiazhengyuyueDao;
import com.entity.JiazhengyuyueEntity;
import com.service.JiazhengyuyueService;
import com.entity.vo.JiazhengyuyueVO;
import com.entity.view.JiazhengyuyueView;

@Service("jiazhengyuyueService")
public class JiazhengyuyueServiceImpl extends ServiceImpl<JiazhengyuyueDao, JiazhengyuyueEntity> implements JiazhengyuyueService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhengyuyueEntity> page = this.selectPage(
                new Query<JiazhengyuyueEntity>(params).getPage(),
                new EntityWrapper<JiazhengyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhengyuyueEntity> wrapper) {
		  Page<JiazhengyuyueView> page =new Query<JiazhengyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhengyuyueVO> selectListVO(Wrapper<JiazhengyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhengyuyueVO selectVO(Wrapper<JiazhengyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhengyuyueView> selectListView(Wrapper<JiazhengyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhengyuyueView selectView(Wrapper<JiazhengyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
