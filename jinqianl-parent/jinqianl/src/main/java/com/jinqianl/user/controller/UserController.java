package com.jinqianl.user.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jianqianl.common.constants.CodeConstants;
import com.jianqianl.common.page.PageWrapper;
import com.jianqianl.common.response.AddResponse;
import com.jianqianl.common.response.DeleteResponse;
import com.jianqianl.common.response.ListResponse;
import com.jianqianl.common.response.MapResponse;
import com.jianqianl.common.response.ModifyResponse;
import com.jianqianl.common.response.SingleResponse;
import com.jianqianl.common.web.OptionItem;
import com.jinqianl.user.domain.User;
import com.jinqianl.user.service.IUserService;



/**
 * 编  号：
 * 名  称：ApplicationController
 * 描  述：
 * 完成日期：2017年3月14日
 * 编码作者：RenDongPing
 */
@Controller
@RequestMapping(value = "/vacp/app")
public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;


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
			page = userService.findByPage(page);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return page;
	}
	
	/***
	 * 处理数据字典下拉框字段
	 * @param page
	 *//*
	private void handleLabel(PageWrapper<User> page){
		if (page == null || page.getRows() == null 
				|| page.getRows().isEmpty()) {
			return;
		}
		MapResponse<String, SysLookupValue> resp = codeFeignClient.findByParentCode2Map(CodeConstants.VACP_APP_TYPE);
		if(resp!=null && resp.isSuccess()){
			Map<String, SysLookupValue> map = resp.getData();
			for(User app : page.getRows()){
				SysLookupValue val = map.get(app.getType());
				if(val!=null){
					app.setTypeLabel(val.getMeaning());
				}
			}
		}
	}

	@RequestMapping(value = "/findById", method = { RequestMethod.POST, RequestMethod.GET })
	public SingleResponse<User> findById(@RequestParam(value = "id") Long id) {
		SingleResponse<User> resp = null;
		try {
			resp = userService.findById(id);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return resp;
	}

	@RequestMapping(value = "/add", method = { RequestMethod.POST, RequestMethod.GET })
	public AddResponse add(@RequestBody User user) {
		AddResponse resp = new AddResponse();
		try {
			userService.add(user);
			resp.setSuccess(true);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return resp;
	}

	@RequestMapping(value = "/update", method = { RequestMethod.POST, RequestMethod.GET })
	public ModifyResponse update(@RequestBody User user) {
		ModifyResponse resp = new ModifyResponse();
		try {
			userService.update(user);
			resp.setSuccess(true);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return resp;
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.POST, RequestMethod.GET })
	public DeleteResponse delete(@RequestParam String ids) {
		DeleteResponse resp = null;
		try {
			resp = userService.delete(ids);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return resp;
	}

	
	@RequestMapping(value = "/findByParentCode", method = { RequestMethod.POST, RequestMethod.GET })
	public List<OptionItem> findByParentCode(@RequestParam String parentCode) {
		try {
			ListResponse<OptionItem> resp = codeFeignClient.findByParentCode(parentCode);
			if (resp!=null && resp.isSuccess()) {
				return resp.getData();
			} else {
				LOGGER.warn("findByParentCode failed. parentCode={}", parentCode);
				return new ArrayList<OptionItem>(0);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}*/
}
