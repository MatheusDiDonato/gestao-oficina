package com.oficinagenericagestao.oficinagenericagestao.dto;

import com.oficinagenericagestao.oficinagenericagestao.domain.Veiculo;
import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import com.oficinagenericagestao.oficinagenericagestao.enums.ServicosPrestados;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdemDeServicoDTO {

    private Veiculo veiculo;
    private Cliente cliente;
    private ServicosPrestados servicosPrestados;
    private Date dataDeEntrada;
    private String descricao;
    private BigDecimal valorDoServico;
    private Boolean statusDeOrdem;


}
