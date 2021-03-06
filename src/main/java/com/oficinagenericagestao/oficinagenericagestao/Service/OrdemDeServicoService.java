package com.oficinagenericagestao.oficinagenericagestao.Service;

import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemDeServicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrdemDeServicoService {

    @Autowired
    private OrdemDeServicoRepository ordemDeServicoRepository;

    public ResponseEntity<?> registraOrdemDeServico(OrdemDeServico ordemDeServico){
        if(ordemDeServico.getCarro().getPlacaDoVeiculo() == null){
            return ResponseEntity.badRequest().body("A placa do veiculo não pode ser nula.");
        }else if (ordemDeServico.getCliente() == null){
            return ResponseEntity.badRequest().body("O cliente não pode ser nulo");
        }
         return ResponseEntity.badRequest().body(ordemDeServicoRepository.save(ordemDeServico));
    }

}
