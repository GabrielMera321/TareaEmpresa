package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.text.View;
import co.edu.unbosque.model.Candidatos;
import util.datos;
/**
 * Clase controller que se encargar de ejecutar el view
 * @author SANTIAGO
 *
 */
public class Controller {
	/**
	 * Se llama la clase view dentro del controller
	 */
	private View vista;
	/**
	 * Se llama la clase personas dentro del controller
	 */
	private Candidatos candidatos;
	/**
	 * Se crea una vriable de tipo entero para las opciones del menú
	 */
	private int opc;
	/**
	 * Se crea un arrraylist de tipo personas 
	 */
	ArrayList<Candidatos> personal = new ArrayList<Candidatos>();
	/**
	 * Metodo constructor de la clase que se encarga de inicializar los componentes y crear el menú de la interfaz
	 * <b>pre<b> 
	 * <b>post<b>
	 * 
	 */
	public Controller() throws datos {

		vista = new View();
		String menu = "Menu de opciones \n" + "1) Create personas. \n" + "2) read personas. \n"
				+ "3) update personas. \n" + "4) delete personas. \n";
		do {
			try {
				vista.mostrarmensaje(menu);
				opc = vista.leerint("");
				switch (opc) {
				case 1:
					crearcandidatos();
					break;
				case 2:
					leercandidatos();
					break;
				case 3:
					actualizarcandidatos();
					break;
				case 4:
					eliminarcandidatos();
					break;
				}
			} catch (InputMismatchException e) {
				vista.leerString("Incorrect option, please try again");
			}

		} while (opc < 5);
	}
	/**
	 *Metodo que se encarga de eliminar las personas de la lista
	 *<b>pre<b>la lista debe estar incializada
	 *<b>post<b> La persona ha sido eliminada de la lista
	 */
	private void eliminarcandidatos() {
		int codigo = vista.leerint("Please insert the document to delete: ");
		for (int i = 0; i < personal.size(); i++) {
			if (codigo == personal.get(i).getcedula()) {
				personal.remove(i);
			}
		}

	}
	/**
	 * Metodo que se encarga de actualizar la iunforamción de la personas 
	 *<b>pre<b>La lista debe estar incializada
	 *<b>post<b> La persona ha sido eliminada de la lista
	 * @throws datos 
	 */
	private void actualizarcandidatos() throws datos {
		int codigo = vista.leerint("Please insert the document to update: ");
		for (int i = 0; i < personal.size(); i++) {
			if (codigo == personal.get(i).getcedula()) {
				String nombre, apellido, cargo;
				int edad = 0, cedula = 0;
				nombre = vista.leerString("Please insert a name");
				edad = vista.leerint("How old are you?");
				apellido = vista.leerString("Give the last name: ");
				cedula = vista.leerint("ID: ");
				cargo = vista.leerString("Give the ocupation: ");
				candidatos = new Candidatos(nombre, apellido, cedula, edad, cargo);
				personal.set(i, candidatos);
			}
		}
	}
	/**
	 * Metodo que se encarga de eliminar las personas de la lista
	 *<b>pre<b>La lista debe estra incializada
	 *<b>post<b> La persona ha sido eliminada de la lista
	 */
	private void leercandidatos() {
		for (int i = 0; i < personal.size(); i++) {
			vista.leerString(personal.get(i) + " User number #" + i);
		}
	}
	/**
	 * 
	 * @throws InputMismatchException
	 * @throws datos
	 */
	private void crearcandidatos() throws InputMismatchException, datos {
		String nombre, genero;
		int edad = 0, documento = 0;
		nombre = vista.leerString("Please insert a name");
		edad = vista.leerint("How old are you?");
		apellido = vista.leerString("Give the last name: ");
		cedula= vista.leerint("ID: ");
		cargo = vista.leerString("Give the ocupation: ");
		candidatos = new Candidatos(nombre, edad, apellido, cedula, cargo);
		personal.add(candidatos);
	}
}

