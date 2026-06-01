
package com.bicicletas.views;

import com.bicicletas.modelo.Main;
import java.awt.Color;
import java.time.LocalDate;


public class Tiempo extends javax.swing.JPanel {

    public Tiempo() {
        initComponents();
        SetDate();
    }

  
    public void SetDate(){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
            "Octubre","Noviembre","Diciembre"};
        fecha_text.setText(dia+"/"+meses[month - 1]+"/"+year);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fecha_panel = new javax.swing.JPanel();
        fecha_text = new javax.swing.JLabel();
        tiempoUso_button = new javax.swing.JPanel();
        tiempoUso_text = new javax.swing.JLabel();
        tiempoReserva_button1 = new javax.swing.JPanel();
        tiempoReserva_text1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        tiempoUso_button.setBackground(new java.awt.Color(56, 182, 255));
        tiempoUso_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tiempoUso_text.setFont(new java.awt.Font("Ancizar Sans Medium", 0, 20)); // NOI18N
        tiempoUso_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiempoUso_text.setText("Tiempo de uso");
        tiempoUso_text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tiempoUso_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiempoUso_textMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tiempoUso_textMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tiempoUso_textMouseExited(evt);
            }
        });
        tiempoUso_button.add(tiempoUso_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 210));

        add(tiempoUso_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 300, 210));

        tiempoReserva_button1.setBackground(new java.awt.Color(56, 182, 255));
        tiempoReserva_button1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tiempoReserva_text1.setFont(new java.awt.Font("Ancizar Sans Medium", 0, 20)); // NOI18N
        tiempoReserva_text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiempoReserva_text1.setText("Tiempo de reserva");
        tiempoReserva_text1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tiempoReserva_text1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiempoReserva_text1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tiempoReserva_text1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tiempoReserva_text1MouseExited(evt);
            }
        });
        tiempoReserva_button1.add(tiempoReserva_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 210));

        add(tiempoReserva_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 300, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void tiempoUso_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoUso_textMouseClicked


                                           
                                                     
        if (Main.estudianteActual != null && Main.estudianteActual.getReserva() != null) {
            Main.estudianteActual.getReserva().verificarExcesoReserva();
        } else {
                              
                                                     
       if (Main.estudianteActual != null && Main.estudianteActual.getReserva() != null) {
            Main.estudianteActual.getReserva().verificarExcesoReserva();
        } else {

            javax.swing.JOptionPane.showMessageDialog(this,
                "No cuenta con ninguna reserva activa en este momento.",
                "Información",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }

        }



    }//GEN-LAST:event_tiempoUso_textMouseClicked

    private void tiempoUso_textMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoUso_textMouseEntered
        tiempoUso_text.setForeground(Color.WHITE);
        tiempoUso_button.setBackground(new Color(19,134,201));
    }//GEN-LAST:event_tiempoUso_textMouseEntered

    private void tiempoUso_textMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoUso_textMouseExited
        tiempoUso_text.setForeground(Color.BLACK);
        tiempoUso_button.setBackground(new Color(56,182,255));
    }//GEN-LAST:event_tiempoUso_textMouseExited

    private void tiempoReserva_text1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoReserva_text1MouseClicked
       if (Main.estudianteActual != null && Main.estudianteActual.getReserva() != null) {
        // Llamar al método verificarExcesoReserva de la reserva actual
        Main.estudianteActual.getReserva().verificarExcesoReserva();
    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
            "No cuenta con ninguna reserva activa en este momento.",
            "Información",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_tiempoReserva_text1MouseClicked

    private void tiempoReserva_text1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoReserva_text1MouseEntered
        tiempoReserva_text1.setForeground(Color.WHITE);
        tiempoReserva_button1.setBackground(new Color(19,134,201));
    }//GEN-LAST:event_tiempoReserva_text1MouseEntered

    private void tiempoReserva_text1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoReserva_text1MouseExited
        tiempoReserva_text1.setForeground(Color.BLACK);
        tiempoReserva_button1.setBackground(new Color(56,182,255));
    }//GEN-LAST:event_tiempoReserva_text1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fecha_panel;
    private javax.swing.JLabel fecha_text;
    private javax.swing.JPanel tiempoReserva_button1;
    private javax.swing.JLabel tiempoReserva_text1;
    private javax.swing.JPanel tiempoUso_button;
    private javax.swing.JLabel tiempoUso_text;
    // End of variables declaration//GEN-END:variables
}
