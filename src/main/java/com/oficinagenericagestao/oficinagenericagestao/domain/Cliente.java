package com.oficinagenericagestao.oficinagenericagestao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCliente;

	@NotNull
	@NotEmpty
	@Length(min = 3, max = 255)
	@Column(name = "CC_NOME_CLIENTE")
	private String nomeCliente;

	@CPF
	private String cpf;

	@OneToMany
	private List<Telefones> telefones;

	@OneToOne
	private Endereco endereco;

	@OneToMany
	private List<Veiculo> veiculos;





}
