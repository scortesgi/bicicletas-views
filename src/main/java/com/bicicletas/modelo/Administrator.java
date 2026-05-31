package com.bicicletas.modelo;

//clase hija para administraador

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Administrator extends User{
    //atributos
    private String contraseña;


    //constructor
    public Administrator (String username, long cedula, String contraseña){
        super(username, cedula);
        this.contraseña = contraseña;
    }

    public String getContraseña(){
        return contraseña;
    }



    //metodos
    // En la clase Administrator (Ya no necesita recibir el objeto Reservar)
    public boolean penalizeStudent(ArrayList<Student> listaEstudiante, long tiun) {
        
        for (Student student : listaEstudiante) {
            if (student.getTiun() == tiun) {
                // El administrador modifica directamente el estado del estudiante encontrado
                if(student.getContadorPenalizaciones() >= 2){//esta es por si cuenta con 2 o mas penalizaciones
                    student.setFechaFinPenalizacion(LocalDateTime.now().plusDays(30));
                    student.setState("bloqueado");
                    System.out.println("PENALIZACIÓN MANUAL APLICADA POR EL ADMINISTRADOR.");
                    System.out.println("Cuenta con mas de una penalizacion. \nSe bloqueara por 30 dias"); 
                    return true;
                }else{
                    student.setFechaFinPenalizacion(LocalDateTime.now().plusDays(15));
                    student.setState("bloqueado");
                    System.out.println("PENALIZACIÓN MANUAL APLICADA POR EL ADMINISTRADOR.");
                    System.out.println("El estudiante " + student.getUserName() + " ha sido bloqueado por 15 días.");
                    student.setContadorPenalizaciones();
                    return true;
                }   
            }
        }
        System.out.println("Ese TIUN no pertenece a ningún estudiante registrado.");
        return false;
    }
    
     public boolean despenalizeStudent(ArrayList<Student> listaEstudiante, long tiun) {
        
        for (Student student : listaEstudiante) {
            if (student.getTiun() == tiun) {
                if(student.getState().equals("bloqueado")){
                    student.setState("activo");
                    System.out.println("DESPENALIZACION MANUAL APLICADA POR EL ADMINISTRADOR.");
                    System.out.println("El estudiante " + student.getUserName() + " ya no cuenta con penalizaciones");
                    return true;
                }else{
                    System.out.println("El estudiante " + student.getUserName() + " no cuenta con penalizaciones, no se puede DESPENALIZAR");
                    return true;
                }
    
            }
        }
        System.out.println("Ese TIUN no pertenece a ningún estudiante registrado.");
        return false;
    }
    public boolean removeStudent(ArrayList<Student> listaEstudiante, long tiun){
        
        for(int i = 0; i < listaEstudiante.size(); i++){  
             if(listaEstudiante.get(i).getTiun() == tiun){
             listaEstudiante.remove(i);
             return true;
             }
        }
        return false;
    }

//método para registrar el motivo de la penalización
    public void addMotivoPenalizacion(ArrayList<Comment> listaComentariosAdmin, long tiun, String motivo){
    
        Comment comentario = new Comment(motivo, this, tiun);
        listaComentariosAdmin.add(comentario);
        System.out.println("Motivo registrado correctamente.");

    }
    
}