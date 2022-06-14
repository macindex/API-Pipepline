package com.mscompra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

	// @GeneratedValue(strategy = GenerationType.AUTO)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer Id;
	@NotBlank
	@Column(nullable = false, length = 50)
	private String nome;
	@NotNull
	@Column(nullable = false, length = 50)
	private String produto;
	@NotNull
	@Min(1)
	@Column(nullable = false, length = 50)
	private Integer valor;
	@NotNull
	private String dataCompra;
	@NotNull
	private String cpfCliente;
	private String cep;

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

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
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
