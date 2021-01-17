package com.oficinagenericagestao.oficinagenericagestao.resource;

import java.util.Date;
import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;
import com.oficinagenericagestao.oficinagenericagestao.repository.CarroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/acesso")
@RestController
public class SalvarCarroResource {

	@Autowired
	private CarroRepository carroRepository;
	private Iterable<Carro> findAll;

	@GetMapping
	public Iterable<Carro> teste() {
		return carroRepository.findAll();
	}

	private Iterable<Carro> ResponseBody(Iterable<Carro> findAll) {
		return null;
	}

	@PostMapping
	public ResponseEntity<Iterable<Carro>> ordemDeServico() {
		Date date = new Date();
		Carro carro = new Carro();
		carro.setMarcaDoVeiculo("ford");
		carro.setModeloDoVeiculo("modeloDoVeiculo");
		carro.setPlacaDoVeiculo("asd4589");
		carro.setCorDoVeiculo("azs");
		carro.setAnoFabricacaoDoVeiculo(2009);
		carro.setAnoModelo(2003);
		carro.setNumeroDeMotorDoVeiculo(45889);
		carro.setNumeroDePortasDoVeiculo(4);
		carro.setNivelCombustivel("xbbbbxxx");
		carro.setTipoDeCombustivel("fgas");
		// carro.setDataDeEntrada();
		carroRepository.save(carro);

		return ResponseEntity.ok(carroRepository.findAll());
	}

}
