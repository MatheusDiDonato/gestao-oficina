package com.oficinagenericagestao.oficinagenericagestao.repository;

import java.util.List;
import java.util.Optional;

import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Long>{
    
    @Query(value = "select ca from carro ca where ca.placa_do_veiculo = :placa")
   List<Carro> findByPlacaDoVeiculo(String placa);

  
    
}
