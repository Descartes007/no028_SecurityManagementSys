package com.dao;

import com.entity.YewuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewuleixingVO;
import com.entity.view.YewuleixingView;


/**
 * 业务类型
 * 
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface YewuleixingDao extends BaseMapper<YewuleixingEntity> {
	
	List<YewuleixingVO> selectListVO(@Param("ew") Wrapper<YewuleixingEntity> wrapper);
	
	YewuleixingVO selectVO(@Param("ew") Wrapper<YewuleixingEntity> wrapper);
	
	List<YewuleixingView> selectListView(@Param("ew") Wrapper<YewuleixingEntity> wrapper);

	List<YewuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<YewuleixingEntity> wrapper);
	
	YewuleixingView selectView(@Param("ew") Wrapper<YewuleixingEntity> wrapper);
	

}
