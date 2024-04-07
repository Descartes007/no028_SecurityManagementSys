package com.dao;

import com.entity.GangdianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GangdianxinxiVO;
import com.entity.view.GangdianxinxiView;


/**
 * 岗点信息
 * 
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface GangdianxinxiDao extends BaseMapper<GangdianxinxiEntity> {
	
	List<GangdianxinxiVO> selectListVO(@Param("ew") Wrapper<GangdianxinxiEntity> wrapper);
	
	GangdianxinxiVO selectVO(@Param("ew") Wrapper<GangdianxinxiEntity> wrapper);
	
	List<GangdianxinxiView> selectListView(@Param("ew") Wrapper<GangdianxinxiEntity> wrapper);

	List<GangdianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GangdianxinxiEntity> wrapper);
	
	GangdianxinxiView selectView(@Param("ew") Wrapper<GangdianxinxiEntity> wrapper);
	

}
