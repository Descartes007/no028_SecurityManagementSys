package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhangangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhangangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhangangxinxiView;


/**
 * 站岗信息
 *
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface ZhangangxinxiService extends IService<ZhangangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhangangxinxiVO> selectListVO(Wrapper<ZhangangxinxiEntity> wrapper);
   	
   	ZhangangxinxiVO selectVO(@Param("ew") Wrapper<ZhangangxinxiEntity> wrapper);
   	
   	List<ZhangangxinxiView> selectListView(Wrapper<ZhangangxinxiEntity> wrapper);
   	
   	ZhangangxinxiView selectView(@Param("ew") Wrapper<ZhangangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhangangxinxiEntity> wrapper);
   	

}

