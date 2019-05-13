package com.filipe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.filipe.dao.InterfaceContatoDao;
import com.filipe.domain.Contato;

@Service @Transactional(readOnly = false)
public class ContatoServiceImpl implements InterfaceContatoService {
	
	@Autowired
	private InterfaceContatoDao dao;

	@Override
	public void salvar(Contato contato) {
		dao.save(contato);
	}

	@Override
	public void editar(Contato contato) {
		dao.update(contato);
	}

	@Override
	public void excluir(Integer id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Contato buscarPorId(Integer id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Contato> buscaTodos() {
		return dao.findAll();
	}

}
