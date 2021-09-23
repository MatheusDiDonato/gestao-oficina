package com.oficinagenericagestao.oficinagenericagestao.service.serviceImpl;

import exceptions.OrdemDeServiceException;
import com.oficinagenericagestao.oficinagenericagestao.dto.OrdemDeServicoDTO;
import com.oficinagenericagestao.oficinagenericagestao.service.OrdemDeServicoService;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import com.oficinagenericagestao.oficinagenericagestao.repository.VeiculoRepository;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemDeServicoRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdemDeServicoServiceImpl implements OrdemDeServicoService {

    private final ModelMapper mapper;
    private final OrdemDeServicoRepository ordemDeServicoRepository;
    private final VeiculoRepository veiculoRepository;

    public ModelMapper modelMapper () {
        ModelMapper modelMapper = new ModelMapper ();
        return modelMapper;
    }

    public ResponseEntity registraOrdemDeServico(@Valid OrdemDeServicoDTO ordemDeServicoDTO) {
        if (ordemDeServicoDTO.getVeiculo().equals(null)
                || ordemDeServicoDTO.getCliente().equals(null)) {
            throw new OrdemDeServiceException("Cliente ou Veiculo não podem ser nulos.");
        }
      OrdemDeServico ordem =  mapper.map(ordemDeServicoDTO, OrdemDeServico.class);
        ordemDeServicoRepository.save(ordem);
        return ResponseEntity.status(201).build();
    }

    @Override
    public List<OrdemDeServico> findOrdemDeServicoByPlacaVeiculo(String placa) {
        List<OrdemDeServico> ordemDeServico = ordemDeServicoRepository.findOrdemDeServicoByPlacaDoVeiculo(placa);
        if (ordemDeServico.isEmpty())
            throw new OrdemDeServiceException("Não foram encontradas ordens de serviço para esta placa!");
        else return ordemDeServico;
    }

}