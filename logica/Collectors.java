package functional_programming.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collectors {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Julie");
        names.add("Luis");
        names.add("Heath");

        /* .stream() usar las funciones stream en una coleccion, en una estructura de datos, la funciones que implementa stream() las intermedias son opcionales, las terminales son obligatorias. --> */

        names.stream().forEach(System.out::println); // reference to println

        List<String> countries = Arrays.asList("London", "Canada", "New Zealand", "Germany", "Mexico", "Scotland", "Portugal", "Italy", "Polonia", "Suecia", "Sidney");

        // filtrar, y recorrer
        countries.stream()
                .filter(name -> name.toLowerCase().contains("a"))
                .forEach(System.out::println);

    }
}
