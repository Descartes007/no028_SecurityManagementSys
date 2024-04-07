package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewuleixingView;


/**
 * 业务类型
 *
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface YewuleixingService extends IService<YewuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewuleixingVO> selectListVO(Wrapper<YewuleixingEntity> wrapper);
   	
   	YewuleixingVO selectVO(@Param("ew") Wrapper<YewuleixingEntity> wrapper);
   	
   	List<YewuleixingView> selectListView(Wrapper<YewuleixingEntity> wrapper);
   	
   	YewuleixingView selectView(@Param("ew") Wrapper<YewuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewuleixingEntity> wrapper);
   	

}

