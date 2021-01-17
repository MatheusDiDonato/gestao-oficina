package com.oficinagenericagestao.oficinagenericagestao.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "carro")
public class Carro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String marcaDoVeiculo;
	private String modeloDoVeiculo;
	private String placaDoVeiculo;
	private String corDoVeiculo;
	private int anoFabricacaoDoVeiculo;
	private int anoModelo;
	private Integer numeroDeMotorDoVeiculo; 
	private Integer numeroDePortasDoVeiculo; 
	private String nivelCombustivel; 
	private String tipoDeCombustivel; 
	//private Date dataDeEntrada;
	 

	@OneToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "carro_cliente", joinColumns = {
			@JoinColumn(name = "carro_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "cliente_id", referencedColumnName = "id") })
	private Cliente cliente;

}
