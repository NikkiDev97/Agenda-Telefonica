import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Agenda {
  private ArrayList<Contactos> listaContactos;
  private Map<String, Contactos> mapaContactos;
  private int capacidadMaxima;

  public Agenda(int capacidadMaxima) {
    this.capacidadMaxima = capacidadMaxima;
    this.mapaContactos = new HashMap<>();
    this.listaContactos = new ArrayList<>();
  }


  //Métodos

  public void agregarContacto(Contactos contacto) {
    int longitudTelefono = Long.toString(contacto.getTelefono()).length();
    if(!agendaLlena()){
      if(!existeContacto(contacto.getNombre())){
        if(longitudTelefono == 10){
          listaContactos.add(contacto);
          mapaContactos.put(contacto.getNombre(), contacto);
        }else{
          System.out.println("Error, debe ingresar un teléfono de 10 dígitos");
        }
      }else{
        System.out.println("Error, este contacto ya existe en la agenda");
      }
    }else{
      System.out.println("Error, no hay espacio disponible en la agenda");
    }
  }


  public Contactos buscarContacto(String nombre) {
    return mapaContactos.get(nombre);
  }

  public void listarContactos() {
    for (Contactos c : listaContactos ){
      System.out.println(c);
      System.out.println("------");
    }
    System.out.println(mapaContactos);
  }

  public boolean existeContacto(String nombre) {
    return mapaContactos.containsKey(nombre);
  }

  public int espacioLibres() {
    return capacidadMaxima - mapaContactos.size();
  }

  public boolean agendaLlena() {
    if ((capacidadMaxima - mapaContactos.size()) == 0) {
      return true;
    }else {
      return false;
    }
  }

  public void eliminarContacto(){

  }
}





