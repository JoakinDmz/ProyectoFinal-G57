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
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class PanelAdmin2 extends javax.swing.JPanel {

    private DefaultTableModel modelo1;
    private DefaultTableModel modelo2;
    private DefaultTableModel modelo3;
    private DefaultTableModel modelo4;
    private CiudadData cData;
    private List<Ciudad> listaC;
    private AlojamientoData aData;
    private List<Alojamiento> listaA;
    private PasajeData tData;
    private List<Pasaje> listaT;
    private PaqueteData pData;
    private List<Paquete> listaP;
    private Ciudad ciudad;
    
    //paraAgregCiu
    private CiudadData ciuData = new CiudadData();
    private Ciudad ciudadnew=null;
    //paraModCiu
    private String caja[][];//seria una matriz bidimensional
    private CiudadData ciuDataMod = new CiudadData();
    //paraBorrarCiu
    private CiudadData borrarCiuData= new CiudadData();
    //para AgregAloj
    private AlojamientoData aloData =new AlojamientoData();
    private Alojamiento alojamientonew=null;
    private CiudadData buscarCiuData = new CiudadData();
    //modificarAlojamiento
    private Alojamiento aloSelec = new Alojamiento();
    private AlojamientoData aloSelecData = new AlojamientoData();
    private CiudadData buscarCiuModData = new CiudadData();
    private Alojamiento alojamientoMod=null;
    private AlojamientoData aloModData= new AlojamientoData();
    //paraBorrarAlojamiento
    private AlojamientoData borrarAloData = new AlojamientoData();
    private AlojamientoData buscarAloData = new AlojamientoData();
    //para modificarTransporte
    private Pasaje tranSelec = new Pasaje();
    private PasajeData tranSelecData = new PasajeData();
    private Pasaje pasajenew = null;
    private Pasaje transporteMod = null;
    //para agregar paquete
    private Paquete paquetenew = null;
    
    public PanelAdmin2() {
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
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCiudades = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextCiudad = new javax.swing.JTextField();
        jTextPais = new javax.swing.JTextField();
        jTextProvincia = new javax.swing.JTextField();
        jbAgregarCiu = new javax.swing.JButton();
        jbModificarCiu = new javax.swing.JButton();
        jbEliminarCiu = new javax.swing.JButton();
        jbSalirCiu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botonEstadoCiudad = new javax.swing.JRadioButton();
        jbLimpiarCiu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAlojamientos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextCiudadAlo = new javax.swing.JTextField();
        jTextTipoAlo = new javax.swing.JTextField();
        jTextCostoAlo = new javax.swing.JTextField();
        jTextServicioAlo = new javax.swing.JTextField();
        jbAgregarAlo = new javax.swing.JButton();
        jbModificarAlo = new javax.swing.JButton();
        jbEliminarAlo = new javax.swing.JButton();
        jbSalirAlo = new javax.swing.JButton();
        jbLimpiarAlo = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFechaIng = new javax.swing.JTextField();
        jTextFechaEgr = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextIdCiudadDes = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jbSeleccionarDeTabla = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTransportes = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextTipoTransp = new javax.swing.JTextField();
        jTextPrecioTransp = new javax.swing.JTextField();
        jTextCiudadOrigenTransp = new javax.swing.JTextField();
        jbAgregarTran = new javax.swing.JButton();
        jbModificarTran = new javax.swing.JButton();
        jbEliminarTran = new javax.swing.JButton();
        jbSalirTran = new javax.swing.JButton();
        jbLimpiarTran = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jTextIDPasaje = new javax.swing.JTextField();
        jbSelecTran = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jTIDciudadOrigen = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtPaquetes = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextCiuOrgPaq = new javax.swing.JTextField();
        jTextCiuDesPaq = new javax.swing.JTextField();
        jTextAlojamientoPaq = new javax.swing.JTextField();
        jTextTransportePaq = new javax.swing.JTextField();
        jbAgregarPaq = new javax.swing.JButton();
        jbModificarPaq = new javax.swing.JButton();
        jbEliminarPaq = new javax.swing.JButton();
        jbSalirPaq = new javax.swing.JButton();
        jbLimpiarPaq = new javax.swing.JButton();
        jbSelecPaq = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextCanPers = new javax.swing.JTextField();
        jLImporte = new javax.swing.JLabel();
        jbcalcular = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(10, 52, 80));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Panel Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jtCiudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Ciudad", "Pais", "Provincia", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jtCiudades);

        jLabel2.setText("Ciudad:");

        jLabel3.setText("Pais:");

        jLabel4.setText("Provincia/Estado/Region:");

        jTextCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCiudadActionPerformed(evt);
            }
        });
        jTextCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextCiudadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCiudadKeyTyped(evt);
            }
        });

        jTextPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPaisActionPerformed(evt);
            }
        });
        jTextPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPaisKeyTyped(evt);
            }
        });

        jTextProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextProvinciaActionPerformed(evt);
            }
        });
        jTextProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextProvinciaKeyTyped(evt);
            }
        });

        jbAgregarCiu.setText("Agregar");
        jbAgregarCiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarCiuActionPerformed(evt);
            }
        });

        jbModificarCiu.setText("Modificar");
        jbModificarCiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarCiuActionPerformed(evt);
            }
        });

        jbEliminarCiu.setText("Eliminar");
        jbEliminarCiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarCiuActionPerformed(evt);
            }
        });

        jbSalirCiu.setText("Salir");
        jbSalirCiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirCiuActionPerformed(evt);
            }
        });

        jLabel5.setText("Estado:");

        jbLimpiarCiu.setText("Limpiar");
        jbLimpiarCiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCiuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbLimpiarCiu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbAgregarCiu)
                                .addGap(113, 113, 113)
                                .addComponent(jbModificarCiu)
                                .addGap(118, 118, 118))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextPais, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(botonEstadoCiudad))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(jTextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)))
                        .addComponent(jbEliminarCiu)
                        .addGap(92, 92, 92)
                        .addComponent(jbSalirCiu)
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEstadoCiudad)
                    .addComponent(jLabel5))
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregarCiu)
                    .addComponent(jbModificarCiu)
                    .addComponent(jbEliminarCiu)
                    .addComponent(jbSalirCiu)
                    .addComponent(jbLimpiarCiu))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ciudades", jPanel2);

        jtAlojamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Ciudad", "Tipo", "Costo Diario", "Servicios"
            }
        ));
        jScrollPane2.setViewportView(jtAlojamientos);

        jLabel6.setText("Ciudad:");

        jLabel7.setText("Tipo:");

        jLabel8.setText("Costo:");

        jLabel9.setText("Servicio:");

        jTextCiudadAlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCiudadAloActionPerformed(evt);
            }
        });
        jTextCiudadAlo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCiudadAloKeyTyped(evt);
            }
        });

        jTextTipoAlo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTipoAloKeyTyped(evt);
            }
        });

        jTextCostoAlo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCostoAloKeyTyped(evt);
            }
        });

        jTextServicioAlo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextServicioAloKeyTyped(evt);
            }
        });

        jbAgregarAlo.setText("Agregar");
        jbAgregarAlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAloActionPerformed(evt);
            }
        });

        jbModificarAlo.setText("Modificar");
        jbModificarAlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarAloActionPerformed(evt);
            }
        });

        jbEliminarAlo.setText("Eliminar");
        jbEliminarAlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarAloActionPerformed(evt);
            }
        });

        jbSalirAlo.setText("Salir");
        jbSalirAlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirAloActionPerformed(evt);
            }
        });

        jbLimpiarAlo.setText("Limpiar");
        jbLimpiarAlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarAloActionPerformed(evt);
            }
        });

        jLabel17.setText("Fecha de Ingreso:");

        jLabel18.setText("Fecha de Egreso:");

        jTextFechaIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFechaIngActionPerformed(evt);
            }
        });

        jTextFechaEgr.setToolTipText("");
        jTextFechaEgr.setName(""); // NOI18N
        jTextFechaEgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFechaEgrActionPerformed(evt);
            }
        });

        jLabel19.setText("ID Ciudad Destino:");

        jTextIdCiudadDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdCiudadDesActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel20.setText("Para AGREGAR un Alojamiento el campo de ID es Obligatorio(*).");

        jLabel21.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel21.setText("* : Campo obligatorio");

        jLabel22.setText("*");

        jLabel23.setText("*");

        jLabel24.setText("*");

        jLabel25.setText("*");

        jLabel26.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel26.setText("Formato para la FECHA: AAAA-MM-dd");

        jLabel27.setText("*");

        jbSeleccionarDeTabla.setText("Seleccionar");
        jbSeleccionarDeTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarDeTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jbLimpiarAlo))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTextCostoAlo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 6, Short.MAX_VALUE)
                                        .addComponent(jbAgregarAlo)
                                        .addGap(76, 76, 76)
                                        .addComponent(jbSeleccionarDeTabla)
                                        .addGap(69, 69, 69))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextCiudadAlo, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(jTextTipoAlo)
                                    .addComponent(jTextIdCiudadDes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(jbSalirAlo))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextServicioAlo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFechaIng, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFechaEgr, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jbModificarAlo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEliminarAlo)
                                .addGap(128, 128, 128))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextServicioAlo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextIdCiudadDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextCiudadAlo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextTipoAlo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25)
                    .addComponent(jLabel17)
                    .addComponent(jTextFechaIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextCostoAlo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel18)
                    .addComponent(jTextFechaEgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregarAlo)
                    .addComponent(jbModificarAlo)
                    .addComponent(jbEliminarAlo)
                    .addComponent(jbSalirAlo)
                    .addComponent(jbLimpiarAlo)
                    .addComponent(jbSeleccionarDeTabla))
                .addGap(80, 80, 80))
        );

        jTabbedPane1.addTab("Alojamientos", jPanel3);

        jtTransportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Transporte", "Precio", "Ciudad de Origen"
            }
        ));
        jScrollPane3.setViewportView(jtTransportes);

        jLabel10.setText("Tipo de Transporte:");

        jLabel11.setText("Precio:");

        jLabel12.setText("Ciudad de Origen:");

        jTextTipoTransp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTipoTranspKeyTyped(evt);
            }
        });

        jTextPrecioTransp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPrecioTranspKeyTyped(evt);
            }
        });

        jTextCiudadOrigenTransp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCiudadOrigenTranspKeyTyped(evt);
            }
        });

        jbAgregarTran.setText("Agregar");
        jbAgregarTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarTranActionPerformed(evt);
            }
        });

        jbModificarTran.setText("Modificar");
        jbModificarTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarTranActionPerformed(evt);
            }
        });

        jbEliminarTran.setText("Eliminar");
        jbEliminarTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarTranActionPerformed(evt);
            }
        });

        jbSalirTran.setText("Salir");
        jbSalirTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirTranActionPerformed(evt);
            }
        });

        jbLimpiarTran.setText("Limpiar");
        jbLimpiarTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarTranActionPerformed(evt);
            }
        });

        jLabel28.setText("ID Pasaje:");

        jTextIDPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDPasajeActionPerformed(evt);
            }
        });

        jbSelecTran.setText("Seleccionar");
        jbSelecTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecTranActionPerformed(evt);
            }
        });

        jLabel29.setText("ID Ciudad Origen:");

        jTIDciudadOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTIDciudadOrigenKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel30.setText("Para AGREGAR un Pasaje el campo de ID Ciudad Origen es Obligatorio(*).");

        jLabel31.setText("*");

        jLabel32.setText("*");

        jLabel33.setText("*");

        jLabel34.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel34.setText("* : Campo obligatorio");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimpiarTran)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jbAgregarTran)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addComponent(jbSelecTran)
                                .addGap(77, 77, 77)
                                .addComponent(jbModificarTran)
                                .addGap(64, 64, 64)
                                .addComponent(jbEliminarTran)
                                .addGap(64, 64, 64)
                                .addComponent(jbSalirTran)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextTipoTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTIDciudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextIDPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel31))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel34)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextPrecioTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33)
                                        .addGap(19, 19, 19))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextCiudadOrigenTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(400, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextIDPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPrecioTransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel33))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextCiudadOrigenTransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIDciudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTipoTransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel32))
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregarTran)
                    .addComponent(jbModificarTran)
                    .addComponent(jbEliminarTran)
                    .addComponent(jbSalirTran)
                    .addComponent(jbLimpiarTran)
                    .addComponent(jbSelecTran))
                .addGap(75, 75, 75))
        );

        jTabbedPane1.addTab("Transportes", jPanel4);

        jtPaquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ciudad Origen", "Ciudad Destino", "Alojamiento", "Transporte"
            }
        ));
        jScrollPane4.setViewportView(jtPaquetes);

        jLabel13.setText("ID Ciudad de Origen:");

        jLabel14.setText("ID Ciudad de Destino:");

        jLabel15.setText("ID Alojamiento:");

        jLabel16.setText("ID Transporte:");

        jTextCiuOrgPaq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCiuOrgPaqKeyTyped(evt);
            }
        });

        jTextCiuDesPaq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCiuDesPaqKeyTyped(evt);
            }
        });

        jTextAlojamientoPaq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAlojamientoPaqKeyTyped(evt);
            }
        });

        jTextTransportePaq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTransportePaqKeyTyped(evt);
            }
        });

        jbAgregarPaq.setText("Agregar");
        jbAgregarPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarPaqActionPerformed(evt);
            }
        });

        jbModificarPaq.setText("Modificar");
        jbModificarPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarPaqActionPerformed(evt);
            }
        });

        jbEliminarPaq.setText("Eliminar");
        jbEliminarPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarPaqActionPerformed(evt);
            }
        });

        jbSalirPaq.setText("Salir");
        jbSalirPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirPaqActionPerformed(evt);
            }
        });

        jbLimpiarPaq.setText("Limpiar");
        jbLimpiarPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarPaqActionPerformed(evt);
            }
        });

        jbSelecPaq.setText("Seleccionar");
        jbSelecPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecPaqActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel35.setText("Para AGREGAR un paquete TODOS los campos son obligatorios (*).");

        jLabel36.setText("*");

        jLabel37.setText("*");

        jLabel38.setText("*");

        jLabel39.setText("*");

        jLabel40.setText("Precio por Paquete:");

        jLabel41.setText("Cantidad de Personas:");

        jTextCanPers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCanPersKeyTyped(evt);
            }
        });

        jLImporte.setText("Importe");

        jbcalcular.setText("Calcular");
        jbcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextTransportePaq, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jTextAlojamientoPaq)
                            .addComponent(jTextCiuDesPaq)
                            .addComponent(jTextCiuOrgPaq))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37))
                                .addGap(141, 141, 141)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel40)
                                    .addComponent(jbcalcular))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCanPers, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbLimpiarPaq)
                        .addGap(54, 54, 54)
                        .addComponent(jbSelecPaq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jbAgregarPaq)
                        .addGap(82, 82, 82)
                        .addComponent(jbModificarPaq)
                        .addGap(70, 70, 70)
                        .addComponent(jbEliminarPaq)
                        .addGap(57, 57, 57)
                        .addComponent(jbSalirPaq)
                        .addGap(38, 38, 38))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextCiuOrgPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel40)
                    .addComponent(jLImporte))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextCiuDesPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jTextCanPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jbcalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextAlojamientoPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextTransportePaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(53, 53, 53)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregarPaq)
                    .addComponent(jbModificarPaq)
                    .addComponent(jbEliminarPaq)
                    .addComponent(jbSalirPaq)
                    .addComponent(jbLimpiarPaq)
                    .addComponent(jbSelecPaq))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Paquetes", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPaisActionPerformed

    private void jTextProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextProvinciaActionPerformed

    private void jbModificarCiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarCiuActionPerformed
         try {
            int filaSeleccionada = jtCiudades.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Selecciona una fila para modificar.");
                return;
            }

            Ciudad ciudadOriginal = new Ciudad();

            ciudadOriginal.setIdCiudad((int) jtCiudades.getValueAt(filaSeleccionada, 0));
            ciudadOriginal.setNombre((String) jtCiudades.getValueAt(filaSeleccionada, 1));
            ciudadOriginal.setPais((String) jtCiudades.getValueAt(filaSeleccionada, 2));
            ciudadOriginal.setProvincia((String) jtCiudades.getValueAt(filaSeleccionada, 3));
            ciudadOriginal.setEstado((boolean) jtCiudades.getValueAt(filaSeleccionada, 4));

            // Modifica los atributos de la ciudad
            
            String nuevoNombre = obtenerNuevoValor("Nuevo nombre de la ciudad:", ciudadOriginal.getNombre());
            if (nuevoNombre != null) {
                ciudadOriginal.setNombre(nuevoNombre);
            }

            String nuevoPais = obtenerNuevoValor("Nuevo país:", ciudadOriginal.getPais());
            if (nuevoPais != null) {
                ciudadOriginal.setPais(nuevoPais);
            }

            String nuevaProvincia = obtenerNuevoValor("Nueva provincia:", ciudadOriginal.getProvincia());
            if (nuevaProvincia != null) {
                ciudadOriginal.setProvincia(nuevaProvincia);
            }

            boolean nuevoEstado = (boolean) jtCiudades.getValueAt(filaSeleccionada, 4);

// Verifica si se ha realizado un cambio en el estado
            if (nuevoEstado != ciudadOriginal.isEstado()) {
                ciudadOriginal.setEstado(nuevoEstado);
            }

            // Luego, actualiza la base de datos con la ciudad modificada
            ciuDataMod.modificarCiudad(ciudadOriginal);
            limpiarCiudad();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números.");
        }
       
    }//GEN-LAST:event_jbModificarCiuActionPerformed

    
     private String obtenerNuevoValor(String mensaje, String valorActual) {

        return valorActual;
    }
    private void jTextCiudadAloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCiudadAloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCiudadAloActionPerformed

    private void jbModificarAloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarAloActionPerformed
        //Para modificar tendra que mostrar id en ciudad (listo) y rescatar los dos primero caracteres
        //de ciudad siendo el ID para buscar la ciudad y completar el alojamiento nuevo
        //una vez teniendo el alojamiento a cada valor del mismo se lo pasamos a los
        //jTextField respectivos para poder modificar
        
        try {
            //indice de tabla
            int selectedRow = jtAlojamientos.getSelectedRow();
            //creo un objeto en base al valor de la tabla modelo2 de columna 0 y fila seleccionada
            Object valorDTabla = modelo2.getValueAt(selectedRow, 0);
            //transformo ese valor en un int
            int idAloja = Integer.parseInt(valorDTabla.toString());
            
            int idCiudad = Integer.parseInt(jTextIdCiudadDes.getText());
            
            String nombre = jTextCiudadAlo.getText();//innecesario para AgregarAlojamiento
            String tipoAlo = jTextTipoAlo.getText();
            String costoAlo = jTextCostoAlo.getText();
            String servicioAlo = jTextServicioAlo.getText();
            String fechaIng = jTextFechaIng.getText();
            String fechaEgr = jTextFechaEgr.getText();

            // Verificar si hay campos vacíos
            if ( jTextIdCiudadDes.getText().isEmpty() || tipoAlo.isEmpty() || costoAlo.isEmpty() || fechaIng.isEmpty() || fechaEgr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo Obligatorio vacio");
                return;
            }

            // Dar formato a las fechas que se ingresan por los campos de fecha
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Formato en el que se deben ingresar las fechas

            LocalDate fecha1 = null;
            LocalDate fecha2 = null;
            double costoA = 0.0;
            Ciudad ciudadDesMod = buscarCiuModData.buscarCiudadParaLista(idCiudad);

            try {
                // Convierte las cadenas en objetos LocalDate
                fecha1 = LocalDate.parse(fechaIng, formato);
                fecha2 = LocalDate.parse(fechaEgr, formato);
                // Convierte el costo a tipo double
                costoA = Double.parseDouble(costoAlo);
            } catch (DateTimeParseException e) {
                // Excepción cuando no se ingresa el formato correcto
                JOptionPane.showMessageDialog(this, "El formato de la fecha es incorrecto");
                return; // Sale del método si hay un error en el formato de la fecha
            }

            if (alojamientoMod == null) {
                // Crear un objeto Alojamiento con los datos ingresados
                //nombre debe ser un objeto tipo ciudad
                Alojamiento alojamientoMod = new Alojamiento(idAloja ,fecha1, fecha2, true, servicioAlo, costoA, ciudadDesMod, tipoAlo);
                aloModData.modificarAlojamiento(alojamientoMod);
            }
            //se vuelven a habilitar una vez terminada la modificacion
            jTextIdCiudadDes.setEnabled(true);
            jTextCiudadAlo.setEnabled(true);
            cargarAlojamientos();
            limpiarAlojamiento();

        
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados");//ya sea por el formato o el costo que debe ser un double
        }
       
        
    }//GEN-LAST:event_jbModificarAloActionPerformed

    private void jbSalirTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirTranActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbSalirTranActionPerformed

    private void jbSalirPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirPaqActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbSalirPaqActionPerformed

    private void jbSalirCiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirCiuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbSalirCiuActionPerformed

    private void jbSalirAloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirAloActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbSalirAloActionPerformed

    private void jbAgregarPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarPaqActionPerformed
        
        try{
        String idCiuOr =jTextCiuOrgPaq.getText();
        String idCiuDest = jTextCiuDesPaq.getText();
        String idalojamiento = jTextAlojamientoPaq.getText();
        String idtransporte = jTextTransportePaq.getText();

        if(idCiuOr.isEmpty()|| idCiuDest.isEmpty() || idalojamiento.isEmpty() || idtransporte.isEmpty()){
            JOptionPane.showMessageDialog(this, "Campo Obligatorio vacio");
                return;

        }
        //transformar los String en INT para poder usar en los metodos y pasar a PAQUETE()
        int idCiuOri = Integer.parseInt(idCiuOr);
        int idCiuDesti = Integer.parseInt(idCiuDest);
        int idAlojamiento = Integer.parseInt(idalojamiento);
        int idTransporte = Integer.parseInt(idtransporte);
        Ciudad ciudadOr = cData.buscarCiudadParaLista(idCiuOri);
        Ciudad ciudadDest = cData.buscarCiudadParaLista(idCiuDesti);
        Alojamiento alo = aloData.buscarAlojamiento(idAlojamiento);
        Pasaje pas = tData.buscarPasaje(idTransporte);

        if (paquetenew == null){
            Paquete paquetenew = new Paquete(ciudadOr, ciudadDest, alo, pas);
            pData.guardarPaquete(paquetenew);

        }

        cargarPaquetes();
        limpiarPaquetes();


       }catch(IllegalArgumentException e){
           JOptionPane.showMessageDialog(this, "Error en los datos ingresados");

       }
        
    }//GEN-LAST:event_jbAgregarPaqActionPerformed

    private void jbModificarPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarPaqActionPerformed
        
        try {
            //indice de tabla
            int selectedRow = jtPaquetes.getSelectedRow();
            //creo un objeto en base al valor de la tabla modelo4(Paquetes) de columna 0 y fila seleccionada
            Object valorDTabla = modelo4.getValueAt(selectedRow, 0);
            //transformo ese valor en un int
            int idPaq = Integer.parseInt(valorDTabla.toString());
            String idCiuOr = jTextCiuOrgPaq.getText();
            String idCiuDest = jTextCiuDesPaq.getText();
            String idalojamiento = jTextAlojamientoPaq.getText();
            String idtransporte = jTextTransportePaq.getText();

            if (idCiuOr.isEmpty() || idCiuDest.isEmpty() || idalojamiento.isEmpty() || idtransporte.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo Obligatorio vacio");
                return;

            }
            //transformar los String en INT para poder usar en los metodos y pasar a PAQUETE()
            int idCiuOri = Integer.parseInt(idCiuOr);
            int idCiuDesti = Integer.parseInt(idCiuDest);
            int idAlojamiento = Integer.parseInt(idalojamiento);
            int idTransporte = Integer.parseInt(idtransporte);
            Ciudad ciudadOr = cData.buscarCiudadParaLista(idCiuOri);//corregir
            Ciudad ciudadDest = cData.buscarCiudadParaLista(idCiuDesti);
            Alojamiento alo = aloData.buscarAlojamiento(idAlojamiento);
            Pasaje pas = tData.buscarPasaje(idTransporte);
            paquetenew = null;
            if (paquetenew == null) {
                Paquete paquetenew = new Paquete(idPaq,ciudadOr, ciudadDest, alo, pas);
                pData.modificarPaquete(paquetenew);

            }
jTextCiuOrgPaq.setEnabled(true);
jTextCiuDesPaq.setEnabled(true);
            cargarPaquetes();
            limpiarPaquetes();

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados");

        }
    }//GEN-LAST:event_jbModificarPaqActionPerformed

    private void jbEliminarPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarPaqActionPerformed
        int indice = jtPaquetes.getSelectedRow();
        String idalojamiento = jtPaquetes.getValueAt(indice, 3).toString();
        String idtransporte = jtPaquetes.getValueAt(indice, 4).toString();
        int idA; int idT;
        int ip = idalojamiento.indexOf(")");
        String parteidA = idalojamiento.substring(0, ip);
        idA = Integer.parseInt(parteidA);
        int ip2 = idtransporte.indexOf(")");
        String parteidT = idtransporte.substring(0, ip2);
        idT = Integer.parseInt(parteidT);
                
        
        
        pData.borrarPaquete(idA, idT);
        cargarPaquetes();
        limpiarPaquetes();
    }//GEN-LAST:event_jbEliminarPaqActionPerformed

    private void jbAgregarCiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarCiuActionPerformed
        //El codigo funciona pero en los campos de string deja poner numeros
        //se puede solucionar?
        
        
        try{
        
        String nombre = jTextCiudad.getText();
        String pais = jTextPais.getText();
        String provincia = jTextProvincia.getText();
        Boolean estado=botonEstadoCiudad.isSelected();
        
        if(nombre.isEmpty()||pais.isEmpty() || provincia.isEmpty() || (estado.booleanValue()==false)){
            JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
            return;
        
        }
        
        
        if(ciudadnew==null){
        
            ciudadnew= new Ciudad(nombre, pais, estado, provincia);
            ciuData.guardarCiudad(ciudadnew);
        }
        
        }catch(IllegalArgumentException ex){//creo que no es el catch correcto
            //cambio "NumerFormatException" por "IllegalArgumentException"
            //no sale ningun msj
            JOptionPane.showMessageDialog(this, "Los campos solo reciben letras");
        
        }
        cargarCiudades();
        limpiarCiudad();
    }//GEN-LAST:event_jbAgregarCiuActionPerformed

    private void jbEliminarCiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarCiuActionPerformed
        
        int indice = jtCiudades.getSelectedRow();//creo una variable indice y le doy el valor de la fila seleccionada
        int idciudad = Integer.parseInt(jtCiudades.getValueAt(indice,0).toString());
        String nombre = jtCiudades.getValueAt(indice,1).toString();
        String pais = jtCiudades.getValueAt(indice,2).toString();
        String provincia = jtCiudades.getValueAt(indice,3).toString();
        Boolean estado = (Boolean) jtCiudades.getValueAt(indice, 4);
        Ciudad ciudadSelec = new Ciudad(idciudad,nombre,pais,estado,provincia);
        System.out.println(ciudadSelec);//hasta aqui crea la ciudadSelec
        borrarCiuData.borrarCiudad(ciudadSelec);//no la borra
        
        cargarCiudades();//no me refresca la tabla porque no borra nada
        limpiarCiudad();
    }//GEN-LAST:event_jbEliminarCiuActionPerformed

    private void jbAgregarAloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarAloActionPerformed

        try {
            String idCiudad = jTextIdCiudadDes.getText();
//            String nombre = jTextCiudadAlo.getText();//innecesario para AgregarAlojamiento
            String tipoAlo = jTextTipoAlo.getText();
            String costoAlo = jTextCostoAlo.getText();
            String servicioAlo = jTextServicioAlo.getText();
            String fechaIng = jTextFechaIng.getText();
            String fechaEgr = jTextFechaEgr.getText();

            // Verificar si hay campos vacíos
            if ( idCiudad.isEmpty() || tipoAlo.isEmpty() || costoAlo.isEmpty() || fechaIng.isEmpty() || fechaEgr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo Obligatorio vacio");
                return;
            }

            // Dar formato a las fechas que se ingresan por los campos de fecha
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Formato en el que se deben ingresar las fechas

            LocalDate fecha1 = null;
            LocalDate fecha2 = null;
            double costoA = 0.0;
            int iDCiudad = Integer.parseInt(idCiudad);
            Ciudad ciudadDes = buscarCiuData.buscarCiudadParaLista(iDCiudad);

            try {
                // Convierte las cadenas en objetos LocalDate
                fecha1 = LocalDate.parse(fechaIng, formato);
                fecha2 = LocalDate.parse(fechaEgr, formato);
                // Convierte el costo a tipo double
                costoA = Double.parseDouble(costoAlo);
            } catch (DateTimeParseException e) {
                // Excepción cuando no se ingresa el formato correcto
                JOptionPane.showMessageDialog(this, "El formato de la fecha es incorrecto");
                return; // Sale del método si hay un error en el formato de la fecha
            }

            if (alojamientonew == null) {
                // Crear un objeto Alojamiento con los datos ingresados
                //nombre debe ser un objeto tipo ciudad
                Alojamiento alojamientonew = new Alojamiento(fecha1, fecha2, true, servicioAlo, costoA, ciudadDes, tipoAlo);
                
                aloData.guardarAlojamiento(alojamientonew);
            }
            cargarAlojamientos();
            limpiarAlojamiento();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los campos solo deben contener números");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados");//ya sea por el formato o el costo que debe ser un double
        }

    }//GEN-LAST:event_jbAgregarAloActionPerformed

    private void jbEliminarAloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarAloActionPerformed
        //para eliminar necesitamos la id, entonces tomaremos el valor seleccionado de la tabla
        //necesito scar ese valor dado el indice de seleccion en la tabla
        int indice = jtAlojamientos.getSelectedRow();//creo una variable indice y le doy el valor de la fila seleccionada
        //dado el indice creo una variable donde le designo el valor en la posicion de indice y columna 0 (ID)
        int idalojamiento = Integer.parseInt(jtAlojamientos.getValueAt(indice,0).toString());

        //teniendo el idalojamiento lo uso para borrar el alojamiento 
        borrarAloData.eliminarAlojamiento(idalojamiento);//le paso el valor tomado del alo seleccionado
        
        cargarAlojamientos();
        limpiarAlojamiento();
    }//GEN-LAST:event_jbEliminarAloActionPerformed

    private void jbAgregarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarTranActionPerformed
       try{
        String idCiudad = jTIDciudadOrigen.getText();
        
        String tipoPasaje = jTextTipoTransp.getText();
        String precioPasaje = jTextPrecioTransp.getText();
        String ciuOrigen = jTextCiudadOrigenTransp.getText();
        
        if (idCiudad.isEmpty() || tipoPasaje.isEmpty() || precioPasaje.isEmpty()){
                JOptionPane.showMessageDialog(this, "Campo Obligatorio vacio");
                return;
            }
        
        
        double costoT = 0.0;
        costoT = Double.parseDouble(precioPasaje);
        int IDciudad = Integer.parseInt(idCiudad);
        Ciudad ciudadOr = buscarCiuData.buscarCiudadParaLista(IDciudad);
        
        
        if (pasajenew == null){
            Pasaje pasajenew = new Pasaje(tipoPasaje, costoT, ciudadOr, true);
            System.out.println(pasajenew);
            tData.guardarPasaje(pasajenew);
        
        }
        
       
           
       
        cargarTransportes();
        limpiarTransporte();
        
       }catch(NumberFormatException x){
       
           JOptionPane.showMessageDialog(this, "Datos incorrectos");
       }catch(IllegalArgumentException e){
           JOptionPane.showMessageDialog(this, "Error en los datos ingresados");
                   
       }

    }//GEN-LAST:event_jbAgregarTranActionPerformed

    private void jbModificarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarTranActionPerformed
        try {
            //indice de tabla
            int selectedRow = jtTransportes.getSelectedRow();
            //creo un objeto en base al valor de la tabla modelo2 de columna 0 y fila seleccionada
            Object valorDTabla = modelo3.getValueAt(selectedRow, 0);
            //transformo ese valor en un int
            int idTran = Integer.parseInt(valorDTabla.toString());
            
            int idCiudad = Integer.parseInt(jTIDciudadOrigen.getText());
            
            
            String tipoTran = jTextTipoTransp.getText();
            String costoTran = jTextPrecioTransp.getText();
            

            // Verificar si hay campos vacíos
            if (tipoTran.isEmpty() || costoTran.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo Obligatorio vacio");
                return;
            }

            
            double costoT = 0.0;
            Ciudad ciuOrigen = cData.buscarCiudadParaLista(idCiudad);

            
            costoT = Double.parseDouble(costoTran);
            

            if (transporteMod == null) {
                // Crear un objeto Alojamiento con los datos ingresados
                //nombre debe ser un objeto tipo ciudad
               Pasaje transporteMod = new Pasaje(idTran, tipoTran, costoT, ciuOrigen, true);
                tData.modificarPasaje(transporteMod);
            }
            //se vuelven a habilitar una vez terminada la modificacion
            jTextCiudadOrigenTransp.setEnabled(true);
            jTextIDPasaje.setEnabled(true);
            jTIDciudadOrigen.setEnabled(true);
            
            cargarTransportes();
            limpiarTransporte();

        
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados");//ya sea por el formato o el costo que debe ser un double
        }
    }//GEN-LAST:event_jbModificarTranActionPerformed

    private void jbEliminarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarTranActionPerformed
        //para eliminar necesitamos la id, entonces tomaremos el valor seleccionado de la tabla
        //necesito scar ese valor dado el indice de seleccion en la tabla
        int indice = jtTransportes.getSelectedRow();//creo una variable indice y le doy el valor de la fila seleccionada
        //dado el indice creo una variable donde le designo el valor en la posicion de indice y columna 0 (ID)
        int idpasaje = Integer.parseInt(jtTransportes.getValueAt(indice, 0).toString());
        Pasaje pnew = tData.buscarPasaje(idpasaje);
        
        //teniendo el idpasaje lo uso para borrar el pasaje
        tData.eliminarPasaje(pnew);
        
        cargarTransportes();
        limpiarTransporte();
        
        
    }//GEN-LAST:event_jbEliminarTranActionPerformed

    private void jbLimpiarCiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarCiuActionPerformed
        limpiarCiudad();
    }//GEN-LAST:event_jbLimpiarCiuActionPerformed

    private void jbLimpiarAloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarAloActionPerformed
        limpiarAlojamiento();
        jTextIdCiudadDes.setEnabled(true);jTextCiudadAlo.setEnabled(true);
    }//GEN-LAST:event_jbLimpiarAloActionPerformed

    private void jbLimpiarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarTranActionPerformed
        limpiarTransporte();
        jTextIDPasaje.setEnabled(true);jTextCiudadOrigenTransp.setEnabled(true);jTIDciudadOrigen.setEnabled(true);
    }//GEN-LAST:event_jbLimpiarTranActionPerformed

    private void jbLimpiarPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarPaqActionPerformed
        limpiarPaquetes();
    }//GEN-LAST:event_jbLimpiarPaqActionPerformed

    private void jTextCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCiudadActionPerformed

    private void jTextCiudadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCiudadKeyPressed
       
    }//GEN-LAST:event_jTextCiudadKeyPressed

    private void jTextCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCiudadKeyTyped
        char c = evt.getKeyChar();
    
    if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
        // Permite letras, espacios en blanco y teclas de control (como borrar).
        
    } else {
        evt.consume();  // Consumir el evento para evitar que se ingresen otros caracteres.
    }
    }//GEN-LAST:event_jTextCiudadKeyTyped

    private void jTextPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPaisKeyTyped
       char c = evt.getKeyChar();
    
    if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
        // Permite letras, espacios en blanco y teclas de control (como borrar).
        
    } else {
        evt.consume();  // Consumir el evento para evitar que se ingresen otros caracteres.
    }
    }//GEN-LAST:event_jTextPaisKeyTyped

    private void jTextProvinciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextProvinciaKeyTyped
        char c = evt.getKeyChar();
    
    if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
        // Permite letras, espacios en blanco y teclas de control (como borrar).
        
    } else {
        evt.consume();  // Consumir el evento para evitar que se ingresen otros caracteres.
    }
    }//GEN-LAST:event_jTextProvinciaKeyTyped

    private void jTextCiudadAloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCiudadAloKeyTyped
        char c = evt.getKeyChar();
    
    if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
        // Permite letras, espacios en blanco y teclas de control (como borrar).
        
    } else {
        evt.consume();  // Consumir el evento para evitar que se ingresen otros caracteres.
    }
    }//GEN-LAST:event_jTextCiudadAloKeyTyped

    private void jTextTipoAloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTipoAloKeyTyped
        char c = evt.getKeyChar();
    
    if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
        // Permite letras, espacios en blanco y teclas de control (como borrar).
        
    } else {
        evt.consume();  // Consumir el evento para evitar que se ingresen otros caracteres.
    }
    }//GEN-LAST:event_jTextTipoAloKeyTyped

    private void jTextServicioAloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextServicioAloKeyTyped
        char c = evt.getKeyChar();
    
    if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
        // Permite letras, espacios en blanco y teclas de control (como borrar).
        
    } else {
        evt.consume();  // Consumir el evento para evitar que se ingresen otros caracteres.
    }
    }//GEN-LAST:event_jTextServicioAloKeyTyped

    private void jTextCostoAloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCostoAloKeyTyped

        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == '.' || c == ',' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextCostoAloKeyTyped

    private void jTextTipoTranspKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTipoTranspKeyTyped
        char c = evt.getKeyChar();
    
    if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
        // Permite letras, espacios en blanco y teclas de control (como borrar).
        
    } else {
        evt.consume();  // Consumir el evento para evitar que se ingresen otros caracteres.
    }
    }//GEN-LAST:event_jTextTipoTranspKeyTyped

    private void jTextPrecioTranspKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPrecioTranspKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == '.' || c == ',' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextPrecioTranspKeyTyped

    private void jTextCiudadOrigenTranspKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCiudadOrigenTranspKeyTyped
        char c = evt.getKeyChar();
    
    if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
        // Permite letras, espacios en blanco y teclas de control (como borrar).
        
    } else {
        evt.consume();  // Consumir el evento para evitar que se ingresen otros caracteres.
    }
    }//GEN-LAST:event_jTextCiudadOrigenTranspKeyTyped

    private void jTextCiuOrgPaqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCiuOrgPaqKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == '.' || c == ',' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextCiuOrgPaqKeyTyped

    private void jTextCiuDesPaqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCiuDesPaqKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == '.' || c == ',' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextCiuDesPaqKeyTyped

    private void jTextAlojamientoPaqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAlojamientoPaqKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == '.' || c == ',' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextAlojamientoPaqKeyTyped

    private void jTextTransportePaqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTransportePaqKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == '.' || c == ',' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextTransportePaqKeyTyped

    private void jTextFechaEgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFechaEgrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFechaEgrActionPerformed

    private void jTextIdCiudadDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdCiudadDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdCiudadDesActionPerformed

    private void jTextFechaIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFechaIngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFechaIngActionPerformed

    private void jbSeleccionarDeTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarDeTablaActionPerformed
        
        int indice = jtAlojamientos.getSelectedRow();//creo una variable indice y le doy el valor de la fila seleccionada
        //el valor que este en la columna ciudad lo necesito por el id al comienzo
        String idAloj = jtAlojamientos.getValueAt(indice, 0).toString();
        String ciudad = jtAlojamientos.getValueAt(indice, 1).toString();
        int idCiuDes;//seria la id de la ciudadDes
        //busco la posicion de ")"
        int indiceParentesis = ciudad.indexOf(")");
        //extraigo hasta")"
        String parteId = ciudad.substring(0, indiceParentesis);
        //transformo lo extraido en un int
        idCiuDes = Integer.parseInt(parteId);
        //creo una variable int y le asigno el valor de idAloj
        int idAlojInt = Integer.parseInt(idAloj);
        aloSelec = aloSelecData.buscarAlojamiento(idAlojInt);
        if (aloSelec != null) {
            jTextIdCiudadDes.setText(parteId);
            jTextIdCiudadDes.setEnabled(false);//una vez seteados no se podran modificar
            jTextCiudadAlo.setText(ciudad);
            jTextCiudadAlo.setEnabled(false);//una vez seteados no se podran modificar
            jTextTipoAlo.setText(aloSelec.getTipo());
            jTextCostoAlo.setText(String.valueOf(aloSelec.getImporteDiario()));
            jTextServicioAlo.setText(aloSelec.getServicio());
            jTextFechaIng.setText(aloSelec.getFechaIn().toString());
            jTextFechaEgr.setText(aloSelec.getFechaOn().toString());
        }
        
    }//GEN-LAST:event_jbSeleccionarDeTablaActionPerformed

    private void jTextIDPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDPasajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDPasajeActionPerformed

    private void jbSelecTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecTranActionPerformed
        
        int indice = jtTransportes.getSelectedRow();//creo una variable indice y le doy el valor de la fila seleccionada
        //el valor que este en la columna ciudad lo necesito por el id al comienzo
        String idAloj = jtTransportes.getValueAt(indice, 0).toString();
        String ciudad = jtTransportes.getValueAt(indice, 3).toString();
        
        int idCiuOr;//seria la id de la ciudadDes
        //busco la posicion de ")"
        int indiceParentesis = ciudad.indexOf(")");
        //extraigo hasta")"
        String parteId = ciudad.substring(0, indiceParentesis);//ID Ciudad de Origen
        //transformo lo extraido en un int
        idCiuOr = Integer.parseInt(parteId);
        //creo una variable int y le asigno el valor de idAloj
        int idAlojInt = Integer.parseInt(idAloj);
        tranSelec = tranSelecData.buscarPasaje(idAlojInt);//si la encuentra
        
        if (tranSelec != null) {
            jTIDciudadOrigen.setText(parteId);
            jTIDciudadOrigen.setEnabled(false);
            jTextIDPasaje.setText(String.valueOf(tranSelec.getIdPasaje()));
            jTextIDPasaje.setEnabled(false);//una vez seteados no se podran modificar
            jTextCiudadOrigenTransp.setText(ciudad);
            jTextCiudadOrigenTransp.setEnabled(false);//una vez seteados no se podran modificar
            jTextTipoTransp.setText(tranSelec.getTipoTransporte());
            jTextPrecioTransp.setText(String.valueOf(tranSelec.getImporte()));
            
        }
        
        
        
    }//GEN-LAST:event_jbSelecTranActionPerformed

    private void jTIDciudadOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDciudadOrigenKeyTyped
char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == '.' || c == ',' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_jTIDciudadOrigenKeyTyped

    private void jbSelecPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecPaqActionPerformed
        
        int indice = jtPaquetes.getSelectedRow();//creo una variable indice y le doy el valor de la fila seleccionada
        //el valor que este en la columna lo necesito por el id al comienzo
        String idCiuOr = jtPaquetes.getValueAt(indice, 1).toString();
        String idCiuDes = jtPaquetes.getValueAt(indice, 2).toString();
        String idAlo = jtPaquetes.getValueAt (indice,3).toString();
        String idTran = jtPaquetes.getValueAt (indice,4).toString();
        //int iCO; int iCD; int iA ; int iT;//variables para las id de cada columna a buscar
        //para ID CiuO
        int ipCO = idCiuOr.indexOf(")");//busco la posicion de ")"
        String parteIdCO = idCiuOr.substring(0, ipCO);//extraigo hasta")"
        //iCO = Integer.parseInt(parteIdCO);//transformo lo extraido en un int
        //para ID CiuD
        int ipCD = idCiuDes.indexOf(")");
        String parteIdCD = idCiuDes.substring(0, ipCD);
        //iCD = Integer.parseInt(parteIdCD);//transformo lo extraido en un int
        //para ID Alo
        int ipA = idAlo.indexOf(")");
        String parteIdA = idAlo.substring(0, ipA);
        //iA = Integer.parseInt(parteIdA);//transformo lo extraido en un int
        //para ID Tran
        int ipT = idTran.indexOf(")");
        String parteIdT = idTran.substring(0, ipT);
        //iT = Integer.parseInt(parteIdT);
        //seteo los jText
        jTextCiuOrgPaq.setText(parteIdCO);
        jTextCiuOrgPaq.setEnabled(false);
        jTextCiuDesPaq.setText(parteIdCD);
        jTextCiuDesPaq.setEnabled(false);
        jTextAlojamientoPaq.setText(parteIdA);
        jTextTransportePaq.setText(parteIdT);
        
    }//GEN-LAST:event_jbSelecPaqActionPerformed

    private void jbcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcalcularActionPerformed
        int selectedRow = jtPaquetes.getSelectedRow();
        Object idTabla = modelo4.getValueAt(selectedRow, 0);
        int canPer = Integer.parseInt(jTextCanPers.getText());
        int idPaq = Integer.parseInt("" + idTabla);
        Paquete paqnew = null;
        double importetotal = 0.0;
       
        if (paqnew==null){
            paqnew=pData.buscarPaquete(idPaq);
        }
        importetotal = pData.calcularPrecio(paqnew)*canPer;
        jLImporte.setText("" + importetotal);
    }//GEN-LAST:event_jbcalcularActionPerformed

    private void jTextCanPersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCanPersKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == '.' || c == ',' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextCanPersKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonEstadoCiudad;
    private javax.swing.JLabel jLImporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTIDciudadOrigen;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextAlojamientoPaq;
    private javax.swing.JTextField jTextCanPers;
    private javax.swing.JTextField jTextCiuDesPaq;
    private javax.swing.JTextField jTextCiuOrgPaq;
    private javax.swing.JTextField jTextCiudad;
    private javax.swing.JTextField jTextCiudadAlo;
    private javax.swing.JTextField jTextCiudadOrigenTransp;
    private javax.swing.JTextField jTextCostoAlo;
    private javax.swing.JTextField jTextFechaEgr;
    private javax.swing.JTextField jTextFechaIng;
    private javax.swing.JTextField jTextIDPasaje;
    private javax.swing.JTextField jTextIdCiudadDes;
    private javax.swing.JTextField jTextPais;
    private javax.swing.JTextField jTextPrecioTransp;
    private javax.swing.JTextField jTextProvincia;
    private javax.swing.JTextField jTextServicioAlo;
    private javax.swing.JTextField jTextTipoAlo;
    private javax.swing.JTextField jTextTipoTransp;
    private javax.swing.JTextField jTextTransportePaq;
    private javax.swing.JButton jbAgregarAlo;
    private javax.swing.JButton jbAgregarCiu;
    private javax.swing.JButton jbAgregarPaq;
    private javax.swing.JButton jbAgregarTran;
    private javax.swing.JButton jbEliminarAlo;
    private javax.swing.JButton jbEliminarCiu;
    private javax.swing.JButton jbEliminarPaq;
    private javax.swing.JButton jbEliminarTran;
    private javax.swing.JButton jbLimpiarAlo;
    private javax.swing.JButton jbLimpiarCiu;
    private javax.swing.JButton jbLimpiarPaq;
    private javax.swing.JButton jbLimpiarTran;
    private javax.swing.JButton jbModificarAlo;
    private javax.swing.JButton jbModificarCiu;
    private javax.swing.JButton jbModificarPaq;
    private javax.swing.JButton jbModificarTran;
    private javax.swing.JButton jbSalirAlo;
    private javax.swing.JButton jbSalirCiu;
    private javax.swing.JButton jbSalirPaq;
    private javax.swing.JButton jbSalirTran;
    private javax.swing.JButton jbSelecPaq;
    private javax.swing.JButton jbSelecTran;
    private javax.swing.JButton jbSeleccionarDeTabla;
    private javax.swing.JButton jbcalcular;
    private javax.swing.JTable jtAlojamientos;
    private javax.swing.JTable jtCiudades;
    private javax.swing.JTable jtPaquetes;
    private javax.swing.JTable jtTransportes;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraTabla1() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Pais");
        filaCabecera.add("Provincia");
        filaCabecera.add("Estado");
        for (Object it: filaCabecera){
            modelo1.addColumn(it);
        }
        jtCiudades.setModel(modelo1);
    }

private void armarCabeceraTabla2() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
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
        filaCabecera.add("ID");
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
        filaCabecera.add("ID");
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
    DefaultTableModel modelo = (DefaultTableModel) jtCiudades.getModel();
    modelo1.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos
    
    List<Ciudad> ciudades = cData.listarCiudad(); // Obtén la lista de todos los alojamientos disponibles
    
    for (Ciudad c : ciudades) {
        // Accede a los atributos de Alojamiento y agrega una fila a la tabla
        int id= c.getIdCiudad();
        String nombre = c.getNombre();
        String pais = c.getPais();
        String provincia = c.getProvincia();
        Boolean estado = c.isEstado();
        
        modelo1.addRow(new Object[]{id, nombre, pais, provincia, estado});
    }
    }



    //CARGA TODOS LOS ALOJAMIENTOS
    private void cargarAlojamientos() {
    DefaultTableModel modelo = (DefaultTableModel) jtAlojamientos.getModel();
    modelo2.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos
    
    List<Alojamiento> alojamientos = aData.listarAlojamientos(); // Obtén la lista de todos los alojamientos disponibles
    
    for (Alojamiento a : alojamientos) {
        // Accede a los atributos de Alojamiento y agrega una fila a la tabla
        int idAlo=a.getIdAlojamiento();
        String tipo = a.getTipo();
        String servicio = a.getServicio();
        double precio = a.getImporteDiario();
        Ciudad ciudad = a.getCiudadDest();
        modelo2.addRow(new Object[]{idAlo,ciudad, tipo, precio,servicio});
    }
    }
    
    //CARGA TODOS LOS Transportes
    private void cargarTransportes() {
    DefaultTableModel modelo = (DefaultTableModel) jtTransportes.getModel();
    modelo3.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos
    
    List<Pasaje> transportes = tData.listarPasajes(); // Obtén la lista de todos los alojamientos disponibles
    
    for (Pasaje a : transportes) {
        // Accede a los atributos de Alojamiento y agrega una fila a la tabla
        int idTransporte = a.getIdPasaje();
        String tipo = a.getTipoTransporte();
        double precio = a.getImporte();
        Ciudad ciudadOrigen = a.getNombreCiudadOrigen();
        modelo3.addRow(new Object[]{idTransporte,tipo, precio, ciudadOrigen});
    }
    }
    
    //CARGA TODOS LOS PAQUETES
    private void cargarPaquetes (){
    DefaultTableModel modelo = (DefaultTableModel) jtPaquetes.getModel();
    modelo4.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos
    
    List<Paquete> paquetes = pData.listarPaquetes(); // Obtén la lista de todos los alojamientos disponibles
    
    for (Paquete a : paquetes) {
        // Accede a los atributos de Alojamiento y agrega una fila a la tabla
        int idPaq = a.getIdPaquete();
        Ciudad ciudadOrigen = a.getOrigen();
        Ciudad ciudadDestino = a.getDestino();
        Alojamiento alojamiento = a.getAlojamiento();
        Pasaje transporte = a.getPasaje();
        
        
        

        modelo4.addRow(new Object[]{idPaq,ciudadOrigen, ciudadDestino,alojamiento,transporte});

    }

    }
    
        private void limpiarCiudad() {
        jTextCiudad.setText("");
        jTextPais.setText("");
        jTextProvincia.setText("");
        botonEstadoCiudad.setSelected(false);
    }
        
        private void limpiarAlojamiento() {
        jTextIdCiudadDes.setText("");
        jTextCiudadAlo.setText("");
        jTextTipoAlo.setText("");
        jTextCostoAlo.setText("");
        jTextServicioAlo.setText("");
        jTextFechaIng.setText("");
        jTextFechaEgr.setText("");
    }
            
        private void limpiarTransporte() {
        jTextIDPasaje.setText("");
        jTextTipoTransp.setText("");
        jTextPrecioTransp.setText("");
        jTextCiudadOrigenTransp.setText("");
        jTIDciudadOrigen.setText("");
    }
                
    private void limpiarPaquetes() {
        jTextCiuOrgPaq.setText("");
        jTextCiuDesPaq.setText("");
        jTextAlojamientoPaq.setText("");
        jTextTransportePaq.setText("");
        jTextCiuOrgPaq.setEnabled(true);
        jTextCiuDesPaq.setEnabled(true);
    }


}
