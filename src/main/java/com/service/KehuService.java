package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KehuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KehuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KehuView;


/**
 * 客户
 *
 * @author 
 * @email 
 * @date 2022-04-20 09:52:00
 */
public interface KehuService extends IService<KehuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KehuVO> selectListVO(Wrapper<KehuEntity> wrapper);
   	
   	KehuVO selectVO(@Param("ew") Wrapper<KehuEntity> wrapper);
   	
   	List<KehuView> selectListView(Wrapper<KehuEntity> wrapper);
   	
   	KehuView selectView(@Param("ew") Wrapper<KehuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KehuEntity> wrapper);
   	

}

