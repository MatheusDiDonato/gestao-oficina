package com.oficinagenericagestao.oficinagenericagestao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String numeroDaResidencia;

    private String cep;

    private String estado;

    private String cidade;

    private String bairro;

    private String rua;

    private String complemento;
}
