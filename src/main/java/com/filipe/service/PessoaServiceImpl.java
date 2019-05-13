package com.filipe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.filipe.dao.InterfacePessoaDao;
import com.filipe.domain.Pessoa;

@Service @Transactional(readOnly = false)
public class PessoaServiceImpl implements InterfacePessoaService {
	
	@Autowired
	private InterfacePessoaDao dao;

	@Override
	public void salvar(Pessoa pessoa) {
		dao.save(pessoa);
		
	}

	@Override
	public void editar(Pessoa pessoa) {
		dao.update(pessoa);	
	}

	@Override 
	public void excluir(Integer id) {
		dao.delete(id);
	}
	

	@Override @Transactional(readOnly = true)
	public Pessoa buscarPorId(Integer id) {	
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Pessoa> buscaTodos() {
		return dao.findAll();
	}

}
