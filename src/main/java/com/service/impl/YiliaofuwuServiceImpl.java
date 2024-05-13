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


import com.dao.YiliaofuwuDao;
import com.entity.YiliaofuwuEntity;
import com.service.YiliaofuwuService;
import com.entity.vo.YiliaofuwuVO;
import com.entity.view.YiliaofuwuView;

@Service("yiliaofuwuService")
public class YiliaofuwuServiceImpl extends ServiceImpl<YiliaofuwuDao, YiliaofuwuEntity> implements YiliaofuwuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiliaofuwuEntity> page = this.selectPage(
                new Query<YiliaofuwuEntity>(params).getPage(),
                new EntityWrapper<YiliaofuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiliaofuwuEntity> wrapper) {
		  Page<YiliaofuwuView> page =new Query<YiliaofuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiliaofuwuVO> selectListVO(Wrapper<YiliaofuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiliaofuwuVO selectVO(Wrapper<YiliaofuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiliaofuwuView> selectListView(Wrapper<YiliaofuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiliaofuwuView selectView(Wrapper<YiliaofuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
