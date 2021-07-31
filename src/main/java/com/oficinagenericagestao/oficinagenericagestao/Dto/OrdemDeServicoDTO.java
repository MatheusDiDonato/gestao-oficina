package com.oficinagenericagestao.oficinagenericagestao.Dto;

import com.oficinagenericagestao.oficinagenericagestao.Utils.ClienteUtils;
import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;
import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import com.oficinagenericagestao.oficinagenericagestao.domain.Endereco;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import com.oficinagenericagestao.oficinagenericagestao.enums.ServicosPrestados;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdemDeServicoDTO {

    private Carro carro;
    private Cliente cliente;
    private ServicosPrestados servicosPrestados;
    private Date dataDeEntrada;
    private String descricao;
    private BigDecimal valorDoServico;
    private Boolean statusDeOrdem;


}
