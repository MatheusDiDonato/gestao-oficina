package com.oficinagenericagestao.oficinagenericagestao.resource;

import java.util.List;

import javax.persistence.NoResultException;

import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import com.oficinagenericagestao.oficinagenericagestao.repository.CarroRepository;
import com.oficinagenericagestao.oficinagenericagestao.repository.ClienteRepository;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemDeServicoRepository;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping (value = "/acesso")
@RestController
public class SalvarCarroResource {

	@Autowired
	private OrdemRepository ordemRepository;

	@Autowired
	private OrdemDeServicoRepository ordemDeServicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private CarroRepository carroRepository;

	@GetMapping(value = "/busca-ordem-de-servico")
	public Iterable<OrdemDeServico> teste() {
		return ordemDeServicoRepository.findAll();
	}

	@GetMapping(value = "/busca-veiculo/{placa}")
	public ResponseEntity<?> buscaCarroPorPlaca(@PathVariable String placa) {
		try{
		List<Carro> carro = carroRepository.findByPlacaDoVeiculo(placa);
		}catch(NoResultException e){
			e.fillInStackTrace();
		}
	List<Carro> carro = carroRepository.findByPlacaDoVeiculo(placa);
	return ResponseEntity.ok().body(carro);
	}

	@PostMapping(value = "/insere-veiculo")
	public ResponseEntity cadastraVeiculo(@RequestBody Carro carro){
		System.out.println(carro);
		carroRepository.save(carro);
		return ResponseEntity.ok().body(carro);
	}
}
