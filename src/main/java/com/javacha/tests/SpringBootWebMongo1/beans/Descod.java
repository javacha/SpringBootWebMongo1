package com.javacha.tests.SpringBootWebMongo1.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="descod")
public class Descod {

	@Id
	private String id;
	
	private Double tabla;
	private Double codigo;
	private String descripcion;
	
	
	public Descod(Double tabla, Double codigo, String descripcion) {
		super();
		this.tabla = tabla;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Descod [id=");
		builder.append(id);
		builder.append(", tabla=");
		builder.append(tabla);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("]");
		return builder.toString();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Double getTabla() {
		return tabla;
	}


	public void setTabla(Double tabla) {
		this.tabla = tabla;
	}


	public Double getCodigo() {
		return codigo;
	}


	public void setCodigo(Double codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
		
}
