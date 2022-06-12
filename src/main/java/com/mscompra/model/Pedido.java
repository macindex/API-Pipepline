package com.mscompra.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer Id;
	@Column(nullable = false, length = 50)
	private String nome;
	@Column(nullable = false, length = 50)
	private String produto;
	@Column(nullable = false, length = 50)
	private Integer valor;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
//	private String dataCompra;
//	private String cpfCliente;
//	private String cep;

//	public Pedido() {
//		
//	}

	/*
	 * public void setPedido(Pedido pedido) { id.setPedido(pedido); } Esta classe
	 * seria implementada dentro da classe cliente, referenciando um pedido a um
	 * cliente
	 */

//	public Pedido(Long id, String nome, Long produto, BigDecimal valor, String dataCompra, String cpfCliente,
//			String cep) {
//		
//		Id = id;
//		this.nome = nome;
//		this.produto = produto;
//		this.valor = valor;
//		this.dataCompra = dataCompra;
//		this.cpfCliente = cpfCliente;
//		this.cep = cep;
//	}

}
