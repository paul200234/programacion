package Tema7.Videojuego;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializaJuegos {
    public static ArrayList<Videojuego> deserializaJuegos(String ruta){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            return (ArrayList<Videojuego>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void serializaVideoJuegos(List<Videojuego> lista , String ruta) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))){
            oos.writeObject(lista);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
