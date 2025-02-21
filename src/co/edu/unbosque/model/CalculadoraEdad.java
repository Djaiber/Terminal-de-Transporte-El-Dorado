package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculadoraEdad {
    
    public static int calcularEdad(LocalDate fechaNacimiento) {
        return calcularRecursivo(fechaNacimiento, LocalDate.now(), 0);
    }
    
    private static int calcularRecursivo(LocalDate fechaNacimiento, LocalDate actual, int edad) {
        if (fechaNacimiento.plusYears(edad).isAfter(actual)) {
            return edad - 1;
        }
        return calcularRecursivo(fechaNacimiento, actual, edad + 1);
    }
    
    public static boolean esMenorDeEdad(LocalDate fechaNacimiento) {
        return calcularEdad(fechaNacimiento) < 18;
    }
}