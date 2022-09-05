package co.edu.unbosque.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	public Conexion() {
		
	}
	
	public void abrirConexion() {
		Connection connection = null;
		 
	      try{
	         connection = DriverManager.getConnection( "jdbc:sqlite:data.sqlite" );
	         if ( connection != null ){
	            System.out.println("Conexión exitosa!");
	         }
	      }
	      catch ( Exception ex ) {
	         System.err.println( ex.getClass().getName() + ": " + ex.getMessage() );
	         System.out.println("Error en la conexión");
	      }
	}

}
