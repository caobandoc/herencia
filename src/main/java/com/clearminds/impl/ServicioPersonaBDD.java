package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona{

	@Override
	public boolean insertar(Persona persona) {
		System.out.println("Insertando en BDD");
		return true;
	}

	@Override
	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando en BDD");
		return true;
	}

	@Override
	public boolean eliminar(Persona persona) {
		System.out.println("Eliminado en BDD");
		return true;
	}
	
}
