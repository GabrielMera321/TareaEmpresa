package co.edu.unbosque.model;

public class EmpleadoDTO {
    private String name;
    private int cedula;
    private String labor;
    private int edad;

    public EmpleadoDTO(String name, int cedula, String labor, int edad) {
        this.name = name;
        this.cedula = cedula;
        this.labor = labor;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public int getCedula() {
        return cedula;
    }

    public String getLabor() {
        return labor;
    }

    public int getEdad() {
        return edad;
    }
}
