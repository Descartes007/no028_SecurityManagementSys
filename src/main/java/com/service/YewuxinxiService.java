package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewuxinxiView;


/**
 * 业务信息
 *
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface YewuxinxiService extends IService<YewuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewuxinxiVO> selectListVO(Wrapper<YewuxinxiEntity> wrapper);
   	
   	YewuxinxiVO selectVO(@Param("ew") Wrapper<YewuxinxiEntity> wrapper);
   	
   	List<YewuxinxiView> selectListView(Wrapper<YewuxinxiEntity> wrapper);
   	
   	YewuxinxiView selectView(@Param("ew") Wrapper<YewuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewuxinxiEntity> wrapper);
   	

}

