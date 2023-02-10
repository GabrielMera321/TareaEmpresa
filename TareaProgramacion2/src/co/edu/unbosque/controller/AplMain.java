package co.edu.unbosque.controller;

import java.util.Scanner;

import co.edu.unbosque.vista.Vista;

public class AplMain {
public static void main(String[] args) {
Vista view = new Vista();

while (true) {
    System.out.println("1. Añadir empleado");
    System.out.println("2. Ver empleados");
    System.out.println("3. Salir");
    System.out.print("Seleccione una opción: ");

    int option = new Scanner(System.in).nextInt();
    if (option == 1) {
        view.addEmployee();
    } else if (option == 2) {
        view.viewEmployees();
    } else {
        break;
    }
}
}
}