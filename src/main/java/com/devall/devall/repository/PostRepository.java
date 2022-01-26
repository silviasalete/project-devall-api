package com.devall.devall.repository;

import org.springframework.stereotype.Repository;

import com.devall.model.Post;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

	@Query("SELECT p FROM Post p WHERE p.titulo LIKE  %:search% OR  p.resumo LIKE  %:search%")
	Page<Post> findSearch(String search, Pageable pagination);

}
