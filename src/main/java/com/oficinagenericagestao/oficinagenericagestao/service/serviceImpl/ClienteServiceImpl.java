package com.oficinagenericagestao.oficinagenericagestao.service.serviceImpl;

import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import com.oficinagenericagestao.oficinagenericagestao.dto.ClienteDto;
import com.oficinagenericagestao.oficinagenericagestao.repository.ClienteRepository;
import com.oficinagenericagestao.oficinagenericagestao.service.ClienteService;
import com.oficinagenericagestao.oficinagenericagestao.service.Exception.ClienteException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService {

    private final ModelMapper mapper;
    private final ClienteRepository clienteRepository;

    @Override
    public ClienteDto findClienteByCpf(String cpf) {
       Cliente cliente = clienteRepository.findClienteByCpf(cpf);
        if(Objects.isNull(cliente)){
            throw new ClienteException("Cliente não encontrado na base de dados");
        }
        ClienteDto clienteDto = mapper.map(cliente,ClienteDto.class);
        return clienteDto;
    }

    @Override
    public List<ClienteDto> findAllClientes() {
       List<Cliente> listaClientes = clienteRepository.findAll();
        List<ClienteDto> listaClientesDto = new ArrayList<>();
       listaClientes.forEach(cliente -> {
          listaClientesDto.add(mapper.map(cliente, ClienteDto.class));
      });
       return listaClientesDto;
    }

    @Override
    public ClienteDto cadastrarCliente(ClienteDto clienteRecebido) {
    return clienteRecebido;
    }
}
