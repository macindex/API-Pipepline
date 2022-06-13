package com.mscompra.service;

import java.util.List;

import com.mscompra.model.Pedido;


public interface PedidoService {

	List<Pedido> findAll();
	Pedido findById(Integer id);
	Pedido save(Pedido pedido);
	
}
