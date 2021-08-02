package com.oficinagenericagestao.oficinagenericagestao.Controller;

import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;
import com.oficinagenericagestao.oficinagenericagestao.repository.CarroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/carro")
public class CarroController {

    public final CarroRepository carroRepository;

    @GetMapping("/listar-carros")
    public ResponseEntity<List<Carro>> buscaVeiculos() {
        return ResponseEntity.ok().body(carroRepository.findAllCarros());
    }


}
