package com.oficinagenericagestao.oficinagenericagestao.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Long>{
	

}
