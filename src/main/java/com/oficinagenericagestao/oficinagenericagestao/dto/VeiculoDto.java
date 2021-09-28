package com.oficinagenericagestao.oficinagenericagestao.dto;

import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoDto implements Serializable {

    private String marcaDoVeiculo;

    private String modeloDoVeiculo;

    private String placaDoVeiculo;

    private String corDoVeiculo;

    private Long anoFabricacaoDoVeiculo;

    private Long anoModelo;

    private Long numeroDeMotorDoVeiculo;

    private Long numeroDePortasDoVeiculo;

    private String nivelCombustivel;

    private String tipoDeCombustivel;

}
