package com.ufpb.projeto.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufpb.projeto.boot.dao.LivroDao;
import com.ufpb.projeto.boot.domain.Livros;


@Service @Transactional(readOnly = false)
public class LivroServicesImpl implements LivroServices {
	
	@Autowired
	private LivroDao dao;

	@Override
	public void salvar(Livros livro) {
		dao.save(livro);		
	}

	@Override
	public void editar(Livros livro) {
		dao.update(livro);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Livros buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Livros> buscarTodos() {
		
		return dao.findAll();
	}

	@Override
	public boolean bibliotecaTemFuncionarios(Long id) {
		if (buscarPorId(id).getFuncionarios().isEmpty()) {
			return false;
		}
		return true;
	}
}