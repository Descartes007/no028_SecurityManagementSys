package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewushenqingView;


/**
 * 业务申请
 *
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface YewushenqingService extends IService<YewushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewushenqingVO> selectListVO(Wrapper<YewushenqingEntity> wrapper);
   	
   	YewushenqingVO selectVO(@Param("ew") Wrapper<YewushenqingEntity> wrapper);
   	
   	List<YewushenqingView> selectListView(Wrapper<YewushenqingEntity> wrapper);
   	
   	YewushenqingView selectView(@Param("ew") Wrapper<YewushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewushenqingEntity> wrapper);
   	

}

