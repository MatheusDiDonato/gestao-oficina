package com.oficinagenericagestao.oficinagenericagestao.controller;

import com.oficinagenericagestao.oficinagenericagestao.dto.OrdemDeServicoDTO;
import com.oficinagenericagestao.oficinagenericagestao.service.serviceImpl.OrdemDeServicoServiceImpl;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemDeServicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/ordem-de-servico")
public class OrdemDeServicoController {


    public final OrdemDeServicoRepository ordemDeServicoRepository;

    public final OrdemDeServicoServiceImpl ordemDeServicoServiceImpl;


    @GetMapping("/busca")
    public ResponseEntity<?> buscaOrdens() {
        return ResponseEntity.ok().body(ordemDeServicoRepository.findAll());
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> criaOrdemDeServico(@RequestBody OrdemDeServicoDTO ordemDeServicoDTO) {
        return ordemDeServicoServiceImpl.registraOrdemDeServico(ordemDeServicoDTO);
    }

    @GetMapping("/busca-por-placa/{placa}")
    public ResponseEntity<?> buscarOrdemPorPlacaDoVeiculo(@PathVariable String placa) {
        return ResponseEntity.ok(ordemDeServicoServiceImpl.findOrdemDeServicoByPlacaVeiculo(placa));
    }


}
