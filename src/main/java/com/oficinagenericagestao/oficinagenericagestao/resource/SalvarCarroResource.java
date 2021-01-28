package com.oficinagenericagestao.oficinagenericagestao.resource;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;
import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import com.oficinagenericagestao.oficinagenericagestao.domain.Endereco;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import com.oficinagenericagestao.oficinagenericagestao.enums.ServicosPrestados;
import com.oficinagenericagestao.oficinagenericagestao.repository.CarroRepository;
import com.oficinagenericagestao.oficinagenericagestao.repository.ClienteRepository;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemDeServicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Builder;


@Builder
@RequestMapping("/acesso")
@RestController
public class SalvarCarroResource {

	//@Autowired
	private CarroRepository carroRepository;
	@Autowired
	private OrdemDeServicoRepository ordemDeServicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping
	public Iterable<OrdemDeServico> teste() {
		
		return ordemDeServicoRepository.findAll();

	}
	
	@PostMapping
	public OrdemDeServico RegistraOrdemDeServico() {
	
		/*Cliente cliente = new Cliente();
		cliente.setNome("mat");
		cliente.setTelefone("258");

		clienteRepository.save(cliente);*/


		
		OrdemDeServico ordemDeServico = new OrdemDeServico();
		Date date = new Date();

		Carro carro = new Carro();
		carro.setModeloDoVeiculo(ordemDeServico.getCarro().getModeloDoVeiculo());
		carro.setPlacaDoVeiculo(ordemDeServico.getCarro().getPlacaDoVeiculo());
		carro.setCorDoVeiculo(ordemDeServico.getCarro().getCorDoVeiculo());
		carro.setAnoFabricacaoDoVeiculo(ordemDeServico.getCarro().getAnoFabricacaoDoVeiculo());
		carro.setAnoModelo(2003);
		carro.setNumeroDeMotorDoVeiculo(45889);
		carro.setNumeroDePortasDoVeiculo(4);
		carro.setNivelCombustivel("xbbbbxxx");
		carro.setTipoDeCombustivel("fgas");

		Cliente cliente = new Cliente();
		cliente.setNome("matheus");
		cliente.setTelefone("258932");

		//Endereco endereco = new Endereco("Marroio", 114, "casa 3", 02052100, "Sao Paulo");

		ordemDeServico.setCarro(carro);
		ordemDeServico.setCliente(cliente);
		ordemDeServico.setDataDeEntrada(LocalDateTime.now());
		ordemDeServico.setServicosPrestados(ServicosPrestados.MOTOR_COMPLETO);
		ordemDeServico.setValorDoServico(new BigDecimal(280.0));
		ordemDeServico.setDescicao("problemas no motor parte superior");

		ordemDeServicoRepository.save(ordemDeServico);
		return (OrdemDeServico) ordemDeServicoRepository.findAll();
		
	}

}
