package com.neoris.modelo;

import java.util.List;

public class Diagnostico {

	private List<Causa> causas;
	private List<Medicamento> medicamentos;
	
	public Diagnostico(List<Causa> causas, List<Medicamento> medicamentos) {
		this.causas = causas;
		this.medicamentos = medicamentos;
	}
	public Diagnostico() {
		
	}

	public List<Causa> getCausas() {
		return causas;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}
	@Override
	public String toString() {
		return "Diagnostico [causas=" + causas + ", medicamentos=" + medicamentos + "]";
	}
	
	
	
	
}
