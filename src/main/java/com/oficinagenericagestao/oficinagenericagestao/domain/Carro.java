package com.oficinagenericagestao.oficinagenericagestao.domain;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "Carro")
public class Carro implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private  String marcaDoVeiculo;
	private String modeloDoVeiculo;
	private String placaDoVeiculo;
	private  String corDoVeiculo;
	private  int anoFabricacaoDoVeiculo;
	private int anoModelo;
	private Integer numeroDeMotorDoVeiculo;
	private Integer numeroDePortasDoVeiculo;
	private String nivelCombustivel;
	private String tipoDeCombustivel;
	private Date dataDeEntrada;
	private Cliente cliente;
	
	public Carro() {}
	
	
	
	public Carro(String marcaDoVeiculo, String modeloDoVeiculo, String placaDoVeiculo, String corDoVeiculo,
			Integer numeroDeMotorDoVeiculo, Integer numeroDePortasDoVeiculo, String nivelCombustivel,
			String tipoDeCombustivel, Cliente cliente) {
		super();
		this.marcaDoVeiculo = marcaDoVeiculo;
		this.modeloDoVeiculo = modeloDoVeiculo;
		this.placaDoVeiculo = placaDoVeiculo;
		this.corDoVeiculo = corDoVeiculo;
		this.numeroDeMotorDoVeiculo = numeroDeMotorDoVeiculo;
		this.numeroDePortasDoVeiculo = numeroDePortasDoVeiculo;
		this.nivelCombustivel = nivelCombustivel;
		this.tipoDeCombustivel = tipoDeCombustivel;
		this.setCliente(cliente);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Date getDataDeEntrada() {
		return dataDeEntrada;
	}
	public void setDataDeEntrada(Date dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
