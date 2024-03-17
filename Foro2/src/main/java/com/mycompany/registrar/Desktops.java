    package com.mycompany.registrar;

    import javax.swing.JOptionPane;
    import java.util.ArrayList;

    /**
     *
     * @author brondo
     */

    public class Desktops extends Dispositivo {

        public Desktops() {
            super(obtenerFabricante(), obtenerModelo(), obtenerMicroprocesador(), obtenerMemoriaRam(), obtenerTarjetaGrafica(), obtenerTamañoTorre(), obtenerDiscoDuro());
        }

        private static String obtenerFabricante() {
            boolean val = false;
            do{
            String dato = JOptionPane.showInputDialog(null, "Ingresa el fabricante de la Desktop: ", "Fabricante", JOptionPane.PLAIN_MESSAGE).trim();
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
            String dato = JOptionPane.showInputDialog(null, "Ingresa el modelo de la Desktop: ", "Modelo", JOptionPane.PLAIN_MESSAGE).trim();
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
            String dato = JOptionPane.showInputDialog(null, "Ingresa el microprocesador de la Desktop: ", "Microprocesador", JOptionPane.PLAIN_MESSAGE).trim();
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
            String dato = JOptionPane.showInputDialog(null, "Ingresa la memoria RAM de la Desktop: ", "Memoria RAM", JOptionPane.PLAIN_MESSAGE).trim();
            if(dato.length()>= 1){
                val = true;
                return dato;
            }else { JOptionPane.showMessageDialog(null, "Debe ingresar la memoria RAM de la Desktop", "Advertencia", JOptionPane.WARNING_MESSAGE);}
            }while(val == false);
            return "";    
        }

        private static String obtenerTarjetaGrafica(){

            boolean val = false;
            do{
            String dato = JOptionPane.showInputDialog(null, "Ingresa la tarjeta gráfica de la Desktop: ", "Tarjeta Gráfica", JOptionPane.PLAIN_MESSAGE).trim();
            if(dato.length()>= 1){
                val = true;
                return dato;
            }else { JOptionPane.showMessageDialog(null, "Debe ingresar una tarjeta grafica", "Advertencia", JOptionPane.WARNING_MESSAGE);}
            }while(val == false);
            return "";
        }

        private static String obtenerTamañoTorre(){

            boolean val = false;
            do{
            String dato = JOptionPane.showInputDialog(null, "Ingresa el tamaño de la torre de la Desktop: ", "Tamaño de la Torre", JOptionPane.PLAIN_MESSAGE).trim();
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
            String dato = JOptionPane.showInputDialog(null, "Ingresa la capacidad del disco duro de la Desktop: ", "Capacidad de Disco Duro", JOptionPane.PLAIN_MESSAGE).trim();
            if(dato.length()>= 1){
                val = true;
                return dato;
            }else { JOptionPane.showMessageDialog(null, "Debe ingresar la capacidad del disco duro ", "Advertencia", JOptionPane.WARNING_MESSAGE);}
            }while(val == false);
            return "";
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
