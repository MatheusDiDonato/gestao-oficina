package com.oficinagenericagestao.oficinagenericagestao.Service.ServiceImpl;

import Exceptions.OrdemDeServiceException;
import com.oficinagenericagestao.oficinagenericagestao.Dto.OrdemDeServicoDTO;
import com.oficinagenericagestao.oficinagenericagestao.Service.OrdemDeServicoService;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import com.oficinagenericagestao.oficinagenericagestao.repository.CarroRepository;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemDeServicoRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrdemDeServicoServiceImpl implements OrdemDeServicoService {

    private final ModelMapper mapper;
    private final OrdemDeServicoRepository ordemDeServicoRepository;
    private final CarroRepository carroRepository;

    public ModelMapper modelMapper () {
        ModelMapper modelMapper = novo ModelMapper ();
        return modelMapper;
    }

    public ResponseEntity registraOrdemDeServico(@Valid OrdemDeServicoDTO ordemDeServicoDTO) {
        if (ordemDeServicoDTO.getCarro().equals(null)
                || ordemDeServicoDTO.getCliente().equals(null)) {
            throw new OrdemDeServiceException("Cliente ou Veiculo não podem ser nulos.");
        }
      OrdemDeServico ordem =  mapper.map(ordemDeServicoDTO, OrdemDeServico.class);
        ordemDeServicoRepository.save(ordem);
        return ResponseEntity.status(201).build();
    }

    @Override
    public List<OrdemDeServico> findOrdemDeServicoByPlacaVeiculo(String placa) {
        return ordemDeServicoRepository.findOrdemServicosByPlaca(placa);
    }
}