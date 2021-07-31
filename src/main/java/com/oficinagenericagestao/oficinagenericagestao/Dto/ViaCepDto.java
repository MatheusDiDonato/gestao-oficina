package com.oficinagenericagestao.oficinagenericagestao.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViaCepDto {
    private String cep;
    private String city;
    private String neighborhood;
    private String service;
    private String state;
    private String street;
    private String complemento;
    private String NumeroDaResidencia;

}
