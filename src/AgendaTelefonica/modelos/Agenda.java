package AgendaTelefonica.modelos;

import AgendaTelefonica.modelos.Helper;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
  private Map<String, Contactos> mapaContactos;
  private int capacidadMaxima;

  Helper h = new Helper();

  public Agenda(){

  }

  public Agenda(int capacidadMaxima) {
    this.capacidadMaxima = capacidadMaxima;
    this.mapaContactos = new HashMap<>();
  }

  //Métodos

  public void agregarContacto(Contactos contacto) {
    int longitudTelefono = Long.toString(contacto.getTelefono()).length();
    /*if(!agendaLlena()){
      if(!existeContacto(contacto)){
        if(longitudTelefono == 10){
          mapaContactos.put(contacto.getNombre(), contacto);
          System.out.println("Contacto agregado con exito");
        }else{
          System.out.println("Error, debe ingresar un teléfono de 10 dígitos");
        }
      }else{
        System.out.println("Error, este contacto ya existe en la agenda");
      }
    }else{
      System.out.println("Error, no hay espacio disponible en la agenda");
    }*/
    try{
      String name = contacto.getNombre();
      h.validar(agendaLlena(), existeContacto(contacto), longitudTelefono);
      mapaContactos.put(contacto.getNombre(), contacto);
      System.out.println("Contacto agregado con exito");
    }catch (CustomExceptions e){
      System.out.println("Ocurrio un error: " + e.getMessage());
    }
  }


  public Contactos buscarContacto(String nombre) {

    for (Contactos c : mapaContactos.values()){
      if (c.getNombre().equalsIgnoreCase(nombre)){
        return c;
      }
    }
    System.out.println("No se encontro el contacto en la agenda");
    return null;
  }

  public void listarContactos() {
    for (Contactos c : mapaContactos.values()){
      System.out.println(c);
      System.out.println("------");
    }
  }

  public boolean existeContacto(Contactos contacto) {
    for (Contactos c: mapaContactos.values()){
      if (contacto == c){
        return true;
      }
    }
    return false;
  }

  public int espacioLibres() {
    return capacidadMaxima - mapaContactos.size();
  }

  public boolean agendaLlena() {
    return (capacidadMaxima - mapaContactos.size() == 0);
  }

  public void eliminarContacto(Contactos contacto){
    if(existeContacto(contacto)){
      mapaContactos.remove(contacto.getNombre());
      System.out.println("Contacto eliminado con éxito");
    }else{
      System.out.println("Error: el contacto que desea eliminar no existe en la agenda");
    }
  }
}
