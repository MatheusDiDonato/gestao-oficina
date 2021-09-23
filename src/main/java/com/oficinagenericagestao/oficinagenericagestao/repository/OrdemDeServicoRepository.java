package com.oficinagenericagestao.oficinagenericagestao.repository;

import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico, Long>{

    @Query(value = "select o from OrdemDeServico o where o.veiculo.placaVeiculo = :placa")
    List<OrdemDeServico> findOrdemDeServicoByPlacaDoVeiculo(String placa);

}

