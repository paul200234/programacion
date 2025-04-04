package Tema7.ActividadesC;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonaEscribir {
    private ObjectOutputStream output;

        public void abrir() throws IOException{

            //SERIALIZACION
            FileOutputStream file = new FileOutputStream("Resources/persona.dat");
            output = new ObjectOutputStream(file);
        }

        public void cerrar() throws IOException{
            if(output!=null)
                output.close();
        }

        public void escribir(Persona persona) throws IOException {
            if(output!=null) {
                output.writeObject(persona);
                System.out.println("Persona escrita");
            }
        }

    }

