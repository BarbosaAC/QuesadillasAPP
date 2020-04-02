package com.generation20.quesadilllotasapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation20.quesadilllotasapp.model.Quesadillota;

//precesar datos de quesadillota----Tipo de objeto a manipular y ID que va a manejar
@Repository
public interface PedidoRepositorio extends JpaRepository<Quesadillota, Integer>{

	
}
