package functional_programming;

import functional_programming.logica.Auto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BranchRunnin {

    public static void main(String[] args) {

        List<Auto> listaAutos = Arrays.asList(
                new Auto("Volkswagen", "Amarok", 25000),
                new Auto("Volkswagen", "Taos", 32000),
                new Auto("Chevrolet", "Onix", 22000),
                new Auto("Chevrolet", "Tracker", 30000),
                new Auto("Fiat", "Cronos", 21000),
                new Auto("Fiat", "Pulse", 24000),
                new Auto("Toyota", "Corolla", 28000),
                new Auto("Toyota", "Yaris", 23000),
                new Auto("Renault", "Stepway", 20000),
                new Auto("Renault", "Duster", 27000),
                new Auto("Nissan", "Versa", 25000)
        );

        // 1.- Ordenar por precio de manor a mayor sort()

        // copia de una lista a otra, por que sort se aplica y cambia la lista donde se aplica

        System.out.println("<---------------------------------->");
        System.out.println("1.- Ordenar por precio de manor a mayor sort:");
        List<Auto> ordenPrecio = new ArrayList<Auto>(listaAutos);
        ordenPrecio.sort(Comparator.comparing(Auto::getCosto));
        ordenPrecio.forEach(System.out::println);
        // ::println referencia a método estatico

        /* La lista ordenPrecio que es una copia de la listaAutos, ordenamela comparando cada auto por su costo*/

        // 2.- Ordenar por marca y despues por precio usando sorted()
        // sorted es del Object String, el scope es muy limitado y no afecta la lista, python: sort()

        /*
        * Objetos: Comparator, Auto, System
        * metodos: stream(), sorted(), comparing(), getMarca(), thenComparing(), getCosto(), forEach(), println()
        * thenComparing() despues de hacer la primera comparación has esta segunda, type else if java, js, or elif python
        * */

        System.out.println("<---------------------------------->");
        System.out.println("2.- Ordenar por marca y despúes por precio usando sorted:");
        listaAutos.stream()
                .sorted(Comparator.comparing(Auto::getMarca).thenComparing(Auto::getCosto))
                .forEach(System.out::println);

        // 3.- Autos cuyo precio no supere 23000

        System.out.println("<---------------------------------->");
        System.out.println("3.- Autos cuyo precio no supere 23000:");
        listaAutos.stream()
                .filter(auto -> auto.getCosto() <= 23000)
                .forEach(System.out::println);

                /* filter es un tipo if (condicion) filtrará los valores de la Lista, y dejará los que cumplan la condición. */

        // 4.- Autos de marca Chevrolet o Volkwagen

        System.out.println("<---------------------------------->");
        System.out.println("4.- Autos de marca Chevrolet o Volkwagen:");
        listaAutos.stream()
                .filter(auto -> auto.getMarca().
                        equals("Chevrolet")||auto.getMarca().equals("Volkswagen")).forEach(System.out::println);

        // 5.- Autos cuyo modelo contiene al menos una "a"

        System.out.println("<---------------------------------->");
        System.out.println("5.- Autos cuyo modelo contiene al menos una [a]:");
        listaAutos.stream()
                .filter(auto -> auto.getModelo().toLowerCase()
                        .contains("a"))
                .forEach(System.out::println);


    }
}
