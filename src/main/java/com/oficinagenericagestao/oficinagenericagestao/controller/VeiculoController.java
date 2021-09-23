package com.oficinagenericagestao.oficinagenericagestao.controller;

import exceptions.VeiculoException;
import com.gtbr.ViaCepClient;
import com.gtbr.domain.Cep;
import com.oficinagenericagestao.oficinagenericagestao.dto.VeiculoDto;
import com.oficinagenericagestao.oficinagenericagestao.service.VeiculoService;
import com.oficinagenericagestao.oficinagenericagestao.domain.Veiculo;
import com.oficinagenericagestao.oficinagenericagestao.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/veiculo")
public class VeiculoController {

    public final VeiculoRepository veiculoRepository;
    public final VeiculoService veiculoService;

    @GetMapping("/listar-veiculos")
    public ResponseEntity<List<Veiculo>> buscaVeiculos() {
        List<Veiculo> veiculoLista = veiculoRepository.findAllVeiculos();
        if (veiculoLista.isEmpty()) throw new VeiculoException("Não existem veículos para serem listdos!");
        return ResponseEntity.ok().body(veiculoLista);
    }

    @PostMapping("/cadastrar-veiculo")
    public ResponseEntity<Veiculo> cadastrarVeiculo(@RequestBody VeiculoDto veiculoDto) {
        return ResponseEntity.ok().body(veiculoService.insertVeiculo(veiculoDto));
    }

    @GetMapping("/cep/{cep}")
    public ResponseEntity<Cep> buscaCep(@PathVariable String cep){
        return ResponseEntity.ok(ViaCepClient.findCep(cep));
    }

}
