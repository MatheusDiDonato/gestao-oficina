package com.oficinagenericagestao.oficinagenericagestao.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ENDERECO")
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEndereco;

    @Column(name = "CC_NUMERO")
    private String numeroDaResidencia;

    @Column(name = "CC_CEP")
    private String cep;

    @Column(name = "CC_ESTADO")
    private String estado;

    @Column(name = "CC_CIDADE")
    private String cidade;

    @Column(name = "CC_BAIRRO")
    private String bairro;

    @Column(name = "CC_RUA")
    private String rua;

    @Column(name = "CC_COMPLEMENTO")
    private String complemento;

}
