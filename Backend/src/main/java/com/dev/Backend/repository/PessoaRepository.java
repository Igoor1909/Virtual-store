package com.dev.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.Backend.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
	

}
