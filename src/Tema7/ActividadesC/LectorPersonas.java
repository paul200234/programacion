package Tema7.ActividadesC;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LectorPersonas {
    private ObjectInputStream input;

    //Abrir fichero
    public void abrir() throws IOException {
        input = new ObjectInputStream(new FileInputStream("Resources/persona.dat"));
    }

    //Cerrar el fichero
    public void cerrar() throws IOException{
        if(input!=null)
            input.close();
    }

    public Persona leer() throws IOException, ClassNotFoundException{
        Persona persona = null;
        if(input!=null){
            try{
                persona = (Persona) input.readObject();
                System.out.println("persona leido correctamente");

            }catch (EOFException eof){
                //Fin del fichero
            }
        }
        return persona;
    }
}
