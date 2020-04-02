package com.generation20.quesadilllotasapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation20.quesadilllotasapp.dao.PedidoRepositorio;
import com.generation20.quesadilllotasapp.model.Quesadillota;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepositorio repository;
	
	@Override
	public List<Quesadillota> getAll(){
		return repository.findAll();
	}
	@Override
	public void save(Quesadillota quesadillota) {
		repository.save(quesadillota);
	}
	@Override
	public Quesadillota getById (Integer id) {
		return repository.findById(id).get();
	}
}
