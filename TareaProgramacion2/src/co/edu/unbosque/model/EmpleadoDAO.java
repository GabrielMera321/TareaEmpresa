package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
    private List<EmpleadoDTO> employees;

    public EmpleadoDAO() {
        employees = new ArrayList<>();
    }

    public void addEmployee(EmpleadoDTO employee) {
        employees.add(employee);
    }

    public List<EmpleadoDTO> getEmployees() {
        return employees;
    }
}