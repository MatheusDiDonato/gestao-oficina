package com.oficinagenericagestao.oficinagenericagestao.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "cliente")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String telefone;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "carro_cliente", joinColumns = {
			@JoinColumn(name = "cliente_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "carro_id", referencedColumnName = "id") })
	private Carro carro;

	public Cliente(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	// private List endereco;

	// @OneToMany
	// private List carro;

}
