package com.ufpb.projeto.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name= "SECAO")
public class Secao extends AbstractEntidades<Long>{
	
	@Column(nullable= false)
	private String bloco;
	
	@Column(nullable= false)
	private String descricao;
	
	
	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

}
