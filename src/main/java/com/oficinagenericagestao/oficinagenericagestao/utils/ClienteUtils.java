package com.oficinagenericagestao.oficinagenericagestao.utils;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import com.oficinagenericagestao.oficinagenericagestao.domain.Endereco;
import com.oficinagenericagestao.oficinagenericagestao.dto.ViaCepDto;
import com.oficinagenericagestao.oficinagenericagestao.service.Exception.ClienteException;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

public class ClienteUtils {

    private static final String apiCep = "https://brasilapi.com.br/api/cep/v1/";

    public static Endereco criaEndereco(String cep, String complement, String number) {
        RestTemplate restTemplate = new RestTemplate();
        ViaCepDto endereco = restTemplate.getForObject(apiCep + cep, ViaCepDto.class);
        if (!Objects.equals(complement, null)) endereco.setComplemento(complement);
        if (!Objects.equals(number, null)) endereco.setNumeroDaResidencia(number);

        return Endereco.builder()
                .numeroDaResidencia(endereco.getNumeroDaResidencia())
                .cep(endereco.getCep())
                .estado(endereco.getState())
                .cidade(endereco.getCity())
                .bairro(endereco.getNeighborhood())
                .rua(endereco.getStreet())
                .complemento(endereco.getComplemento())
                .build();
    }

    public static boolean validadorDeTelefone(String telefone) {
        if (telefone.matches("[0-9]*")) {
            return true;
        } else throw new ClienteException("Numero de telefone incorreto");
    }

    public static boolean cpfValido(String cpf) {
        try {
            CPFValidator cpfValidator = new CPFValidator();
            cpfValidator.assertValid(cpf);
        } catch (InvalidStateException e) {
            e.getInvalidMessages();
        }
        return true;
    }

}
