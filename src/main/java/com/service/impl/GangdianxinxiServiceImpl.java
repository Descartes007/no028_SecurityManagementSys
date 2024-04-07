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


import com.dao.GangdianxinxiDao;
import com.entity.GangdianxinxiEntity;
import com.service.GangdianxinxiService;
import com.entity.vo.GangdianxinxiVO;
import com.entity.view.GangdianxinxiView;

@Service("gangdianxinxiService")
public class GangdianxinxiServiceImpl extends ServiceImpl<GangdianxinxiDao, GangdianxinxiEntity> implements GangdianxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GangdianxinxiEntity> page = this.selectPage(
                new Query<GangdianxinxiEntity>(params).getPage(),
                new EntityWrapper<GangdianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GangdianxinxiEntity> wrapper) {
		  Page<GangdianxinxiView> page =new Query<GangdianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GangdianxinxiVO> selectListVO(Wrapper<GangdianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GangdianxinxiVO selectVO(Wrapper<GangdianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GangdianxinxiView> selectListView(Wrapper<GangdianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GangdianxinxiView selectView(Wrapper<GangdianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
