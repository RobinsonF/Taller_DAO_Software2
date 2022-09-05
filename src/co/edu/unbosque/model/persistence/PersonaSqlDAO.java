package co.edu.unbosque.model.persistence;

import java.sql.PreparedStatement;
import java.sql.Statement;

import co.edu.unbosque.model.Conexion;

public class PersonaSqlDAO {

	private static Conexion connection;

	public PersonaSqlDAO(Conexion connection) {

		this.connection = connection;
	}

	public void insertarPersonaDB(PersonaDTO persona) {
		connection.abrirConexion();
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO persona (cedula, nombre, apellido, sexo, edad, telefono) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";
			stmt = connection.getConnection().prepareStatement(sql);
			stmt.setString(1, persona.getCedula());
			stmt.setString(2, persona.getNombre());
			stmt.setString(3, persona.getApellido());
			stmt.setString(4, persona.getSexo());
			stmt.setString(5, persona.getEdad());
			stmt.setString(6, persona.getTelefono());
			stmt.executeUpdate(sql);
			stmt.close();
			connection.getConnection().commit();
			connection.getConnection().close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Records created successfully");
	}

}
