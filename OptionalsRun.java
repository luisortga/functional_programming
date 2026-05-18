package functional_programming;

import java.util.Optional;

public class OptionalsRun {

    public static void main(String[] args) {

        Optional<String> stringNull = Optional.ofNullable(null);

        if (stringNull.isEmpty()) {
            System.out.println("El valor esta void.");
        } else if (stringNull == null) {
            System.out.println("El valor esta null.");
        }

        // Object Optional: of no puede contener null
        Optional<String> cadena = Optional.of("Thragg");

        if (cadena.isEmpty()) {
            System.out.println("Is void.");
        } else {
            System.out.println("Tiene un valor " + cadena.get());
        }

        // is of null: throw NullPointerException
        Optional<String> cadenaTwo = Optional.empty();

        if (cadenaTwo.isEmpty()) {
            System.out.println("Is void.");
        } else {
            System.out.println("Tiene un valor " + cadena.get());
        }
    }
}
