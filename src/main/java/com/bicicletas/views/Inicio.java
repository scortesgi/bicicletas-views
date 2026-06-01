
package com.bicicletas.views;
import java.time.LocalDate;

public class Inicio extends javax.swing.JPanel {

    public Inicio() {
        initComponents();
        setSize(800,460);
        SetDate();
    }
    
    public void SetDate(){
    LocalDate now = LocalDate.now();
    int year = now.getYear();
    int dia = now.getDayOfMonth();
    int month = now.getMonthValue();
    String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
        "Octubre","Noviembre","Diciembre"};
    fecha_text.setText(dia+"/"+meses[month - 1]+"/"+year);}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reglamento_text = new javax.swing.JLabel();
        reglamento_text1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        reglamento_text2 = new javax.swing.JLabel();
        reglamento_text3 = new javax.swing.JLabel();
        reglamento_text4 = new javax.swing.JLabel();
        reglamento_text5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fecha_panel = new javax.swing.JPanel();
        fecha_text = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reglamento_text.setFont(new java.awt.Font("Ancizar Serif", 1, 24)); // NOI18N
        reglamento_text.setText("Restricciones adicionales:");
        add(reglamento_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        reglamento_text1.setFont(new java.awt.Font("Ancizar Serif Black", 0, 36)); // NOI18N
        reglamento_text1.setText("Reglamento para el uso de bicicletas:");
        add(reglamento_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bicicleta_azul.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        reglamento_text2.setFont(new java.awt.Font("Ancizar Serif", 1, 24)); // NOI18N
        reglamento_text2.setText("Reservas:");
        add(reglamento_text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        reglamento_text3.setFont(new java.awt.Font("Ancizar Serif", 1, 24)); // NOI18N
        reglamento_text3.setText("Uso:");
        add(reglamento_text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        reglamento_text4.setFont(new java.awt.Font("Ancizar Serif", 1, 24)); // NOI18N
        reglamento_text4.setText("Penalizaciones:");
        add(reglamento_text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        reglamento_text5.setFont(new java.awt.Font("Ancizar Serif", 1, 24)); // NOI18N
        reglamento_text5.setText("Responsabilidades del usuario:");
        add(reglamento_text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel2.setText("ésta vuelve a quedar disponible para otros usuarios.");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel3.setText("La bicicleta debe devolverse en la estación de entrega indicada en la reserva.");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel4.setText("La bicicleta puede reservarse por un máximo de 20 minutos. Si en ese tiempo no se retira, ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel5.setText("30 días.");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel6.setText("El tiempo de uso máximo es de 15 minutos, desde el retiro hasta la devolución.");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel7.setText("respetar las normas de tránsito y seguridad vial.");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel8.setText("por 15 días. En caso que se cuente con 2 penalizaciones el bloqueo se extenderá a  ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel9.setText("Mal uso, daños o no devolución en el tiempo establecido: bloqueo de la cuenta");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel10.setText("El incumplimiento reiterado de las reglas puede llevar a la suspensión definitiva del servicio. ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel11.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel11.setText("usar la bicicleta únicamente para desplazamientos personales, no para actividades comerciales, ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel12.setText("Verificar el estado de la bicicleta antes de retirarla, reportar cualquier daño o irregularidad inmediatamente, ");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Ancizar Sans Light", 0, 14)); // NOI18N
        jLabel13.setText("No se permite: transportar pasajeros, modificar o alterar partes de la bicicleta. El préstamo es personal e intransferible. ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        fecha_panel.setBackground(new java.awt.Color(19, 134, 201));

        fecha_text.setFont(new java.awt.Font("Ancizar Sans Thin", 0, 12)); // NOI18N
        fecha_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_text.setText("{dia}/{month}/{year}");

        javax.swing.GroupLayout fecha_panelLayout = new javax.swing.GroupLayout(fecha_panel);
        fecha_panel.setLayout(fecha_panelLayout);
        fecha_panelLayout.setHorizontalGroup(
            fecha_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fecha_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        fecha_panelLayout.setVerticalGroup(
            fecha_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fecha_text, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(fecha_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 120, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fecha_panel;
    private javax.swing.JLabel fecha_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel reglamento_text;
    private javax.swing.JLabel reglamento_text1;
    private javax.swing.JLabel reglamento_text2;
    private javax.swing.JLabel reglamento_text3;
    private javax.swing.JLabel reglamento_text4;
    private javax.swing.JLabel reglamento_text5;
    // End of variables declaration//GEN-END:variables
}
