package com.dao;

import com.entity.KehuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KehuVO;
import com.entity.view.KehuView;


/**
 * 客户
 * 
 * @author 
 * @email 
 * @date 2022-04-20 09:52:00
 */
public interface KehuDao extends BaseMapper<KehuEntity> {
	
	List<KehuVO> selectListVO(@Param("ew") Wrapper<KehuEntity> wrapper);
	
	KehuVO selectVO(@Param("ew") Wrapper<KehuEntity> wrapper);
	
	List<KehuView> selectListView(@Param("ew") Wrapper<KehuEntity> wrapper);

	List<KehuView> selectListView(Pagination page,@Param("ew") Wrapper<KehuEntity> wrapper);
	
	KehuView selectView(@Param("ew") Wrapper<KehuEntity> wrapper);
	

}
