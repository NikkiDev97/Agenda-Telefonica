//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Contactos contactoNuevo = new Contactos("Pepe", 3153379879L);
    Agenda nuevaLista = new Agenda(5);
    nuevaLista.agregarContacto(contactoNuevo);

    Contactos contacto2 = new Contactos("Pepelin", 1234567890);
    nuevaLista.agregarContacto(contacto2);

    Contactos contacto3 = new Contactos("Ana", 1234567890);
    nuevaLista.agregarContacto(contacto3);

    nuevaLista.listarContactos();

    System.out.println("-- SEPARACION----");
    nuevaLista.eliminarContacto(contacto2);
    nuevaLista.listarContactos();

  }
}