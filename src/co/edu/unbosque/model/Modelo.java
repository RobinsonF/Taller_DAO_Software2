package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.PersonaArrayDAO;

public class Modelo {
	
	private PersonaArrayDAO personaArreglo;
	
	public Modelo() {
		
		personaArreglo = new PersonaArrayDAO();
		
	}

	/**
	 * @return the personaArreglo
	 */
	public PersonaArrayDAO getPersonaArreglo() {
		return personaArreglo;
	}

	/**
	 * @param personaArreglo the personaArreglo to set
	 */
	public void setPersonaArreglo(PersonaArrayDAO personaArreglo) {
		this.personaArreglo = personaArreglo;
	}
	

}
