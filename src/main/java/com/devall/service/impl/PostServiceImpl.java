package com.devall.service.impl;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devall.devall.repository.PostRepository;
import com.devall.dto.PostCliqueDto;
import com.devall.dto.PostDto;
import com.devall.model.Post;
import com.devall.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepository postRepository;

	@Override
	public List<PostDto> findAll() {
		Pageable page = PageRequest.of(0,30, Sort.by(Sort.Direction.DESC, "dataPublicacao"));
		Page<Post> posts = postRepository.findAll(page);
		
		Page<PostDto> pagePostsDto = posts.map(new Function<Post, PostDto>(){

			@Override
			public PostDto apply(Post postEntity) {
				PostDto dto =  postEntity.toDto(); 
				return dto;
			}
			
		});
		List<PostDto> postsDto = pagePostsDto.getContent();
		return postsDto;
	}

	@Override
	public List<PostDto> findSearch(String search) {

		Pageable page = PageRequest.of(0,30, Sort.by(Sort.Direction.DESC, "dataPublicacao"));
		Page<Post> posts = postRepository.findSearch(search,page);
		Page<PostDto> pagePostsDto = posts.map(new Function<Post, PostDto>(){

			@Override
			public PostDto apply(Post postEntity) {
				PostDto dto =  postEntity.toDto(); 
				return dto;
			}
			
		});
		List<PostDto> postsDto = pagePostsDto.getContent();
		return postsDto;
	}
	
	@Override
	public PostCliqueDto findById(Long id) {
		Post post = postRepository.findById(id).get();
		return post.toCliqueDto();
	}
}
