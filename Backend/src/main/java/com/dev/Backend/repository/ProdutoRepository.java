package com.dev.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.Backend.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	

}
