package com.oficinagenericagestao.oficinagenericagestao.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.client.RestTemplate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Transactional
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String telefone;

	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;

}
