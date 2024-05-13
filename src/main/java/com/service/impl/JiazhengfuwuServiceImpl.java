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


import com.dao.JiazhengfuwuDao;
import com.entity.JiazhengfuwuEntity;
import com.service.JiazhengfuwuService;
import com.entity.vo.JiazhengfuwuVO;
import com.entity.view.JiazhengfuwuView;

@Service("jiazhengfuwuService")
public class JiazhengfuwuServiceImpl extends ServiceImpl<JiazhengfuwuDao, JiazhengfuwuEntity> implements JiazhengfuwuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhengfuwuEntity> page = this.selectPage(
                new Query<JiazhengfuwuEntity>(params).getPage(),
                new EntityWrapper<JiazhengfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhengfuwuEntity> wrapper) {
		  Page<JiazhengfuwuView> page =new Query<JiazhengfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhengfuwuVO> selectListVO(Wrapper<JiazhengfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhengfuwuVO selectVO(Wrapper<JiazhengfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhengfuwuView> selectListView(Wrapper<JiazhengfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhengfuwuView selectView(Wrapper<JiazhengfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
