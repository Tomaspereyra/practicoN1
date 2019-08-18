package com.neoris.modelo;

public class Animal {
private String nombre;
private TipoAnimal tipo;
private String raza;
private Integer edad;
private String causaDeAtencion;
private Diagnostico diagnostico;

public Animal(String nombre, TipoAnimal tipo, String raza, Integer edad, String causaDeAtencion) {
	
	this.nombre = nombre;
	this.tipo = tipo;
	this.raza = raza;
	this.edad = edad;
	this.causaDeAtencion = causaDeAtencion;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public TipoAnimal getTipo() {
	return tipo;
}
public void setTipo(TipoAnimal tipo) {
	this.tipo = tipo;
}
public String getRaza() {
	return raza;
}
public void setRaza(String raza) {
	this.raza = raza;
}
public Integer getEdad() {
	return edad;
}
public void setEdad(Integer edad) {
	this.edad = edad;
}
public String getCausaDeAtencion() {
	return causaDeAtencion;
}
public void setCausaDeAtencion(String causaDeAtencion) {
	this.causaDeAtencion = causaDeAtencion;
}
public Diagnostico getDiagnostico() {
	return diagnostico;
}
public void setDiagnostico(Diagnostico diagnostico) {
	this.diagnostico = diagnostico;
}
@Override
public String toString() {
	return "Animal [nombre=" + nombre + ", tipo=" + tipo + ", raza=" + raza + ", edad=" + edad + ", causaDeAtencion="
			+ causaDeAtencion + ", diagnostico=" + diagnostico + "]";
}

}
