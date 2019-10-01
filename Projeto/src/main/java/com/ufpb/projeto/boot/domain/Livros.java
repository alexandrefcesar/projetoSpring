package com.ufpb.projeto.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "LIVROS")
public class Livros extends AbstractEntidades<Long> {
	
	@Column (name = "name", nullable = false, unique=true, length =60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_biblioteca_fk")
	private Biblioteca biblioteca;
	private List<Funcionario> funcionario;

	public List<Funcionario> getFuncionarios() {
		return funcionario;
	}

	public void setFuncionarios(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	} 	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}
	

}
