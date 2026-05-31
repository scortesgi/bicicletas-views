/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bicicletas.modelo;

/**
 *
 * @author xioma
 */
public class PerEmergencia extends User{
    //atributos
    private long numEmergencia;

    //constructor 
    public PerEmergencia (String username, long cedula, String numEmergencia){
        super(username, cedula);
    }

    public long getNumEmergencia(){
        return numEmergencia;
    }
 

    //verificacion de numuero de emergencia
    public boolean setNumEmergencia(String numEmergencia){
    if (numEmergencia.length() == 10 && numEmergencia.matches("\\d{10}")){  
        this.numEmergencia = Long.parseLong(numEmergencia);
        return true;
    }else {
        System.out.println("Numero de emergencia invalido");
        return false;   
    }
}
  
}
