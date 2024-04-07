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


import com.dao.YewuleixingDao;
import com.entity.YewuleixingEntity;
import com.service.YewuleixingService;
import com.entity.vo.YewuleixingVO;
import com.entity.view.YewuleixingView;

@Service("yewuleixingService")
public class YewuleixingServiceImpl extends ServiceImpl<YewuleixingDao, YewuleixingEntity> implements YewuleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewuleixingEntity> page = this.selectPage(
                new Query<YewuleixingEntity>(params).getPage(),
                new EntityWrapper<YewuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewuleixingEntity> wrapper) {
		  Page<YewuleixingView> page =new Query<YewuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewuleixingVO> selectListVO(Wrapper<YewuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewuleixingVO selectVO(Wrapper<YewuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewuleixingView> selectListView(Wrapper<YewuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewuleixingView selectView(Wrapper<YewuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
