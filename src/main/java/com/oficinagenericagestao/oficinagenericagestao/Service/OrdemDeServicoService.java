package com.oficinagenericagestao.oficinagenericagestao.Service;

import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import com.oficinagenericagestao.oficinagenericagestao.repository.CarroRepository;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemDeServicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;

@Service
public class OrdemDeServicoService {

    @Autowired
    private OrdemDeServicoRepository ordemDeServicoRepository;
    @Autowired
    private CarroRepository carroRepository;

    public ResponseEntity<?> registraOrdemDeServico(OrdemDeServico ordemDeServico) {
        if (ordemDeServico.getCarro().getPlacaDoVeiculo() == null) {
            return ResponseEntity.badRequest().body("A placa do veiculo não pode ser nula.");
        } else if (ordemDeServico.getCliente().getNome() == null) {
            return ResponseEntity.badRequest().body("O cliente não pode ser nulo");
        } else if (ordemDeServico.getCliente().getTelefone() == null) {
            return ResponseEntity.badRequest().body("O cliente não pode ser nulo");
        }
        return ResponseEntity.ok().body(ordemDeServicoRepository.save(ordemDeServico));
    }


    public ResponseEntity<?> buscaOrdemPorPlaca(String placa) {

        Collection<OrdemDeServico> ordemDeServicos = (Collection<OrdemDeServico>) ordemDeServicoRepository.findAllByCarroPlacaDoVeiculo(placa);

        if (ordemDeServicos.isEmpty()) {
            return ResponseEntity.ok().body("Ordem de serviço ou placa não foi encontrada.");
        } else {
            return ResponseEntity.badRequest().body(ordemDeServicos);
        }
    }



}




