package com.ufpb.projeto.boot.services;

import java.util.List;

import com.ufpb.projeto.boot.domain.Biblioteca;

public interface BibliotecaServices {

    void salvar(Biblioteca biblioteca);

    void editar(Biblioteca biblioteca);

    void excluir(Long id);

    Biblioteca buscarPorId(Long id);
    
    List<Biblioteca> buscarTodos();

	boolean bibliotecaTemCargos(Long id);
}
