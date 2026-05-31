package com.bicicletas.views;
import java.awt.Color;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;

import java.util.ArrayList;

import com.bicicletas.modelo.*;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sammu
 */
 /*
public class MenuAdmin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuAdmin.class.getName());

    /**
     * Creates new form Login

     
    int xMouse, yMouse;
    public MenuAdmin() {
        initComponents();
        SetDate();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/universidad-nacional-de-colombia-sede-bogota-logo.png"));

        Image img = icon.getImage();

        Image imgEscalada = img.getScaledInstance(200, 50, Image.SCALE_SMOOTH);

        UNlogo.setIcon(new ImageIcon(imgEscalada));
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    
    }
    
   

    */


public class MenuAdmin extends javax.swing.JFrame {
    
    public MenuAdmin() {
    this.listaEstudiante = new java.util.ArrayList<>();
    this.estaciones = new java.util.ArrayList<>();
    this.listaComentarios = new java.util.ArrayList<>();
    this.administrador = null;
    
    initComponents();
    SetDate();
   
    
    Administrar.setIcon(new ImageIcon(administrarEscalado));
    quitar.setIcon(new ImageIcon(quitarEscalado));
    Report.setIcon(new ImageIcon(reportEscalado));
    reglass.setIcon(new ImageIcon(reglasEscalado));
    Penalizarr.setIcon(new ImageIcon(penalizarEscalado));
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
       
    Administrar.setIcon(new ImageIcon(administrarEscalado));
    quitar.setIcon(new ImageIcon(quitarEscalado));
    Report.setIcon(new ImageIcon(reportEscalado));
    reglass.setIcon(new ImageIcon(reglasEscalado));
    Penalizarr.setIcon(new ImageIcon(penalizarEscalado));
    AgregarC.setIcon(new ImageIcon(agregarCEscalado));
    Buscar.setIcon(new ImageIcon(buscarEscalado));
    CerrarSesion.setIcon(new ImageIcon(cerrarSesionEscalado));
      
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
            
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Administrar = new javax.swing.JLabel();
        quitar = new javax.swing.JLabel();
        Report = new javax.swing.JLabel();
        reglass = new javax.swing.JLabel();
        Penalizarr = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JLabel();
        AgregarC = new javax.swing.JLabel();
        Buscar = new javax.swing.JLabel();
        AgregarCicla_button = new javax.swing.JButton();
        Penalizar_button = new javax.swing.JButton();
        Reglas_button = new javax.swing.JButton();
        Reportes_button = new javax.swing.JButton();
        QuitarEstudiante_button = new javax.swing.JButton();
        Buscar_button = new javax.swing.JButton();
        AdminCiclas_button = new javax.swing.JButton();
        CerrarSesion_button1 = new javax.swing.JButton();
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
        jPanel2.add(Administrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 70, 70));

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
        jPanel2.add(quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 70, 70));

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
        jPanel2.add(Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 70, 70));

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
        jPanel2.add(reglass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 70, 70));

        Penalizarr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Penalizarr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/penalizar_estudiante.png"))); // NOI18N
        Penalizarr.setText("jLabel3");
        Penalizarr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel2.add(Penalizarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 70, 70));

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
        jPanel2.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 70, 70));

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
        jPanel2.add(AgregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 70, 70));

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
        jPanel2.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 70, 70));

        AgregarCicla_button.setBackground(new java.awt.Color(56, 182, 255));
        AgregarCicla_button.setBorder(null);
        AgregarCicla_button.setBorderPainted(false);
        AgregarCicla_button.addActionListener(this::AgregarCicla_buttonActionPerformed);
        jPanel2.add(AgregarCicla_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 70, 70));

        Penalizar_button.setBackground(new java.awt.Color(56, 182, 255));
        Penalizar_button.setBorder(null);
        Penalizar_button.setBorderPainted(false);
        Penalizar_button.setPreferredSize(new java.awt.Dimension(70, 70));
        Penalizar_button.addActionListener(this::Penalizar_buttonActionPerformed);
        jPanel2.add(Penalizar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 70, 70));

        Reglas_button.setBackground(new java.awt.Color(56, 182, 255));
        Reglas_button.setBorder(null);
        Reglas_button.setBorderPainted(false);
        Reglas_button.addActionListener(this::Reglas_buttonActionPerformed);
        jPanel2.add(Reglas_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 70, 70));

        Reportes_button.setBackground(new java.awt.Color(56, 182, 255));
        Reportes_button.setBorder(null);
        Reportes_button.setBorderPainted(false);
        Reportes_button.addActionListener(this::Reportes_buttonActionPerformed);
        jPanel2.add(Reportes_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 70, 70));

        QuitarEstudiante_button.setBackground(new java.awt.Color(56, 182, 255));
        QuitarEstudiante_button.setBorder(null);
        QuitarEstudiante_button.setBorderPainted(false);
        QuitarEstudiante_button.addActionListener(this::QuitarEstudiante_buttonActionPerformed);
        jPanel2.add(QuitarEstudiante_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 70, 70));

        Buscar_button.setBackground(new java.awt.Color(56, 182, 255));
        Buscar_button.setBorder(null);
        Buscar_button.setBorderPainted(false);
        jPanel2.add(Buscar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 70, 70));

        AdminCiclas_button.setBackground(new java.awt.Color(56, 182, 255));
        AdminCiclas_button.setBorder(null);
        AdminCiclas_button.setBorderPainted(false);
        AdminCiclas_button.addActionListener(this::AdminCiclas_buttonActionPerformed);
        jPanel2.add(AdminCiclas_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 70, 70));

        CerrarSesion_button1.setBackground(new java.awt.Color(56, 182, 255));
        CerrarSesion_button1.setBorder(null);
        CerrarSesion_button1.setBorderPainted(false);
        jPanel2.add(CerrarSesion_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 70, 70));

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

    private void AdminCiclas_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminCiclas_buttonActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_AdminCiclas_buttonActionPerformed

    private void QuitarEstudiante_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarEstudiante_buttonActionPerformed
       
      
    }//GEN-LAST:event_QuitarEstudiante_buttonActionPerformed

    private void Reportes_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reportes_buttonActionPerformed

       
        // TODO add your handling code here:
    }//GEN-LAST:event_Reportes_buttonActionPerformed

    private void Reglas_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reglas_buttonActionPerformed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_Reglas_buttonActionPerformed

    private void AgregarCicla_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCicla_buttonActionPerformed
      
        
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarCicla_buttonActionPerformed

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

    private void PenalizarrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PenalizarrMouseEntered
    Penalizarr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    Penalizarr.setIcon(new ImageIcon(penalizarNEscalado));    
    Penalizarr.setToolTipText("Penalizar estudiante");
        // TODO add your handling code here:
    }//GEN-LAST:event_PenalizarrMouseEntered

    private void PenalizarrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PenalizarrMouseExited
    Penalizarr.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    Penalizarr.setIcon(new ImageIcon(penalizarEscalado));        // TODO add your handling code here:
    }//GEN-LAST:event_PenalizarrMouseExited

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

    private void PenalizarrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PenalizarrMouseClicked
     adminPenalizar vistaPenalizar = new adminPenalizar();

        vistaPenalizar.setSize(jPanel4.getWidth(), jPanel4.getHeight());
        vistaPenalizar.setLocation(0, 0);

     
        jPanel4.removeAll();
        jPanel4.add(vistaPenalizar, java.awt.BorderLayout.CENTER);

   
        jPanel4.revalidate();
        jPanel4.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_PenalizarrMouseClicked

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

    private void Penalizar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Penalizar_buttonActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_Penalizar_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminCiclas_button;
    private javax.swing.JLabel Administrar;
    private javax.swing.JLabel AgregarC;
    private javax.swing.JButton AgregarCicla_button;
    private javax.swing.JLabel Buscar;
    private javax.swing.JButton Buscar_button;
    private javax.swing.JLabel CERRAR;
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JButton CerrarSesion_button1;
    private javax.swing.JButton Penalizar_button;
    private javax.swing.JLabel Penalizarr;
    private javax.swing.JButton QuitarEstudiante_button;
    private javax.swing.JButton Reglas_button;
    private javax.swing.JLabel Report;
    private javax.swing.JButton Reportes_button;
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
