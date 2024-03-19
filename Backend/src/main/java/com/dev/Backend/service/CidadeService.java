package com.dev.Backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.Backend.entity.Cidade;
import com.dev.Backend.repository.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;

	public List<Cidade> buscarTodos() {
		return cidadeRepository.findAll();
	}

	public Cidade Inserir(Cidade cidade) {
		cidade.setDataCriacao(new Date());
		Cidade cidadeNova = cidadeRepository.saveAndFlush(cidade);
		return cidadeNova;
	}

	public Cidade alterar(Cidade cidade) {
		cidade.setDataAtualizacao(new Date());
		return cidadeRepository.saveAndFlush(cidade);
	}

	public void excluir(Long id) {
		Cidade cidade = cidadeRepository.findById(id).get();
		cidadeRepository.delete(cidade);
	}

}