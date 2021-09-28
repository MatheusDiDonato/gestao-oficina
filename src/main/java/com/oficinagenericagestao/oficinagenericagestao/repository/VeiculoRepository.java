package com.oficinagenericagestao.oficinagenericagestao.repository;

import com.oficinagenericagestao.oficinagenericagestao.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    @Query(value = "select v from Veiculo v")
     List<Veiculo> findAllVeiculos();

    @Query(value = "select v from Veiculo v where v.placaVeiculo =:placa")
    List<Veiculo> findByPlacaDoVeiculo(String placa);
}
