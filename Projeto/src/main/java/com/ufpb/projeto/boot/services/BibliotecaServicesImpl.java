package com.ufpb.projeto.boot.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufpb.projeto.boot.dao.BibliotecaDao;
import com.ufpb.projeto.boot.domain.Biblioteca;


@Service
public class BibliotecaServicesImpl implements BibliotecaServices {
	
	@Autowired
	private BibliotecaDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Biblioteca biblioteca) {
		dao.save(biblioteca);		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Biblioteca departamento) {
		dao.update(departamento);		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Transactional(readOnly = true)
	@Override
	public Biblioteca buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Biblioteca> buscarTodos() {
		
		return dao.findAll();
	}

	@Override
	public boolean bibliotecaTemCargos(Long id) {
		if (buscarPorId(id).getLivros().isEmpty()) {
			return false;
		}
		return true;
	}

}