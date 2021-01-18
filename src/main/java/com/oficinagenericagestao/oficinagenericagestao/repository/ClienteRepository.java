package com.oficinagenericagestao.oficinagenericagestao.repository;

import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
