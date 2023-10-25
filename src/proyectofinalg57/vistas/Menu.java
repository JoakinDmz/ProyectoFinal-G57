/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalg57.vistas;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    //private boolean panelVisible = false; // Variable para controlar la visibilidad del panel
    FondoPanel fondo= new FondoPanel();
    
    public Menu() {
        
        this.setContentPane(fondo);
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbDestino = new javax.swing.JButton();
        jbAlojamiento = new javax.swing.JButton();
        jbModAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbResumen = new javax.swing.JButton();
        jbPaquetes = new javax.swing.JButton();
        jbLogin = new javax.swing.JButton();
        jpVisualizador = new javax.swing.JPanel();
        jpVisualizador2 = new javax.swing.JPanel();
        jpVisualizador3 = new javax.swing.JPanel();
        jpVisualizador4 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0,60));

        jbDestino.setText("DESTINO");
        jbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDestinoActionPerformed(evt);
            }
        });

        jbAlojamiento.setText("ALOJAMIENTO");
        jbAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlojamientoActionPerformed(evt);
            }
        });

        jbModAdmin.setText("Modo Administrador");
        jbModAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModAdminActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/LogoT.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Empresa de Tusimo");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BON VOYAGE");

        jbResumen.setText("RESUMEN DE IMPORTE");
        jbResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResumenActionPerformed(evt);
            }
        });

        jbPaquetes.setText("PAQUETES TURISTICOS");
        jbPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaquetesActionPerformed(evt);
            }
        });

        jbLogin.setText("Iniciar Sesion");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbPaquetes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAlojamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbDestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbLogin)
                    .addComponent(jbModAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jbLogin)
                .addGap(18, 18, 18)
                .addComponent(jbModAdmin)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jpVisualizador.setBackground(new java.awt.Color(255, 255, 255));
        jpVisualizador.setOpaque(false);
        jpVisualizador.setPreferredSize(new java.awt.Dimension(360, 430));

        javax.swing.GroupLayout jpVisualizadorLayout = new javax.swing.GroupLayout(jpVisualizador);
        jpVisualizador.setLayout(jpVisualizadorLayout);
        jpVisualizadorLayout.setHorizontalGroup(
            jpVisualizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jpVisualizadorLayout.setVerticalGroup(
            jpVisualizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jpVisualizador2.setBackground(new java.awt.Color(255, 255, 255));
        jpVisualizador2.setOpaque(false);
        jpVisualizador2.setPreferredSize(new java.awt.Dimension(390, 540));

        javax.swing.GroupLayout jpVisualizador2Layout = new javax.swing.GroupLayout(jpVisualizador2);
        jpVisualizador2.setLayout(jpVisualizador2Layout);
        jpVisualizador2Layout.setHorizontalGroup(
            jpVisualizador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jpVisualizador2Layout.setVerticalGroup(
            jpVisualizador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jpVisualizador3.setBackground(new java.awt.Color(255, 255, 255));
        jpVisualizador3.setOpaque(false);

        javax.swing.GroupLayout jpVisualizador3Layout = new javax.swing.GroupLayout(jpVisualizador3);
        jpVisualizador3.setLayout(jpVisualizador3Layout);
        jpVisualizador3Layout.setHorizontalGroup(
            jpVisualizador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jpVisualizador3Layout.setVerticalGroup(
            jpVisualizador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jpVisualizador4.setOpaque(false);

        javax.swing.GroupLayout jpVisualizador4Layout = new javax.swing.GroupLayout(jpVisualizador4);
        jpVisualizador4.setLayout(jpVisualizador4Layout);
        jpVisualizador4Layout.setHorizontalGroup(
            jpVisualizador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jpVisualizador4Layout.setVerticalGroup(
            jpVisualizador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jpVisualizador2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jpVisualizador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jpVisualizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpVisualizador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jpVisualizador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jpVisualizador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jpVisualizador, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpVisualizador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlojamientoActionPerformed
        // TODO add your handling code here:
        Alojamientos alojamiento = new Alojamientos();
        alojamiento.setSize(390, 540);
        alojamiento.setLocation(0,0);
        
        jpVisualizador2.removeAll();
        jpVisualizador2.add(alojamiento,BorderLayout.CENTER);
        jpVisualizador2.revalidate();
        jpVisualizador2.repaint();
    }//GEN-LAST:event_jbAlojamientoActionPerformed

    private void jbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDestinoActionPerformed
        // TODO add your handling code here:
        Destino destino = new Destino();
        destino.setSize(360, 540);
        destino.setLocation(0,0);
        
        jpVisualizador.removeAll();
        jpVisualizador.add(destino,BorderLayout.CENTER);
        jpVisualizador.revalidate();
        jpVisualizador.repaint();
//        if(panelVisible){
//            jpVisualizador.removeAll(destino);//si el panel esta visible se quita
//        }else{
//            destino.setSize(750, 430);
//            destino.setLocation(0,0);
//            //si el panel no esta visible lo agregamos
//            jpVisualizador.add(destino,BorderLayout.CENTER);
//        }
//        panelVisible = !panelVisible;//cambiamos el estado de visibilidad
//        jpVisualizador.revalidate();
//        jpVisualizador.repaint();   
    }//GEN-LAST:event_jbDestinoActionPerformed

    private void jbResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResumenActionPerformed
        // TODO add your handling code here:
        ResumenVentas resumen = new ResumenVentas();
        resumen.setVisible(true);
    }//GEN-LAST:event_jbResumenActionPerformed

    private void jbModAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModAdminActionPerformed
        // TODO add your handling code here:
        PanelAdministrador paneladmin = new PanelAdministrador();
        paneladmin.setSize(840,710);
        paneladmin.setLocation(0,0);
        
        jpVisualizador4.removeAll();
        jpVisualizador4.add(paneladmin,BorderLayout.CENTER);
        jpVisualizador4.revalidate();
        jpVisualizador4.repaint();
    }//GEN-LAST:event_jbModAdminActionPerformed

    private void jbPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaquetesActionPerformed
        // TODO add your handling code here:
        PaquetesTuristicos paquete = new PaquetesTuristicos();
        paquete.setSize(750, 540);
        paquete.setLocation(0,0);
        
        jpVisualizador3.removeAll();
        jpVisualizador3.add(paquete,BorderLayout.CENTER);
        jpVisualizador3.revalidate();
        jpVisualizador3.repaint();
    }//GEN-LAST:event_jbPaquetesActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jbLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbAlojamiento;
    private javax.swing.JButton jbDestino;
    private javax.swing.JButton jbLogin;
    private javax.swing.JButton jbModAdmin;
    private javax.swing.JButton jbPaquetes;
    private javax.swing.JButton jbResumen;
    private javax.swing.JPanel jpVisualizador;
    private javax.swing.JPanel jpVisualizador2;
    private javax.swing.JPanel jpVisualizador3;
    private javax.swing.JPanel jpVisualizador4;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
        //atributos
        private Image imagen;
        //metodos
        @Override
        public void paint(Graphics g){
            //Creamos la imagen de fondo con la imagen que deseamos
            imagen = new ImageIcon(getClass().getResource("/recursos/imagen2.jpg")).getImage();
            //dibujamos la imagen en el panel
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque (false);//codigo para que muestre la imagen
            super.paint(g);//codigo para que muestre los componentes sobre el panel
        }
    }


    



}
