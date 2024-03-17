
package com.mycompany.registrar;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author brondo
 */
public class Laptops extends Dispositivo{
    public Laptops() {
        super(obtenerFabricante(), obtenerModelo(), obtenerMicroprocesador(), obtenerMemoriaRam(), obtenerTamañoPantalla(), obtenerDiscoDuro());
    }
    
        private static String obtenerFabricante() {
        boolean val = false;
        do{
        String dato = JOptionPane.showInputDialog(null, "Ingresa el fabricante de la laptop: ", "Fabricante", JOptionPane.PLAIN_MESSAGE).trim();
        if(dato.length()>= 1){
            val = true;
            return dato;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un fabricante", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return"";
    }
    
    private static String obtenerModelo(){
        
        boolean val = false;
        do{
        String dato = JOptionPane.showInputDialog(null, "Ingresa el modelo de la laptop: ", "Modelo", JOptionPane.PLAIN_MESSAGE).trim();
        if(dato.length()>= 1){
            val = true;
            return dato;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un modelo", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerMicroprocesador(){
        
        boolean val = false;
        do{
        String dato = JOptionPane.showInputDialog(null, "Ingresa el microprocesador de la laptop: ", "Microprocesador", JOptionPane.PLAIN_MESSAGE).trim();
        if(dato.length()>= 1){
            val = true;
            return dato;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar un microprocesador", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerMemoriaRam(){
        
        boolean val = false;
        do{
        String dato = JOptionPane.showInputDialog(null, "Ingresa la memoria RAM de la laptop: ", "Memoria RAM", JOptionPane.PLAIN_MESSAGE).trim();
        if(dato.length()>= 1){
            val = true;
            return dato;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar la memoria RAM de la Desktop", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";    
    }
    
    private static String obtenerTamañoPantalla(){
        
        boolean val = false;
        do{
        String dato = JOptionPane.showInputDialog(null, "Ingresa el tamaño de la pantalla de la laptop: ", "Tamaño de la Pantalla", JOptionPane.PLAIN_MESSAGE).trim();
        if(dato.length()>= 1){
            val = true;
            return dato;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar el tamaño de la torre", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    private static String obtenerDiscoDuro(){
        
        boolean val = false;
        do{
        String dato = JOptionPane.showInputDialog(null, "Ingresa la capacidad del disco duro de la laptop: ", "Capacidad de Disco Duro", JOptionPane.PLAIN_MESSAGE).trim();
        if(dato.length()>= 1){
            val = true;
            return dato;
        }else { JOptionPane.showMessageDialog(null, "Debe ingresar la capacidad del disco duro ", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }while(val == false);
        return "";
    }
    
    public static ArrayList<String> laptopsList(String fabricante, String modelo, String microprocesador, String memoriaRam, String tamañoPantalla, String discoDuro){
        ArrayList<String> listLaptops = new ArrayList<>();
        listLaptops.add(fabricante);
        listLaptops.add(modelo);
        listLaptops.add(microprocesador);
        listLaptops.add(memoriaRam);
        listLaptops.add(tamañoPantalla);
        listLaptops.add(discoDuro);
        
        return listLaptops;
        
   }

    
}
