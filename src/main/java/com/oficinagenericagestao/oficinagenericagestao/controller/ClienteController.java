package com.oficinagenericagestao.oficinagenericagestao.controller;

import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import com.oficinagenericagestao.oficinagenericagestao.dto.ClienteDto;
import com.oficinagenericagestao.oficinagenericagestao.dto.ClienteVeiculoDto;
import com.oficinagenericagestao.oficinagenericagestao.service.ClienteService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @ApiResponse(description = "Retorna a lista de pessoa")
    @PostMapping("/cadastrar-cliente")
    public ResponseEntity<ClienteDto> insertNewCliente(@RequestBody ClienteDto clienteDto) {
        return ResponseEntity.ok(clienteService.cadastrarCliente(clienteDto));
    }


    @GetMapping("/busca-cliente-e-veiculos-por-cpf/{cpf}")
    public ResponseEntity<ClienteVeiculoDto> findClienteAndVeiculosByCpf(@PathVariable String cpf) {
        return ResponseEntity.ok(clienteService.findClienteAndVeiculosByCpf(cpf));
    }

}
