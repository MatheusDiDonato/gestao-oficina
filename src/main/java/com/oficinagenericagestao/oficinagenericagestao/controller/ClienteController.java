package com.oficinagenericagestao.oficinagenericagestao.controller;

import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import com.oficinagenericagestao.oficinagenericagestao.dto.ClienteDto;
import com.oficinagenericagestao.oficinagenericagestao.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController("/cliente")
public class ClienteController {

    private final ModelMapper mapper;
    private final ClienteService clienteService;


    @GetMapping("/busca-por-cpf/{cpf}")
    public ResponseEntity<ClienteDto> findClienteByCpf(@PathVariable String cpf) {
        return ResponseEntity.ok(clienteService.findClienteByCpf(cpf));
    }

    @GetMapping("/busca-todos-clientes")
    public ResponseEntity<List<ClienteDto>> findAllClientes() {
        return ResponseEntity.ok(clienteService.findAllClientes());
    }

    @PostMapping("/cadastrar-cliente")
    public ResponseEntity<ClienteDto> cadastrarCliente(){
        return ResponseEntity.ok(clienteService.cadastrarCliente());
    }
}
