package com.dao;

import com.entity.KaohexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaohexinxiVO;
import com.entity.view.KaohexinxiView;


/**
 * 考核信息
 * 
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface KaohexinxiDao extends BaseMapper<KaohexinxiEntity> {
	
	List<KaohexinxiVO> selectListVO(@Param("ew") Wrapper<KaohexinxiEntity> wrapper);
	
	KaohexinxiVO selectVO(@Param("ew") Wrapper<KaohexinxiEntity> wrapper);
	
	List<KaohexinxiView> selectListView(@Param("ew") Wrapper<KaohexinxiEntity> wrapper);

	List<KaohexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KaohexinxiEntity> wrapper);
	
	KaohexinxiView selectView(@Param("ew") Wrapper<KaohexinxiEntity> wrapper);
	

}
