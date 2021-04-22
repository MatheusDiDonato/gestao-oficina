package com.oficinagenericagestao.oficinagenericagestao.repository;

import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico, Long>{

    @Query(value = "select o from OrdemDeServico o where o.carro.id in " +
            "(select c.id from Carro c where c.placaDoVeiculo = :placa)")
    List<OrdemDeServico> buscaPorPlaca(String placa);

}

