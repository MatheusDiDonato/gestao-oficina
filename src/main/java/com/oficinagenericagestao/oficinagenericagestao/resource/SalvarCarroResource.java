package com.oficinagenericagestao.oficinagenericagestao.resource;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;
import com.oficinagenericagestao.oficinagenericagestao.repository.CarroRepository;

@RequestMapping("/acesso")
@RestController
public class SalvarCarroResource {

	@Autowired
	private CarroRepository carroRepository;


	
	@GetMapping
	public String teste() {
		return "funionando";
	}


	@PostMapping
	public Iterable<Carro> ordemDeServico(@RequestBody Carro carro) {
	
		carroRepository.save(carro);
		return ResponseEntity.ok(carroRepository.findAll());
	}

}
