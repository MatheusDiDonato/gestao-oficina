package com.oficinagenericagestao.oficinagenericagestao.Controller;

import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import com.oficinagenericagestao.oficinagenericagestao.repository.CarroRepository;
import com.oficinagenericagestao.oficinagenericagestao.repository.ClienteRepository;
import com.oficinagenericagestao.oficinagenericagestao.repository.OrdemDeServicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
public class SalvarCarroController {

	// @Autowired
	public CarroRepository carroRepository;
	@Autowired
	public OrdemDeServicoRepository ordemDeServicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping
	public Iterable<OrdemDeServico> teste() {

		return ordemDeServicoRepository.findAll();

	}

	@PostMapping(value = "/criar-ordem-de-servico")
	public String registraOrdemDeServico(@RequestBody OrdemDeServico ordemDeServico) {

		return "ok";
	}

	@PostMapping(value = "/busca-ordem-de-servico")
	public String buscaOrdemDeServico(@RequestBody OrdemDeServico ordemDeServico) {

		return "ok";
	}

}
