package com.devall.service;

import java.util.List;

import com.devall.dto.PostCliqueDto;
import com.devall.dto.PostDto;

public interface PostService {
	List<PostDto> findAll();
	List<PostDto> findSearch(String search);
	PostCliqueDto findById(Long id);
}
