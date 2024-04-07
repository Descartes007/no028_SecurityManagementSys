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


import com.dao.YewuxinxiDao;
import com.entity.YewuxinxiEntity;
import com.service.YewuxinxiService;
import com.entity.vo.YewuxinxiVO;
import com.entity.view.YewuxinxiView;

@Service("yewuxinxiService")
public class YewuxinxiServiceImpl extends ServiceImpl<YewuxinxiDao, YewuxinxiEntity> implements YewuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewuxinxiEntity> page = this.selectPage(
                new Query<YewuxinxiEntity>(params).getPage(),
                new EntityWrapper<YewuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewuxinxiEntity> wrapper) {
		  Page<YewuxinxiView> page =new Query<YewuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewuxinxiVO> selectListVO(Wrapper<YewuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewuxinxiVO selectVO(Wrapper<YewuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewuxinxiView> selectListView(Wrapper<YewuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewuxinxiView selectView(Wrapper<YewuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
