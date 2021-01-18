package com.oficinagenericagestao.oficinagenericagestao.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

@Entity
public class OrdemDeServico {

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
    private LocalDateTime dataDeEntrada;
    private String descicao;
    private BigDecimal valorDoServico;
    

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ServicosPrestados getServicosPrestados() {
        return servicosPrestados;
    }

    public void setServicosPrestados(ServicosPrestados servicosPrestados) {
        this.servicosPrestados = servicosPrestados;
    }

    public LocalDateTime getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(LocalDateTime dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorDoServico() {
        return valorDoServico;
    }

    public void setValorDoServico(BigDecimal valorDoServico) {
        this.valorDoServico = valorDoServico;
    }

}
