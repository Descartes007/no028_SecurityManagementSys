package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PeixunxinxiEntity;
import com.entity.view.PeixunxinxiView;

import com.service.PeixunxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 培训信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-20 09:52:01
 */
@RestController
@RequestMapping("/peixunxinxi")
public class PeixunxinxiController {
    @Autowired
    private PeixunxinxiService peixunxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PeixunxinxiEntity peixunxinxi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date peixunriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date peixunriqiend,
		HttpServletRequest request){

        EntityWrapper<PeixunxinxiEntity> ew = new EntityWrapper<PeixunxinxiEntity>();
                if(peixunriqistart!=null) ew.ge("peixunriqi", peixunriqistart);
                if(peixunriqiend!=null) ew.le("peixunriqi", peixunriqiend);
    	PageUtils page = peixunxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peixunxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PeixunxinxiEntity peixunxinxi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date peixunriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date peixunriqiend,
		HttpServletRequest request){
        EntityWrapper<PeixunxinxiEntity> ew = new EntityWrapper<PeixunxinxiEntity>();
                if(peixunriqistart!=null) ew.ge("peixunriqi", peixunriqistart);
                if(peixunriqiend!=null) ew.le("peixunriqi", peixunriqiend);
    	PageUtils page = peixunxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peixunxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PeixunxinxiEntity peixunxinxi){
       	EntityWrapper<PeixunxinxiEntity> ew = new EntityWrapper<PeixunxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( peixunxinxi, "peixunxinxi")); 
        return R.ok().put("data", peixunxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PeixunxinxiEntity peixunxinxi){
        EntityWrapper< PeixunxinxiEntity> ew = new EntityWrapper< PeixunxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( peixunxinxi, "peixunxinxi")); 
		PeixunxinxiView peixunxinxiView =  peixunxinxiService.selectView(ew);
		return R.ok("查询培训信息成功").put("data", peixunxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PeixunxinxiEntity peixunxinxi = peixunxinxiService.selectById(id);
        return R.ok().put("data", peixunxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PeixunxinxiEntity peixunxinxi = peixunxinxiService.selectById(id);
        return R.ok().put("data", peixunxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PeixunxinxiEntity peixunxinxi, HttpServletRequest request){
    	peixunxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peixunxinxi);

        peixunxinxiService.insert(peixunxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PeixunxinxiEntity peixunxinxi, HttpServletRequest request){
    	peixunxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peixunxinxi);

        peixunxinxiService.insert(peixunxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PeixunxinxiEntity peixunxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(peixunxinxi);
        peixunxinxiService.updateById(peixunxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        peixunxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<PeixunxinxiEntity> wrapper = new EntityWrapper<PeixunxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = peixunxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
