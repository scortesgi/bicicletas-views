package com.bicicletas.modelo;
import java.io.*;

public class Archivo {
    
public static void cargarBicicletas(Station estacion){

    try(BufferedReader br =
            new BufferedReader(
                    new FileReader(estacion.getArchivo()))){

        String linea;

        while((linea = br.readLine()) != null){
if (linea.trim().isEmpty()) continue;
            String[] partes = linea.split(",");
            if (partes.length < 2) continue;
            try {
                
                int id = Integer.parseInt(partes[0].trim());
                String estado = partes[1].trim();
                estacion.agregarBikeMemoria(new Bike(id, estado));
                
            } catch (NumberFormatException e) {
                
                System.out.println("Línea inválida omitida: " + linea);
            }
        }

    }catch(IOException e){

        System.out.println(
                "No se pudo cargar "
                + estacion.getName_station()
        );
    }
}

    //Guardar una bicicleta
    public static void guardarBike(String nombreArchivo,Bike bike){

        try(FileWriter fw =
                new FileWriter(nombreArchivo, true);

            BufferedWriter bw =
                new BufferedWriter(fw);

            PrintWriter out =
                new PrintWriter(bw)){

            out.println(bike.getId()
                        + ","
                        + bike.getState());

        }catch(IOException e){

            e.printStackTrace();
        }
    }

    
    public static void reescribirArchivo(Station estacion) {
    try (PrintWriter writer = new PrintWriter(estacion.getArchivo())) {
        for (Bike bike : estacion.getBicis()) {
            
            writer.println(bike.getId() + "," + bike.getState());
        }
        
    } catch (IOException e) {
        
        
        e.printStackTrace();
    }
   }
}
