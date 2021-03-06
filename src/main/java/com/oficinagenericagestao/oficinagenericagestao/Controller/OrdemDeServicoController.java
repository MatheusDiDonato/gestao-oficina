package com.oficinagenericagestao.oficinagenericagestao.Controller;

import com.oficinagenericagestao.oficinagenericagestao.Service.OrdemDeServicoService;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ordem")
public class OrdemDeServicoController {

    @Autowired
    private OrdemDeServicoService ordemDeServicoService;
    
    public ResponseEntity<?> criaOrdemDeServico(@RequestBody OrdemDeServico ordemDeServico){
        
        return ResponseEntity.ok().body(ordemDeServicoService.registraOrdemDeServico(ordemDeServico));
    }
}
