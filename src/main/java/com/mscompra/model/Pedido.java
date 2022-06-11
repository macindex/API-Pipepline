package com.mscompra.model;

import java.math.BigDecimal;
import java.time.LocalDate;
//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tb_pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	@Column(nullable = false, length = 50)
	private String nome;
	private Long produto;
	private BigDecimal valor;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate dataCompra;
	private String cpfCliente;
	private String cep;
	
	public Pedido() {
		
	}
	
	/*
	 * public void setPedido(Pedido pedido) { id.setPedido(pedido); }
	 * Esta classe seria implementada dentro da classe cliente, referenciando um pedido a um cliente
	 */
	
	public Pedido(Long id, String nome, Long produto, BigDecimal valor, LocalDate dataCompra, String cpfCliente,
			String cep) {
		
		Id = id;
		this.nome = nome;
		this.produto = produto;
		this.valor = valor;
		this.dataCompra = dataCompra;
		this.cpfCliente = cpfCliente;
		this.cep = cep;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getProduto() {
		return produto;
	}

	public void setProduto(Long produto) {
		this.produto = produto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
