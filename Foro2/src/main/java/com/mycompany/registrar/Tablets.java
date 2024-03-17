/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrar;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author brondo
 */
public class Tablets extends Dispositivo {
    public Tablets(){
        super(obtenerFabricante(), obtenerModelo(), obtenerMicroprocesador(), obtenerTamDiagonal(), obtenerCapRes(), obtenerMemoriaNAND(), obtenerSistemaOperativo());
    }

    private static String obtenerFabricante(){
        boolean val = false;
        do{
        String fabricante = JOptionPane.showInputDialog(null, "Ingresa el fabricante de la tablet: ", "Fabricante", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return fabricante;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un fabricante", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerModelo(){
        boolean val = false;
        do{
        String modelo = JOptionPane.showInputDialog(null, "Ingresa el modelo de la tablet: ", "Modelo", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return modelo;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un modelo", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerMicroprocesador(){
        boolean val = false;
        do{
        String micro = JOptionPane.showInputDialog(null, "Ingresa el microprocesador de la tablet: ", "Microprocesador", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return micro;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un microprocesador", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerTamDiagonal(){
        boolean val = false;
        do{
        String tamdiago = JOptionPane.showInputDialog(null, "Ingresa el tamaño diagonal de la tablet: ", "Tamaño diagonal", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return tamdiago;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un tamaño diagonal", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerCapRes(){
        boolean val = false;
        do{
        String tipo = JOptionPane.showInputDialog(null, "Ingresa el tipo de la tablet (capacitiva o resistiva): ", "Tipo", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return tipo;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un tipo", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerMemoriaNAND(){
        boolean val = false;
        do{
        String nandmem = JOptionPane.showInputDialog(null, "Ingresa la memoria NAND de la tablet: ", "Memoria NAND", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return nandmem;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar la memoria NAND", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerSistemaOperativo(){
        boolean val = false;
        do{
        String opsis = JOptionPane.showInputDialog(null, "Ingresa el Sistema Operativo de la tablet: ", "Sistema Operativo", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return opsis;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un Sistema Operativo", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }

    public static ArrayList<String> tabletsList(String fabricante, String modelo, String microprocesador, String diag_tam, String cap_res, String nand, String so) {
        ArrayList<String> listTablets = new ArrayList<>();
        listTablets.add(fabricante);
        listTablets.add(modelo);
        listTablets.add(micro);
        listTablets.add(tamdiago);
        listTablets.add(tipo);
        listTablets.add(nandmem);
        listTablets.add(opsis);
        
        return listTablets;
        
   }
}
