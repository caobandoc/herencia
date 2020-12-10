package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaArchivos implements ServicioPersona{

	@Override
	public boolean insertar(Persona persona) {
		System.out.println("insertando persona en un archivo");
		return true;
	}

	@Override
	public boolean actualizar(Persona persona) {
		System.out.println("actualizando persona en un archivo");
		return true;
	}

	@Override
	public boolean eliminar(Persona persona) {
		System.out.println("eliminando persona en un archivo");
		return true;
	}

}
