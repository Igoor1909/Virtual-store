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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dev.Backend.entity.ProdutoImagens;
import com.dev.Backend.service.ProdutoImagensService;

@RestController
@RequestMapping("api/produtoImagem")
public class ProdutoImagensController {
	
	@Autowired
	private ProdutoImagensService produtoImagensService;

	@GetMapping("/")
	public List<ProdutoImagens> buscarTodos() {
		return produtoImagensService.buscarTodos();
	}

	@PostMapping("/")
	public ProdutoImagens inserir(@RequestParam("file") MultipartFile file, @RequestParam("idProduto") Long idProduto) {
		return produtoImagensService.Inserir(idProduto, file);

	}

	@PutMapping("/")
	public ProdutoImagens alterar(@RequestBody ProdutoImagens obj) {
		return produtoImagensService.alterar(obj);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> exluir(@PathVariable("id") Long id) {
		produtoImagensService.excluir(id);
		return ResponseEntity.ok().build();
	}

}
