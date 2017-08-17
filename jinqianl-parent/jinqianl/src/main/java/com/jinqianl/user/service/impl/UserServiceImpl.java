package com.jinqianl.user.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jianqianl.common.exception.BusinessException;
import com.jianqianl.common.page.PageWrapper;
import com.jinqianl.user.dao.UserMapper;
import com.jinqianl.user.domain.User;
import com.jinqianl.user.domain.UserExample;
import com.jinqianl.user.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findById(Long id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageWrapper<User> findByPage(PageWrapper<User> page) throws BusinessException {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		
		UserExample example = new UserExample();
		example.createCriteria();
        List<User> list = userMapper.selectByExample(example);
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        page.setTotal(pageInfo.getTotal());
        page.setTotalPages(pageInfo.getPages());
        return  page;
	}

	@Override
	public int add(User record) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User record) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(List<Long> ids) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}