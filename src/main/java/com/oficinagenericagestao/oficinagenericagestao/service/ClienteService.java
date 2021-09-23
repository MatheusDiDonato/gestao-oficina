package com.oficinagenericagestao.oficinagenericagestao.service;

import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import com.oficinagenericagestao.oficinagenericagestao.dto.ClienteDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

     ClienteDto findClienteByCpf(String cpf);

    List<ClienteDto> findAllClientes();
}
