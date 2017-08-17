package com.jinqianl;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;

@SpringBootApplication
public class JinQianlMain {

	public static void main(String[] args) {
		SpringApplication.run(JinQianlMain.class, args);
	}

	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties p = new Properties();
		p.setProperty("offsetAsPageNum", "true");
		p.setProperty("rowBoundsWithCount", "true");
		p.setProperty("reasonable", "true");
		// 通过设置pageSize=0或者RowBounds.limit = 0就会查询出全部的结果。
		p.setProperty("pageSizeZero", "true");
		pageHelper.setProperties(p);
		return pageHelper;
	}

}
