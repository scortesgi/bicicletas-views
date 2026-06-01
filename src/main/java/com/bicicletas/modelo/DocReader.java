package com.bicicletas.modelo;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DocReader {
    
    public static boolean dupli = false;
        //constructor
public static void guardarReserva(Reservar r) {

    try (PrintWriter pw = new PrintWriter(new FileWriter("reservas.txt", true))) {

        pw.println(
            r.getEstudiante().getTiun() + "," +
            r.getBicicletaReservada().getId() + "," +
            r.getEstacionRecogida().getName_station() + "," +
            r.getEstacionEntrega().getName_station() + "," +
            r.getEstadoReserva() + "," +
            r.getTiempoInicioReserva());

    } catch (IOException e) {
        e.printStackTrace();
    }
}
public static void cargarReservas() {

    File file = new File("reservas.txt");
    if (!file.exists()) return;

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {

        String line;

        while ((line = br.readLine()) != null) {

            if (line.trim().isEmpty()) continue;

            String[] p = line.split(",");

            long tiun = Long.parseLong(p[0]);
            int bikeId = Integer.parseInt(p[1]);
            String estRec = p[2];
            String estEnt = p[3];
            String estado = p[4];

            Student st = null;
            Station rec = null;
            Station ent = null;
            Bike bike = null;

            // buscar estudiante
            for (Student s : Main.listaEstudiante) {
                if (s.getTiun() == tiun) {
                    st = s;
                    break;
                }
            }

            // buscar estaciones
            for (Station s : Main.estaciones) {
                if (s.getName_station().equals(estRec)) rec = s;
                if (s.getName_station().equals(estEnt)) ent = s;
            }

            if (st == null || rec == null) continue;

            // buscar bici 
            for (Bike b : rec.getBicis()) {
                if (b.getId() == bikeId) {
                    bike = b;
                    break;
                }
            }

            if (bike == null) continue;

            // crear reserva
            Reservar r = new Reservar(bike, st);

            r.setEstacionRecogida(rec);
            r.setEstacionEntrega(ent);
            r.setEstadoReserva(estado);

            st.setReserva(r);
            if (estado.equals("reservada") || estado.equals("en_uso")) {

                bike.reservar();              // cambia estado de la bici
                rec.retirarBicicleta(bike);   // la saca de la estación
            }

        }

        System.out.println("Reservas cargadas correctamente.");

    } catch (Exception e) {
        e.printStackTrace();
    }
}

public static void cargarComentarios(String nombreArchivo) {

    File archivo = new File(nombreArchivo);

    if (!archivo.exists()) {
        System.out.println("No existe archivo de comentarios.");
        return;
    }

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.trim().isEmpty()) continue;
            String[] partes = linea.split(":");
            if (partes.length < 4) continue;
            String tipo = partes[0];
            if (tipo.equals("ESTUDIANTE")) {
                String type = partes[1];
                long tiun = Long.parseLong(partes[2]);
                String fecha = partes[3];
                String mensaje = partes[4];
                Student autor = null;
                
                for (Student s : Main.listaEstudiante) {
                    if (s.getTiun() == tiun) {
                        autor = s;
                        break;
                    }
                }

                if (autor != null) {
                    Comment c = new Comment(mensaje, autor, type);
                    Main.listaComentarios.add(c);
                }

            } else if (tipo.equals("ADMIN")) {

                long tiun = Long.parseLong(partes[1]);
                String fecha = partes[2];
                String mensaje = partes[3];

                Comment c = new Comment(
                    mensaje,
                    Main.administradorActual,
                    tiun
                );

                Main.listaComentariosAdmin.add(c);
            }
        }
        System.out.println("Comentarios cargados correctamente.");

    } catch (IOException | NumberFormatException ex) {
        ex.printStackTrace();
    }
}



    

    public static void guardarComentario(String nombreArchivo, Comment comentario) {

    File archivo = new File(nombreArchivo);

    try (PrintWriter salida = new PrintWriter(new FileWriter(archivo, true))) {

        if (comentario.getAutor() != null) {

            salida.println(
                "ESTUDIANTE:" +comentario.getType() + ":" +comentario.getAutor().getTiun() + ":" +
                comentario.getFecha() + ":" + comentario.getMensaje());

        } else {

            salida.println(
                "ADMIN:" + comentario.getTiun() + ":" + comentario.getFecha() + ":" + comentario.getMensaje());
        }

    } catch (IOException ex) {

        ex.printStackTrace();
    }
}
    
    
    public static void cargarComentariosDesdeArchivo(String nombreArchivo) {
    File archivo = new File(nombreArchivo);
    if (!archivo.exists()) return;
    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.trim().isEmpty()) continue;
            String[] partes = linea.split(":", 4);
            if (partes.length < 4) continue;
            
    try {
                long tiun      = Long.parseLong(partes[0].trim());
                String tipo    = partes[1].trim();
                String mensaje = partes[3].trim();
                Student autor = null;
                for (Student s : Main.listaEstudiante) {
                    if (s.getTiun() == tiun) { autor = s; break; }
                }
                if (autor == null) continue;

                Comment c = new Comment(mensaje, autor, tipo);
                Main.listaComentarios.add(c);

            } catch (NumberFormatException e) {
                System.out.println("Línea inválida omitida: " + linea);
            }
        }
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}
    

       public static void crearArchivo(String nombreArchivo) {

    File archivo = new File(nombreArchivo);

    try {

        if (archivo.createNewFile()) {
            System.out.println("Archivo creado");
        } else {
            System.out.println("El archivo ya existe");
        }

    } catch(IOException ex) {
        ex.printStackTrace(System.out);
    }
}

       
       
        public static void contenidoArchivo(String nombreArchivo, String nombre_st,  int cedula, long tiun, String contraseña) {

        File archivo = new File(nombreArchivo);

        try {
           if(dupli !=true ){
            PrintWriter salida = new PrintWriter(new FileWriter(archivo , true));
           // PrintWriter salida2 = new PrintWriter(new FileWriter(tiun , true));
            salida.println(nombre_st + "," + cedula + "," + tiun + "," + contraseña);
                salida.close();
                System.out.println("Se actualizó el historial");
        
           }
        } catch(FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }

        
        
        
        public static void leerArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {
            BufferedReader openHistorial = new BufferedReader(new FileReader(archivo));
            String lectura= openHistorial.readLine();
                while (lectura != null) {
                    System.out.println(lectura);
                    lectura = openHistorial.readLine();
                }

         openHistorial.close();
        } catch(FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }

                public static void verificarDuplicados(String nombreArchivo, int tiun) {

                    File archivo = new File(nombreArchivo);

                    try {

                        BufferedReader openHistorial =
                                new BufferedReader(new FileReader(archivo));

                        String lectura;

                        dupli = false;

                        while ((lectura = openHistorial.readLine()) != null) {

                            // Ignorar líneas vacías
                            if (lectura.trim().isEmpty()) {
                                continue;
                            }

                            // Separar datos por coma
                            String[] partes = lectura.split(",");

                            // Verificar formato correcto
                            if(partes.length < 4){
                                continue;
                            }

                            
                            int identificacion = Integer.parseInt(partes[2].trim());

                            if (tiun == identificacion ) {

                                System.out.println("Ya existe el user");

                                dupli = true;

                                break;
                            }
                        }

                        openHistorial.close();

                    } catch(FileNotFoundException | NumberFormatException ex) {
                        
            System.out.println("Error al verificar duplicados: " + ex.getMessage());
            
        } catch(IOException ex) {
            
            ex.printStackTrace(System.out);
        } 
    }

                
                
public static void guardarAdministrador(
        String nombreArchivo,
        String nombre,
        int cedula,
        String contraseña) {

    File archivo = new File(nombreArchivo);

    try {

        // Verifica máximo 5 administradores
        BufferedReader br = new BufferedReader(new FileReader(archivo));

        int contador = 0;

        while(br.readLine() != null){
            contador++;
        }

        br.close();

        if(contador >= 5){
            System.out.println("Ya existen 5 administradores.");
            return;
        }

        PrintWriter pw = new PrintWriter(new FileWriter(archivo, true));

        pw.println(nombre + "," + cedula + "," + contraseña );

        pw.close();

        System.out.println("Administrador guardado.");

    } catch(IOException ex){
        ex.printStackTrace(System.out);
    }
}

public static void guardarEstudianteEnArchivo(String nombreArchivo, Student estudiante) {
    File archivo = new File(nombreArchivo);
    try (PrintWriter salida = new PrintWriter(new FileWriter(archivo, true))) {
        
        salida.println(
            estudiante.getTiun()     + ":" +
            estudiante.getUserName() + ":" +
            estudiante.getCedula()   + ":" +
            estudiante.getContraseña() + ":" +
            estudiante.getPerEmergencia().getNumEmergencia()
                    
        );
        System.out.println("Estudiante guardado en archivo.");
    } catch (IOException ex) {
        ex.printStackTrace();

    }
}

    public static void cargarEstudiantesDesdeArchivo(String nombreArchivo) {
    File archivo = new File(nombreArchivo);
    if (!archivo.exists()) {
        System.out.println("Archivo de estudiantes no encontrado: " + nombreArchivo);
        return;
    }

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.trim().isEmpty()) continue;

            String[] partes = linea.split(":");
            if (partes.length < 5) continue; // línea incompleta, la salta

            try {
                long   tiun       = Long.parseLong(partes[0].trim());
                String userName   = partes[1].trim();
                long   cedula     = Long.parseLong(partes[2].trim());
                String contraseña = partes[3].trim();
                String telEmerg   = partes[4].trim();

                // Evitar duplicados: si ya está en la lista, no lo agrega
                boolean yaExiste = false;
                for (Student s : Main.listaEstudiante) {
                    if (s.getTiun() == tiun) { yaExiste = true; break; }
                }
                if (yaExiste) continue;

                PerEmergencia pe = new PerEmergencia("", 0, telEmerg);
                Student estudiante = new Student(userName, cedula, tiun, contraseña, pe);

                Main.listaEstudiante.add(estudiante);
                System.out.println("Estudiante cargado: " + userName);

            } catch (NumberFormatException e) {
                System.out.println("Línea con formato inválido, omitida: " + linea);
            }
        }
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


public static boolean cambiarClaveAdministrador(
        String nombreArchivo,
        String nombreBuscar,
        int cedulaBuscar,
        int contraseñaActual,
        int Nuevacontraseña) {

    File archivo = new File(nombreArchivo);
    File temporal = new File("temp.txt");

    boolean cambioRealizado = false;

    try {

        BufferedReader br =
                new BufferedReader(new FileReader(archivo));

        PrintWriter pw =
                new PrintWriter(new FileWriter(temporal));

        String linea;

        while((linea = br.readLine()) != null){

            if(linea.trim().isEmpty()){
                continue;
            }

            String[] datos = linea.split(",");

            if(datos.length < 3){
                pw.println(linea);
                continue;
            }

            String nombre = datos[0].trim();

            int cedula = Integer.parseInt(datos[1].trim());

            int contraseñaGuardada =
                    Integer.parseInt(datos[2].trim());

            // Verifica admin correcto
            if(nombre.equalsIgnoreCase(nombreBuscar.trim())
            && cedula == cedulaBuscar
            && contraseñaGuardada == contraseñaActual){

                // 🔥 ESCRIBE NUEVA CLAVE
                pw.println(
                        nombre + "," +
                        cedula + "," +
                        Nuevacontraseña
                );

                cambioRealizado = true;

            }else{

                // Mantiene la línea original
                pw.println(linea);
            }
        }

        br.close();
        pw.close();

        // REEMPLAZAR ARCHIVO ORIGINAL
        if(archivo.delete()){

            temporal.renameTo(archivo);

        }else{

            System.out.println("No se pudo actualizar el archivo.");
        }

    } catch(Exception e){

        e.printStackTrace(System.out);
    }

    return cambioRealizado;
}   




        public static boolean verificarContraseñaAdministrador(
        String nombreArchivo,
        String nombreBuscar,
        int cedulaBuscar,
        int contraseñaAdministrador) {

    File archivo = new File(nombreArchivo);

    try {

        BufferedReader br =
                new BufferedReader(new FileReader(archivo));

        String linea;

        while((linea = br.readLine()) != null){

            // Ignorar líneas vacías
            if(linea.trim().isEmpty()){
                continue;
            }

            String[] datos = linea.split(",");

            // Verificar formato correcto
            if(datos.length < 3){
                continue;
            }

            String nombre = datos[0];

            int cedula = Integer.parseInt(datos[1]);

            int contraseñaGuardada = Integer.parseInt(datos[2]);

            
            
            // Comparar datos
            if(nombre.trim().equalsIgnoreCase(nombreBuscar.trim())
            && cedula == cedulaBuscar
            && contraseñaGuardada == contraseñaAdministrador){

                br.close();

                return true;
            }
        }

        br.close();

    } catch(IOException | NumberFormatException ex){
            System.out.println("Error al verificar clave: " + ex.getMessage());
        }

    return false;
}
}
