package com.clearminds.impl;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager test = null;
		try {
			test = new PersonaManager();
		} catch (InstanceException e) {
			e.printStackTrace();
		}
		Persona p = new Persona();
		
		test.insertarPersona(p);
		test.actualizarPersona(p);
		test.eliminarPersona(p);

	}

}
