package com.devall.service;

import java.util.List;

import com.devall.model.Autor;

public interface AutorService {

	//Autor buscaAutor(Site site);

	List<Autor> findAll();

	Autor findById(Long id);
}
