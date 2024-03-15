package com.mycompany.mostrar;

import com.mycompany.registrar.Desktops;
import com.mycompany.registrar.Dispositivo;
import com.mycompany.registrar.Laptops;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Mostrar {
    
public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("Lista de escritorios:");
        int totalEscritorios = lista.size() / 7; // Calculamos el número total de escritorios
        
        for (int i = 0; i < totalEscritorios; i++) {
            int indice = i * 7; // Calculamos el índice inicial de cada escritorio
            
            System.out.println("Fabricante: " + lista.get(indice));
            System.out.println("Modelo: " + lista.get(indice + 1));
            System.out.println("Microprocesador: " + lista.get(indice + 2));
            System.out.println("Memoria RAM: " + lista.get(indice + 3));
            System.out.println("Tarjeta Gráfica: " + lista.get(indice + 4));
            System.out.println("Tamaño de la Torre: " + lista.get(indice + 5));
            System.out.println("Capacidad de Disco Duro: " + lista.get(indice + 6));
            System.out.println();
        }
    }

public static void mostrarListaL(ArrayList<String> lista) {
    System.out.println("Lista de laptops:");
        for (int i = 0; i < lista.size(); i += 6) {
            System.out.println("Fabricante: " + lista.get(i));
            System.out.println("Modelo: " + lista.get(i + 1));
            System.out.println("Microprocesador: " + lista.get(i + 2));
            System.out.println("Memoria RAM: " + lista.get(i + 3));
            System.out.println("Tamaño de la Torre: " + lista.get(i + 4));
            System.out.println("Capacidad de Disco Duro: " + lista.get(i + 5));
            System.out.println();
        }
}
    
    public static void mostrar (ArrayList <String> lista){
        ArrayList<String>[] datos = Dispositivo.obtenerDatos();

        String[] opciones = {"Desktops", "Laptops", "Tablets"};

        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Qué tipo de dispositivo quiere ver:", "Mostrar equipo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        switch (opcionSeleccionada) {
            case 0:
                 System.out.println("Elementos de finalD:");
        for (String elemento : datos[0]) {
            System.out.println(elemento);
        }break;
            case 1:
                 System.out.println("Elementos de finalL:");
        for (String elemento : datos[1]) {
            System.out.println(elemento);
        }
                break;
                

            case 2:
                // Lógica para Tablets
                break;
        }
        

    
        
    }
}
