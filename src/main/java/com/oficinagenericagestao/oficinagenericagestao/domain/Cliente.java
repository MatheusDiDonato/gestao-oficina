package com.oficinagenericagestao.oficinagenericagestao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
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

    @OneToMany(mappedBy = "cliente")
    private List<Telefones> telefones;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Veiculo> veiculos;

    @NotNull
    @Length(min = 3, max = 255)
    @Column(name = "CC_NOME_CLIENTE")
    private String nomeCliente;

    @CPF(message = "CPF INVALIDO")
    private String cpf;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Endereco endereco;

    private Date dataCriacao;

    private Date dataAtualizacao;
}
