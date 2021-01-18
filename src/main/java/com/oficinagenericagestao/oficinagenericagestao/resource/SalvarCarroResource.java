package com.oficinagenericagestao.oficinagenericagestao.resource;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;
import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import com.oficinagenericagestao.oficinagenericagestao.domain.Endereco;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import com.oficinagenericagestao.oficinagenericagestao.enums.ServicosPrestados;
import com.oficinagenericagestao.oficinagenericagestao.repository.CarroRepository;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemDeServicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/acesso")
@RestController
public class SalvarCarroResource {

	//@Autowired
	//private CarroRepository carroRepository;
	@Autowired
	private OrdemDeServicoRepository ordemDeServicoRepository;

	/*@GetMapping
	public Optional<Carro> teste(@RequestBody String placa) {
		
		return carroRepository.findById(1L);

	}*/
	
	@PostMapping
	public ResponseEntity<Iterable<OrdemDeServico>> ordemDeServico() {
	
		
		OrdemDeServico ordemDeServico = new OrdemDeServico();
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

		Cliente cliente = new Cliente();
		cliente.setNome("matheus");
		cliente.setTelefone("258932");

		Endereco endereco = new Endereco("Marroio", 114, "casa 3", 02052100, "Sao Paulo");

		ordemDeServico.setCarro(carro);
		ordemDeServico.setCliente(cliente);
		ordemDeServico.setDataDeEntrada(LocalDateTime.now());
		ordemDeServico.setServicosPrestados(ServicosPrestados.MOTOR_COMPLETO);
		ordemDeServico.setValorDoServico(new BigDecimal(280.0));
		ordemDeServico.setDescicao("problemas no motor parte superior");

		ordemDeServicoRepository.save(ordemDeServico);
		
				return ResponseEntity.ok(ordemDeServicoRepository.findAll());
	}

}
