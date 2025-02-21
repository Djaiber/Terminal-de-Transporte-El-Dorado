package co.edu.unbosque.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Viajero implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private int edad;
    private boolean menorDeEdad;

    public Viajero(String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad(fechaNacimiento, LocalDate.now(), 0);
        this.menorDeEdad = this.edad < 18;
    }

    private int calcularEdad(LocalDate nacimiento, LocalDate current, int edad) { //https://www.youtube.com/watch?v=z1BACPQwuhg
        if (nacimiento.plusYears(edad).isAfter(current)) return edad - 1;
        return calcularEdad(nacimiento, current, edad + 1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad(fechaNacimiento, LocalDate.now(), 0);
        this.menorDeEdad = this.edad < 18;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isMenorDeEdad() {
        return menorDeEdad;
    }

    @Override
    public String toString() {
        return nombre + " - " + edad + " años (" + (menorDeEdad ? "Menor de edad" : "Mayor de edad") + ")";
    }
}
