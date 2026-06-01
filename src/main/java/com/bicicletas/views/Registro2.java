
package com.bicicletas.views;

import com.bicicletas.modelo.DocReader;
import com.bicicletas.modelo.Main;
import com.bicicletas.modelo.PerEmergencia;
import java.awt.Color;

public class Registro2 extends javax.swing.JPanel {

    public Registro2() {
        initComponents();
    
        enterUser.setOpaque(false);
    enterUser.setBackground(new java.awt.Color(0, 0, 0, 0));
    
    enterID.setOpaque(false);
    enterID.setBackground(new java.awt.Color(0, 0, 0, 0));
    
    enterTel.setOpaque(false);
    enterTel.setBackground(new java.awt.Color(0, 0, 0, 0));
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterMenu_button = new javax.swing.JPanel();
        enterMenu_text = new javax.swing.JLabel();
        user_text = new javax.swing.JLabel();
        enterUser = new javax.swing.JTextField();
        id_text = new javax.swing.JLabel();
        enterID = new javax.swing.JTextField();
        tel_text = new javax.swing.JLabel();
        enterTel = new javax.swing.JTextField();
        emergencyinfo_text = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterMenu_button.setBackground(new java.awt.Color(56, 182, 255));
        enterMenu_button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        enterMenu_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterMenu_text.setBackground(new java.awt.Color(56, 182, 255));
        enterMenu_text.setFont(new java.awt.Font("Ancizar Sans ExtraBold", 0, 24)); // NOI18N
        enterMenu_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterMenu_text.setText("Entrar");
        enterMenu_text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterMenu_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterMenu_textMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterMenu_textMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterMenu_textMouseExited(evt);
            }
        });
        enterMenu_button.add(enterMenu_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        add(enterMenu_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 300, 60));

        user_text.setFont(new java.awt.Font("Ancizar Serif", 1, 24)); // NOI18N
        user_text.setText("Nombre:");
        add(user_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        enterUser.setBackground(new java.awt.Color(56, 182, 255, 9));
        enterUser.setFont(new java.awt.Font("Ancizar Serif Medium", 0, 18)); // NOI18N
        enterUser.setForeground(new java.awt.Color(0,0,0,50));
        enterUser.setText("Ingrese el nombre");
        enterUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enterUserMousePressed(evt);
            }
        });
        enterUser.addActionListener(this::enterUserActionPerformed);
        add(enterUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 420, -1));

        id_text.setFont(new java.awt.Font("Ancizar Serif", 1, 24)); // NOI18N
        id_text.setText("Identificación:");
        add(id_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        enterID.setBackground(new java.awt.Color(56, 182, 255, 9));
        enterID.setFont(new java.awt.Font("Ancizar Serif Medium", 0, 18)); // NOI18N
        enterID.setForeground(new java.awt.Color(0,0,0,50));
        enterID.setText("Identificación sin puntos");
        enterID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enterIDMousePressed(evt);
            }
        });
        add(enterID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 420, -1));

        tel_text.setFont(new java.awt.Font("Ancizar Serif", 1, 24)); // NOI18N
        tel_text.setText("Teléfono:");
        add(tel_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        enterTel.setBackground(new java.awt.Color(56, 182, 255, 9));
        enterTel.setFont(new java.awt.Font("Ancizar Serif Medium", 0, 18)); // NOI18N
        enterTel.setForeground(new java.awt.Color(0,0,0,50));
        enterTel.setText("Ingrese número de teléfono");
        enterTel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enterTelMousePressed(evt);
            }
        });
        enterTel.addActionListener(this::enterTelActionPerformed);
        add(enterTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 420, -1));

        emergencyinfo_text.setFont(new java.awt.Font("Ancizar Sans ExtraBold", 1, 36)); // NOI18N
        emergencyinfo_text.setForeground(new java.awt.Color(19, 134, 201));
        emergencyinfo_text.setText("Contacto de emergencia");
        add(emergencyinfo_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void enterMenu_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMenu_textMouseClicked
      /*
        // Validar si el estudiante actual está bloqueado
        if (Main.listaEstudiantesBloqueados.contains(Main.estudianteActual)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "⚠️ Este estudiante está bloqueado de por vida. No puede completar el registro.",
                "Acceso denegado",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return; // corta el flujo, no guarda contacto ni abre Login
        }
      */  
        
        
        //ATRIBUTOS
        String nombreEmergencia = enterUser.getText();
        String idEmergenciaStr  = enterID.getText();
        String numEmergencia = enterTel.getText();
        
        
    if (nombreEmergencia.isEmpty() || nombreEmergencia.equals("Ingrese el nombre") ||
        idEmergenciaStr.isEmpty()  || idEmergenciaStr.equals("Identificación sin puntos") ||
        numEmergencia.isEmpty()    || numEmergencia.equals("Ingrese número de teléfono")) {

        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
        return;
    }

    try {
    long cedulaEmergencia = Long.parseLong(idEmergenciaStr);
    
        //CREACION DE CONTACTO DE EMERGENCIA
        PerEmergencia contactoEmergencia = new PerEmergencia(nombreEmergencia, cedulaEmergencia, numEmergencia);
        
        
    if (!contactoEmergencia.setNumEmergencia(numEmergencia)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Número de emergencia inválido. Debe tener 10 dígitos.");
        return;
    }
    
    
    com.bicicletas.modelo.Student nuevoEstudiante = new com.bicicletas.modelo.Student(
    Main.tempNombre,
    Main.tempCedula,
    Main.tempTiun,
    Main.tempContrasena,
    contactoEmergencia
);
    
    Main.estudianteActual = nuevoEstudiante;
    Main.listaEstudiante.add(nuevoEstudiante);
    Main.perEmergencia = contactoEmergencia;
    
    String nombreArchivo = "estudiantes.txt";
    
    DocReader.crearArchivo(nombreArchivo);
        DocReader.guardarEstudianteEnArchivo(nombreArchivo, Main.estudianteActual);
        
    
    System.out.println("Estudiante guardado permanentemente en: " + nombreArchivo);

} catch (NumberFormatException e) {
    javax.swing.JOptionPane.showMessageDialog(this, "Error: La cédula debe ser numérica.");
    return;
} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage());
    return;
}
    
    
    
       
        
        
        java.awt.Window ventanaActual = javax.swing.SwingUtilities.getWindowAncestor(this);
        int x = ventanaActual.getX();
        int y = ventanaActual.getY();
        
        Login login=new Login();
        login.setLocation(x, y);
        login.setVisible(true);
        
        
        //cerrar el jframe de signup
        ventanaActual.dispose();
        
        //this.dispose();
    }//GEN-LAST:event_enterMenu_textMouseClicked

    private void enterMenu_textMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMenu_textMouseEntered
        enterMenu_button.setBackground(new Color(19,134,201));
        enterMenu_text.setForeground(Color.WHITE);
        //iniciarSesion_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 134, 201), 10, true));
    }//GEN-LAST:event_enterMenu_textMouseEntered

    private void enterMenu_textMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMenu_textMouseExited
        enterMenu_button.setBackground(new Color(56,182,255));
        enterMenu_text.setForeground(Color.BLACK);
        //iniciarSesion_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 182, 255), 10, true));
    }//GEN-LAST:event_enterMenu_textMouseExited

    private void enterUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterUserMousePressed
        if (enterUser.getText().equals("Ingrese el nombre")){
            enterUser.setText("");
            enterUser.setForeground(Color.black);
        }
        if(enterID.getText().isEmpty()){
            enterID.setText("Identificación sin puntos");
            enterID.setForeground(new Color(0,0,0,50));
        }
        if (enterTel.getText().isEmpty()){
            enterTel.setText("Ingrese número de teléfono");
            enterTel.setForeground(new Color(0,0,0,50));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_enterUserMousePressed

    private void enterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterUserActionPerformed

    private void enterIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterIDMousePressed
        if (enterID.getText().equals("Identificación sin puntos")){
            enterID.setText("");
            enterID.setForeground(Color.black);
        }
        if(enterUser.getText().isEmpty()){
            enterUser.setText("Ingrese el nombre");
            enterUser.setForeground(new Color(0,0,0,50));
        }
        if (enterTel.getText().isEmpty()){
            enterTel.setText("Ingrese número de teléfono");
            enterTel.setForeground(new Color(0,0,0,50));
        }
    }//GEN-LAST:event_enterIDMousePressed

    private void enterTelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterTelMousePressed
        if (enterTel.getText().equals("Ingrese número de teléfono")){
            enterTel.setText("");
            enterTel.setForeground(Color.black);
        }
        if(enterUser.getText().isEmpty()){
            enterUser.setText("Ingrese el nombre");
            enterUser.setForeground(new Color(0,0,0,50));
        }
        if (enterID.getText().isEmpty()){
            enterID.setText("Identificación sin puntos");
            enterID.setForeground(new Color(0,0,0,50));
        }
    }//GEN-LAST:event_enterTelMousePressed

    private void enterTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterTelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emergencyinfo_text;
    private javax.swing.JTextField enterID;
    private javax.swing.JPanel enterMenu_button;
    private javax.swing.JLabel enterMenu_text;
    private javax.swing.JTextField enterTel;
    private javax.swing.JTextField enterUser;
    private javax.swing.JLabel id_text;
    private javax.swing.JLabel tel_text;
    private javax.swing.JLabel user_text;
    // End of variables declaration//GEN-END:variables
}
