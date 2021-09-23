package com.oficinagenericagestao.oficinagenericagestao.service;

import com.oficinagenericagestao.oficinagenericagestao.dto.OrdemDeServicoDTO;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public interface OrdemDeServicoService {

    ResponseEntity registraOrdemDeServico(@Valid OrdemDeServicoDTO ordemDeServicoDTO);

    List<OrdemDeServico> findOrdemDeServicoByPlacaVeiculo(String placa);


}
