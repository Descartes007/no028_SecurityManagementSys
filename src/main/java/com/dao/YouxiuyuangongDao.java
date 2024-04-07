package com.dao;

import com.entity.YouxiuyuangongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxiuyuangongVO;
import com.entity.view.YouxiuyuangongView;


/**
 * 优秀员工
 * 
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface YouxiuyuangongDao extends BaseMapper<YouxiuyuangongEntity> {
	
	List<YouxiuyuangongVO> selectListVO(@Param("ew") Wrapper<YouxiuyuangongEntity> wrapper);
	
	YouxiuyuangongVO selectVO(@Param("ew") Wrapper<YouxiuyuangongEntity> wrapper);
	
	List<YouxiuyuangongView> selectListView(@Param("ew") Wrapper<YouxiuyuangongEntity> wrapper);

	List<YouxiuyuangongView> selectListView(Pagination page,@Param("ew") Wrapper<YouxiuyuangongEntity> wrapper);
	
	YouxiuyuangongView selectView(@Param("ew") Wrapper<YouxiuyuangongEntity> wrapper);
	

}
