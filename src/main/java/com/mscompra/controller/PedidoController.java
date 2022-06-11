package com.mscompra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mscompra.model.Pedido;
import com.mscompra.repository.PedidoRepository;


@RestController
public class PedidoController {
	@Autowired
	private PedidoRepository repository;
	
	@GetMapping(path = "/api/pedido/{id}")
	public ResponseEntity consultar(@PathVariable("codigo") Long id) {
		return repository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping(path = "/api/usuario/salvar")
	public Pedido salvar(@RequestBody Pedido pedido) {
		return repository.save(pedido);
	}
}