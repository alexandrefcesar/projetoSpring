package com.ufpb.projeto.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BIBLIOTECA")
public class Biblioteca extends AbstractEntidades<Long> {
	
	@Column (name = "nome", nullable= false, unique =true , length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "biblioteca")
	private List<Livros> livros;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Livros> getLivros() {
		return livros;
	}

	public void setLivros(List<Livros> livros) {
		this.livros = livros;
	}
	
	
	

}
