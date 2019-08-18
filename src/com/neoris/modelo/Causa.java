package com.neoris.modelo;

public class Causa {
private String descripcion;

public Causa(String descripcion) {
	super();
	this.descripcion = descripcion;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

@Override
public String toString() {
	return "Causa [descripcion=" + descripcion + "]";
}

}
