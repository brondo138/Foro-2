package com.mycompany.registrar;

import com.mycompany.main.Main;
import com.mycompany.mostrar.Mostrar;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Dispositivo {

    protected static String fabricante;
    protected static String modelo;
    protected static String microprocesador;
    protected static String memoriaRam;
    protected static String tarjetaGrafica;
    protected static String tamañoTorre;
    protected static String discoDuro;

    public Dispositivo(String fabricante, String modelo, String microprocesador, String memoriaRam, String tarjetaGrafica, String tamañoTorre, String discoDuro) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.memoriaRam = memoriaRam;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamañoTorre = tamañoTorre;
        this.discoDuro = discoDuro;
    }

    public static String getFabricante() {
        return fabricante;
    }

    public static String getModelo() {
        return modelo;
    }

    public static String getMicroprocesador() {
        return microprocesador;
    }

    public static String getMemoriaRam() {
        return memoriaRam;
    }

    public static String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public static String getTamañoTorre() {
        return tamañoTorre;
    }

    public static String getDiscoDuro() {
        return discoDuro;
    }

     public static ArrayList ingresoDatos(ArrayList<String> listaDesktops) {
        String[] opciones = {"Desktops", "Laptops", "Tablets"};

        boolean continuar = true;

            int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Qué tipo de dispositivo va a agregar:", "Registrar equipo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (opcionSeleccionada) {
                case 0:
                    Desktops desktops = new Desktops();
                    listaDesktops.addAll(Desktops.desktopList(Desktops.getFabricante(), Desktops.getModelo(), Desktops.getMicroprocesador(), Desktops.getMemoriaRam(), Desktops.getTarjetaGrafica(), Desktops.getTamañoTorre(), Desktops.getDiscoDuro()));   
                break;

                case 1:
                    
                case 2:
                    // Lógica para Laptops
                    Mostrar.mostrarLista(listaDesktops);
                    break;
            }
       

        return listaDesktops;
    }
}