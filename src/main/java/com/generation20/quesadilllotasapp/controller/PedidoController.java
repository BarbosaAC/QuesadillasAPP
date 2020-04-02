package com.generation20.quesadilllotasapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation20.quesadilllotasapp.model.Quesadillota;
import com.generation20.quesadilllotasapp.service.PedidoService;
import com.generation20.quesadilllotasapp.service.PedidoServiceImpl;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoServiceImpl service;
	
	@GetMapping()
	public String showPedidos(Model model) {
		model.addAttribute("quesadillota", service.getAll());
		return ("quesadillotas");
	}
	
	@GetMapping("/editar")
	public String showUpdateById(@RequestParam("qid") Integer qid, Model model) {
		
		model.addAttribute("quesadillota", service.getById(qid));
		return "form";
	}
	@GetMapping("/nuevo")
	public String loadFormView() {
		return "form";
	}
	@PostMapping("/crear")
	public String createPedido(
			@RequestParam("nombre") String nombre,
			@RequestParam("tipoTortilla") int tipoTortilla,
			@RequestParam("tipoChile") int tipoChile,
			@RequestParam("queso") String queso,
			@RequestParam(name = "comentario", required = false) String comentario) {
		Quesadillota quesadillota = new Quesadillota();
		quesadillota.setNombre(nombre);
		quesadillota.setTipoTortilla(tipoTortilla);
		quesadillota.setTipoChile(tipoChile);
		quesadillota.setQueso(queso);
		quesadillota.setComentario(comentario);

		service.save(quesadillota);
		return "redirect:/pedido/nuevo";
	}
	
}
