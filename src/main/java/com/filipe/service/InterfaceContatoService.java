package com.filipe.service;

import java.util.List;

import com.filipe.domain.Contato;

public interface InterfaceContatoService {

	void salvar(Contato contato);

	void editar(Contato contato);

	void excluir(Integer id);

	Contato buscarPorId(Integer id);

	List<Contato> buscaTodos();
}
