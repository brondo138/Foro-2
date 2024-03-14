package com.mycompany.registrar;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Desktops extends Dispositivo {
    
    public Desktops() {
        super(obtenerFabricante(), obtenerModelo(), obtenerMicroprocesador(), obtenerMemoriaRam(), obtenerTarjetaGrafica(), obtenerTamañoTorre(), obtenerDiscoDuro());
    }

    private static String obtenerFabricante() {
        return JOptionPane.showInputDialog(null, "Ingresa el fabricante de la Desktop: ", "Fabricante", JOptionPane.PLAIN_MESSAGE);
    }
    
    private static String obtenerModelo(){
        return JOptionPane.showInputDialog(null, "Ingresa el modelo de la Desktop: ", "Modelo", JOptionPane.PLAIN_MESSAGE);
    }
    
    private static String obtenerMicroprocesador(){
        return JOptionPane.showInputDialog(null, "Ingresa el microprocesador de la Desktop: ", "Microprocesador", JOptionPane.PLAIN_MESSAGE);
    }
    
    private static String obtenerMemoriaRam(){
        return JOptionPane.showInputDialog(null, "Ingresa la memoria RAM de la Desktop: ", "Memoria RAM", JOptionPane.PLAIN_MESSAGE);    
    }
    
    private static String obtenerTarjetaGrafica(){
        return JOptionPane.showInputDialog(null, "Ingresa la tarjeta gráfica de la Desktop: ", "Tarjeta Gráfica", JOptionPane.PLAIN_MESSAGE);
    }
    
    private static String obtenerTamañoTorre(){
        return JOptionPane.showInputDialog(null, "Ingresa el tamaño de la torre de la Desktop: ", "Tamaño de la Torre", JOptionPane.PLAIN_MESSAGE);
    }
    
    private static String obtenerDiscoDuro(){
        return JOptionPane.showInputDialog(null, "Ingresa la capacidad del disco duro de la Desktop: ", "Capacidad de Disco Duro", JOptionPane.PLAIN_MESSAGE);
    }
    
    public static ArrayList<String> desktopList(String fabricante, String modelo, String microprocesador, String memoriaRam, String tarjetaGrafica, String tamañoTorre, String discoDuro) {
        ArrayList<String> listDesktops = new ArrayList<>();
        listDesktops.add(fabricante);
        listDesktops.add(modelo);
        listDesktops.add(microprocesador);
        listDesktops.add(memoriaRam);
        listDesktops.add(tarjetaGrafica);
        listDesktops.add(tamañoTorre);
        listDesktops.add(discoDuro);
        
        return listDesktops;
        
   }
}