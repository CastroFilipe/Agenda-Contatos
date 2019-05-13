package com.filipe.domain;

public enum Tipo {
	EMAIL,
	RESIDENCIAL,
	COMERCIAL;
	
	private String descricao;

	Tipo() {}
	
	Tipo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
