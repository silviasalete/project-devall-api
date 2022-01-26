package com.devall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devall.devall.repository.AutorRepository;
import com.devall.model.Autor;
import com.devall.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService{
	
	@Autowired
	AutorRepository autorRepository;

	@Override
	public List<Autor> findAll() {
		// TODO Auto-generated method stub
		return autorRepository.findAll();
	}
	
	@Override
	public Autor findById(Long id) {
		// TODO Auto-generated method stub
		return autorRepository.findById(id).get();
	}}
