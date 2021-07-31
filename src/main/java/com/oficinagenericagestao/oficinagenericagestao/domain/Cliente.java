package com.oficinagenericagestao.oficinagenericagestao.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.client.RestTemplate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@NotEmpty
	@Length(min = 3, max = 255)
	@Column(name = "CC_NOME_CLIENTE")
	private String nomeCliente;

	@OneToMany
	private List<TelefonesContato> telefonesContato;

	@OneToMany
	private List<Endereco> enderecoCliente;

	@OneToMany
	private List<Carro> carrosCliente;

}
