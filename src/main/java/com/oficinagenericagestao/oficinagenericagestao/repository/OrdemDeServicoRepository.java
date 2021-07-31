package com.oficinagenericagestao.oficinagenericagestao.repository;

import com.oficinagenericagestao.oficinagenericagestao.Dto.OrdemDeServicoDTO;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
@EnableJpaRepositories
public interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico, Long>{

    @Query(value = "select o from OrdemDeServico o where o.carro.carroId in " +
            "(select c.carroId from Carro c where c.placaDoVeiculo = :placa)")
    List<OrdemDeServico> findOrdemServicosByPlaca(String placa);

//    @Query(value = "select o from OrdemDeServico where ")
//    List<OrdemDeServico> findOrdemServicosByPlaca(String placa);
}

