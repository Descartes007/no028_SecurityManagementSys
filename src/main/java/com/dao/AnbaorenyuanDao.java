package com.dao;

import com.entity.AnbaorenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AnbaorenyuanVO;
import com.entity.view.AnbaorenyuanView;


/**
 * 安保人员
 * 
 * @author 
 * @email 
 * @date 2022-04-20 09:52:00
 */
public interface AnbaorenyuanDao extends BaseMapper<AnbaorenyuanEntity> {
	
	List<AnbaorenyuanVO> selectListVO(@Param("ew") Wrapper<AnbaorenyuanEntity> wrapper);
	
	AnbaorenyuanVO selectVO(@Param("ew") Wrapper<AnbaorenyuanEntity> wrapper);
	
	List<AnbaorenyuanView> selectListView(@Param("ew") Wrapper<AnbaorenyuanEntity> wrapper);

	List<AnbaorenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<AnbaorenyuanEntity> wrapper);
	
	AnbaorenyuanView selectView(@Param("ew") Wrapper<AnbaorenyuanEntity> wrapper);
	

}
