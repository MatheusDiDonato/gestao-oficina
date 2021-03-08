package com.oficinagenericagestao.oficinagenericagestao.repository;

import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico, Long> {

    Iterable<OrdemDeServico> findAllByCarroPlacaDoVeiculo(String placa);
}
