package Tema7.EjercicioFunko;

import java.io.*;
import java.util.List;

public class SerializaFunkos {
    public static void serializarFunko(Funko funko, String fichero){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))){
            oos.writeObject(funko);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Funko deserializarFunko(String fichero){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            return (Funko) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void serializaListaDeFunkos(List<Funko> funkos, String archivo){

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))){
                oos.writeObject(funkos);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
    public static List<Funko> deserializaListasdeFunkos(String ruta){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
            return (List<Funko>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
