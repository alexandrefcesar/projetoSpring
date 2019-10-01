package com.ufpb.projeto.boot.services;

import java.time.LocalDate;
import java.util.List;

import com.ufpb.projeto.boot.domain.Funcionario;

public interface FuncionarioServices {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();

	List<Funcionario> buscarPorNome(String nome);

	List<Funcionario> buscarPorCargo(Long id);
	
	List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida);
}