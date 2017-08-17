package com.jinqianl.base.service;

import java.util.List;

import com.jianqianl.common.exception.BusinessException;
import com.jinqianl.base.domain.SysConfig;

public interface ISysConfigService {
	
	public List<SysConfig> findAll() throws BusinessException;
}
