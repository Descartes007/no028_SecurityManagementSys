package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GangdianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GangdianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GangdianxinxiView;


/**
 * 岗点信息
 *
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface GangdianxinxiService extends IService<GangdianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GangdianxinxiVO> selectListVO(Wrapper<GangdianxinxiEntity> wrapper);
   	
   	GangdianxinxiVO selectVO(@Param("ew") Wrapper<GangdianxinxiEntity> wrapper);
   	
   	List<GangdianxinxiView> selectListView(Wrapper<GangdianxinxiEntity> wrapper);
   	
   	GangdianxinxiView selectView(@Param("ew") Wrapper<GangdianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GangdianxinxiEntity> wrapper);
   	

}

