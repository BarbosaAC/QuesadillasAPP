package com.generation20.quesadilllotasapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Define el proceso el ORM
@Entity //Estoy relacionando mi clase con una base de datos
@Table(name = "quesadillota") //Nombre de la tabla que queremos
public class Quesadillota {
	//Personalizar el campo poner @Column
	//@CreationTimestamp para fecha
	
	@Id //Indica la llave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private int tipoTortilla;
	private int tipoChile;
	private String queso;
	private String comentario;
	
	public Quesadillota () {};

	public Quesadillota(Integer id, String nombre, int tipoTortilla, int tipoChile, String queso, String comentario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipoTortilla = tipoTortilla;
		this.tipoChile = tipoChile;
		this.queso = queso;
		this.comentario = comentario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipoTortilla() {
		return tipoTortilla;
	}

	public void setTipoTortilla(int tipoTortilla) {
		this.tipoTortilla = tipoTortilla;
	}

	public int getTipoChile() {
		return tipoChile;
	}

	public void setTipoChile(int tipoChile) {
		this.tipoChile = tipoChile;
	}

	public String getQueso() {
		return queso;
	}

	public void setQueso(String queso) {
		this.queso = queso;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
}
