package com.oficinagenericagestao.oficinagenericagestao.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.oficinagenericagestao.oficinagenericagestao.enums.ServicosPrestados;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDEM_DE_SERVICO")
public class OrdemDeServico implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "UTC")
    private Date dataCriacaoOrdem;

    @Column(name = "CD_FINALIZACAO_ORDEM")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "UTC")
    private Date dataFinalizacaoOrdem;

    @Column(name = "CD_ENTRADA_VEICULO")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "UTC")
    private Date dataDeEntradaVeiculo = new Date();

    @Column(name = "CD_SAIDA_VEICULO")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "UTC")
    private Date dataDeSaidaVeiculo;

    @Column(name = "CC_DESCRICAO_ORD_SERVICO")
    private String descricao;

    @Column(name = "CV_VALOR_SERVICO")
    private BigDecimal valorDoServico;

    @Column(name = "CB_ORDEM_ATIVA")
    private Boolean ordemAtiva = true;

}
