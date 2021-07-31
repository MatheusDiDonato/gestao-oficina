package com.oficinagenericagestao.oficinagenericagestao.domain;

import com.oficinagenericagestao.oficinagenericagestao.enums.TipoDeNumeroTelefonico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TelefonesContato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long telefoneId;

    @Column(name = "CC_TIPO_CONTATO")
    @Enumerated(EnumType.STRING)
    private TipoDeNumeroTelefonico tipoDeNumeroTelefonico;

    @Column(name = "CC_NUMERO_CONTATO")
    private String telefoneContato;
}
