package com.oficinagenericagestao.oficinagenericagestao.dto;

import com.oficinagenericagestao.oficinagenericagestao.domain.Endereco;
import com.oficinagenericagestao.oficinagenericagestao.domain.Telefones;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {

    private String nomeCliente;

    private String cpf;

    private List<Telefones> telefones;

    private Endereco endereco;
}
