/*package com.oficinagenericagestao.Service;

import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;
import com.oficinagenericagestao.oficinagenericagestao.repository.CarroRepository;

import org.springframework.stereotype.Service;

@Service
public class CarroService {
    
    private CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository){
    }

    private Carro procuraCarro(String placa){
    return carroRepository.findByPlacaDoVeiculo(placa).get();
    }

}
*/