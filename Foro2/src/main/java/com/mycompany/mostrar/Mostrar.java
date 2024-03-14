package com.mycompany.mostrar;
import java.util.ArrayList;

public class Mostrar {
    
     public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("Lista de escritorios:");
        for (String desktop : lista) {
            System.out.println(desktop);
        }
    }
    
}
