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
		if (v != null) {
			if (this.veterinaria.cantidadDeAnimalesAtendidos() < 20) {
				v.revisar(animal);

			} else {
				throw new Exception("La veterinaria ya atendio 20 animales");
			}

		} else {
			throw new Exception("El veterinario no existe");
		}

	}

	public Veterinario traerVeterinario(Integer matricula) {
		return this.veterinaria.traerVeterinario(matricula);
	}

}
