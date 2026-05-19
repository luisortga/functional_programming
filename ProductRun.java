package functional_programming;

import functional_programming.logica.Producto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductRun {

    static void main(String[] args) {

        args.clone();

        // Lista de productos
        List<Producto> productos = Arrays.asList(
                new Producto("Manzana", "frutas", 1, 2.5),
                new Producto("Leche", "lácteos", 2, 1.2),
                new Producto("Pan", "panadería", 5, 1.0),
                new Producto("Yogur", "lácteos", 3, 1.8),
                new Producto("Pera", "frutas", 4, 3.0),
                new Producto("Naranja", "frutas", 6, 2.0),
                new Producto("Queso", "lácteos", 2, 3.5),
                new Producto("Manteca", "lácteos", 1, 2.2),
                new Producto("Harina", "panadería", 3, 1.5),
                new Producto("Arroz", "alimentos", 4, 1.8),
                new Producto("Tomate", "frutas", 5, 1.2),
                new Producto("Lechuga", "verduras", 2, 0.9),
                new Producto("Pescado", "pescadería", 1, 4.0),
                new Producto("Pollo", "carnes", 3, 5.0),
                new Producto("Carne", "carnes", 2, 6.5)
        );

        // 1.- filtrar productos de la categoría
        List<Producto> frutas = productos.stream()
                .filter(p -> p.getCategoria().equals("frutas"))
                .toList();
        frutas.forEach(System.out::println);

        // 2.- Calcular el precio total de los productos en "lácteos"

        double totalLac = productos.stream()
                .filter(p -> p.getCategoria().equals("lácteos"))
                .mapToDouble(Producto::getPrecio)
                .sum(); // todo lo mapeado lo suma

        System.out.println("\nTotal lac: " + totalLac);

        // 3.- Obtener el producto con el precio más bajo
        Producto productLow = productos.stream()
                .min(Comparator.comparingDouble(Producto::getPrecio))
                .orElse(null);

        System.out.println("\nProducto más barato: " + productLow);

        // 4.- Agrupar productos por categoría
        Map<String, List<Producto>> prodPorCa = productos.stream().collect(Collectors.groupingBy(Producto::getCategoria));

        System.out.println("\nProd por categorías : " + prodPorCa + "\n");

        // 5.- Calcular el precio promedio de los productos por categoría

        Map<String, Double> promPorCat = productos.parallelStream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.averagingDouble(Producto::getPrecio)));

        System.out.println("El precio por categoría es: " + promPorCat);

        // 6.- Obtener la categoría con el precio promedio más alto

        String catMasCara = promPorCat.entrySet().parallelStream().max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("No disponible");

        System.out.println("Categoria con el precio promedio mas alto: " + catMasCara);
    }
}
