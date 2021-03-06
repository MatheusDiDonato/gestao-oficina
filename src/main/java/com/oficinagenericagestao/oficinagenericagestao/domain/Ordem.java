package com.oficinagenericagestao.oficinagenericagestao.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Ordem implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne (cascade=CascadeType.PERSIST)
    @JoinColumn(name = "carro_id")
    private Carro carro;
    @OneToOne (cascade=CascadeType.PERSIST)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Ordem(Long id, Carro carro, Cliente cliente) {
        this.id = id;
        this.carro = carro;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

 
}
