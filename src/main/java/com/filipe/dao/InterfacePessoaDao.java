package com.filipe.dao;

import java.util.List;

import com.filipe.domain.Pessoa;

public interface InterfacePessoaDao {
	public void save(Pessoa pessoa);
	
	public void update(Pessoa pessoa);
	
	public void delete(Integer id);
	
	Pessoa findById(Integer id);
	
	List<Pessoa> findAll();
}
