package AgendaTelefonica.modelos;

public class Helper {

    public Helper(){

    }

    public void validar(boolean agenLlena, boolean contactExist, long longitudTel) throws CustomExceptions{
        if (agenLlena){
            throw new CustomExceptions("La agenda esta llena");
        }

        if (contactExist){
            throw new CustomExceptions("El contacto ya existe");
        }

        if (longitudTel != 10){
            throw new CustomExceptions("El numero no cumple con la longitud de un numero de telefono");
        }
    }

}
