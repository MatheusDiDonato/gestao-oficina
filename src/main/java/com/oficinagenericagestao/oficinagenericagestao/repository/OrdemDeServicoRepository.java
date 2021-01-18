package com.oficinagenericagestao.oficinagenericagestao.repository;

import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface OrdemDeServicoRepository extends CrudRepository <OrdemDeServico, Long> {

}
