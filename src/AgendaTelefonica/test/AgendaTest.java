package AgendaTelefonica.test;
import AgendaTelefonica.modelos.Agenda;
import AgendaTelefonica.modelos.Contactos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgendaTest {

  private Agenda agenda;

  Contactos contacto1 = new Contactos("Sara", 1234567891L);
  Contactos contacto2 = new Contactos("Jhoan", 1234567892L);
  Contactos contacto3 = new Contactos("Nicole", 1234567893L);
  @BeforeEach
  public void setUp() {
    agenda = new Agenda(10);

    agenda.agregarContacto(contacto1);
    agenda.agregarContacto(contacto2);
    agenda.agregarContacto(contacto3);

  }


  @Test
  public void agregarContactoTest() {
    Contactos contacto4 = new Contactos("Pepe", 1234567890L);
    agenda.agregarContacto(contacto4);
    assertEquals(6 , agenda.espacioLibres());
  }

  @Test
  public void eliminarContacto(){
    agenda.eliminarContacto(contacto1);
    assertEquals(8, agenda.espacioLibres());
  }

//  @Test
//  public void agendaLlena(){
//   agenda.agendaLlena();
//   assertFalse(agendaLlena());
//  }
}
