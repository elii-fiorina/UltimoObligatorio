/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiswing;

import controlador.ControladorSimularLlamada;
import dominio.Sector.Sector;
import dominio.Sector.SectorException;
import dominio.cliente.ClienteException;
import java.time.LocalTime;
import java.util.List;
import javax.swing.JOptionPane;
import vista.VistaSimularLlamada;

public class SimularLlamada extends javax.swing.JFrame implements VistaSimularLlamada {

    ControladorSimularLlamada controlador;
    String cedula = "";
    boolean clienteIngresado;
    int sectorElegido = 0;

    /**
     * Creates new form SimularLlamada
     */
    public SimularLlamada() {
        initComponents();
        controlador = new ControladorSimularLlamada(this);
        clienteIngresado = false;
        textoSimulador.setVisible(false);
        textoSimulador.setEditable(false);
    }
    //JButton[] numerosBotones = new JButton[12]; 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSector = new javax.swing.JLabel();
        jLabelAppTrabajadores = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        JLabelDescripcion = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        btnNumeral = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoSimulador = new javax.swing.JTextArea();

        jLabelSector.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSector.setText("jLabel1");
        jLabelSector.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAppTrabajadores.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAppTrabajadores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAppTrabajadores.setText("Simulador de llamadas");
        jLabelAppTrabajadores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelAppTrabajadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnIniciar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(0, 153, 51));
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnFinalizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 0, 0));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        JLabelDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLabelDescripcion.setText("Mensaje de la central telefonica:");

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("*");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("0");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        btnNumeral.setText("#");
        btnNumeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeralActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        textoSimulador.setColumns(20);
        textoSimulador.setRows(5);
        jScrollPane2.setViewportView(textoSimulador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIniciar)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumeral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAppTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelAppTrabajadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnFinalizar))
                .addGap(29, 29, 29)
                .addComponent(JLabelDescripcion)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(btnNumeral)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        limpiarCedula();
        limpiarDatos();
        solicitarCedula();
        textoSimulador.setEnabled(true);
        textoSimulador.setVisible(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea Salir?");
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cedula += "1";
        sectorElegido = 1;
        textoSimulador.setText(cedula);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cedula += "2";
        sectorElegido = 2;
        textoSimulador.setText(cedula);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cedula += "3";
        sectorElegido = 3;
        textoSimulador.setText(cedula);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cedula += "4";
        sectorElegido = 4;
        textoSimulador.setText(cedula);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cedula += "5";
        sectorElegido = 5;
        textoSimulador.setText(cedula);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cedula += "6";
        sectorElegido = 6;
        textoSimulador.setText(cedula);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        cedula += "7";
        sectorElegido = 7;
        textoSimulador.setText(cedula);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        cedula += "8";
        sectorElegido = 8;
        textoSimulador.setText(cedula);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        cedula += "9";
        sectorElegido = 9;
        textoSimulador.setText(cedula);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        cedula += "*";
        textoSimulador.setText(cedula);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        cedula += "0";
        sectorElegido = 0;
        textoSimulador.setText(cedula);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnNumeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeralActionPerformed
        if (clienteIngresado == false) {
            try {
                seleccionarUnCliente();
                clienteIngresado = true;
            } catch (ClienteException ex) {
                limpiarDatos();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else {
            int sec = sectorElegido;
            try {
                Sector s = traerSector(sec);
                controlador.iniciarLlamada(s);
            } catch (SectorException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            //limpiarDatos();
        }
        limpiarCedula();
    }//GEN-LAST:event_btnNumeralActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        controlador.finalizarLlamada();
        limpiarCedula();
        clienteIngresado = false;

        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelDescripcion;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnNumeral;
    private javax.swing.JButton btnSalir;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabelAppTrabajadores;
    private javax.swing.JLabel jLabelSector;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textoSimulador;
    // End of variables declaration//GEN-END:variables

    private void solicitarCedula() {
        textoSimulador.setText("Ingrese su c??dula seguida de la tecla numeral");
    }

    @Override
    public void mostrarTodosLosSectores(List<Sector> sectoresTotal) {
        String linea = "Para comunicarse con ";
        for (Sector sector : sectoresTotal) {
            int posicion = sectoresTotal.indexOf(sector) + 1;
            linea += formatear(sector) + " digite " + posicion + ", ";
        }
        textoSimulador.setText(linea);
    }

    private void limpiarDatos() {
        textoSimulador.setText("");
    }

    private void limpiarCedula() {
        cedula = "";
    }

    private void seleccionarUnCliente() throws ClienteException {
        controlador.seleccionarCliente(cedula);
        clienteIngresado = true;
    }

    private String formatear(Sector sector) {
        return sector.getNombre();
    }

    @Override
    public void iniciarLlamada(Sector s, String t) {
        String str = ("Llamada en curso??? ud. se est?? comunicando con el sector " + s.getNombre()
                + ". Y est?? siendo atendido por " + t
                + ". Su llamada se ha iniciado en " + LocalTime.now());
        textoSimulador.setText(str);
    }

    private Sector traerSector(int sectorElegido) throws SectorException {
        return controlador.traerSector(sectorElegido);
    }
   

    @Override
    public void finalizarLlamada(double costo, double saldo, double duracion) {
        String texto = "Llamada finalizada. Duracion: " + 
                        duracion + 
                        " | Costo: " +
                        costo + 
                        " | Saldo del cliente: " +
                        saldo;
                
        textoSimulador.setText(texto);
    }
    

}
