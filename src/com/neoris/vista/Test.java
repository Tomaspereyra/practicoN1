package com.neoris.vista;

import java.util.ArrayList;
import java.util.List;

import com.neoris.controlador.VeterinariaControlador;
import com.neoris.modelo.Animal;
import com.neoris.modelo.TipoAnimal;
import com.neoris.modelo.Veterinaria;
import com.neoris.modelo.Veterinario;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		List<Veterinario> veterinarios = new ArrayList<Veterinario>();
		veterinarios.add(new Veterinario("Pepe",123)); // nombre y matricula para identificarlos
		veterinarios.add(new Veterinario("Juan",231));
		veterinarios.add(new Veterinario("Tomas",312));
		veterinarios.add(new Veterinario("Matias",131));
		veterinarios.add(new Veterinario("Gonzalo",132));		
		Veterinaria veterinaria=new Veterinaria(veterinarios);
		
		VeterinariaControlador veterinariaControlador = new VeterinariaControlador(veterinaria);
		Animal perro =new Animal("Moro", TipoAnimal.PERRO,"Pitbull",  5,"x"); //ultimo parametro representa la causa de atencion
		//-------Enviandole 6 animales a un mismo veterinario-----//
		try {
			veterinariaControlador.revisarAnimal(perro, 123);//animal y matricula del veterinario que lo va a revisar
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		try {
			veterinariaControlador.revisarAnimal(perro, 123);//animal y matricula del veterinario que lo va a revisar
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		try {
			veterinariaControlador.revisarAnimal(perro, 123);//animal y matricula del veterinario que lo va a revisar
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		try {
			veterinariaControlador.revisarAnimal(perro, 123);//animal y matricula del veterinario que lo va a revisar
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		try {
			veterinariaControlador.revisarAnimal(perro, 123);//animal y matricula del veterinario que lo va a revisar
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		try {
			veterinariaControlador.revisarAnimal(perro, 123);//animal y matricula del veterinario que lo va a revisar
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		 
		//---Cantidad de animales atendidos por doctor---//
		System.out.println("Animales atendidos por "+veterinariaControlador.traerVeterinario(123)+" : "+veterinariaControlador.detallePorVeterinario(123));
		
		//--Otro veterinario revisa a un animal--//
		try {
			veterinariaControlador.revisarAnimal(perro, 231);//animal y matricula del veterinario que lo va a revisar
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		System.out.println("Animales atendidos por "+veterinariaControlador.traerVeterinario(231)+" : "+veterinariaControlador.detallePorVeterinario(231));
		
		//-- Detalle del resto de los veterinarios--//
		
		System.out.println("Animales atendidos por "+veterinariaControlador.traerVeterinario(312)+" : "+veterinariaControlador.detallePorVeterinario(312));
		System.out.println("Animales atendidos por "+veterinariaControlador.traerVeterinario(131)+" : "+veterinariaControlador.detallePorVeterinario(131));
		System.out.println("Animales atendidos por "+veterinariaControlador.traerVeterinario(132)+" : "+veterinariaControlador.detallePorVeterinario(132));


		

	}

}
