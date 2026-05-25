package functional_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class structure {

    public static void Arrays() {
        // start

        //Declaraciónd e Array

        // array no puedes eliminar datos, solo pudes hacer nullos o 0

        String[] names = {"Luis", "Monica", "Emilio", null, null};

        names[3] = "Melissa"; // añadir datos
        names[4] = "Ortega";
        int[] numeros = new int[3];

        for (int i=0; i < 5; i++) {
            System.out.println(names[i]);
        }

        System.out.println((new String[3])[0]);
    }

    public static void Listas() {
        // ArrayList

        /* Las list demoran más que un Set por que buscan el elemnto de forma ordenada, entre más grande las listas mayor será el tiempo de respuesta a la busqueda. */

        // ArrayList se puede utilizar la interfaz como referencia
        List<String> callOfDuty = new ArrayList<>();

        callOfDuty.add("Moder Warfare");
        callOfDuty.add("Black Ops 3");
        callOfDuty.add("Black Ops 4");
        callOfDuty.add("Vanguard");


        if (callOfDuty.contains("Moder Warfare")) {
            System.out.println("Call Of Duty tiene juegos clasicos");
        } else {
            System.out.println("Solo contiene COD muy recientes");
        }

        List<String> codMobileMaps = new ArrayList<>();

        // Crear la version nueva, sintaxis mas limpia
        var damage = new ArrayList<Integer>();

        damage.add(48);

        System.out.println(damage.indexOf(48));
        System.out.println(damage.size());

        /* .size() tamaño del ArrayList
        *  .remove() Elimina por valor
        *  .clear() Vaciar la lista
        *  .getFirst() obtienes el primer elemento
        *  .getLast() obtienes el ultimo elemento
        *  .set(index, "nuevo elemento") */

        // Error común IndexOutOfBoundsException

        System.out.println(callOfDuty.size());
        System.out.println(" --> sep. <--");

        try {
            System.out.println(callOfDuty.get(3));
        } catch (IndexOutOfBoundsException e) {
            throw new Error(e); // Lanzando el error
        }
        System.out.println(callOfDuty.getFirst()); // get el primer valor
        callOfDuty.set(1, "Cold War"); // agrega y recorre los elementos

        // 2. For-each (Recomendado)
        for (String cod: callOfDuty) {
            System.out.println(cod);
        }

        // 3. Con método Stream + forEach() + Lambda (Java 8+)
        callOfDuty.forEach(System.out::println);

        var pulgadas = new ArrayList<Double>(); // funciona
    }

    public static void Sets() {
        // tipo estructora especial que almacena datos unicos
        // Estructura desordenada, utiliza un hash
        HashSet<String> callOfDuty = new HashSet<>();
        var damage = new HashSet<Integer>();

        damage.add(48);
        damage.add(24);
        System.out.println(damage.contains(48));
        System.out.println(damage.size());
        callOfDuty.add("Moder Warfare");
        callOfDuty.add("Black Ops 3");
        callOfDuty.add("Black Ops 4");
        callOfDuty.add("Cold War");

        callOfDuty.forEach(System.out::println);

        // Buscar elementos

        // .contains() true si tiene el elemnto, false si no lo tiene

        /* Set es más rapido por que no tiene que mantener un orden específico,
         utilizan una funcion hash para buscar elementos con una velocidad constante así que la insercion y busqueda se realizan en tiempo promedio. */
        System.out.println(callOfDuty.contains("Moder Warfare"));
        System.out.println(callOfDuty.contains("Black Ops 3"));

        // .remove Lo elimina por el elemento("Moder warfare")

        callOfDuty.remove("Moder Warfare");
        callOfDuty.forEach(System.out::println);

        // No permite repetidos

        callOfDuty.add("Moder Warfare");
        // callOfDuty.add("Moder Warfare"); // Error generaria el mismo hash
        // Comprueba que si el hash asociada a Moder Warfare ya existe

        // Operar de manera eficiente entre conjuntos
        // String join con Integer: Error incompatibilidad de datos

        var mapasCod = new HashSet<String>();
        var mapasPubg = new HashSet<String>();
        mapasCod.add("Nucketdown");
        mapasCod.add("Raid");
        mapasCod.add("Standoff");
        mapasCod.add("Shipment");
        mapasPubg.add("Erangel");
        mapasPubg.add("Miramar");
        mapasPubg.add("Sanhok");
        mapasPubg.add("Vikendi");

        // Unir dos Sets compatibles
        mapasCod.addAll(mapasPubg); // agregando los elementos del Set de pubg

        System.out.println(mapasCod);

        // mapasCod.removeAll(mapasPubg);

        System.out.println("Se eliminan los mapas de pubg mobile");
        mapasCod.forEach(System.out::println);

        mapasCod.retainAll(mapasPubg);
        mapasCod.forEach(System.out::println);
    }

    public static void HashMaps() {
        // Almacena un conjunto de pares clave, valor

        // Asignamos el tipo de dato de la clave y el valor
        /* diccionarios en python */

        // Al ser HashMap no es una estructura ordenda, no hay indices, not index
        var callOfDuty = new HashMap<String, String>();
        HashMap<String, Long> priceCOD = new HashMap<>();

        // añadir elementos
        callOfDuty.put("Moder Warfare", "Simon Railey");
        callOfDuty.put("Black Ops 3", "Alex Mason");
        callOfDuty.put("Black Ops 4", "Frank Woods");
        callOfDuty.put("Cold War", "Russell Adler");
        callOfDuty.put("Warzone", "Price");

        System.out.println(callOfDuty);

        priceCOD.put("Moder Warfare", 60L);
        priceCOD.put("Black Ops 3", 68L);

        // acceder al valor, con la clave
        System.out.println(callOfDuty.get("Moder Warfare"));
        System.out.println(priceCOD.get("Black Ops 3"));

        // Verificar el valor, con la key
        if (callOfDuty.containsKey("Black Ops 3")) {
            System.out.println("Si contiene Black Ops 3");
        } else {
            System.out.println("No tiene el valor Black Ops 3");
        }

        // Verificar la key, con value
        if (callOfDuty.containsValue("Price")) {
            System.out.println("Esta versiona si contiene Warzone");
        } else {
            System.out.println("No tiene el valor Price");
        }

        System.out.println(callOfDuty.containsKey("Black Ops 4"));

        /* Eliminacion segura, remove safety */
        // Metodo remove, lo elimina y lo retorna
        String aviso = callOfDuty.remove("Warzone");

        System.out.println("Aviso importante la key Warzone : " + aviso + " se ha eliminado");

        // callOfDuty.clear(); limpiar
        /* al momento de llamar a put, lo sobre escribe, @Overrider */

        // replace: remplazas el valor colocando, key y nuevo valor Jason Hudson
        callOfDuty.replace("Cold War", "Jason Hudson");
        System.out.println(callOfDuty);

        // replace, key, old value, new value
        callOfDuty.replace("Black Ops 4", "Frank Woods", "Urban Tracker");

        // Insert only if not contains
        // Lo inserta solo si no existe, no llega a remplazar

        callOfDuty.putIfAbsent("Black Ops 7", "Soap");
        System.out.println(callOfDuty);

        // .isEmpty, return true si, está vacio el HashMap

        System.out.println(callOfDuty.isEmpty());
        System.out.println(callOfDuty.values()); // solo valores
    }

    public static void main(String[] args) {
        /* Arrays();
        //Listas();
        //Sets();
        //HashMaps();*/
    }
}
