package functional_programming.logica;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorRun {

    public static void main(String[] args) {

        // Collectors.toList te retorna el valor en una nueva lista, convertir el resultado a una colección
        List<String> names = List.of("Luis", "Moni", "Ortega", "Joseph");

        List<String> namesI =  names.stream()
                .filter(name -> name.contains("i"))
                .collect(Collectors.toList());

        namesI.forEach(System.out::println);

        // Collectors.toset
        List<String> lenguaje = List.of("Java", "Java", "PHP", "Python", "C#", "JavaScript", "C++");
        Set<String> sinRepetir = lenguaje.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        sinRepetir.forEach(System.out::println);

        // Collectors.joining()
        List<String> sgbds = List.of("MySQL", "Oracle", "PostgreSQL", "NoSQL");
        String listDB = sgbds.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" | "));

        System.out.println(listDB);
        // Python: join

        List<String> countries = List.of("US", "Canada", "France", "Germany", "Grace", "Canada");
        Long countG = countries.stream()
                .filter(c -> c.startsWith("G"))
                .collect(Collectors.counting());

        /* Se desconoce la cantidad de valores que el collector puede pasar, si supera el limite maximo de valores de int, por esa razón se utiliza Long (Wripper) */

        System.out.println(countG);

        // Collectors.partitioningBy() List true, false
        List<Integer> ages = List.of(12, 16, 22, 21, 35, 16, 17, 48, 59);
        Map<Boolean, List<Integer>> mayoresAge = ages.stream()
                .collect(Collectors.partitioningBy(e -> e>=18));

    }
}
