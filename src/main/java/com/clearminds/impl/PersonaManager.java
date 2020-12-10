package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	
	private ServicioPersona serv;

	public PersonaManager() {
		serv = new ServicioPersonaBDD();
	}
	
	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}
	
	public void actualizarPersona(Persona persona) {
		serv.actualizar(persona);
	}
	
	public void eliminarPersona(Persona persona) {
		serv.eliminar(persona);
	}
	
}
