package functional_programming.logica;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsLambdasExercises {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("María", 22),
                new Persona("Carlos", 35)
        );

        List<String> nombresMayoresDe25 = personas.stream()
                .filter(p -> p.getEdad() > 25)                    // Predicate
                .sorted(Comparator.comparing(Persona::getNombre)) // Method reference
                .map(Persona::getNombre)                          // Function
                .toList();                    // Collector

        nombresMayoresDe25.forEach(System.out::println);
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
}