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


import com.dao.ZhangangxinxiDao;
import com.entity.ZhangangxinxiEntity;
import com.service.ZhangangxinxiService;
import com.entity.vo.ZhangangxinxiVO;
import com.entity.view.ZhangangxinxiView;

@Service("zhangangxinxiService")
public class ZhangangxinxiServiceImpl extends ServiceImpl<ZhangangxinxiDao, ZhangangxinxiEntity> implements ZhangangxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhangangxinxiEntity> page = this.selectPage(
                new Query<ZhangangxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhangangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhangangxinxiEntity> wrapper) {
		  Page<ZhangangxinxiView> page =new Query<ZhangangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhangangxinxiVO> selectListVO(Wrapper<ZhangangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhangangxinxiVO selectVO(Wrapper<ZhangangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhangangxinxiView> selectListView(Wrapper<ZhangangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhangangxinxiView selectView(Wrapper<ZhangangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
