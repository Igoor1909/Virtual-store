package com.dev.Backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.Backend.entity.Marca;
import com.dev.Backend.repository.MarcaRepository;

@Service
public class MarcaService {

	@Autowired
	private MarcaRepository marcaRepository;

	public List<Marca> buscarTodos() {
		return marcaRepository.findAll();
	}

	public Marca Inserir(Marca marca) {
		marca.setDataCriacao(new Date());
		Marca marcaNova = marcaRepository.saveAndFlush(marca);
		return marcaNova;
	}

	public Marca alterar(Marca marca) {
		marca.setDataAtualizacao(new Date());
		return marcaRepository.saveAndFlush(marca);
	}

	public void excluir(Long id) {
		Marca marca = marcaRepository.findById(id).get();
		marcaRepository.delete(marca);

	}
}
