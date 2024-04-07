package com.dao;

import com.entity.YewuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewuxinxiVO;
import com.entity.view.YewuxinxiView;


/**
 * 业务信息
 * 
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface YewuxinxiDao extends BaseMapper<YewuxinxiEntity> {
	
	List<YewuxinxiVO> selectListVO(@Param("ew") Wrapper<YewuxinxiEntity> wrapper);
	
	YewuxinxiVO selectVO(@Param("ew") Wrapper<YewuxinxiEntity> wrapper);
	
	List<YewuxinxiView> selectListView(@Param("ew") Wrapper<YewuxinxiEntity> wrapper);

	List<YewuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YewuxinxiEntity> wrapper);
	
	YewuxinxiView selectView(@Param("ew") Wrapper<YewuxinxiEntity> wrapper);
	

}
