package com.oficinagenericagestao.oficinagenericagestao.service;

import com.oficinagenericagestao.oficinagenericagestao.dto.ClienteDto;
import com.oficinagenericagestao.oficinagenericagestao.dto.ClienteVeiculoDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    ClienteDto findClienteByCpf(String cpf);

    List<ClienteDto> findAllClientes();

    ClienteDto cadastrarCliente(ClienteDto clienteDto);

    ClienteVeiculoDto findClienteAndVeiculosByCpf(String cpf);

}
