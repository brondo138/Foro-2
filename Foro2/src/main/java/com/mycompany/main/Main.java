package com.mycompany.registrar;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tablets extends Dispositivo {
    
    public Tablets() {
        super(obtenerFabricante(), obtenerModelo(), obtenerMicroprocesador(), obtenerTamDiagonal(), obtenerCapRes(), obtenerMemoriaNAND(), obtenerSistemaOperativo());
    }

    private static String obtenerFabricante() {
        boolean valido = false;
        String fabricante = "";
        do {
            fabricante = JOptionPane.showInputDialog(null, "Ingresa el fabricante de la tablet: ", "Fabricante", JOptionPane.PLAIN_MESSAGE).trim();
            if (fabricante.length() >= 1) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un fabricante", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return fabricante;
    }

    private static String obtenerModelo() {
        boolean valido = false;
        String modelo = "";
        do {
            modelo = JOptionPane.showInputDialog(null, "Ingresa el modelo de la tablet: ", "Modelo", JOptionPane.PLAIN_MESSAGE).trim();
            if (modelo.length() >= 1) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un modelo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return modelo;
    }

    private static String obtenerMicroprocesador() {
        boolean valido = false;
        String microprocesador = "";
        do {
            microprocesador = JOptionPane.showInputDialog(null, "Ingresa el microprocesador de la tablet: ", "Microprocesador", JOptionPane.PLAIN_MESSAGE).trim();
            if (microprocesador.length() >= 1) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un microprocesador", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return microprocesador;
    }

    private static String obtenerTamDiagonal() {
        boolean valido = false;
        String tamDiagonal = "";
        do {
            tamDiagonal = JOptionPane.showInputDialog(null, "Ingresa el tamaño diagonal de la tablet: ", "Tamaño diagonal", JOptionPane.PLAIN_MESSAGE).trim();
            if (tamDiagonal.length() >= 1) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un tamaño diagonal", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return tamDiagonal;
    }

    private static String obtenerCapRes() {
        boolean valido = false;
        String capRes = "";
        do {
            capRes = JOptionPane.showInputDialog(null, "Ingresa el tipo de la tablet (capacitiva o resistiva): ", "Tipo", JOptionPane.PLAIN_MESSAGE).trim();
            if (capRes.length() >= 1) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un tipo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return capRes;
    }

    private static String obtenerMemoriaNAND() {
        boolean valido = false;
        String memoriaNAND = "";
        do {
            memoriaNAND = JOptionPane.showInputDialog(null, "Ingresa la memoria NAND de la tablet: ", "Memoria NAND", JOptionPane.PLAIN_MESSAGE).trim();
            if (memoriaNAND.length() >= 1) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar la memoria NAND", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return memoriaNAND;
    }

    private static String obtenerSistemaOperativo() {
        boolean valido = false;
        String sistemaOperativo = "";
        do {
            sistemaOperativo = JOptionPane.showInputDialog(null, "Ingresa el Sistema Operativo de la tablet: ", "Sistema Operativo", JOptionPane.PLAIN_MESSAGE).trim();
            if (sistemaOperativo.length() >= 1) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un Sistema Operativo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return sistemaOperativo;
    }

    public static ArrayList<String> tabletsList(String fabricante, String modelo, String microprocesador, String diag_tam, String cap_res, String nand, String so) {
        ArrayList<String> listTablets = new ArrayList<>();
        listTablets.add(fabricante);
        listTablets.add(modelo);
        listTablets.add(microprocesador);
        listTablets.add(diag_tam);
        listTablets.add(cap_res);
        listTablets.add(nand);
        listTablets.add(so);
        
        return listTablets;
    }
}
