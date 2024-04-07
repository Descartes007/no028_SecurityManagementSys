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


import com.dao.YewushenqingDao;
import com.entity.YewushenqingEntity;
import com.service.YewushenqingService;
import com.entity.vo.YewushenqingVO;
import com.entity.view.YewushenqingView;

@Service("yewushenqingService")
public class YewushenqingServiceImpl extends ServiceImpl<YewushenqingDao, YewushenqingEntity> implements YewushenqingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewushenqingEntity> page = this.selectPage(
                new Query<YewushenqingEntity>(params).getPage(),
                new EntityWrapper<YewushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewushenqingEntity> wrapper) {
		  Page<YewushenqingView> page =new Query<YewushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewushenqingVO> selectListVO(Wrapper<YewushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewushenqingVO selectVO(Wrapper<YewushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewushenqingView> selectListView(Wrapper<YewushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewushenqingView selectView(Wrapper<YewushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
