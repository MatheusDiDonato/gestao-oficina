package com.oficinagenericagestao.oficinagenericagestao.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
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

}

