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


import com.dao.AnbaorenyuanDao;
import com.entity.AnbaorenyuanEntity;
import com.service.AnbaorenyuanService;
import com.entity.vo.AnbaorenyuanVO;
import com.entity.view.AnbaorenyuanView;

@Service("anbaorenyuanService")
public class AnbaorenyuanServiceImpl extends ServiceImpl<AnbaorenyuanDao, AnbaorenyuanEntity> implements AnbaorenyuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AnbaorenyuanEntity> page = this.selectPage(
                new Query<AnbaorenyuanEntity>(params).getPage(),
                new EntityWrapper<AnbaorenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AnbaorenyuanEntity> wrapper) {
		  Page<AnbaorenyuanView> page =new Query<AnbaorenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AnbaorenyuanVO> selectListVO(Wrapper<AnbaorenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AnbaorenyuanVO selectVO(Wrapper<AnbaorenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AnbaorenyuanView> selectListView(Wrapper<AnbaorenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AnbaorenyuanView selectView(Wrapper<AnbaorenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
