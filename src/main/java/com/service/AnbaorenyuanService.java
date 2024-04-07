package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AnbaorenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AnbaorenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AnbaorenyuanView;


/**
 * 安保人员
 *
 * @author 
 * @email 
 * @date 2022-04-20 09:52:00
 */
public interface AnbaorenyuanService extends IService<AnbaorenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AnbaorenyuanVO> selectListVO(Wrapper<AnbaorenyuanEntity> wrapper);
   	
   	AnbaorenyuanVO selectVO(@Param("ew") Wrapper<AnbaorenyuanEntity> wrapper);
   	
   	List<AnbaorenyuanView> selectListView(Wrapper<AnbaorenyuanEntity> wrapper);
   	
   	AnbaorenyuanView selectView(@Param("ew") Wrapper<AnbaorenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AnbaorenyuanEntity> wrapper);
   	

}

