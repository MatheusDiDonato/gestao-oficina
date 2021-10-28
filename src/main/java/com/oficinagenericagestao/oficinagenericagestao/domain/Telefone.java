package com.oficinagenericagestao.oficinagenericagestao.domain;

import com.oficinagenericagestao.oficinagenericagestao.enums.TipoDeNumeroTelefonico;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TELEFONE")
public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTelefone;

    @Column(name = "TIPO_CONTATO")
    @Enumerated(EnumType.STRING)
    private TipoDeNumeroTelefonico tipoDeNumeroTelefonico;

    @Column(name = "NUMERO_CONTATO")
    private String numeroTelefone;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;

}
