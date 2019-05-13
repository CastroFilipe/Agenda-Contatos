package com.filipe.dao;

import org.springframework.stereotype.Repository;

import com.filipe.domain.Pessoa;

@Repository
public class PessoaDaoImpl extends AbstractDao<Pessoa, Integer> implements InterfacePessoaDao {
	
}
