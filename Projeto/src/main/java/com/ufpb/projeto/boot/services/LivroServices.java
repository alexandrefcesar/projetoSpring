package com.ufpb.projeto.boot.services;

import java.util.List;

import com.ufpb.projeto.boot.domain.Livros;

public interface LivroServices {

	void salvar(Livros livro);
	
	void editar(Livros livro);
	
	void excluir(Long id);
	
	Livros buscarPorId(Long id);
	
	List<Livros> buscarTodos();
	
	boolean bibliotecaTemFuncionarios(Long id);
}
