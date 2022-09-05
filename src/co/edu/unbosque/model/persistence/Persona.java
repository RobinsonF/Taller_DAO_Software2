package co.edu.unbosque.model.persistence;

//RegistroCuentaSerializable.java
//Una clase que representa un registro de informaci�n.

import java.io.Serializable;

public class Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7924144084333737104L;

//	private int cuenta;
//	private String primerNombre;
//	private String apellidoPaterno;
//	private double saldo;

	private String dni;
	private String nombres;
	private String apellidos;
	private int edad;
	private int salario;
	
	public Persona(String dni, String nombres, String apellidos, int edad, int salario) {
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

}

