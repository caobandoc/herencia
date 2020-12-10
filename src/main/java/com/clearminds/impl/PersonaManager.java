package com.clearminds.impl;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		// serv = new ServicioPersonaArchivos();
		Class<?> clase = null;
		try {
			clase = Class.forName("com.clearminds.impl.ServicioPersonaBDD");
			serv = (ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
		
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
