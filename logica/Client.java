package functional_programming.logica;

public class Client {

    private long nro_cliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    public Client() {

    }

    public Client(Long nro_cliente, String nombre, String apellido, String direccion, String telefono) {
        this.nro_cliente = nro_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public long getNro_cliente() {
        return nro_cliente;
    }

    public void setNro_cliente(long nro_cliente) {
        this.nro_cliente = nro_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}
