public class Contactos {
    private String nombre;
    private long telefono;

    public Contactos(String nombre, long telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre + '\n' +
                "Teléfono: " + telefono;
    }
}
