package com.bicicletas.modelo;

 //clase hija  de madre para estudiante

import java.time.LocalDateTime; 
import java.util.ArrayList;

import java.time.Duration;      // Para calcular la diferencia de tiempo entre dos momentos
import java.util.List;
import javax.swing.JOptionPane;
    



public class Student extends User {
    //Atributos
    private long tiun;
    private String state = "activo", contraseña;
    public boolean TieneReserva = false; 
    public Bike bicicletaAsignada = null;
    private LocalDateTime fechaFinPenalizacion;
    private int contadorPenalizaciones = 0;
    private Reservar reserva;
    private PerEmergencia perEmergencias;
    

    //Constructor
    public Student (String username, long cedula, long tiun,String contraseña, PerEmergencia perEmergencias){
        super(username, cedula);
        this.tiun = tiun;
        this.contraseña = contraseña;
        this.perEmergencias = perEmergencias;
    }

    //Get

    public long getTiun(){
        return tiun;
    }
    public LocalDateTime getFechaFinPenalizacion(){
        return fechaFinPenalizacion;
    }
    public String getState(){
        return state;
    }
    public int getContadorPenalizaciones(){
        return contadorPenalizaciones;
    }
    public Reservar getReserva(){
        return reserva;
    }
    public PerEmergencia getPerEmergencia(){
        return perEmergencias;
    }
    public String getContraseña(){
        return contraseña;
    }
//Set
    public boolean setContraseña(String contraseña){
        if (contraseña!= null && !contraseña.isEmpty()){   
            this.contraseña=contraseña;
            return true;      
        }else {
            System.out.println("contraseña invalido");
            return false;
        }
    }

        
    public void setReserva(Reservar reserva) {
        this.reserva = reserva;
    }
    
    public void setPerEmergencia(PerEmergencia perEmergencia) {
        this.perEmergencias = perEmergencia;
    }


        
    //verificacion de tiun
    public boolean setTiun(long tiun){
        String tiunS = String.valueOf(tiun);
        if (tiunS.length() == 10 ){  
            this.tiun = tiun;
            return true;
        }else {
            System.out.println("Tiun invalido");
            return false;   
        }
    }
    

    public void setFechaFinPenalizacion( LocalDateTime fechaFinPenalizacion){
        this.fechaFinPenalizacion=  fechaFinPenalizacion;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setContadorPenalizaciones(){
        this.contadorPenalizaciones ++;
    }

    //METODOS

    public void asignarBicicleta(Bike bicicleta){ //se le tiene que agregar al administrador esta opcion para que puede ver que ciclas tienen reservadas por que estudiantes
        this.bicicletaAsignada = bicicleta; //cuando haya ids se les asigna == se debe completar
        this.TieneReserva = true;
    }

    public void devolverBicicleta(Bike bicicleta){
        this.bicicletaAsignada = null;
        this.TieneReserva = false;
    }
    
    public void activacionDeUso(){
    if (this.reserva != null) {
        reserva.activacionUso();
    } else {
        javax.swing.JOptionPane.showMessageDialog(null,
            "El estudiante " + this.getUserName() + " no tiene ninguna reserva activa.",
            "Activación fallida",
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}

public void finalizacionDeUso(){
    if (this.reserva != null) {
        reserva.finalizarUso();
    } else {
        javax.swing.JOptionPane.showMessageDialog(null,
            "El estudiante " + this.getUserName() + " no tiene un uso activo para finalizar.",
            "Finalización fallida",
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}


    public void estadoPenalizacionConComentario(List<Comment> comentariosAdmin){
    StringBuilder mensaje = new StringBuilder();

    if (this.getState() != null && this.getState().equals("bloqueado")) {
        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime finCastigo = this.getFechaFinPenalizacion();

        if (finCastigo != null && ahora.isBefore(finCastigo)) {
            Duration tiempoRestante = Duration.between(ahora, finCastigo);

            long dias = tiempoRestante.toDays();
            long horas = tiempoRestante.toHoursPart();
            long minutos = tiempoRestante.toMinutesPart();

            mensaje.append("Cuenta regresiva de tu sanción:\n")
                   .append(dias).append(" días, ")
                   .append(horas).append(" horas y ")
                   .append(minutos).append(" minutos.\n\n");
        } else {
            this.setState("activo");
            this.setFechaFinPenalizacion(null);
            mensaje.append("El estudiante ").append(this.getUserName())
                   .append(" ya se encuentra activo.\n\n");
        }
    } else {
        mensaje.append("El estudiante ").append(this.getUserName())
               .append(" no se encuentra penalizado.\n\n");
    }

    // Buscar comentarios asociados a este estudiante
    for (Comment c : comentariosAdmin) {
        if (c.getTiun() == this.getTiun()) {
            if (c.getAutor() != null) {
                mensaje.append("Comentario del administrador:\n")
                       .append("Autor: ").append(c.getAutor().getUserName()).append("\n")
                       .append("Fecha: ").append(c.getFecha()).append("\n")
                       .append("Mensaje: ").append(c.getMensaje()).append("\n");
            } else {
                mensaje.append("Comentario del administrador:\n")
                       .append("Administrador: ").append(c.getAdmin().getUserName()).append("\n")
                       .append("Fecha: ").append(c.getFecha()).append("\n")
                       .append("Mensaje: ").append(c.getMensaje()).append("\n");
            }
        }
    }

    // Mostrar todo en una sola alerta
    JOptionPane.showMessageDialog(null,
        mensaje.toString(),
        "Estado de penalización y comentarios",
        JOptionPane.WARNING_MESSAGE);
}


    public void tiempoDeUso(){
        //verificacion de que si cuente con la activacion del uso 
       
        if((this.reserva != null) && reserva.getEstadoReserva().equals("en_uso")){
            long minutosUsados = Duration.between(reserva.getTiempoInicioUso(), LocalDateTime.now()).toMinutes();
            if(minutosUsados > reserva.getTiempoUsoMax()){
                javax.swing.JOptionPane.showMessageDialog(null,
                    "Superaste el tiempo de uso. Esto generará una penalización.",
                    "Tiempo de uso",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            } else {
                long minutosRestantes = (long) (reserva.getTiempoUsoMax() - minutosUsados);
                javax.swing.JOptionPane.showMessageDialog(null,
                    "Cuentas con un tiempo restante de uso de: " + minutosRestantes + " minutos.",
                    "Tiempo de uso",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null,
                "Usted no cuenta con ninguna activación de uso de bicicleta en estos momentos.",
                "Tiempo de uso",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }


    }

     public void verMotivosPenalizacion(ArrayList <Comment> listaComentariosAdmin){
        
        boolean existe = false;
        for(Comment comentario : listaComentariosAdmin){
            if(comentario.getTiun() == this.getTiun()){
                if(!existe){
                System.out.println("Motivos de penalización:");
                }
                comentario.verComentario();
                existe = true;
            }
        }
    }
    public void informacionEmergencia(){
        System.out.println("Nombre: " + this.getUserName());
        System.out.println("C.C o ID: " + this.getCedula());
        System.out.println("Tiun: " + this.getTiun());    
        System.out.println("Nombre de persona de EMERGENCIA: " + perEmergencias.getUserName());
        System.out.println("C.C de persona de EMERGENCIA: " + perEmergencias.getCedula());
        System.out.println("Numero de persona de EMERGENCIA: " + perEmergencias.getNumEmergencia());
    }
    
}

    
