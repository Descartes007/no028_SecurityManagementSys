package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixunxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixunxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunxinxiView;


/**
 * 培训信息
 *
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface PeixunxinxiService extends IService<PeixunxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixunxinxiVO> selectListVO(Wrapper<PeixunxinxiEntity> wrapper);
   	
   	PeixunxinxiVO selectVO(@Param("ew") Wrapper<PeixunxinxiEntity> wrapper);
   	
   	List<PeixunxinxiView> selectListView(Wrapper<PeixunxinxiEntity> wrapper);
   	
   	PeixunxinxiView selectView(@Param("ew") Wrapper<PeixunxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixunxinxiEntity> wrapper);
   	

}

