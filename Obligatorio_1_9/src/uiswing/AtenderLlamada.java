/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiswing;

import vista.VistaAtender;
import controlador.ControladorAtenderLlamada;
import static dominio.EventoSistema.FINALIZAR_LLAMADA;
import static dominio.EventoSistema.LOGOUT;
import dominio.trabajador.Trabajador;
import dominio.trabajador.TrabajadorException;
import javax.swing.JOptionPane;
import observer.Observable;

public class AtenderLlamada extends javax.swing.JFrame implements VistaAtender {

    ControladorAtenderLlamada controlador;
    Observable origen;
    boolean llamadaEnCurso = false;

    public AtenderLlamada(java.awt.Frame parent, boolean modal, Trabajador trabajador) throws TrabajadorException {
        initComponents();
        this.setLocationRelativeTo(parent);
        controlador = new ControladorAtenderLlamada(trabajador, this);
        jTextFieldLlamadaEnCurso.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabSector1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JLabelDescripcion = new javax.swing.JLabel();
        jLabelAppTrabajadores = new javax.swing.JLabel();
        jLabelNombreTrabajador = new javax.swing.JLabel();
        jLabelSector = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jButtonFinalizarLlamada = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jTextFieldLlamadaEnCurso = new javax.swing.JTextField();
        jLabelCliente = new javax.swing.JLabel();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabelLlamadasAtendidas = new javax.swing.JLabel();
        jLabelLlamadasAtendidas1 = new javax.swing.JLabel();
        jLabelTiempoPromedio = new javax.swing.JLabel();
        jLabelTiempoPromedio1 = new javax.swing.JLabel();
        jTextFieldCantidadLlamadas = new javax.swing.JTextField();
        jTextFieldTiempoPromedio = new javax.swing.JTextField();

        LabSector1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        JLabelDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLabelDescripcion.setText("Descripci??n:");

        jLabelAppTrabajadores.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAppTrabajadores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAppTrabajadores.setText("Aplicacion para trabajadores");
        jLabelAppTrabajadores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelAppTrabajadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelNombreTrabajador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNombreTrabajador.setText("jLabel1");

        jLabelSector.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSector.setText("jLabel1");
        jLabelSector.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jButtonFinalizarLlamada.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonFinalizarLlamada.setText("Finalizar llamada");
        jButtonFinalizarLlamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarLlamadaActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setText("Salir");
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jTextFieldLlamadaEnCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldLlamadaEnCurso.setText("Sin llamada en curso");

        jLabelCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCliente.setText("Cliente: ");

        jLabelNombreCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNombreCliente.setText("Sin Cliente");

        jLabelLlamadasAtendidas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelLlamadasAtendidas.setText("Llamadas");

        jLabelLlamadasAtendidas1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelLlamadasAtendidas1.setText("atendidas");

        jLabelTiempoPromedio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelTiempoPromedio.setText("Tiempo");

        jLabelTiempoPromedio1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelTiempoPromedio1.setText("promedio");

        jTextFieldCantidadLlamadas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldCantidadLlamadas.setText("#");

        jTextFieldTiempoPromedio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldTiempoPromedio.setText("#");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelNombreTrabajador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAppTrabajadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLlamadasAtendidas)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldCantidadLlamadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelTiempoPromedio1)
                                            .addComponent(jLabelTiempoPromedio))
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldTiempoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 54, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLlamadasAtendidas1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLlamadaEnCurso)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButtonFinalizarLlamada)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonSalir))
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabelCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelNombreCliente)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAppTrabajadores, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTiempoPromedio)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreTrabajador)
                            .addComponent(jLabelLlamadasAtendidas)
                            .addComponent(jLabelTiempoPromedio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSector)
                            .addComponent(jLabelLlamadasAtendidas1)
                            .addComponent(jLabelTiempoPromedio1)))
                    .addComponent(jTextFieldCantidadLlamadas))
                .addGap(17, 17, 17)
                .addComponent(jTextFieldLlamadaEnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCliente)
                    .addComponent(jLabelNombreCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFinalizarLlamada)
                    .addComponent(jButtonSalir))
                .addGap(18, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFinalizarLlamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarLlamadaActionPerformed
        String d = descripcion.getText();
        finalizarLlamada(d);
    }//GEN-LAST:event_jButtonFinalizarLlamadaActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        if (llamadaEnCurso) {
            int opcion = JOptionPane.showConfirmDialog(this, "Hay una llamada en curso, desea salir y finalizarla?");
            if (opcion == JOptionPane.YES_OPTION) {
                String d = descripcion.getText();
                controlador.finalizarLlamada(d);
                System.exit(0);
            }
        } else {
            controlador.actualizar(origen, LOGOUT);
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelDescripcion;
    private javax.swing.JLabel LabSector1;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton jButtonFinalizarLlamada;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelAppTrabajadores;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelLlamadasAtendidas;
    private javax.swing.JLabel jLabelLlamadasAtendidas1;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelNombreTrabajador;
    private javax.swing.JLabel jLabelSector;
    private javax.swing.JLabel jLabelTiempoPromedio;
    private javax.swing.JLabel jLabelTiempoPromedio1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCantidadLlamadas;
    private javax.swing.JTextField jTextFieldLlamadaEnCurso;
    private javax.swing.JTextField jTextFieldTiempoPromedio;
    // End of variables declaration//GEN-END:variables

    @Override
    public void finalizarLlamada(String descripcion) {
        controlador.actualizar(origen, FINALIZAR_LLAMADA);
    }

    @Override
    public void mostrarNombreTrabajador(String nombre) {
        jLabelNombreTrabajador.setText(nombre);
    }

    @Override
    public void mostrarSector(String str) {
        jLabelSector.setText(str);
    }

    @Override
    public void cantidadLlamadasAtendidas(String atendidas) {
        jTextFieldCantidadLlamadas.setEditable(false);
        jTextFieldCantidadLlamadas.setText(atendidas);
    }

    @Override
    public void tiempoPromedioLlamada(String promedio) {
        jTextFieldTiempoPromedio.setEditable(false);
        jTextFieldTiempoPromedio.setText(promedio);
    }

}
