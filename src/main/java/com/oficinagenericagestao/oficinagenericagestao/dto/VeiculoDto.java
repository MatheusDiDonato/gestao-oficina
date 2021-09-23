package com.oficinagenericagestao.oficinagenericagestao.dto;

import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoDto {

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

    private Cliente cliente;
}
