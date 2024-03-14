package com.mycompany.main;
import com.mycompany.mostrar.Mostrar;
import com.mycompany.registrar.Dispositivo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    private static ArrayList<String> listaDesktops = new ArrayList<>();

    public static void main(String[] args) {
        String[] opciones = {"Registrar equipos", "Ver equipos", "Salir"};
        boolean salir = false;

        do {
            int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Bienvenido usuario, ¿qué desea hacer?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            switch (opcionSeleccionada) {
                case 0:
                    // Registrar equipos
                    Dispositivo.ingresoDatos(listaDesktops);
                    break;
                case 1:
                    // Mostrar equipos
                    Mostrar.mostrarLista(listaDesktops);
                    break;
                case 2:
                    // Salir
                    salir = true;
                    break;
            }
        } while (!salir);
    }

    public static ArrayList<String> getListaDesktops() {
        return listaDesktops;
    }

    public static void setListaDesktops(ArrayList<String> nuevaListaDesktops) {
        listaDesktops = nuevaListaDesktops;
    }
}
