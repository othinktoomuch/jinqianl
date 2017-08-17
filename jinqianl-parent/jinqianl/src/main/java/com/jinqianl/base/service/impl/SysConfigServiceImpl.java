package com.jinqianl.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jianqianl.common.exception.BusinessException;
import com.jinqianl.base.dao.SysConfigMapper;
import com.jinqianl.base.domain.SysConfig;
import com.jinqianl.base.service.ISysConfigService;

@Service
@Transactional
public class SysConfigServiceImpl implements ISysConfigService {

	@Autowired
	private SysConfigMapper sysConfigMapper;
	
	@Override
	public List<SysConfig> findAll() throws BusinessException {
		return this.sysConfigMapper.selectByExample(null);
	}

}
