package com.filipe.dao;

import java.util.List;

import com.filipe.domain.Contato;

public interface InterfaceContatoDao {
	public void save(Contato contato);
	
	public void update(Contato contato);
	
	public void delete(Integer id);
	
	Contato findById(Integer id);
	
	List<Contato> findAll();
}
