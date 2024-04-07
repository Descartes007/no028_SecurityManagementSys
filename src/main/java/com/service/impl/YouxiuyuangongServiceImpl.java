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


import com.dao.YouxiuyuangongDao;
import com.entity.YouxiuyuangongEntity;
import com.service.YouxiuyuangongService;
import com.entity.vo.YouxiuyuangongVO;
import com.entity.view.YouxiuyuangongView;

@Service("youxiuyuangongService")
public class YouxiuyuangongServiceImpl extends ServiceImpl<YouxiuyuangongDao, YouxiuyuangongEntity> implements YouxiuyuangongService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxiuyuangongEntity> page = this.selectPage(
                new Query<YouxiuyuangongEntity>(params).getPage(),
                new EntityWrapper<YouxiuyuangongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxiuyuangongEntity> wrapper) {
		  Page<YouxiuyuangongView> page =new Query<YouxiuyuangongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxiuyuangongVO> selectListVO(Wrapper<YouxiuyuangongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxiuyuangongVO selectVO(Wrapper<YouxiuyuangongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxiuyuangongView> selectListView(Wrapper<YouxiuyuangongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxiuyuangongView selectView(Wrapper<YouxiuyuangongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
