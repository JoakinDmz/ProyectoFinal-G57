/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectofinalg57.vistas;

import finalgrupo57.AccesoADatos.AlojamientoData;
import finalgrupo57.AccesoADatos.CiudadData;
import finalgrupo57.AccesoADatos.PaqueteData;
import finalgrupo57.AccesoADatos.PasajeData;
import finalgrupo57.Entidades.Alojamiento;
import finalgrupo57.Entidades.Ciudad;
import finalgrupo57.Entidades.Paquete;
import finalgrupo57.Entidades.Pasaje;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;


public class PanelAdministrador extends javax.swing.JPanel {

    private DefaultTableModel modelo1;
    private DefaultTableModel modelo2;
    private DefaultTableModel modelo3;
    private DefaultTableModel modelo4;
    private CiudadData cData;
    private List<Ciudad> listaC;//sin uso
    private AlojamientoData aData;
    private List<Alojamiento> listaA;// sin uso
    private PasajeData tData;
    private List<Pasaje> listaT;// sin uso
    private PaqueteData pData;
    private List<Paquete> listaP;
    
    public PanelAdministrador() {
        initComponents();
        modelo1 = new DefaultTableModel();
        modelo2 = new DefaultTableModel();
        modelo3 = new DefaultTableModel();
        modelo4 = new DefaultTableModel();
        armarCabeceraTabla1();
        armarCabeceraTabla2();
        armarCabeceraTabla3();
        armarCabeceraTabla4();
        cData = new CiudadData();
        listaC = cData.listarCiudad();
        aData = new AlojamientoData();
        listaA= aData.listarAlojamientos();
        tData = new PasajeData();
        listaT = tData.listarPasajes();
        pData = new PaqueteData();
        listaP = pData.listarPaquetes();
        
        cargarCiudades();
        cargarAlojamientos();
        cargarTransportes();
        cargarPaquetes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCiudades = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTransportes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtPaquetes = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtAlojamientos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfPaquetes = new javax.swing.JTextField();
        tfTransportes = new javax.swing.JTextField();
        tfAlojamientos = new javax.swing.JTextField();
        tfCiudades = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(840, 710));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 710));

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Panel Administrador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 102, 0));

        jButton1.setText("Nuevo");

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jbSalir.setText("Cerrar");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(17, 17, 17))
        );

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ciudades:");

        jtCiudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtCiudades);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Alojamientos:");

        jtTransportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtTransportes);

        jtPaquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtPaquetes);

        jtAlojamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jtAlojamientos);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Transportes:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Paquetes:");

        tfPaquetes.setText("Formato de Ingreso");

        tfTransportes.setText("Formato de Ingreso");

        tfAlojamientos.setText("Formato de Ingreso.");
        tfAlojamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlojamientosActionPerformed(evt);
            }
        });

        tfCiudades.setText("Formato de Ingreso");
        tfCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCiudadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tfPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tfTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tfAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCiudadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCiudadesActionPerformed

    private void tfAlojamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlojamientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAlojamientosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtAlojamientos;
    private javax.swing.JTable jtCiudades;
    private javax.swing.JTable jtPaquetes;
    private javax.swing.JTable jtTransportes;
    private javax.swing.JTextField tfAlojamientos;
    private javax.swing.JTextField tfCiudades;
    private javax.swing.JTextField tfPaquetes;
    private javax.swing.JTextField tfTransportes;
    // End of variables declaration//GEN-END:variables


private void armarCabeceraTabla1() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Pais");
        filaCabecera.add("Provincia");
        for (Object it: filaCabecera){
            modelo1.addColumn(it);
        }
        jtCiudades.setModel(modelo1);
    }

private void armarCabeceraTabla2() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Ciudad");
        filaCabecera.add("Tipo");
        filaCabecera.add("Costo Diario");
        filaCabecera.add("Servicio");
        
        for (Object it: filaCabecera){
            modelo2.addColumn(it);
        }
        jtAlojamientos.setModel(modelo2);
    }
private void armarCabeceraTabla3() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Transporte");
        filaCabecera.add("Precio");
        filaCabecera.add("Ciudad de Origen");
        
        for (Object it: filaCabecera){
            modelo3.addColumn(it);
        }
        jtTransportes.setModel(modelo3);
    }

private void armarCabeceraTabla4() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Ciudad Origen");
        filaCabecera.add("Ciudad Destino");
        filaCabecera.add("Alojamiento");
        filaCabecera.add("Transporte");
        for (Object it: filaCabecera){
            modelo4.addColumn(it);
        }
        jtPaquetes.setModel(modelo4);
    }

    //CARGA TODOS LAS Ciudades
    private void cargarCiudades() {
    DefaultTableModel modelo = (DefaultTableModel) jtAlojamientos.getModel();
    modelo1.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos
    
    List<Ciudad> ciudades = cData.listarCiudad(); // Obtén la lista de todos los alojamientos disponibles
    
    for (Ciudad c : ciudades) {
        // Accede a los atributos de Alojamiento y agrega una fila a la tabla
        int id= c.getIdCiudad();
        String nombre = c.getNombre();
        String pais = c.getPais();
        String provincia = c.getProvincia();
        
        modelo1.addRow(new Object[]{id, nombre, pais, provincia});
    }
    }



    //CARGA TODOS LOS ALOJAMIENTOS
    private void cargarAlojamientos() {
    DefaultTableModel modelo = (DefaultTableModel) jtAlojamientos.getModel();
    modelo2.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos
    
    List<Alojamiento> alojamientos = aData.listarAlojamientos(); // Obtén la lista de todos los alojamientos disponibles
    
    for (Alojamiento a : alojamientos) {
        // Accede a los atributos de Alojamiento y agrega una fila a la tabla
        String tipo = a.getTipo();
        String servicio = a.getServicio();
        double precio = a.getImporteDiario();
        Ciudad ciudad = a.getCiudadDest();
        modelo2.addRow(new Object[]{ciudad, tipo, precio,servicio});
    }
    }
    
    //CARGA TODOS LOS Transportes
    private void cargarTransportes() {
    DefaultTableModel modelo = (DefaultTableModel) jtTransportes.getModel();
    modelo3.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos
    
    List<Pasaje> transportes = tData.listarPasajes(); // Obtén la lista de todos los alojamientos disponibles
    
    for (Pasaje a : transportes) {
        // Accede a los atributos de Alojamiento y agrega una fila a la tabla
        String tipo = a.getTipoTransporte();
        double precio = a.getImporte();
        Ciudad ciudadOrigen = a.getNombreCiudadOrigen();
        modelo3.addRow(new Object[]{tipo, precio, ciudadOrigen});
    }
    }
    
    //CARGA TODOS LOS PAQUETES
    private void cargarPaquetes (){
    DefaultTableModel modelo = (DefaultTableModel) jtPaquetes.getModel();
    modelo4.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos
    
    List<Paquete> paquetes = pData.listarPaquetes(); // Obtén la lista de todos los alojamientos disponibles
    
    for (Paquete a : paquetes) {
        // Accede a los atributos de Alojamiento y agrega una fila a la tabla
        
        Ciudad ciudadOrigen = a.getOrigen();
        Ciudad ciudadDestino = a.getDestino();
        Alojamiento alojamiento = a.getAlojamiento();
        Pasaje transporte = a.getPasaje();
        
        
        
        modelo4.addRow(new Object[]{ciudadOrigen, ciudadDestino,alojamiento,transporte});
    }
    }
    //Codigo para limpiar TextField
//    private void limpiar() {
//        tfCiudades.setText("");
//        tfAlojamientos.setText("");
//        tfTransportes.setText("");
//        tfPaquetes.setText("");
//        estadoRadioButton.setSelected(false);
//    }
}
