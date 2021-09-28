package com.oficinagenericagestao.oficinagenericagestao.dto;

import com.oficinagenericagestao.oficinagenericagestao.domain.Endereco;
import com.oficinagenericagestao.oficinagenericagestao.domain.Telefones;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto implements Serializable {

    @NotNull
    private String nomeCliente;
    @NotNull
    private String cpf;

    @Length(min = 6, max = 8)
    private List<TelefoneDto> telefones;
    private Date dataCriacao;
    private Date dataAtualizacao;
    private EnderecoDto enderecoDto;
}
