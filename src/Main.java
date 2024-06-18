import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
//    Contactos contactoNuevo = new Contactos("Pepe", 3153379879L);
//    Agenda nuevaLista = new Agenda(5);
//    nuevaLista.agregarContacto(contactoNuevo);
//
//    Contactos contacto2 = new Contactos("Pepelin", 1234567890);
//    nuevaLista.agregarContacto(contacto2);
//
//    Contactos contacto3 = new Contactos("Ana", 1234567890);
//    nuevaLista.agregarContacto(contacto3);
//
//    nuevaLista.listarContactos();
//
//    System.out.println("-- SEPARACION----");
//    nuevaLista.eliminarContacto(contacto2);
//    nuevaLista.listarContactos();
    Scanner scanner = new Scanner(System.in);

    int opcion;
    int capacidadMaxima = scanner.nextInt();
    scanner.nextLine();
    Agenda nuevaLista = new Agenda(capacidadMaxima);

    do {
      System.out.println("\n Menu:");
      System.out.println("1. Agregar Contacto");
      System.out.println("2. Listar Contactos");
      System.out.println("3. Buscar Contacto");
      System.out.println("4. Eliminar Contacto");
      System.out.println("5. Verificar Espacio Disponible");
      System.out.println("6. Salir");
      System.out.println("Escoge una Opcion: ");

      opcion = scanner.nextInt();

      switch (opcion){
        case 1:
          System.out.println("Nombre: ");
          String nombre = scanner.nextLine();

          System.out.println("Telefono: ");
          long telefono = scanner.nextLong();

          Contactos nuevoContacto = new Contactos(nombre, telefono);
          nuevaLista.agregarContacto(nuevoContacto);
          break;
      }


    }
  }
}