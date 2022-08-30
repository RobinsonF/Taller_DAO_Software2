package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import co.edu.unbosque.model.Modelo;
import co.edu.unbosque.view.Vista;

public class Controller implements ActionListener, KeyListener {

	private Vista vista;
	private Modelo modelo;

	public Controller() {
		vista = new Vista(this);
		modelo = new Modelo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals(vista.getCOMANDO_DAO_ARREGLO())) {
			System.out.println("Hola");
		}
		if (comando.equals(vista.getCOMANDO_DAO_BINARIO())) {

		}
		if (comando.equals(vista.getCOMANDO_DAO_RELACIONAL())) {

		}
		if (comando.equals(vista.getCOMANDO_DAO_NORELACIONAL())) {

		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
