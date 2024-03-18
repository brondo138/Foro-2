package Registrar;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tablets extends Dispositivo {

    public Tablets() {
        super(obtenerFabricante(), obtenerModelo(), obtenerMicroprocesador(), obtenerTamDiagonal(), obtenerCapRes(), obtenerMemoriaNAND(), obtenerSistemaOperativo(), obtenerNothing());
    }

    private static String obtenerFabricante() {
        boolean valido = false;
        String dato = "";
        do {
            dato = JOptionPane.showInputDialog(null, "Ingresa el fabricante de la tablet: ", "Fabricante", JOptionPane.PLAIN_MESSAGE).trim();
            if (dato.length() >= 1) {
                valido = true;
                return dato;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un fabricante", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return "";
    }

    private static String obtenerModelo() {
        boolean valido = false;
        String dato = "";
        do {
            dato = JOptionPane.showInputDialog(null, "Ingresa el modelo de la tablet: ", "Modelo", JOptionPane.PLAIN_MESSAGE).trim();
            if (dato.length() >= 1) {
                valido = true;
                return dato;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un modelo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return "";
    }

    private static String obtenerMicroprocesador() {
        boolean valido = false;
        String dato = "";
        do {
            dato = JOptionPane.showInputDialog(null, "Ingresa el microprocesador de la tablet: ", "Microprocesador", JOptionPane.PLAIN_MESSAGE).trim();
            if (dato.length() >= 1) {
                valido = true;
                return dato;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un microprocesador", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return "";
    }

    private static String obtenerTamDiagonal() {
        boolean valido = false;
        String dato = "";
        do {
            dato = JOptionPane.showInputDialog(null, "Ingresa el tamaño diagonal de la tablet: ", "Tamaño diagonal", JOptionPane.PLAIN_MESSAGE).trim();
            if (dato.length() >= 1) {
                valido = true;
                return dato;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un tamaño diagonal", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return "";
    }

    private static String obtenerCapRes() {
        boolean valido = false;
        String dato = "";
        do {
            dato = JOptionPane.showInputDialog(null, "Ingresa el tipo de la tablet (capacitiva o resistiva): ", "Tipo", JOptionPane.PLAIN_MESSAGE).trim();
            if (dato.length() >= 1) {
                valido = true;
                return dato;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un tipo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return "";
    }

    private static String obtenerMemoriaNAND() {
        boolean valido = false;
        String dato = "";
        do {
            dato = JOptionPane.showInputDialog(null, "Ingresa la memoria NAND de la tablet: ", "Memoria NAND", JOptionPane.PLAIN_MESSAGE).trim();
            if (dato.length() >= 1) {
                valido = true;
                return dato;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar la memoria NAND", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return "";
    }

    private static String obtenerSistemaOperativo() {
        boolean valido = false;
        String dato = "";
        do {
            dato = JOptionPane.showInputDialog(null, "Ingresa el Sistema Operativo de la tablet: ", "Sistema Operativo", JOptionPane.PLAIN_MESSAGE).trim();
            if (dato.length() >= 1) {
                valido = true;
                return dato;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un Sistema Operativo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!valido);
        return "";
    }

    private static String obtenerNothing(){
        return "";
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
