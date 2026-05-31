
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
    public static Administrator administradorActual;

    
    //estos son temporales para el registro
    public static String tempNombre;
    public static long tempCedula;
    public static long tempTiun;
    public static String tempContrasena;

   public static void main(String[] args) {
        
       //ADMINISTRADORES
       
       adminsAutorizados.add(new Administrator("Santiago Gonzalez", 1032443188, "1032443188"));
        adminsAutorizados.add(new Administrator("Laura Valderrama", 1052841022, "1052841022"));
        adminsAutorizados.add(new Administrator("Sammuel Cortes", 1013602884, "1013602884"));
        adminsAutorizados.add(new Administrator("Valery Torres", 1141326715, "1141326715"));
        adminsAutorizados.add(new Administrator("Xiomara Malagon", 1021666771, "1021666771"));
        //ESTACIONES
        estaciones.add(new Station("Calle 53",2,"calle53.txt"));
        estaciones.add(new Station("CYT",2,"cyt.txt"));
        estaciones.add(new Station("Uriel",15,"uriel.txt"));
        estaciones.add(new Station("Calle 45",15,"calle45.txt"));
        estaciones.add(new Station("Calle 26",30,"calle26.txt"));
        estaciones.add(new Station("Calle 30",40,"calle30.txt"));
       
        for (Station estacion : estaciones) {
        Archivo.cargarBicicletas(estacion);
        }
        
  
    // para ver como es sn registrarse
    
    java.awt.EventQueue.invokeLater(() -> new Bienvenida().setVisible(true));
   
}
}