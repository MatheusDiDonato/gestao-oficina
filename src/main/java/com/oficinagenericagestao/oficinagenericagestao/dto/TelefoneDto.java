package com.oficinagenericagestao.oficinagenericagestao.dto;

import com.oficinagenericagestao.oficinagenericagestao.enums.TipoDeNumeroTelefonico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneDto implements Serializable {

    private TipoDeNumeroTelefonico tipoDeNumeroTelefonico;
    private String numeroTelefone;
}
