package com.oficinagenericagestao.oficinagenericagestao.Controller;

import com.oficinagenericagestao.oficinagenericagestao.Dto.OrdemDeServicoDTO;
import com.oficinagenericagestao.oficinagenericagestao.Service.ServiceImpl.OrdemDeServicoServiceImpl;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemDeServicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequiredArgsConstructor
@RequestMapping("/ordem")
public class OrdemDeServicoController {


    public final OrdemDeServicoRepository ordemDeServicoRepository;

    public final OrdemDeServicoServiceImpl ordemDeServicoServiceImpl;


    @GetMapping("/busca-ordens-de-servico")
    public ResponseEntity<?> buscaOrdens() {
        return ResponseEntity.ok().body(ordemDeServicoRepository.findAll());
    }

    @PostMapping("/registra-ordem")
    public ResponseEntity<?> criaOrdemDeServico(@RequestBody OrdemDeServicoDTO ordemDeServicoDTO) {
        return ordemDeServicoServiceImpl.registraOrdemDeServico(ordemDeServicoDTO);
    }

    @GetMapping("/busca-ordem-por-placa/{placa}")
    public ResponseEntity<?> buscarOrdemPorPlacaDoVeiculo(@PathVariable String placa) {
        return ResponseEntity.ok(ordemDeServicoServiceImpl.findOrdemDeServicoByPlacaVeiculo(placa));
    }


}
