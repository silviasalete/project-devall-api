package com.devall.devall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devall.model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
 

}
