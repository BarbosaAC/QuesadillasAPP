package com.generation20.quesadilllotasapp.service;

import java.util.List;

import com.generation20.quesadilllotasapp.model.Quesadillota;

public interface PedidoService {

	//Definir operaciones para logíca de negocio 
		List<Quesadillota> getAll();
		void save(Quesadillota quesadilla);
		Quesadillota getById(Integer id);
}
