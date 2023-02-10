package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.EmpleadoDAO;
import co.edu.unbosque.model.EmpleadoDTO;

public class Controller {
    private EmpleadoDAO employeeDAO;

    public Controller() {
        employeeDAO = new EmpleadoDAO();
    }

    public void addEmployee(String name, int cedula, String labor, int edad) {
        EmpleadoDTO employee = new EmpleadoDTO(name, cedula, labor, edad);
        employeeDAO.addEmployee(employee);
    }

    public List<EmpleadoDTO> getEmployees() {
        List<EmpleadoDTO> employees = employeeDAO.getEmployees();
        List<EmpleadoDTO> employeeDTOs = new ArrayList<>();
        for (EmpleadoDTO employee : employees) {
            employeeDTOs.add(new EmpleadoDTO(employee.getName(), employee.getCedula(), employee.getLabor(), employee.getEdad()));
        }
        return employeeDTOs;
    }
}
