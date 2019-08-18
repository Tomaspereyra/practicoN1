package com.neoris.modelo;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
private List<Veterinario> veterinarios;

public Veterinaria(List<Veterinario> veterinarios) {
	this.veterinarios = veterinarios;
}

public List<Veterinario> getVeterinarios() {
	return veterinarios;
}
public int animalesAtendidosPorVeterinario(Veterinario veterinario){
		int cantidad=0;
	for(Veterinario v : this.veterinarios) {
		if(v.equals(veterinario)) {
			cantidad = v.getAnimalesAtendidos().size();
			
		}
	}
	return cantidad;
	
}

public int cantidadDeAnimalesAtendidos() {
	int cantidad=0;
	for(Veterinario v: this.veterinarios) {
		cantidad+= this.animalesAtendidosPorVeterinario(v);
	}
	return cantidad;
}

public Veterinario traerVeterinario(Integer matricula) {
	Veterinario  v = new Veterinario();
	for(Veterinario vet : this.veterinarios) {
		if( vet.getMatricula().equals(matricula)) {
			v = vet;
		}
	}
	return v;
	
	
	
}
  



}
