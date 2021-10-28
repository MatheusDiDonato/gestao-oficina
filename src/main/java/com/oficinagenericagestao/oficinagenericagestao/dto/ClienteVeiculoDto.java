package com.oficinagenericagestao.oficinagenericagestao.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.oficinagenericagestao.oficinagenericagestao.domain.Endereco;
import com.oficinagenericagestao.oficinagenericagestao.domain.Telefone;
import com.oficinagenericagestao.oficinagenericagestao.domain.Veiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteVeiculoDto implements Serializable {

    private String nomeCliente;
    private String cpf;
    private List<Telefone> telefones;
    private Endereco endereco;
    private List<Veiculo> veiculos;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "UTC")
    private Date dataCriacao;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "UTC")
    private Date dataAtualizacao;
}
