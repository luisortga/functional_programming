package functional_programming;

import functional_programming.logica.Client;

import java.util.*;

public class DHLStart {

    public static void main(String[] args) {

        List<Client> listaClientes = obtenerClientes();

        System.out.println("<-------- pipecodong -------->");
        System.out.println("Ingrese el número de cliente a enviar un paquete:");
        Scanner scanner = new Scanner(System.in); // instancias un objeto scanner
        Long numero = scanner.nextLong();

        Optional<Client> cliente = buscarClient(listaClientes, numero);

        // Verificar cliente

        if (cliente.isPresent()) {
            Optional<String> direccion = obtenerDireccion(cliente);
            // verificar si obtuvo direccion o no
            if (direccion.isPresent()) {
                System.out.println("La direccion del cliente es: " + direccion.get());
            }
            else {
                System.out.println("Este cliente no tiene direccion");
            }
        }
        else {
            System.out.println("El cliente no existe");
        }


    }

    private static Optional<String> obtenerDireccion(Optional<Client> cliente) {
        return cliente.map(Client::getDireccion);
    }

    private static Optional<Client> buscarClient(List<Client> listaClientes, Long numero) {

        return listaClientes.stream()
                .filter(cli -> Objects.equals(cli.getNro_cliente(), numero))
                .findFirst();
    }

    private static List<Client> obtenerClientes() {
        List<Client> clientes = Arrays.asList(
                new Client(1L, "Juan", "Pérez", null, "1111-1111"),
                new Client(2L, "María", "Gómez", "Av. Siempre Viva 742", "2222-2222"),
                new Client(3L, "Carlos", "López", "Mitre 100", "3333-3333"),
                new Client(4L, "Lucía", "Martínez", "Belgrano 456", "4444-4444"),
                new Client(5L, "Ana", "Fernández", "San Martín 789", "5555-5555"),
                new Client(6L, "Pedro", "Sánchez", null, "3333-4444"),
                new Client(7L, "Laura", "Díaz", "Corrientes 202", "7777-7777"),
                new Client(8L, "Diego", "Ramírez", null, "8888-8888"),
                new Client(9L, "Suscribite", "Todocode", "Internet 404", "9999-9999"),
                new Client(10L, "Valeria", "Acosta", null, "0000-0000")
        );
        return clientes;
    }
}
