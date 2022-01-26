package com.devall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devall.devall.repository.SiteRepository;
import com.devall.model.Site;
import com.devall.service.SiteService;

@Service
public class SiteServiceImpl implements SiteService{

	@Autowired
	SiteRepository siteRepository;
	@Override
	public List<Site> findAll() {
		return siteRepository.findAll();
	}
 
}
