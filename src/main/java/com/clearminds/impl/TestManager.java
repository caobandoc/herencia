package com.clearminds.impl;

import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager test = new PersonaManager();
		Persona p = new Persona();
		
		test.insertarPersona(p);
		test.actualizarPersona(p);
		test.eliminarPersona(p);

	}

}
