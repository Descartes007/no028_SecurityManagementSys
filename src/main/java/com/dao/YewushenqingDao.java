package com.dao;

import com.entity.YewushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewushenqingVO;
import com.entity.view.YewushenqingView;


/**
 * 业务申请
 * 
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface YewushenqingDao extends BaseMapper<YewushenqingEntity> {
	
	List<YewushenqingVO> selectListVO(@Param("ew") Wrapper<YewushenqingEntity> wrapper);
	
	YewushenqingVO selectVO(@Param("ew") Wrapper<YewushenqingEntity> wrapper);
	
	List<YewushenqingView> selectListView(@Param("ew") Wrapper<YewushenqingEntity> wrapper);

	List<YewushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<YewushenqingEntity> wrapper);
	
	YewushenqingView selectView(@Param("ew") Wrapper<YewushenqingEntity> wrapper);
	

}
