package com.oficinagenericagestao.oficinagenericagestao.Utils;

import com.oficinagenericagestao.oficinagenericagestao.domain.Endereco;
import org.springframework.web.client.RestTemplate;

public class ClienteUtils {

    private static final String apiCep = "https://brasilapi.com.br/api/cep/v1/";

    public static Endereco criaEndereco(String cep, String complement, Integer number){
        RestTemplate restTemplate = new RestTemplate();
        Endereco endereco = restTemplate.getForObject(apiCep + cep, Endereco.class);
        endereco.setComplement(complement);
        endereco.setNumber(number);
        return endereco;
    }

}
