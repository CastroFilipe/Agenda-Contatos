package com.filipe.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "contato")
public class Contato extends AbstractEntity<Integer> {

		@Column(name = "tipo")//opcional pois os campos possum os mesmo nomes das colunas nas tabelas do banco
		@Enumerated(EnumType.STRING)
		private Tipo tipo;
		
		@Column(name = "registro")
		private String registro; 
		
		@ManyToOne
		@JoinColumn(name = "fk_pessoa_id")
		private Pessoa pessoa;

		public Tipo getTipo() {
			return tipo;
		}

		public void setTipo(Tipo tipo) {
			this.tipo = tipo;
		}

		public String getRegistro() {
			return registro;
		}

		public void setRegistro(String registro) {
			this.registro = registro;
		}

		public Pessoa getPessoa() {
			return pessoa;
		}

		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}
		
}
