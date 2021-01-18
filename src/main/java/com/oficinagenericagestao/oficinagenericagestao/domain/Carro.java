package com.oficinagenericagestao.oficinagenericagestao.domain;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	

	public String getMarcaDoVeiculo() {
		return marcaDoVeiculo;
	}


	public void setMarcaDoVeiculo(String marcaDoVeiculo) {
		this.marcaDoVeiculo = marcaDoVeiculo;
	}


	public String getModeloDoVeiculo() {
		return modeloDoVeiculo;
	}


	public void setModeloDoVeiculo(String modeloDoVeiculo) {
		this.modeloDoVeiculo = modeloDoVeiculo;
	}


	public String getPlacaDoVeiculo() {
		return placaDoVeiculo;
	}


	public void setPlacaDoVeiculo(String placaDoVeiculo) {
		this.placaDoVeiculo = placaDoVeiculo;
	}


	public String getCorDoVeiculo() {
		return corDoVeiculo;
	}


	public void setCorDoVeiculo(String corDoVeiculo) {
		this.corDoVeiculo = corDoVeiculo;
	}


	public int getAnoFabricacaoDoVeiculo() {
		return anoFabricacaoDoVeiculo;
	}


	public void setAnoFabricacaoDoVeiculo(int anoFabricacaoDoVeiculo) {
		this.anoFabricacaoDoVeiculo = anoFabricacaoDoVeiculo;
	}


	public int getAnoModelo() {
		return anoModelo;
	}


	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}


	public Integer getNumeroDeMotorDoVeiculo() {
		return numeroDeMotorDoVeiculo;
	}


	public void setNumeroDeMotorDoVeiculo(Integer numeroDeMotorDoVeiculo) {
		this.numeroDeMotorDoVeiculo = numeroDeMotorDoVeiculo;
	}


	public Integer getNumeroDePortasDoVeiculo() {
		return numeroDePortasDoVeiculo;
	}


	public void setNumeroDePortasDoVeiculo(Integer numeroDePortasDoVeiculo) {
		this.numeroDePortasDoVeiculo = numeroDePortasDoVeiculo;
	}


	public String getNivelCombustivel() {
		return nivelCombustivel;
	}


	public void setNivelCombustivel(String nivelCombustivel) {
		this.nivelCombustivel = nivelCombustivel;
	}


	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}


	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}


}
