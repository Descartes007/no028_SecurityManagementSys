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


import com.dao.KaohexinxiDao;
import com.entity.KaohexinxiEntity;
import com.service.KaohexinxiService;
import com.entity.vo.KaohexinxiVO;
import com.entity.view.KaohexinxiView;

@Service("kaohexinxiService")
public class KaohexinxiServiceImpl extends ServiceImpl<KaohexinxiDao, KaohexinxiEntity> implements KaohexinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaohexinxiEntity> page = this.selectPage(
                new Query<KaohexinxiEntity>(params).getPage(),
                new EntityWrapper<KaohexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaohexinxiEntity> wrapper) {
		  Page<KaohexinxiView> page =new Query<KaohexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaohexinxiVO> selectListVO(Wrapper<KaohexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaohexinxiVO selectVO(Wrapper<KaohexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaohexinxiView> selectListView(Wrapper<KaohexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaohexinxiView selectView(Wrapper<KaohexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
