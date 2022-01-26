package com.devall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devall.dto.PostCliqueDto;
import com.devall.dto.PostDto;
import com.devall.service.PostService;

@RestController
@RequestMapping("/post")
@CrossOrigin(origins = "*")
public class PostController {
	
	@Autowired
	PostService postService;

	@GetMapping()
	public List<PostDto> findAll(@RequestParam(required = false) String search) {
		if (search == null) {
			return postService.findAll();
		}
		return postService.findSearch(search);
	}
	
	@GetMapping("/clique/{id}")
	public PostCliqueDto findById(@PathVariable(required = true)  Long id) {
		return postService.findById(id);
	}
}