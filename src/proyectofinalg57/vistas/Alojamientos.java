package proyectofinalg57.vistas;

import finalgrupo57.AccesoADatos.AlojamientoData;
import finalgrupo57.AccesoADatos.CiudadData;
import finalgrupo57.Entidades.Ciudad;
import finalgrupo57.Entidades.Alojamiento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Alojamientos extends javax.swing.JPanel {

    private List<Ciudad> listaC;
    private List<Alojamiento> listaA;
    private CiudadData cData;
    private AlojamientoData aData;
    private DefaultTableModel modelo;
    
    
    public Alojamientos() {
        initComponents();
        cData = new CiudadData();
        listaC = cData.listarCiudad();
        
        modelo = new DefaultTableModel();
        aData = new AlojamientoData();
        listaA= aData.listarAlojamientos();
        armarCabeceraTabla();
        cargarCiudad();
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaHospedajes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtCantidadPorHospedaje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbCalcular = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbConfirmarHospedaje = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboxCiudades2 = new javax.swing.JComboBox<>();
        jLCostoFinalHospedaje = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextDiasHospedaje = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 204, 0,120));

        jLabel1.setText("Disponibilidad de Alojamientos:");

        jLabel5.setText("Precio de Alojamiento esta sujeto a la temporada ");

        jLabel6.setText("que se realizar el viaje");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jtTablaHospedajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospedaje", "Servicio", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jtTablaHospedajes);

        jLabel2.setText("Cantidad de Personas:");

        jLabel3.setText("Costo Total de Hospedaje:");

        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbConfirmarHospedaje.setText("Confirmar");

        jLabel4.setText("Ciudad de Destino:");

        cboxCiudades2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCiudades2ActionPerformed(evt);
            }
        });

        jLCostoFinalHospedaje.setText("Importe Final");

        jLabel7.setText("Dias de Hospedaje:");

        jTextDiasHospedaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDiasHospedajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCalcular)
                        .addGap(64, 64, 64)
                        .addComponent(jbConfirmarHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxCiudades2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLCostoFinalHospedaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtCantidadPorHospedaje, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextDiasHospedaje))))
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboxCiudades2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextDiasHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCantidadPorHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLCostoFinalHospedaje))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCalcular)
                    .addComponent(jbSalir)
                    .addComponent(jbConfirmarHospedaje))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        try {
            //indice de tabla
            int selectedRow = jtTablaHospedajes.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Por favor seleccione un alojamiento de la tabla");
            } else {
                //creo un objeto en base al valor de la tabla modelo4(Paquetes) de columna 0 y fila seleccionada
                Object valorDTabla = modelo.getValueAt(selectedRow, 2);                
                //transformo ese valor en un Double
                double precioxD = Double.parseDouble(valorDTabla.toString());
                String diasAlo = jTextDiasHospedaje.getText();//jTextDiasHospedaje
                String canPers = jtCantidadPorHospedaje.getText();
           
                if (diasAlo.isEmpty() || canPers.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No deben haber campos vacios");
                }
                double dA = Double.parseDouble(diasAlo);
                double cP = Double.parseDouble(canPers);
                double calculoImporteHospedaje = precioxD * dA * cP;
                jLCostoFinalHospedaje.setText(String.valueOf(calculoImporteHospedaje));//otra forma de conversion (""+calculoImporte)
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados");

        }
        
    }//GEN-LAST:event_jbCalcularActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cboxCiudades2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCiudades2ActionPerformed
        // TODO add your handling code here:
        
        
       cargarAlojamientos();
        
        
    }//GEN-LAST:event_cboxCiudades2ActionPerformed

    private void jTextDiasHospedajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDiasHospedajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDiasHospedajeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Ciudad> cboxCiudades2;
    private javax.swing.JLabel jLCostoFinalHospedaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextDiasHospedaje;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbConfirmarHospedaje;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtCantidadPorHospedaje;
    private javax.swing.JTable jtTablaHospedajes;
    // End of variables declaration//GEN-END:variables
    private void cargarCiudad() {
        for(Ciudad item: listaC){
     //recorre la lista y se lo setea al checkbox
        cboxCiudades2.addItem(item);
        
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Hospedaje");
        filaCabecera.add("Servicio");
        filaCabecera.add("Precio");
        for (Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jtTablaHospedajes.setModel(modelo);
    }

    private void cargarAlojamientos() {
    DefaultTableModel modelo = (DefaultTableModel) jtTablaHospedajes.getModel();
    modelo.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos

    Ciudad selec = (Ciudad) cboxCiudades2.getSelectedItem();
    int ciudadId = selec.getIdCiudad(); // guardo el ID de la ciudad marcada en el cbox
    List<Alojamiento> alojamientos = aData.listarAlojamientos();// lista de todos los alojamientos

    // filtro los alojamientos segun el ID de la ciudad del cbox
    List<Alojamiento> alojamientosPorID = new ArrayList<>();
    for (Alojamiento a : alojamientos) {
        if (a.getCiudadDest().getIdCiudad() == ciudadId) {
            alojamientosPorID.add(a);
        }
    }

    // cargo la tabla con los alojamientos que se filtro
    for (Alojamiento a : alojamientosPorID) {
        String tipo = a.getTipo();
        String servicio = a.getServicio();
        double precio = a.getImporteDiario();
        modelo.addRow(new Object[]{tipo, servicio, precio});
    }
}
}
