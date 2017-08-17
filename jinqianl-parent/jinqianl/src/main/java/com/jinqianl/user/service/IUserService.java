package com.jinqianl.user.service;


import java.util.List;

import com.jianqianl.common.exception.BusinessException;
import com.jianqianl.common.page.PageWrapper;
import com.jinqianl.user.domain.User;


public interface IUserService {
	
	public User findById(Long id) throws BusinessException;

	public PageWrapper<User> findByPage(PageWrapper<User> page) throws BusinessException;

	public int add(User record) throws BusinessException;

	public int update(User record) throws BusinessException;

	public int delete(Long id) throws BusinessException;
	
	public int delete(List<Long> ids) throws BusinessException;
	
}