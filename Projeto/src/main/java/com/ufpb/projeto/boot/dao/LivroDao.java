package com.ufpb.projeto.boot.dao;

import java.util.List;

import com.ufpb.projeto.boot.domain.Livros;

public interface LivroDao {

	void save(Livros livro);

	void update(Livros livro);

	void delete(Long id);

	Livros findById(Long id);

	List<Livros> findAll();
}
