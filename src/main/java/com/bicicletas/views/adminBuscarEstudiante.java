
package com.bicicletas.views;
import java.awt.Color;

public class adminBuscarEstudiante extends javax.swing.JPanel {


    public adminBuscarEstudiante() {
        initComponents();
        enterID.setOpaque(false);
    enterID.setBackground(new java.awt.Color(0, 0, 0, 0));
    
   
    
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user_text1 = new javax.swing.JLabel();
        user_text2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        enterID = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(815, 347));

        user_text1.setFont(new java.awt.Font("Ancizar Serif", 1, 36)); // NOI18N
        user_text1.setText("BUSCAR ESTUDIANTE");

        user_text2.setFont(new java.awt.Font("Ancizar Serif", 1, 24)); // NOI18N
        user_text2.setText("Ingrese el TIUN del estudiante ");

        jButton7.setBackground(new java.awt.Color(19, 134, 201));
        jButton7.setFont(new java.awt.Font("Ancizar Serif Medium", 0, 18)); // NOI18N
        jButton7.setText("Buscar");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        enterID.setBackground(new java.awt.Color(56, 182, 255, 9));
        enterID.setFont(new java.awt.Font("Ancizar Serif Medium", 0, 18)); // NOI18N
        enterID.setForeground(new java.awt.Color(0,0,0,50));
        enterID.setText("TIUN del estudiante");
        enterID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                enterIDFocusLost(evt);
            }
        });
        enterID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enterIDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(user_text2)
                .addGap(277, 277, 277))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(enterID, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(user_text1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(user_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_text2)
                .addGap(12, 12, 12)
                .addComponent(enterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          
         String tiunStr = enterID.getText();

    if (tiunStr.isEmpty() || tiunStr.equals("TIUN del estudiante")) {
        javax.swing.JOptionPane.showMessageDialog(this, "Ingrese el TIUN del estudiante.");
        return;
    }
    
    try {
        long tiun = Long.parseLong(tiunStr.trim());
        com.bicicletas.modelo.Student objetivo = null;

        for (com.bicicletas.modelo.Student s : com.bicicletas.modelo.Main.listaEstudiante) {
            if (s.getTiun() == tiun) {
                objetivo = s;
                break;
            }
        }

        if (objetivo == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "No existé ningún estudiante con TIUN: " + tiun,
                "No encontrado", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Contacto de emergencia
        String telEmerg = "No registrado";
        String nombreEmerg = "No registrado";
        String cedulaEmerg = "No registrado";
        
        if (objetivo.getPerEmergencia() != null) {
            telEmerg    = String.valueOf(objetivo.getPerEmergencia().getNumEmergencia());//se convierte en string
            nombreEmerg = objetivo.getPerEmergencia().getUserName();
            cedulaEmerg = String.valueOf(objetivo.getPerEmergencia().getCedula());
        }

        // Penalización
        String penalizacion = "Ninguna";
        String motivo = "no tiene penalización";
        
        
        
        
        
            

        String info =
                
            "----------------------------\n" +
            "INFORMACIÓN DEL ESTUDIANTE\n" +
            "----------------------------\n" +
            "Usuario:       " + objetivo.getUserName()  + "\n" +
            "Cédula:        " + objetivo.getCedula()    + "\n" +
            "TIUN:          " + objetivo.getTiun()      + "\n" +
            "Estado:        " + objetivo.getState()     + "\n" +
            "Penalizaciones:" + objetivo.getContadorPenalizaciones() + "\n" +
            "Penalización:  " + penalizacion            + "\n" +
            "---------------------------\n" +
            "CONTACTO DE EMERGENCIA\n" +
            "---------------------------\n" +
            "Nombre:        " + nombreEmerg             + "\n" +
            "Teléfono:      " + telEmerg                + "\n" +
            "Cédula:      " +   cedulaEmerg                + "\n" +
            "+---------------------------\n";

        javax.swing.JOptionPane.showMessageDialog(this,
            info,
            "Estudiante encontrado",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);


    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "El TIUN debe ser numérico.",
            "Error de formato", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void enterIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterIDFocusLost
        if (enterID.getText().isEmpty()) {
            enterID.setText("TIUN del estudiante");
            enterID.setForeground(new java.awt.Color(0, 0, 0, 50));

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_enterIDFocusLost

    private void enterIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterIDMousePressed
        if (enterID.getText().equals("TIUN del estudiante")) {
            enterID.setText("");
            enterID.setForeground(java.awt.Color.BLACK);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_enterIDMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField enterID;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel user_text1;
    private javax.swing.JLabel user_text2;
    // End of variables declaration//GEN-END:variables
}
