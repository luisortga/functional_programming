package functional_programming.logica;

import Course.Mensajero;
import Course.MensajesEncriptados;

import java.util.function.*;

public class LambdasSteams {

    public static void Lambdas() {

        // Lambda sin parámetros


        // Con un parámetro (paréntesis opcionales)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Function<Integer, Integer> isEven2 = x -> x % 2;
        Consumer<Integer> isEven3 = System.out::println;
        BiFunction<Integer, Integer, Integer> isEven4 = Integer::sum;
        Supplier<Integer> isEven5 = () -> 0;

    }

    public static void numerosPares() {
        Predicate<Integer> esPar = n -> n % 2 == 0;
        Function<Integer, String> duplicarYTexto = n -> "Resultado: " + (n * 2);
        Consumer<String> imprimir = System.out::println;

        System.out.println(esPar.test(5));           // false
        imprimir.accept(duplicarYTexto.apply(10));   // Resultado: 20
    }

    public static void main(String[] args) {

        // Mensajes con lambda

        Mensajero firtsMsj = () -> System.out.println("Hola desde lambda");

        firtsMsj.emitirMensaje();

        MensajesEncriptados firtsMsjEncriptado = (mensaje, level) -> {
            System.out.println("Tú cuenta HSBC: " + "$%" + "2" + level/4 + "40" + level*9 + "0" + "df_" + level+66 + "36 " + mensaje);};

        firtsMsjEncriptado.sendMensaje("el número de cuenta esta encriptado por seguridad.", 24);

        MensajesEncriptados secondTryMsjEncriptado = (mensaje, level) -> {
            int newEncriptado = level+12;
            System.out.println("Tú cuenta HSBC: " + "$%" + "2#{{" + level/4 + "40" + newEncriptado*9 + "0" + "df_" + newEncriptado+66 + "36 " + mensaje);
            System.out.println("Haz superado el numero de consultas.");
        };

        secondTryMsjEncriptado.sendMensaje("segunda query.", 16);

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Function<Integer, Integer> isEven2 = x -> x % 2;
        System.out.println(isEven.test(5));
    }
}
