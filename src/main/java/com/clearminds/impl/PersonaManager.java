package com.clearminds.impl;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		// serv = new ServicioPersonaArchivos();
		Class<?> clase = null;
		try {
			clase = Class.forName(leerArchivo());
			serv = (ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}

	}

	private static String leerArchivo() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea = null;
		try {
			archivo = new File("config.properties");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			linea = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return linea;
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
