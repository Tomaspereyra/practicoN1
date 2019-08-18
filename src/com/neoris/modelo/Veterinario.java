package com.neoris.modelo;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
	private String nombre;
	private Integer matricula;
	private List<Animal> animalesAtendidos;

	public Veterinario(String nombre, Integer matricula) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.animalesAtendidos = new ArrayList<Animal>();
	}
	public Veterinario() {
		
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Animal> getAnimalesAtendidos() {
		return animalesAtendidos;
	}

	public void revisar(Animal animal) throws Exception {
		if (this.animalesAtendidos.size() < 5) {
			List<Causa>causas = new ArrayList<Causa>();
			List<Medicamento>medicamentos = new ArrayList<Medicamento>();

			Diagnostico diagnostico = new Diagnostico(causas,medicamentos);

			switch (animal.getCausaDeAtencion()) {
			case "x":
				diagnostico.getCausas().add(new Causa("Mucho frio"));
				diagnostico.getMedicamentos().add(new Medicamento("IbuProfeno", 400.0));
			    break;
			case "y":
				diagnostico.getCausas().add(new Causa("Mucha comida"));
				diagnostico.getMedicamentos().add(new Medicamento("IbuProfeno", 600.0));
			    break;
			}

			if (diagnostico != null) {
				this.animalesAtendidos.add(animal);
				animal.setDiagnostico(diagnostico);
			}
			
			

		}
		else {
			throw new Exception("Ya atendi 5 animales. No puedo atender mas. "+this.toString());
		}

	}

	public boolean equals(Veterinario v) { //redefino equals
		if (this.matricula.equals(v.getMatricula())) {
			return true;
		} else {
			return false;
		}

	}
	@Override
	public String toString() {
		return "Veterinario [nombre=" + nombre + ", matricula=" + matricula + "]";
	}
	

}
