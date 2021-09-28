package com.oficinagenericagestao.oficinagenericagestao.dto;

import com.oficinagenericagestao.oficinagenericagestao.domain.Endereco;
import com.oficinagenericagestao.oficinagenericagestao.domain.Telefones;
import com.oficinagenericagestao.oficinagenericagestao.domain.Veiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteVeiculoDto implements Serializable {

    private String nomeCliente;
    private String cpf;
    private List<Telefones> telefones;
    private Endereco endereco;
    private List<Veiculo> veiculos;
    private Date dataCriacao;
    private Date dataAtualizacao;
}
