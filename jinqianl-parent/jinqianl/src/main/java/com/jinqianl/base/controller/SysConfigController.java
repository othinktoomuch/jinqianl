package com.jinqianl.base.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jianqianl.common.page.PageWrapper;
import com.jinqianl.base.service.ISysConfigService;
import com.jinqianl.user.domain.User;



/**
 * 编  号：
 * 名  称：ApplicationController
 * 描  述：
 * 完成日期：2017年3月14日
 * 编码作者：RenDongPing
 */
@Controller
@RequestMapping(value = "/base/v1")
public class SysConfigController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SysConfigController.class);
	
	@Autowired
	private ISysConfigService sysConfigService;

	@RequestMapping(value = "/findByPage", method = { RequestMethod.POST, RequestMethod.GET })
	public PageWrapper<User> findByPage(@RequestParam Map<String, Object> map,
			@RequestParam(value = "page", defaultValue = "1") int pageNumber,
			@RequestParam(value = "rows", defaultValue = "20") int pageSize,
			@RequestParam(value = "sort", defaultValue = "id") String sortType,
			@RequestParam(value = "order", defaultValue = "desc") String orderType) {
		PageWrapper<User> page = null;
		try {
			page = new PageWrapper<User>();
			page.setPageNumber(pageNumber);
			page.setPageSize(pageSize);
			page.setParams(map);
			//page = sysConfigService.findByPage(page);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return page;
	}
	
	/**
	 * 返回html模板.
	 */
	@RequestMapping("/listAll")
	public ModelAndView listAll() {
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("configList", sysConfigService.findAll());
		return view;
	}

	
}
