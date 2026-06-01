/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bicicletas.views;

import com.bicicletas.modelo.Main;
import com.bicicletas.modelo.Student;

public class AdminQuitarEstudiante extends javax.swing.JPanel {

    public AdminQuitarEstudiante() {
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
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 360));

        user_text1.setFont(new java.awt.Font("Ancizar Serif", 1, 36)); // NOI18N
        user_text1.setText("Quitar acceso a estudiante");

        user_text2.setFont(new java.awt.Font("Ancizar Serif", 1, 24)); // NOI18N
        user_text2.setText("Ingrese el TIUN del estudiante que desea remover ");

        jButton7.setBackground(new java.awt.Color(19, 134, 201));
        jButton7.setFont(new java.awt.Font("Ancizar Serif Medium", 0, 18)); // NOI18N
        jButton7.setText("Entregar");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        enterID.setBackground(new java.awt.Color(56, 182, 255, 9));
        enterID.setFont(new java.awt.Font("Ancizar Serif Medium", 0, 18)); // NOI18N
        enterID.setForeground(new java.awt.Color(0,0,0,50));
        enterID.setText("Tiun del estudiante a remover");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(user_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(user_text2)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(enterID, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(user_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
                        
          String tiunStr = enterID.getText();
         
          if (tiunStr.isEmpty() || tiunStr.equals("Tiun del estudiante a remover")) {
        javax.swing.JOptionPane.showMessageDialog(this, "Ingrese el TIUN del estudiante.");
        return;
    }
          
          
        try {
            //ATRIBUTOS
            long tiun = Long.parseLong(tiunStr.trim());
            boolean encontrado = false;

            // BUSCA ESTUDIANTE EN LA LISTA DE ESTUDIANTES
            for (Student student : Main.listaEstudiante) {
                if (student.getTiun() == tiun) {
                    encontrado = true;

                    // Preguntar si es de por vida o temporal
                    int opcion = javax.swing.JOptionPane.showConfirmDialog(
                        this,
                        "¿Desea quitarle el acceso de por vida a" + student.getUserName() + "?",
                        "Confirmar bloqueo",
                        javax.swing.JOptionPane.YES_NO_OPTION
                    );

                    
                    
                    if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                        // Bloqueo de por vida
                        Main.listaEstudiantesBloqueados.add(student);
                        Main.listaEstudiante.remove(student);
                        
                        com.bicicletas.modelo.DocReader.crearArchivo("bloqueados.txt");
                        com.bicicletas.modelo.DocReader.guardarEstudianteEnArchivo("bloqueados.txt", student);
                        reescribirEstudiantes();
                    
                    
                        javax.swing.JOptionPane.showMessageDialog(this,
                            "Se quitó el acceso al estudiante" + student.getUserName() + " de por vida.",
                            "Bloqueo permanente",
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        
                        // Bloqueo temporal → remover de la lista
                        student.setState("bloqueado");
                        student.setFechaFinPenalizacion(java.time.LocalDateTime.now().plusDays(30));
                        reescribirEstudiantes();
                        Main.listaEstudiante.remove(student);
                    
                        javax.swing.JOptionPane.showMessageDialog(this,
                            "Se quitó el acceso temporalmente.",
                            "Bloqueo temporal",
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                }
            }

            if (!encontrado) {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "El TIUN no pertenece a ningún estudiante registrado.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Ingrese un TIUN válido (solo números).",
                "Error de formato",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
    }
        
    //metodo para leer el archivo y reescribir los estudiantes. Si se quitan o no en el txt
        private void reescribirEstudiantes() {
    String archivo = "estudiantes.txt";
    try (java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(archivo, false))) {
        for (Student s : Main.listaEstudiante) {
            pw.println(
                s.getTiun() + ":" +
                s.getUserName() + ":" +
                s.getCedula() + ":" +
                s.getContraseña() + ":" +
                s.getPerEmergencia().getNumEmergencia()
            );
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }

        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void enterIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterIDFocusLost
        if (enterID.getText().isEmpty()) {
            enterID.setText("Tiun del estudiante a remover");
            enterID.setForeground(new java.awt.Color(0, 0, 0, 50));

        }

    }//GEN-LAST:event_enterIDFocusLost

    private void enterIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterIDMousePressed
        if (enterID.getText().equals("Tiun del estudiante a remover")) {
            enterID.setText("");
            enterID.setForeground(java.awt.Color.BLACK);
        }  
    }//GEN-LAST:event_enterIDMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField enterID;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel user_text1;
    private javax.swing.JLabel user_text2;
    // End of variables declaration//GEN-END:variables
}
