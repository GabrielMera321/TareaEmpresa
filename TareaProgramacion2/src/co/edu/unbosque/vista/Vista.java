package co.edu.unbosque.vista;

import java.util.Scanner;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.EmpleadoDTO;

import java.util.List;

public class Vista {
private Controller controller;
private Scanner scanner;


public Vista() {
    controller = new Controller();
    scanner = new Scanner(System.in);
}

public void addEmployee() {
    System.out.print("Nombre: ");
    String name = scanner.nextLine();
    System.out.print("Cédula: ");
    int cedula = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Labor: ");
    String labor = scanner.nextLine();
    System.out.print("Edad: ");
    int edad = scanner.nextInt();

    controller.addEmployee(name, cedula, labor, edad);
}

public void viewEmployees() {
    List<EmpleadoDTO> employees = controller.getEmployees();
    System.out.println("Nombre\tCédula\tLabor\tEdad");
    for (EmpleadoDTO employee : employees) {
        System.out.println(employee.getName() + "\t" + employee.getCedula() + "\t" + employee.getLabor() + "\t" + employee.getEdad());
    }
}
}
