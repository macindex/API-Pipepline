package com.mscompra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mscompra.model.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer>{

}
