package com.dao;

import com.entity.ZhangangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhangangxinxiVO;
import com.entity.view.ZhangangxinxiView;


/**
 * 站岗信息
 * 
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface ZhangangxinxiDao extends BaseMapper<ZhangangxinxiEntity> {
	
	List<ZhangangxinxiVO> selectListVO(@Param("ew") Wrapper<ZhangangxinxiEntity> wrapper);
	
	ZhangangxinxiVO selectVO(@Param("ew") Wrapper<ZhangangxinxiEntity> wrapper);
	
	List<ZhangangxinxiView> selectListView(@Param("ew") Wrapper<ZhangangxinxiEntity> wrapper);

	List<ZhangangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhangangxinxiEntity> wrapper);
	
	ZhangangxinxiView selectView(@Param("ew") Wrapper<ZhangangxinxiEntity> wrapper);
	

}
