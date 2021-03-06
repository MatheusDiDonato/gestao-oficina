package com.oficinagenericagestao.oficinagenericagestao.Controller;

import com.oficinagenericagestao.oficinagenericagestao.Service.OrdemDeServicoService;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemDeServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ordem")
public class OrdemDeServicoController {

    @Autowired
    public OrdemDeServicoRepository ordemDeServicoRepository;

    public final OrdemDeServicoService ordemDeServicoService;

    public OrdemDeServicoController(OrdemDeServicoService ordemDeServicoService) {
        this.ordemDeServicoService = ordemDeServicoService;
    }

    @GetMapping("/busca-ordens-de-servico")
    public ResponseEntity<?> buscaOrdens(){
        return ResponseEntity.ok().body(ordemDeServicoRepository.findAll());
    }

    @PostMapping("/registra-ordem")
    public ResponseEntity<?> criaOrdemDeServico(@RequestBody OrdemDeServico ordemDeServico){
        return ResponseEntity.ok().body(ordemDeServicoService.registraOrdemDeServico(ordemDeServico));
    }
}
