package com.oficinagenericagestao.oficinagenericagestao.Service;

import com.oficinagenericagestao.oficinagenericagestao.Dto.OrdemDeServicoDTO;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public interface OrdemDeServicoService {

    ResponseEntity registraOrdemDeServico(@Valid OrdemDeServicoDTO ordemDeServicoDTO);

    List<OrdemDeServico> findOrdemDeServicoByPlacaVeiculo(String placa);


}
