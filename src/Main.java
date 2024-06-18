import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int opcion;
    System.out.println("Ingrese la cantidad máxima de contactos a guardar");
    int capacidadMaxima = scanner.nextInt();
    scanner.nextLine();

    Agenda agenda = new Agenda(capacidadMaxima);

    do {
      System.out.println("\n Menú:");
      System.out.println("1. Agregar Contacto");
      System.out.println("2. Listar Contactos");
      System.out.println("3. Buscar Contacto");
      System.out.println("4. Eliminar Contacto");
      System.out.println("5. Verificar Espacio Disponible");
      System.out.println("6. Salir");
      System.out.println("Escoge una Opción: ");

      opcion = Integer.valueOf(scanner.nextLine());

      switch (opcion){
        case 1:
          System.out.println("Nombre: ");
          String nombre = scanner.nextLine();
          System.out.println("Teléfono: ");
          long telefono = Long.valueOf(scanner.nextLine());
          Contactos nuevoContacto = new Contactos(nombre, telefono);
          agenda.agregarContacto(nuevoContacto);
          break;

        case 2:
          System.out.println("----LISTA DE CONTACTOS-----");
          agenda.listarContactos();
          break;

        case 3:
          System.out.println("Ingrese el nombre del contacto que desea buscar: ");
          String name = scanner.nextLine();

          System.out.println(agenda.buscarContacto(name));
          break;

        case 4:
          System.out.println("Ingrese el nombre del contacto que desea eliminar: ");
          String nameDelete = scanner.nextLine();
          agenda.eliminarContacto(agenda.buscarContacto(nameDelete));
          break;

        case 5:

          if (agenda.agendaLlena()) {
            System.out.println("La agenda esta llena");
          }else {
            System.out.println("Hay espacio disponible");
            System.out.println("Espacios disponibles: " + agenda.espacioLibres());
          }
          break;

        case 6:
          System.out.println("¡Adios!");
          break;

        default:
          System.out.println("Opción no valida.");
      }

    }while(opcion != 6);
    scanner.close();
  }
}