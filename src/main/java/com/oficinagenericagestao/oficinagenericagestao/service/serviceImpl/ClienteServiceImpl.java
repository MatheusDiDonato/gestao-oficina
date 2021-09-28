package com.oficinagenericagestao.oficinagenericagestao.service.serviceImpl;

import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import com.oficinagenericagestao.oficinagenericagestao.dto.ClienteDto;
import com.oficinagenericagestao.oficinagenericagestao.dto.ClienteVeiculoDto;
import com.oficinagenericagestao.oficinagenericagestao.repository.ClienteRepository;
import com.oficinagenericagestao.oficinagenericagestao.service.ClienteService;
import com.oficinagenericagestao.oficinagenericagestao.service.Exception.ClienteException;
import com.oficinagenericagestao.oficinagenericagestao.utils.ClienteUtils;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService {

    private final ModelMapper mapper;
    private final ClienteRepository clienteRepository;

    @Override
    public ClienteDto findClienteByCpf(String cpf) {
        Cliente cliente = clienteRepository.findClienteByCpf(cpf);
        if (Objects.isNull(cliente)) {
            throw new ClienteException("Cliente não encontrado na base de dados");
        }
        ClienteDto clienteDto = mapper.map(cliente, ClienteDto.class);
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
    public ClienteDto cadastrarCliente(ClienteDto clienteDto) {
        clienteDto.setDataCriacao(new Date());
        clienteDto.getTelefones().forEach(e->{
            ClienteUtils.validadorDeTelefone(e.getNumeroTelefone());
        });
        if (Objects.nonNull(clienteRepository.findClienteByCpf(clienteDto.getCpf()))) {
            throw new ClienteException("Cliente já cadastrado na base");
        } else {
            Cliente cliente = mapper.map(clienteDto, Cliente.class);
            clienteRepository.save(cliente);
        }
        return clienteDto;
    }

    @Override
    public ClienteVeiculoDto findClienteAndVeiculosByCpf(String cpf) {
        try {
            return mapper.map(clienteRepository.findClienteByCpf(cpf), ClienteVeiculoDto.class);
        }catch (NullPointerException | IllegalArgumentException e){
            throw new ClienteException("Cliente não encontrado com este cpf");
        }
    }


}
