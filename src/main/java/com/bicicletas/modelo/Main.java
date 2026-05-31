
package com.bicicletas.modelo;
import java.util.ArrayList;
import com.bicicletas.views.Bienvenida; 

public class Main {
    ///GLOBALES
    public static ArrayList<Administrator> adminsAutorizados = new ArrayList<>();
    public static ArrayList<Student> listaEstudiante = new ArrayList<>();
    public static ArrayList<Station> estaciones = new ArrayList<>();
    public static ArrayList<Comment> listaComentarios = new ArrayList<>();
    public static ArrayList<Comment> listaComentariosAdmin = new ArrayList<>();
    public static ArrayList<Student> listaEstudiantesBloqueados = new ArrayList<>();
    public static Student estudianteActual;
    public static PerEmergencia  perEmergencia;
    public static Station estacionRecogida,estacionEntrega;
    public static Bike bicicleta;
    public static Reservar reserva;
    
    

   public static void main(String[] args) {
        
       //ADMINISTRADORES
       adminsAutorizados.add(new Administrator("santiago gonzalez", 1032443188, "1032443188"));
        adminsAutorizados.add(new Administrator("laura valderrama", 1052841022, "1052841022"));
        adminsAutorizados.add(new Administrator("sammuel cortes", 1013602884, "1013602884"));
        adminsAutorizados.add(new Administrator("valery torres", 1141326715, "1141326715"));
        adminsAutorizados.add(new Administrator("xiomara malagon", 1021666771, "1021666771"));
        //ESTACIONES
        estaciones.add(new Station("Calle 53", 2));
        estaciones.add(new Station("CYT", 2));
        estaciones.add(new Station("Uriel", 15));   
        estaciones.add(new Station("Calle 45", 15));
        estaciones.add(new Station("Calle 26", 30));
        estaciones.add(new Station("Calle 30", 40));
       
     
        
  
    // para ver como es sn registrarse
    
    java.awt.EventQueue.invokeLater(() -> new Bienvenida().setVisible(true));
   
}
}