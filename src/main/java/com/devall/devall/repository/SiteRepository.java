package com.devall.devall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devall.model.Site;
@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {

	List<Site> findAll();
}
