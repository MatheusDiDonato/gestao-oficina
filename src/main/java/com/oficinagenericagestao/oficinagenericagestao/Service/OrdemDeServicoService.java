package com.oficinagenericagestao.oficinagenericagestao.Service;

import com.oficinagenericagestao.oficinagenericagestao.Dto.OrdemDeServicoDTO;
import com.oficinagenericagestao.oficinagenericagestao.Utils.ClienteUtils;
import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;
import com.oficinagenericagestao.oficinagenericagestao.domain.Endereco;
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

    public ResponseEntity<?> registraOrdemDeServico(OrdemDeServicoDTO ordemDeServicoDTO) {
        if (ordemDeServicoDTO.getCarro().getPlacaDoVeiculo() == null) {
            return ResponseEntity.badRequest().body("A placa do veiculo não pode ser nula.");
        } else if (ordemDeServicoDTO.getCliente().getNome() == null) {
            return ResponseEntity.badRequest().body("O cliente não pode ser nulo");
        } else if (ordemDeServicoDTO.getCliente().getTelefone() == null) {
            return ResponseEntity.badRequest().body("O cliente não pode ser nulo");
        }
        OrdemDeServico ordemDeServico = ordemDeServicoDTO.converteOrdemDeServicoDtoparaOrdemDeServico();
        return ResponseEntity.ok().body(ordemDeServicoRepository.save(ordemDeServico));
    }


    public List<OrdemDeServico> buscaOrdemPorPlaca(String placa) {
        return ordemDeServicoRepository.buscaPorPlaca(placa);
    }

}




