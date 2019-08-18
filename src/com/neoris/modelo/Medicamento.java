package com.neoris.modelo;

public class Medicamento {
private String nombre;
private Double dosis;
public Medicamento(String nombre, Double dosis) {
	this.nombre = nombre;
	this.dosis = dosis;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Double getDosis() {
	return dosis;
}
public void setDosis(Double dosis) {
	this.dosis = dosis;
}
@Override
public String toString() {
	return "Medicamento [nombre=" + nombre + ", dosis=" + dosis + "]";
}


}
