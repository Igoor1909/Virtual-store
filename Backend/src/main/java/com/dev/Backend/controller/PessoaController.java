package com.dev.Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.Backend.entity.Estado;
import com.dev.Backend.entity.Pessoa;
import com.dev.Backend.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;

	@GetMapping("/")
	public List<Pessoa> buscarTodos() {
		return pessoaService.buscarTodos();
	}

	@PostMapping("/")
	public Pessoa inserir(@RequestBody Pessoa pessoa) {
		return pessoaService.Inserir(pessoa);

	}

	@PutMapping("/")
	public Pessoa alterar(@RequestBody Pessoa pessoa) {
		return pessoaService.alterar(pessoa);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> exluir(@PathVariable("id") Long id) {
		pessoaService.excluir(id);
		return ResponseEntity.ok().build();
	}

}
