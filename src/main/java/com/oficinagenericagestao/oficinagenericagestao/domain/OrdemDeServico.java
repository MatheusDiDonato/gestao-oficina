package com.oficinagenericagestao.oficinagenericagestao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.oficinagenericagestao.oficinagenericagestao.enums.ServicosPrestados;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrdemDeServico implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne (cascade=CascadeType.PERSIST)
    @JoinColumn(name = "carro_id")
    private Carro carro;
    @OneToOne (cascade=CascadeType.PERSIST)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;


    @Enumerated(EnumType.STRING)
    private ServicosPrestados servicosPrestados;
    private Date dataDeEntrada;
    private String descricao;
    private BigDecimal valorDoServico;

}
