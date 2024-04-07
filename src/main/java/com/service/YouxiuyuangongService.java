package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxiuyuangongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxiuyuangongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxiuyuangongView;


/**
 * 优秀员工
 *
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
public interface YouxiuyuangongService extends IService<YouxiuyuangongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxiuyuangongVO> selectListVO(Wrapper<YouxiuyuangongEntity> wrapper);
   	
   	YouxiuyuangongVO selectVO(@Param("ew") Wrapper<YouxiuyuangongEntity> wrapper);
   	
   	List<YouxiuyuangongView> selectListView(Wrapper<YouxiuyuangongEntity> wrapper);
   	
   	YouxiuyuangongView selectView(@Param("ew") Wrapper<YouxiuyuangongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxiuyuangongEntity> wrapper);
   	

}

