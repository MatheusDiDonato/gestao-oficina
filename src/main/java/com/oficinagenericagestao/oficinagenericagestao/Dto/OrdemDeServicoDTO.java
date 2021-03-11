package com.oficinagenericagestao.oficinagenericagestao.Dto;

import com.oficinagenericagestao.oficinagenericagestao.Utils.ClienteUtils;
import com.oficinagenericagestao.oficinagenericagestao.domain.Carro;
import com.oficinagenericagestao.oficinagenericagestao.domain.Cliente;
import com.oficinagenericagestao.oficinagenericagestao.domain.Endereco;
import com.oficinagenericagestao.oficinagenericagestao.domain.OrdemDeServico;
import com.oficinagenericagestao.oficinagenericagestao.enums.ServicosPrestados;

import java.math.BigDecimal;
import java.util.Date;

public class OrdemDeServicoDTO {

    private Carro carro;
    private Cliente cliente;
    private ServicosPrestados servicosPrestados;
    private Date dataDeEntrada;
    private String descricao;
    private BigDecimal valorDoServico;
    private Endereco endereco;
    private String cep;
    private String complement;
    private Integer number;

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ServicosPrestados getServicosPrestados() {
        return servicosPrestados;
    }

    public void setServicosPrestados(ServicosPrestados servicosPrestados) {
        this.servicosPrestados = servicosPrestados;
    }

    public Date getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Date dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorDoServico() {
        return valorDoServico;
    }

    public void setValorDoServico(BigDecimal valorDoServico) {
        this.valorDoServico = valorDoServico;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Endereco converteEndereco(String cep, String complement, Integer number) {
       return endereco = ClienteUtils.criaEndereco(cep, complement, number);
    }

    public OrdemDeServico converteOrdemDeServicoDtoparaOrdemDeServico(){
        OrdemDeServico ordemDeServico = new OrdemDeServico();
        ordemDeServico.setValorDoServico(valorDoServico);
        ordemDeServico.setServicosPrestados(getServicosPrestados());
        ordemDeServico.setDescricao(getDescricao());
        ordemDeServico.setStatusDeOrdem(true);
        ordemDeServico.setValorDoServico(valorDoServico);
        ordemDeServico.setCarro(carro);
        ordemDeServico.setDataDeEntrada(dataDeEntrada);
        ordemDeServico.setCliente(cliente);
        ordemDeServico.getCliente().setEndereco(converteEndereco(
                ordemDeServico.getCliente().getEndereco().getCep(),
                ordemDeServico.getCliente().getEndereco().getComplement(),
                ordemDeServico.getCliente().getEndereco().getNumber()));

        return ordemDeServico;
    }
}
