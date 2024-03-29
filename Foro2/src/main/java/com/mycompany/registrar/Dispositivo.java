package com.mycompany.registrar;

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
    protected static String tamañoPantalla;
    protected static String diag_tam;
    protected static String cap_res;
    protected static String nand;
    protected static String so;

    //dekstop
    public Dispositivo(String fabricante, String modelo, String microprocesador, String memoriaRam, String tarjetaGrafica, String tamañoTorre, String discoDuro) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.memoriaRam = memoriaRam;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamañoTorre = tamañoTorre;
        this.discoDuro = discoDuro;
    }

    //String fabricante, String modelo, String microprocesador, String memoriaRam, String tamañoPantalla, String discoDuro
    //laptops
    public Dispositivo(String fabricante, String modelo, String microprocesador, String memoriaRam, String tamañoPantalla, String discoDuro) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.memoriaRam = memoriaRam;
        this.tamañoPantalla = tamañoPantalla;
        this.discoDuro = discoDuro;
    }

    //tablets
    public Dispositivo(String fabricante, String modelo, String microprocesador, String diag_tam, String cap_res, String nand, String so, String nothing) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.diag_tam = diag_tam;
        this.cap_res = cap_res;
        this.nand = nand;
        this.so = so;
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

    public static String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public static String getTamañoTorre() {
        return tamañoTorre;
    }

    public static String getDiscoDuro() {
        return discoDuro;
    }

    public static String getTamDiagonal() {
        return diag_tam;
    }

    public static String getCapRes() {
        return cap_res;
    }

    public static String getMemoriaNAND() {
        return nand;
    }

    public static String getSistemaOperativo() {
        return so;
    }

    public static int tipoDispositivo() {
        String[] opciones = {"Desktops", "Laptops", "Tablets"};

        return JOptionPane.showOptionDialog(null, "Qué tipo de dispositivo va a agregar:", "Registrar equipo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
    }
    private static ArrayList<String> finalD = new ArrayList<>();
    private static ArrayList<String> finalL = new ArrayList<>();
    private static ArrayList<String> finalT = new ArrayList<>();

    public static void ingresoDatos(int tipo) {
        if (tipo == 0) {

            // Llamamos a la función desktops de la clase Desktops
            Desktops desktops = new Desktops();
            // Aloja las variables en la lista
            finalD.addAll(desktops.desktopList(fabricante, modelo, microprocesador, memoriaRam, tarjetaGrafica, tamañoTorre, discoDuro));
        }
        if (tipo == 1) {

            // Llamamos a la función laptops de la clase Laptops
            Laptops laptops = new Laptops();
            // Aloja las variables en la lista
            finalL.addAll(laptops.laptopsList(fabricante, modelo, microprocesador, memoriaRam, tamañoPantalla, discoDuro));

        }
        if (tipo == 2) {

            // Llamamos a la función tablets de la clase Tablets
            Tablets tablets = new Tablets();
            // Aloja las variables en la lista
            //finalT = tablets.tabletsList(fabricante, modelo, microprocesador, diag_tam, cap_res, nand, so);
            finalT.addAll(tablets.tabletsList(fabricante, modelo, microprocesador, diag_tam, cap_res, nand, so));
        }
    }

    public static ArrayList<String>[] obtenerDatos() {
        ArrayList<String>[] datos = new ArrayList[3]; // Creamos un arreglo de tres ArrayLists
        datos[0] = finalD; // Asignamos finalD al primer elemento del arreglo
        datos[1] = finalL; // Asignamos finalL al segundo elemento del arreglo
        datos[2] = finalT; // Asignamos finalT al tercer elementon del arreglo
        return datos;
    }
}
