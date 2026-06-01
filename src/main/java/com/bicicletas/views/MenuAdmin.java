package com.bicicletas.views;
import java.awt.Color;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;

import java.util.ArrayList;

import com.bicicletas.modelo.*;





public class MenuAdmin extends javax.swing.JFrame {
    
    public MenuAdmin() {
    this.listaEstudiante = new java.util.ArrayList<>();
    this.estaciones = new java.util.ArrayList<>();
    this.listaComentarios = new java.util.ArrayList<>();
    this.administrador = null;
    
    initComponents();
    SetDate();
   
    Penalizarr.setIcon(new ImageIcon(penalizarEscalado));
    Administrar.setIcon(new ImageIcon(administrarEscalado));
    quitar.setIcon(new ImageIcon(quitarEscalado));
    Report.setIcon(new ImageIcon(reportEscalado));
    reglass.setIcon(new ImageIcon(reglasEscalado));
    AgregarC.setIcon(new ImageIcon(agregarCEscalado));
    Buscar.setIcon(new ImageIcon(buscarEscalado));
    CerrarSesion.setIcon(new ImageIcon(cerrarSesionEscalado));
    
    /*
    Administrar.setIcon(new ImageIcon(administrarNEscalado));
    quitar.setIcon(new ImageIcon(quitarNEscalado));
    Report.setIcon(new ImageIcon(reportNEscalado));
    reglass.setIcon(new ImageIcon(reglasNEscalado));
    Penalizarr.setIcon(new ImageIcon(penalizarNEscalado));
    AgregarC.setIcon(new ImageIcon(agregarCNEscalado));
    Buscar.setIcon(new ImageIcon(buscarNEscalado));
    */
    
    
    
   
}
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuAdmin.class.getName());

    
     private ArrayList<Student> listaEstudiante;
    private ArrayList<Station> estaciones;
    private ArrayList<Comment> listaComentarios;
    private Administrator administrador;

    int xMouse, yMouse; 
    
    ImageIcon administrarIcon = new ImageIcon(getClass().getResource("/imagenes/administrar_bicicleta.png"));
    Image administrarImg = administrarIcon.getImage();
    Image administrarEscalado = administrarImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

    ImageIcon quitarIcon = new ImageIcon(getClass().getResource("/imagenes/quitar_acceso_estudiante.png"));
    Image quitarImg = quitarIcon.getImage();
    Image quitarEscalado = quitarImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon reportIcon = new ImageIcon(getClass().getResource("/imagenes/reportes_de_estudiantes.png"));
Image reportImg = reportIcon.getImage();
Image reportEscalado = reportImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon reglasIcon = new ImageIcon(getClass().getResource("/imagenes/reglas.png"));
Image reglasImg = reglasIcon.getImage();
Image reglasEscalado = reglasImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon penalizarrIcon = new ImageIcon(getClass().getResource("/imagenes/penalizar_estudiante.png"));
Image penalizarImg = penalizarrIcon.getImage();
Image penalizarEscalado = penalizarImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon cerrarSesionIcon = new ImageIcon(getClass().getResource("/imagenes/cerrar_sesion.png"));
Image cerrarSesionImg = cerrarSesionIcon.getImage();
Image cerrarSesionEscalado = cerrarSesionImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon agregarCIcon = new ImageIcon(getClass().getResource("/imagenes/agregar_bicicleta.png"));
Image agregarCImg = agregarCIcon.getImage();
Image agregarCEscalado = agregarCImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon buscarIcon = new ImageIcon(getClass().getResource("/imagenes/buscar_estudiante.png"));
Image buscarImg = buscarIcon.getImage();
Image buscarEscalado = buscarImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);


   //negras
ImageIcon administrarNIcon = new ImageIcon(getClass().getResource("/imagenes/administrar_bicicleta_negro.png"));
Image administrarNImg = administrarNIcon.getImage();
Image administrarNEscalado = administrarNImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon quitarNIcon = new ImageIcon(getClass().getResource("/imagenes/quitar_acceso_estudiante_negro.png"));
Image quitarNImg = quitarNIcon.getImage();
Image quitarNEscalado = quitarNImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon reportNIcon = new ImageIcon(getClass().getResource("/imagenes/reportes_de_estudiantes_negro.png"));
Image reportNImg = reportNIcon.getImage();
Image reportNEscalado = reportNImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon reglasNIcon = new ImageIcon(getClass().getResource("/imagenes/reglas_negro.png"));
Image reglasNImg = reglasNIcon.getImage();
Image reglasNEscalado = reglasNImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon penalizarNIcon = new ImageIcon(getClass().getResource("/imagenes/penalizar_estudiante_negro.png"));
Image penalizarNImg = penalizarNIcon.getImage();
Image penalizarNEscalado = penalizarNImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon cerrarSesionNIcon = new ImageIcon(getClass().getResource("/imagenes/cerrar_sesion_negro.png"));
Image cerrarSesionNImg = cerrarSesionNIcon.getImage();
Image cerrarSesionNEscalado = cerrarSesionNImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);


ImageIcon agregarCNIcon = new ImageIcon(getClass().getResource("/imagenes/agregar_bicicleta_negro.png"));
Image agregarCNImg = agregarCNIcon.getImage();
Image agregarCNEscalado = agregarCNImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

ImageIcon buscarNIcon = new ImageIcon(getClass().getResource("/imagenes/buscar_estudiante_negro.png"));
Image buscarNImg = buscarNIcon.getImage();
Image buscarNEscalado = buscarNImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);


//------------------------------------------------------------------------------------------
   
//
   public MenuAdmin(ArrayList<Student> listaEstudiante, ArrayList<Station> estaciones, 
                 ArrayList<Comment> listaComentarios, Administrator administrador) {
       
    this.listaEstudiante = listaEstudiante;
    this.estaciones = estaciones;
    this.listaComentarios = listaComentarios;
    this.administrador = administrador;
       
        initComponents();
        SetDate();
       
   
      
    }
    
    
        private void SetDate() {
    LocalDate now = LocalDate.now();
    int year = now.getYear();
    int dia = now.getDayOfMonth();
    int month = now.getMonthValue();
    String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
        "Octubre","Noviembre","Diciembre"};
    jLabel2.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);
}
            
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ReportP = new javax.swing.JPanel();
        Report = new javax.swing.JLabel();
        QuitarP = new javax.swing.JPanel();
        quitar = new javax.swing.JLabel();
        ReglasP = new javax.swing.JPanel();
        reglass = new javax.swing.JLabel();
        CerrarSesionP = new javax.swing.JPanel();
        CerrarSesion = new javax.swing.JLabel();
        PenalizarP = new javax.swing.JPanel();
        Penalizarr = new javax.swing.JLabel();
        AdministrarP = new javax.swing.JPanel();
        Administrar = new javax.swing.JLabel();
        AgregarP = new javax.swing.JPanel();
        AgregarC = new javax.swing.JLabel();
        BuscarP = new javax.swing.JPanel();
        Buscar = new javax.swing.JLabel();
        panel_superior = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        CERRAR = new javax.swing.JLabel();
        UNlogo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(19, 134, 201));
        jPanel2.setPreferredSize(new java.awt.Dimension(873, 190));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReportP.setBackground(new java.awt.Color(56, 182, 255));

        Report.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes_de_estudiantes.png"))); // NOI18N
        Report.setText("jLabel3");
        Report.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ReportPLayout = new javax.swing.GroupLayout(ReportP);
        ReportP.setLayout(ReportPLayout);
        ReportPLayout.setHorizontalGroup(
            ReportPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportPLayout.createSequentialGroup()
                .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ReportPLayout.setVerticalGroup(
            ReportPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(ReportP, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 70, 70));

        QuitarP.setBackground(new java.awt.Color(56, 182, 255));

        quitar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quitar_acceso_estudiante.png"))); // NOI18N
        quitar.setText("jLabel3");
        quitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quitarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quitarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout QuitarPLayout = new javax.swing.GroupLayout(QuitarP);
        QuitarP.setLayout(QuitarPLayout);
        QuitarPLayout.setHorizontalGroup(
            QuitarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(QuitarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuitarPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        QuitarPLayout.setVerticalGroup(
            QuitarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(QuitarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuitarPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(QuitarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 70, 70));

        ReglasP.setBackground(new java.awt.Color(56, 182, 255));

        reglass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reglass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reglas.png"))); // NOI18N
        reglass.setText("jLabel3");
        reglass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reglass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reglassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reglassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reglassMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ReglasPLayout = new javax.swing.GroupLayout(ReglasP);
        ReglasP.setLayout(ReglasPLayout);
        ReglasPLayout.setHorizontalGroup(
            ReglasPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(ReglasPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReglasPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(reglass, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ReglasPLayout.setVerticalGroup(
            ReglasPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(ReglasPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReglasPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(reglass, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(ReglasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 70, 70));

        CerrarSesionP.setBackground(new java.awt.Color(56, 182, 255));

        CerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar_sesion.png"))); // NOI18N
        CerrarSesion.setText("jLabel3");
        CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CerrarSesionPLayout = new javax.swing.GroupLayout(CerrarSesionP);
        CerrarSesionP.setLayout(CerrarSesionPLayout);
        CerrarSesionPLayout.setHorizontalGroup(
            CerrarSesionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(CerrarSesionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CerrarSesionPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CerrarSesionPLayout.setVerticalGroup(
            CerrarSesionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(CerrarSesionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CerrarSesionPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(CerrarSesionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 70, 70));

        PenalizarP.setBackground(new java.awt.Color(56, 182, 255));

        Penalizarr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Penalizarr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/penalizar_estudiante.png"))); // NOI18N
        Penalizarr.setText("jLabel3");
        Penalizarr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Penalizarr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PenalizarrFocusGained(evt);
            }
        });
        Penalizarr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PenalizarrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PenalizarrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PenalizarrMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PenalizarPLayout = new javax.swing.GroupLayout(PenalizarP);
        PenalizarP.setLayout(PenalizarPLayout);
        PenalizarPLayout.setHorizontalGroup(
            PenalizarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PenalizarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Penalizarr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PenalizarPLayout.setVerticalGroup(
            PenalizarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PenalizarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Penalizarr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(PenalizarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 70, 70));

        AdministrarP.setBackground(new java.awt.Color(56, 182, 255));

        Administrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Administrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administrar_bicicleta.png"))); // NOI18N
        Administrar.setText("jLabel3");
        Administrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Administrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdministrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdministrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdministrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AdministrarPLayout = new javax.swing.GroupLayout(AdministrarP);
        AdministrarP.setLayout(AdministrarPLayout);
        AdministrarPLayout.setHorizontalGroup(
            AdministrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(AdministrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AdministrarPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Administrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        AdministrarPLayout.setVerticalGroup(
            AdministrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(AdministrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AdministrarPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Administrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(AdministrarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 70, 70));

        AgregarP.setBackground(new java.awt.Color(56, 182, 255));

        AgregarC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar_bicicleta.png"))); // NOI18N
        AgregarC.setText("jLabel3");
        AgregarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarCMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AgregarPLayout = new javax.swing.GroupLayout(AgregarP);
        AgregarP.setLayout(AgregarPLayout);
        AgregarPLayout.setHorizontalGroup(
            AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AgregarPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        AgregarPLayout.setVerticalGroup(
            AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AgregarPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(AgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 70, 70));

        BuscarP.setBackground(new java.awt.Color(56, 182, 255));

        Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_estudiante.png"))); // NOI18N
        Buscar.setText("jLabel3");
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BuscarPLayout = new javax.swing.GroupLayout(BuscarP);
        BuscarP.setLayout(BuscarPLayout);
        BuscarPLayout.setHorizontalGroup(
            BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BuscarPLayout.setVerticalGroup(
            BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(BuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 70, 70));

        panel_superior.setBackground(new java.awt.Color(19, 134, 201));
        panel_superior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_superiorMouseDragged(evt);
            }
        });
        panel_superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_superiorMousePressed(evt);
            }
        });
        jPanel2.add(panel_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 756, 30));

        exit.setBackground(new java.awt.Color(19, 134, 201));
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.setLayout(new java.awt.BorderLayout());

        CERRAR.setFont(new java.awt.Font("Ancizar Sans Thin", 0, 24)); // NOI18N
        CERRAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CERRAR.setText("X");
        CERRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CERRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CERRARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CERRARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CERRARMouseExited(evt);
            }
        });
        exit.add(CERRAR, java.awt.BorderLayout.CENTER);

        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 0, 53, -1));

        UNlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/universidad-nacional-de-colombia-sede-bogota-logo.png"))); // NOI18N
        jPanel2.add(UNlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 47, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 830, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 820, 360));

        jPanel3.setBackground(new java.awt.Color(56, 182, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(56, 182, 255));
        jLabel1.setFont(new java.awt.Font("Ancizar Serif ExtraBold", 0, 12)); // NOI18N
        jLabel1.setText("Administración / Página principal");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 270, 14));

        jLabel2.setFont(new java.awt.Font("Ancizar Serif Light", 0, 18)); // NOI18N
        jLabel2.setText("Hoy es {dia} de {month} del {year}");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 185, 820, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 815, 592);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited

        exit.setBackground(new Color(19,134,201));
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        Bienvenida welcome = new Bienvenida();
        this.dispose();
        welcome.setVisible(true);
    }//GEN-LAST:event_exitMouseClicked

    private void CERRARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CERRARMouseExited
             // TODO add your handling code here:
    }//GEN-LAST:event_CERRARMouseExited

    private void CERRARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CERRARMouseEntered
           // TODO add your handling code here:
    }//GEN-LAST:event_CERRARMouseEntered

    private void CERRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CERRARMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_CERRARMouseClicked

    private void panel_superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_superiorMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_panel_superiorMousePressed

    private void panel_superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_superiorMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_panel_superiorMouseDragged

    private void AdministrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministrarMouseEntered
    Administrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    Administrar.setIcon(new ImageIcon(administrarNEscalado)); 
    Administrar.setToolTipText("Administrar bicicletas");
// TODO add your handling code here:
    }//GEN-LAST:event_AdministrarMouseEntered

    private void AdministrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministrarMouseExited

    Administrar.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    Administrar.setIcon(new ImageIcon(administrarEscalado));  
    // TODO add your handling code here:
    }//GEN-LAST:event_AdministrarMouseExited

    private void quitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitarMouseEntered
    quitar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    quitar.setIcon(new ImageIcon(quitarNEscalado));  
    quitar.setToolTipText("Quitar acceso a estudiante");    
// TODO add your handling code here:
    }//GEN-LAST:event_quitarMouseEntered

    private void quitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitarMouseExited
    quitar.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    quitar.setIcon(new ImageIcon(quitarEscalado));        // TODO add your handling code here:
    }//GEN-LAST:event_quitarMouseExited

    private void ReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseEntered
    Report.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    Report.setIcon(new ImageIcon(reportNEscalado));
    Report.setToolTipText("Ver reportes de ciclas");
    // TODO add your handling code here:
    }//GEN-LAST:event_ReportMouseEntered

    private void ReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseExited
Report.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    Report.setIcon(new ImageIcon(reportEscalado));        // TODO add your handling code here:
    }//GEN-LAST:event_ReportMouseExited

    private void reglassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reglassMouseEntered
    reglass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    reglass.setIcon(new ImageIcon(reglasNEscalado));  
    reglass.setToolTipText("Reglas del sistema");
// TODO add your handling code here:
    }//GEN-LAST:event_reglassMouseEntered

    private void reglassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reglassMouseExited
    reglass.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    reglass.setIcon(new ImageIcon(reglasEscalado));        // TODO add your handling code here:
    }//GEN-LAST:event_reglassMouseExited

    private void AgregarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarCMouseEntered
    AgregarC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    AgregarC.setIcon(new ImageIcon(agregarCNEscalado));  
    AgregarC.setToolTipText("Agregar bicicleta");
// TODO add your handling code here:
    }//GEN-LAST:event_AgregarCMouseEntered

    private void AgregarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarCMouseExited
    AgregarC.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    AgregarC.setIcon(new ImageIcon(agregarCEscalado));        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarCMouseExited

    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
    Buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    Buscar.setIcon(new ImageIcon(buscarNEscalado));   
    Buscar.setToolTipText("Buscar estudiante");
// TODO add your handling code here:
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
     Buscar.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    Buscar.setIcon(new ImageIcon(buscarEscalado));        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarMouseExited

    private void CerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseEntered
    CerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    CerrarSesion.setIcon(new ImageIcon(cerrarSesionNEscalado));  
    CerrarSesion.setToolTipText("Cerrar sesión");
// TODO add your handling code here:
    }//GEN-LAST:event_CerrarSesionMouseEntered

    private void CerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseExited
    CerrarSesion.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    CerrarSesion.setIcon(new ImageIcon(cerrarSesionEscalado));
    
// TODO add your handling code here:
    }//GEN-LAST:event_CerrarSesionMouseExited

    private void AdministrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministrarMouseClicked
    Adminadministrarbicicleta vistaAdminBici = new Adminadministrarbicicleta();

      
        vistaAdminBici.setSize(jPanel4.getWidth(), jPanel4.getHeight());
        vistaAdminBici.setLocation(0, 0);

        jPanel4.removeAll();
        jPanel4.add(vistaAdminBici, java.awt.BorderLayout.CENTER);

        jPanel4.revalidate();
        jPanel4.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_AdministrarMouseClicked

    private void AgregarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarCMouseClicked
    AdminAgregarcicla vistaAgregarCicla = new AdminAgregarcicla();

        vistaAgregarCicla.setSize(jPanel4.getWidth(), jPanel4.getHeight());
        vistaAgregarCicla.setLocation(0, 0);

        jPanel4.removeAll();
        jPanel4.add(vistaAgregarCicla, java.awt.BorderLayout.CENTER);

        jPanel4.revalidate();
        jPanel4.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarCMouseClicked

    private void reglassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reglassMouseClicked
     Reglas vistaReglas = new Reglas();

        vistaReglas.setSize(jPanel4.getWidth(), jPanel4.getHeight());
        vistaReglas.setLocation(0, 0);

        jPanel4.removeAll();
        jPanel4.add(vistaReglas, java.awt.BorderLayout.CENTER);

        jPanel4.revalidate();
        jPanel4.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_reglassMouseClicked

    private void ReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseClicked
     AdminReportes vistaReportes = new AdminReportes();

        vistaReportes.setSize(jPanel4.getWidth(), jPanel4.getHeight());
        vistaReportes.setLocation(0, 0);

        jPanel4.removeAll();
        jPanel4.add(vistaReportes, java.awt.BorderLayout.CENTER);

        jPanel4.revalidate();
        jPanel4.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_ReportMouseClicked

    private void quitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitarMouseClicked
      AdminQuitarEstudiante vistaQuitarEstudiante = new AdminQuitarEstudiante();

        vistaQuitarEstudiante.setSize(jPanel4.getWidth(), jPanel4.getHeight());
        vistaQuitarEstudiante.setLocation(0, 0);

        jPanel4.removeAll();
        jPanel4.add(vistaQuitarEstudiante, java.awt.BorderLayout.CENTER);

        jPanel4.revalidate();
        jPanel4.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_quitarMouseClicked

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
   
        adminBuscarEstudiante vistaBuscarEstudiante = new adminBuscarEstudiante();

        vistaBuscarEstudiante.setSize(jPanel4.getWidth(), jPanel4.getHeight());
        vistaBuscarEstudiante.setLocation(0, 0);

     
        jPanel4.removeAll();
        jPanel4.add(vistaBuscarEstudiante, java.awt.BorderLayout.CENTER);

   
        jPanel4.revalidate();
        jPanel4.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarMouseClicked

    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        Main.administradorActual = null;

        Bienvenida welcome = new Bienvenida();
        this.dispose();
        welcome.setVisible(true);
    }//GEN-LAST:event_CerrarSesionMouseClicked

    private void PenalizarrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PenalizarrMouseClicked
       adminPenalizar vistaPenalizar = new adminPenalizar();

        vistaPenalizar.setSize(jPanel4.getWidth(), jPanel4.getHeight());
        vistaPenalizar.setLocation(0, 0);

     
        jPanel4.removeAll();
        jPanel4.add(vistaPenalizar, java.awt.BorderLayout.CENTER);

   
        jPanel4.revalidate();
        jPanel4.repaint();         // TODO add your handling code here:
    }//GEN-LAST:event_PenalizarrMouseClicked

    private void PenalizarrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PenalizarrFocusGained
            // TODO add your handling code here:
    }//GEN-LAST:event_PenalizarrFocusGained

    private void PenalizarrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PenalizarrMouseEntered
    Penalizarr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    Penalizarr.setIcon(new ImageIcon(penalizarNEscalado));  
    Penalizarr.setToolTipText("Penalizar estudiante");
// TODO add your handling code here:
    }//GEN-LAST:event_PenalizarrMouseEntered

    private void PenalizarrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PenalizarrMouseExited
    Penalizarr.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    Penalizarr.setIcon(new ImageIcon(penalizarEscalado));

    }//GEN-LAST:event_PenalizarrMouseExited

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Administrar;
    private javax.swing.JPanel AdministrarP;
    private javax.swing.JLabel AgregarC;
    private javax.swing.JPanel AgregarP;
    private javax.swing.JLabel Buscar;
    private javax.swing.JPanel BuscarP;
    private javax.swing.JLabel CERRAR;
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JPanel CerrarSesionP;
    private javax.swing.JPanel PenalizarP;
    private javax.swing.JLabel Penalizarr;
    private javax.swing.JPanel QuitarP;
    private javax.swing.JPanel ReglasP;
    private javax.swing.JLabel Report;
    private javax.swing.JPanel ReportP;
    private javax.swing.JLabel UNlogo;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panel_superior;
    private javax.swing.JLabel quitar;
    private javax.swing.JLabel reglass;
    // End of variables declaration//GEN-END:variables

   
}
