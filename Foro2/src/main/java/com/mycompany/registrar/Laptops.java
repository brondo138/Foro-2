
package com.mycompany.registrar;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author brondo
 */
public class Laptops extends Dispositivo{
    public Laptops() {
        super(obtenerFabricante(), obtenerModelo(), obtenerMicroprocesador(), obtenerMemoriaRam(), obtenerTamañoTorre(), obtenerDiscoDuro());
    }
    
        private static String obtenerFabricante() {
        boolean val = false;
        do{
        String fabricante = JOptionPane.showInputDialog(null, "Ingresa el fabricante de la laptop: ", "Fabricante", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return fabricante;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un fabricante", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return"";
    }
    
    private static String obtenerModelo(){
        
        boolean val = false;
        do{
        String fabricante = JOptionPane.showInputDialog(null, "Ingresa el modelo de la laptop: ", "Modelo", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return fabricante;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un modelo", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerMicroprocesador(){
        
        boolean val = false;
        do{
        String fabricante = JOptionPane.showInputDialog(null, "Ingresa el microprocesador de la laptop: ", "Microprocesador", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return fabricante;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un microprocesador", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerMemoriaRam(){
        
        boolean val = false;
        do{
        String fabricante = JOptionPane.showInputDialog(null, "Ingresa la memoria RAM de la laptop: ", "Memoria RAM", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return fabricante;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar la memoria RAM de la Desktop", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";    
    }
    
    private static String obtenerTamañoTorre(){
        
        boolean val = false;
        do{
        String fabricante = JOptionPane.showInputDialog(null, "Ingresa el tamaño de la torre de la laptop: ", "Tamaño de la Torre", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return fabricante;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar el tamaño de la torre", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerDiscoDuro(){
        
        boolean val = false;
        do{
        String fabricante = JOptionPane.showInputDialog(null, "Ingresa la capacidad del disco duro de la laptop: ", "Capacidad de Disco Duro", JOptionPane.PLAIN_MESSAGE).trim();
        if(fabricante.length()>= 1){
            val = true;
            return fabricante;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar la capacidad del disco duro ", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    public static ArrayList<String> laptopsList(String fabricante, String modelo, String microprocesador, String memoriaRam, String tamañoTorre, String discoDuro) {
        ArrayList<String> listLaptops = new ArrayList<>();
        listLaptops.add(fabricante);
        listLaptops.add(modelo);
        listLaptops.add(microprocesador);
        listLaptops.add(memoriaRam);
        listLaptops.add(tamañoTorre);
        listLaptops.add(discoDuro);
        
        return listLaptops;
        
   }

    
}
