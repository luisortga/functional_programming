package functional_programming.logica;

import Course.Employee;
import Course.Manager;
import Course.PersonCode;
import Course.RunnerOperador;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class RunnerStreamsLam {

    public static void DefinitionFirtsLamda() {
        /* Las clases anonimas y lambdas necesitan interfeces */

        // result class Unknown
        RunnerOperador sum = new RunnerOperador() {
            @Override
            public int operar(int a, int b) {
                return a+b;
            }
        }; // declaracion necesita, punto y coma ;
        System.out.println("Suma anonima: " + sum.operar(12, 24));

        // result with lambdas
        RunnerOperador prod = (a, b)  -> a+b;
        System.out.println("Resultado con lambda: " + prod.operar(12, 24));

        // Herencia en clases anonimas se puede utilizar this. y super(), en lambdas no, clases sencillas no en logica compleja y repetitiva

        // :: what is this? Referencia a métodos
        // Tiene que ser referencia a un metodo estatico ::

        String result = String.valueOf(5); // casting int a String
        String comprobacion = result+"6 si es un str";

        /* int num -> String.valueOf(5);
        String::valueOf; */

        // Java tiene interfases funcionales que son propias del lenguaje

        // Function<T,R> interfas de Java T: Type de dato, R, el valor de retorno
        Function<Integer,String> converter = String::valueOf;
        String result2 = converter.apply(5); // aplica, llama a la interfas funcional
        System.out.println("El resultado con :: " + result2);

        // Referencia a un método de instancia de un objeto : Object

        var practicante = new PersonCode();
        practicante.toString();

        Runnable saludoInTheOffice = practicante::greeting;
        // Threads ejecutar tipo void se dice Ranabult
        saludoInTheOffice.run(); // Ejecutar el metodo asociado

    }

    public static void ReferenceFirtsLamda() {

        // Tercera tipo de referencia a metodo

        // Forma mas actual al instanciar objetos con dos parametros
        BiFunction<String, Double, PersonCode> devSenior = PersonCode::new; // Bi dos funciones, dos parameter

        /* Instanciar un objeto PersonCode con referencias a los parametros del objeto, recibe <String: name, Double: estatura, retorna el objeto PersonCode> PersonCode::new*/

        var ortega = devSenior.apply("luis", 1.64);

        System.out.println("La primera persona es :: " + ortega);


    }

    public static void main(String[] args) {
        // Referencia a un método de instancia de un objeto arbitrario

        // instanciar en una lista de instancias de objetos, lista de personas por ejemplos

        List<PersonCode> deploy = new ArrayList<>(); // use Object PersonCode in ArrayList compress

        deploy.add(new Employee());
        deploy.add(new Manager());
        deploy.add(new Employee());
        deploy.add(new Manager());

        // Recorremos las lista con forEach al Objecto Padre
        deploy.forEach(PersonCode::greeting);
    }
}
