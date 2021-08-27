package com.oficinagenericagestao.oficinagenericagestao.service;

import com.oficinagenericagestao.oficinagenericagestao.dto.VeiculoDto;
import com.oficinagenericagestao.oficinagenericagestao.domain.Veiculo;
import org.springframework.stereotype.Service;

@Service
public interface VeiculoService {

    Veiculo insertVeiculo(VeiculoDto veiculoDto);


}

