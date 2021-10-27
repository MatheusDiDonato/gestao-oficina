package com.oficinagenericagestao.oficinagenericagestao.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "VEICULO")
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idVeiculo;

	@Column(name = "CC_MARCA_VEICULO")
	private String marcaVeiculo;

	@Column(name = "CC_MODEL_VEICULO")
	private String modeloVeiculo;

	@Length(min = 7, max= 7)
	@Column(name = "CC_PLACA_VEICULO")
	private String placaVeiculo;

	@Column(name = "CC_COR_VEICULO")
	private String corVeiculo;

	@Column(name = "CV_ANO_FAB_VEIC")
	private Long anoFabricacaoVeiculo;

	@Column(name = "CV_ANO_MODELO")
	private Long anoModelo;

	@Column(name = "CV_NUMERO_MOTOR_VEICULO")
	private Long numeroMotorVeiculo;

	@Column(name = "CV_NUM_PORTAS_VEICULO")
	private Long numeroPortasDoVeiculo;

	@Length(max = 6)
	@Column(name = "CC_NIVEL_COMBUSTIVEL")
	private String nivelCombustivel;

	@Column(name = "CC_TIPO_COMBUSTIVEL")
	private String tipoCombustivel;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
}

