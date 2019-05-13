package com.filipe.service;

import java.util.List;

import com.filipe.domain.Pessoa;

public interface InterfacePessoaService {
	
	void salvar(Pessoa pessoa);
	
	void editar(Pessoa pessoa);
	
	void excluir(Integer id);
	
	Pessoa buscarPorId(Integer id);
	
	List<Pessoa> buscaTodos();
}
