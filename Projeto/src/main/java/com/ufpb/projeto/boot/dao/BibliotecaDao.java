package com.ufpb.projeto.boot.dao;

import java.util.List;

import com.ufpb.projeto.boot.domain.Biblioteca;

public interface BibliotecaDao {

	void save(Biblioteca biblioteca);

	void update(Biblioteca biblioteca);

	void delete(Long id);

	Biblioteca findById(Long id);

	List<Biblioteca> findAll();
}