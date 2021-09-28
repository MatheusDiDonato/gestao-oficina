package com.oficinagenericagestao.oficinagenericagestao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import com.oficinagenericagestao.oficinagenericagestao.enums.ServicosPrestados;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDEM_DE_SERVICO")
public class OrdemDeServico implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOrdemDeServico;

    @OneToOne
    @JoinColumn(name = "carro_id")
    private Veiculo veiculo;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Enumerated(EnumType.STRING)
    @Column(name = "CC_SERVICO_PRESTADO")
    private ServicosPrestados servicosPrestados;

    @Column(name = "CD_CRIACAO_ORDEM")
    private Date dataCriacaoOrdem;

    @Column(name = "CD_FINALIZACAO_ORDEM")
    private Date dataFinalizacaoOrdem;

    @Column(name = "CD_ENTRADA_VEICULO")
    private Date dataDeEntradaVeiculo = new Date();

    @Column(name = "CD_SAIDA_VEICULO")
    private Date dataDeSaidaVeiculo;

    @Column(name = "CC_DESCRICAO_ORD_SERVICO")
    private String descricao;

    @Column(name = "CV_VALOR_SERVICO")
    private BigDecimal valorDoServico;

    @Column(name = "CB_ORDEM_ATIVA")
    private Boolean ordemAtiva = true;

}
