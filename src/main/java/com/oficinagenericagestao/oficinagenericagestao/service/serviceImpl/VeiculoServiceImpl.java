package com.oficinagenericagestao.oficinagenericagestao.service.serviceImpl;

import com.oficinagenericagestao.oficinagenericagestao.dto.VeiculoDto;
import com.oficinagenericagestao.oficinagenericagestao.service.VeiculoService;
import com.oficinagenericagestao.oficinagenericagestao.domain.Veiculo;
import com.oficinagenericagestao.oficinagenericagestao.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@RequiredArgsConstructor
@Service
public class VeiculoServiceImpl implements VeiculoService {

    private final ModelMapper mapper;
    private final VeiculoRepository veiculoRepository;

    @Override
    public Veiculo insertVeiculo(@Valid VeiculoDto veiculoDto) {
        Veiculo veiculo = mapper.map(veiculoDto, Veiculo.class);
        return veiculoRepository.save(veiculo);
    }


}
