package com.mscompra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mscompra.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
