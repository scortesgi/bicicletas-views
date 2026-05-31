package com.bicicletas.modelo;

import java.time.LocalDateTime;

public class Comment{

    //Atributos

    private String mensaje;
    private LocalDateTime fecha;
    private Student autor;
    private Administrator admin;
    private long tiun; 
    private String type;
    //Constructor
    public Comment(String mensaje, Student autor, String type) {
            this.mensaje = mensaje;
            this.autor = autor;
            this.type = type;
            //Se asigna la fecha de manera automática
            this.fecha = LocalDateTime.now();
    }

    //Constructor para el motivo de penalización manual realizada por el Administrador
    public Comment(String mensaje, Administrator admin, long tiun ) {
            this.mensaje = mensaje;
            this.admin = admin;
            this.tiun = tiun;
            //Se asigna la fecha de manera automática
            this.fecha = LocalDateTime.now();
    }

    //Get
    public String getType(){
        return type;
    }
    public String getMensaje(){
        return mensaje;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
        public Student getAutor() {
        return autor;
    }
    public Administrator getAdmin() {
        return admin; 
    }
    public long getTiun(){
        return tiun;
    }

    //Set
    public void setMensaje(){
        this.mensaje = mensaje;
    }

    //Métodos
    public void verComentario() {
        if(autor != null){
            System.out.println("Autor: " + autor.getUserName());
            System.out.println("TIUN: " + autor.getTiun());
            System.out.println("Fecha: " + fecha);
            System.out.println("Mensaje: " + mensaje);
        }else{
            System.out.println("Administrador: " + admin.getUserName());
            System.out.println("Fecha: " + fecha);
            System.out.println(" - "+ mensaje);
        }
        System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");

    }


}
