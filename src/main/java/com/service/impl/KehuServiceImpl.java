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


import com.dao.KehuDao;
import com.entity.KehuEntity;
import com.service.KehuService;
import com.entity.vo.KehuVO;
import com.entity.view.KehuView;

@Service("kehuService")
public class KehuServiceImpl extends ServiceImpl<KehuDao, KehuEntity> implements KehuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KehuEntity> page = this.selectPage(
                new Query<KehuEntity>(params).getPage(),
                new EntityWrapper<KehuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KehuEntity> wrapper) {
		  Page<KehuView> page =new Query<KehuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KehuVO> selectListVO(Wrapper<KehuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KehuVO selectVO(Wrapper<KehuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KehuView> selectListView(Wrapper<KehuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KehuView selectView(Wrapper<KehuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
