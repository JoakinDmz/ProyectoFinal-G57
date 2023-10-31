
package proyectofinalg57.vistas;

import finalgrupo57.Entidades.Ciudad;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import finalgrupo57.AccesoADatos.CiudadData;
import finalgrupo57.AccesoADatos.PasajeData;
import finalgrupo57.Entidades.Pasaje;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Destino extends javax.swing.JPanel {
    
    private List<Ciudad> listaC;
    private CiudadData cData;
    private List<Pasaje> listaT;
    private PasajeData tData;
private int primerElemento;
    private int idCiu;
    private int idCiuD;
    private String temporada;

    public Ciudad ciudadO;
    public Ciudad ciudadD;
    public Destino() {


        cData = new CiudadData();
        listaC = cData.listarCiudad();

        tData = new PasajeData();
        listaT = tData.listarPasajesCiudad(idCiu);
        initComponents();
        cargarCiudad();
       // cargarTransporte();
        //System.out.println(idCiu);

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDestino = new javax.swing.JPanel();
        cboxCiudades = new javax.swing.JComboBox<>();
        cboxTransporte = new javax.swing.JComboBox<>();
        jbSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtCantidadPasajeros = new javax.swing.JTextField();
        cboxCiudadOrigen = new javax.swing.JComboBox<>();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(360, 540));

        jpDestino.setBackground(new java.awt.Color(255, 255, 255));
        jpDestino.setPreferredSize(new java.awt.Dimension(360, 540));

        cboxCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCiudadesActionPerformed(evt);
            }
        });

        cboxTransporte.setToolTipText("");
        cboxTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTransporteActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 204, 0,120));

        jLabel1.setText("Ciudad de Origen:");

        jLabel2.setText("Ciudad de Destino:");

        jLabel3.setText("Transporte:");

        jLabel4.setText("Fechas de Viaje:");

        jLabel5.setText("Fecha de Inicio:");

        jLabel6.setText("Fecha Final:");

        jLabel7.setText("Pasajeros:");

        jLabel8.setText("Temporada:");

        jLabel9.setText("Costo de Viaje:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("(Transporte)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addComponent(jLabel8)
                .addGap(57, 57, 57)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jtCantidadPasajeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantidadPasajerosKeyTyped(evt);
            }
        });

        cboxCiudadOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCiudadOrigenActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Temporada");

        jLabel12.setText("0");

        javax.swing.GroupLayout jpDestinoLayout = new javax.swing.GroupLayout(jpDestino);
        jpDestino.setLayout(jpDestinoLayout);
        jpDestinoLayout.setHorizontalGroup(
            jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDestinoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDestinoLayout.createSequentialGroup()
                        .addGroup(jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboxCiudadOrigen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxTransporte, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxCiudades, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtCantidadPasajeros, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34))
                    .addGroup(jpDestinoLayout.createSequentialGroup()
                        .addGroup(jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDestinoLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(91, 91, 91)
                        .addComponent(jbSalir)
                        .addContainerGap())
                    .addGroup(jpDestinoLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpDestinoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpDestinoLayout.setVerticalGroup(
            jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDestinoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cboxCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboxCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboxTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtCantidadPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel11)
                .addGap(58, 58, 58)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jButton1))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cboxTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxTransporteActionPerformed

    private void cboxCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCiudadesActionPerformed
        // TODO add your handling code here:
        String selecTodo = cboxCiudades.getSelectedItem().toString();
        //\D+ busca solamente numeros usando expresiones regulares
        String[] xi = selecTodo.split("\\D+");

        int idCiuD = Integer.parseInt(xi[0]);


        ciudadD= cData.buscarCiudadParaLista(idCiuD);

        //System.out.println(ciudadD);
    }//GEN-LAST:event_cboxCiudadesActionPerformed

    private void jtCantidadPasajerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantidadPasajerosKeyTyped
        char c = evt.getKeyChar();
    if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
        evt.consume(); // Esto consume el evento y evita que el carácter ingresado se muestre en el campo de texto.
    }
    }//GEN-LAST:event_jtCantidadPasajerosKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
          
       
      LocalDate fecha1 = jDateChooser3.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate fecha2 = jDateChooser4.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
   
    int inicio = fecha1.getMonthValue();
    int fin = fecha2.getMonthValue();

    if ((inicio == Month.JANUARY.getValue() || inicio == Month.JULY.getValue()) &&
        (fin == Month.JANUARY.getValue() || fin == Month.JULY.getValue())) {
        jLabel11.setText("Alta");
        temporada ="Alta";
    } else if ((inicio == Month.FEBRUARY.getValue() || inicio == Month.JUNE.getValue()) &&
               (fin == Month.FEBRUARY.getValue() || fin == Month.JUNE.getValue())) {
        jLabel11.setText("Media");
         temporada ="Media";
    } else {
        jLabel11.setText("Baja");
         temporada ="Baja";
    }
        
    
      } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar una fecha");
    
       
      }
        double precio=0;
        
        String seleccionCompletaT = cboxTransporte.getSelectedItem().toString();
        String[] a = seleccionCompletaT.split("\\D+");
        
        double costoT = Integer.parseInt(a[1]);
        
        try{
        int cantP = Integer.parseInt(jtCantidadPasajeros.getText());
        
        if (temporada.equals("Alta")) {
            precio = (costoT * cantP) * 1.30;
        } else if (temporada.equals("Media")) {
            precio = (costoT * cantP) * 1.15;
        } else {

           precio = (costoT * cantP);

        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Tiene que ingresar una cantidad de pasajeros");
    
       
      }
        jLabel12.setText(String.valueOf(precio));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboxCiudadOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCiudadOrigenActionPerformed
        // TODO add your handling code here:
        cboxTransporte.removeAllItems();
//        System.out.println(listaT);
        String seleccionCompleta = cboxCiudadOrigen.getSelectedItem().toString();
        //\\D+ busca solamente numeros usando expresiones regulares
        String[] x = seleccionCompleta.split("\\D+");
        
        int idCiu = Integer.parseInt(x[0]);
        
//        System.out.println( "idCiudad " +idCiu );
        listaT = tData.listarPasajesCiudad(idCiu);
        
        for (Pasaje item : listaT) {
                
          cboxTransporte.addItem(item);
        }
       
        ciudadO= cData.buscarCiudadParaLista(idCiu);
    }//GEN-LAST:event_cboxCiudadOrigenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Ciudad> cboxCiudadOrigen;
    private javax.swing.JComboBox<Ciudad> cboxCiudades;
    private javax.swing.JComboBox<Pasaje> cboxTransporte;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JPanel jpDestino;
    private javax.swing.JTextField jtCantidadPasajeros;
    // End of variables declaration//GEN-END:variables

    private void cargarCiudad() {
        for (Ciudad item : listaC) {
            //recorre la lista y se lo setea al checkbox
            cboxCiudades.addItem(item);
            cboxCiudadOrigen.addItem(item);

        }
    }

//    private void cargarTransporte() {
//        for (Pasaje item: listaT){
//            cboxTransporte.addItem(item);
//        }
//    }
}
