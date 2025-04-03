package Tema7.ActividadesB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjercicioB2 {
    public static void main(String[] args) {
        List<Alumno>alumnos=new ArrayList<>();

        try {
            List <String> aluTexto = Files.readAllLines(Path.of("Resources/alumnos_notas.txt"));
            aluTexto.forEach(linea -> alumnos.add(new Alumno(linea)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        alumnos.sort(Comparator.comparing(alumno -> alumno.getMedia()));
        for (int i = alumnos.size()-1; i >=0 ; i--) {
            System.out.println(alumnos.get(i));
        }
    }
}
