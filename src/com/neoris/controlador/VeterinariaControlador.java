package com.neoris.controlador;

import com.neoris.modelo.Animal;
import com.neoris.modelo.Veterinaria;
import com.neoris.modelo.Veterinario;

public class VeterinariaControlador {
	private Veterinaria veterinaria;

	public VeterinariaControlador(Veterinaria veterinaria) {
		this.veterinaria = veterinaria;
	}

	public int detallePorVeterinario(Integer matricula) {
	
		return this.veterinaria.animalesAtendidosPorVeterinario(this.veterinaria.traerVeterinario(matricula));
	}

	public void revisarAnimal(Animal animal, Integer matricula) throws Exception {
		Veterinario v = this.veterinaria.traerVeterinario(matricula);
		if ((this.veterinaria.cantidadDeAnimalesAtendidos() < 20) && (v != null) ) { //si atendieron menos de 20 y el veterinario existe
			v.revisar(animal);

		}

	}
	
	public Veterinario traerVeterinario(Integer matricula) {
		return this.veterinaria.traerVeterinario(matricula);
	}
	
	
	
	
	

}
