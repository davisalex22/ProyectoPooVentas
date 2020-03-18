package Ventanas;

/**
 * @author davisalex22
 */
// Importacion de librerias
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaProductos extends javax.swing.JFrame {

    // Variables para Borrar Fila de Tabla Stock
    String ID_Producto = "", NombreProducto = "",TipoProducto = "";
    int Cantidad = 0;
    double Precio = 0;
    // Variables para Borrar Fila de Tabla Venta
    String ID_ProductoVenta = "";
    String NombreProductoVenta = "";
    int CantidadVenta = 0;
    double IvaProducto = 0, PrecioTotal = 0;
    // Variables Generales del Programa
    int filaSeleccionada;
    double total = 0, ivaTotal = 0, importe = 0, totalPagar = 0, totalCambio = 0;
    // DecimalFormat para delimitar numero de decimales           
    DecimalFormat df = new DecimalFormat("#0.00");
    // Creacion de ArrayList para almacenamiento de productos
    ArrayList<Stock> lista = new ArrayList<Stock>();
    ArrayList<Venta> listaVenta = new ArrayList<Venta>();

    public VentanaProductos() {
        initComponents();
        this.setLocationRelativeTo(null);// Control de ubicacion Ventana
        // Accion MouseListener para seleccion de filas de jTableStock
        jTableStock.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            @Override
            public void mouseClicked(MouseEvent e) {
                int i = jTableStock.getSelectedRow();
                ID_Producto = jTableStock.getValueAt(i, 0).toString();
                NombreProducto = jTableStock.getValueAt(i, 1).toString();
                Cantidad = Integer.parseInt(jTableStock.getValueAt(i, 2).toString());
                Precio = Double.parseDouble(jTableStock.getValueAt(i, 3).toString());
                TipoProducto = jTableStock.getValueAt(i, 4).toString();
            }
        });
        // Accion MouseListener para seleccion de filas de jTableVenta
        jTableVenta.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            @Override
            public void mouseClicked(MouseEvent e) {
                int i = jTableVenta.getSelectedRow();
                ID_ProductoVenta = jTableVenta.getValueAt(i, 0).toString();
                NombreProductoVenta = jTableVenta.getValueAt(i, 1).toString();
                CantidadVenta = Integer.parseInt(jTableVenta.getValueAt(i, 2).toString());
                Precio = Double.parseDouble(jTableVenta.getValueAt(i, 3).toString());
                PrecioTotal = Double.parseDouble(jTableVenta.getValueAt(i, 4).toString());
                IvaProducto = Double.parseDouble(jTableVenta.getValueAt(i, 5).toString());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelVentanaStock = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblSupermercado2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        cbxTipoProducto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStock = new javax.swing.JTable();
        lblSupermercado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblSupermercado1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEditarID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEditarNombreProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEditarCantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEditarPrecio = new javax.swing.JTextField();
        btnTerminarEdicion = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        cbxEditarTipoProducto = new javax.swing.JComboBox<>();
        txtEditarTP = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblSupermercado3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtBusquedaVenta = new javax.swing.JTextField();
        txtCantidadVenta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        txtNombreProductoVenta = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JLabel();
        txtIDVenta = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtTipoVenta = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnIrFactura = new javax.swing.JButton();
        btnIrPrincipal = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVenta = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtCambio = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        txtValorPagar = new javax.swing.JLabel();
        txtIVA = new javax.swing.JLabel();
        txtValorVenta = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        lblSupermercado4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelVentanaStock.setBackground(new java.awt.Color(12, 0, 99));

        jPanel3.setBackground(new java.awt.Color(0, 159, 240));

        lblSupermercado2.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        lblSupermercado2.setText("Control de Stock de Productos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSupermercado2)
                .addGap(195, 195, 195))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblSupermercado2)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(212, 234, 252));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre del Producto :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cantidad a disponer :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Precio por Unidad :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Id del Producto :");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Tipo de Producto :");

        cbxTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Oficina", "Comestibles", "Ferreteria", "Medicina", "Educación", "Tecnología" }));
        cbxTipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txtIDProducto))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbxTipoProducto, javax.swing.GroupLayout.Alignment.LEADING, 0, 142, Short.MAX_VALUE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(cbxTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Nombre", "Cantidad", "Precio Unidad", "TipoProducto"
            }
        ));
        jTableStock.setRowHeight(20);
        jScrollPane1.setViewportView(jTableStock);

        lblSupermercado.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        lblSupermercado.setForeground(new java.awt.Color(255, 255, 255));
        lblSupermercado.setText(" Stock de Productos");

        jPanel1.setBackground(new java.awt.Color(212, 234, 252));

        lblSupermercado1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lblSupermercado1.setText("Modificar Producto");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Id del Producto:");

        txtEditarID.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtEditarID.setForeground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nombre del Producto:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Cantidad a disponer:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Precio por Unidad:");

        btnTerminarEdicion.setText("Terminar Edición");
        btnTerminarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarEdicionActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Tipo de Producto :");

        cbxEditarTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Oficina", "Comestibles", "Ferreteria", "Medicina", "Educación", "Tecnología" }));

        txtEditarTP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEditarTP.setForeground(new java.awt.Color(0, 102, 102));
        txtEditarTP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEditarTP.setText("jLabel27");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel26))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEditarNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSupermercado1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEditarID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGap(28, 28, 28))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnTerminarEdicion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cbxEditarTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(txtEditarTP, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSupermercado1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEditarID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEditarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(3, 3, 3)
                .addComponent(txtEditarTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxEditarTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnTerminarEdicion)
                .addGap(24, 24, 24))
        );

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/supermercado.png"))); // NOI18N

        lblSupermercado3.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        lblSupermercado3.setForeground(new java.awt.Color(255, 255, 255));
        lblSupermercado3.setText("Registro de Productos");

        javax.swing.GroupLayout jPanelVentanaStockLayout = new javax.swing.GroupLayout(jPanelVentanaStock);
        jPanelVentanaStock.setLayout(jPanelVentanaStockLayout);
        jPanelVentanaStockLayout.setHorizontalGroup(
            jPanelVentanaStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelVentanaStockLayout.createSequentialGroup()
                .addGroup(jPanelVentanaStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentanaStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaStockLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1))
                        .addGroup(jPanelVentanaStockLayout.createSequentialGroup()
                            .addGroup(jPanelVentanaStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelVentanaStockLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelVentanaStockLayout.createSequentialGroup()
                                    .addGap(138, 138, 138)
                                    .addComponent(lblSupermercado)))
                            .addGap(0, 61, Short.MAX_VALUE)))
                    .addGroup(jPanelVentanaStockLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblSupermercado3)))
                .addGroup(jPanelVentanaStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentanaStockLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanelVentanaStockLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnEliminar)
                .addGap(137, 137, 137)
                .addComponent(btnModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVentanaStockLayout.setVerticalGroup(
            jPanelVentanaStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaStockLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelVentanaStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentanaStockLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSupermercado3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblSupermercado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanelVentanaStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelVentanaStockLayout.createSequentialGroup()
                        .addGap(18, 57, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77))))
        );

        jPanel5.setBackground(new java.awt.Color(12, 0, 99));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cédula / Ruc:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Datos de Venta");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre Cliente:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Búsqueda de Producto:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Fecha");

        jTextFieldFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFecha.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextFieldFechaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(212, 234, 252));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Nombre del Producto :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Cantidad a Comprar :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Precio por Unidad :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Id o Nombre :");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comprar.png"))); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        txtNombreProductoVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombreProductoVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        txtPrecioVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPrecioVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        txtIDVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIDVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("ID:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Tipo de Producto :");

        txtTipoVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTipoVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel25)
                            .addComponent(jLabel22)
                            .addComponent(jLabel27))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarProducto))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(btnComprar))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBusquedaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel23)
                    .addComponent(txtBusquedaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(txtNombreProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComprar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarProducto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(92, 92, 92)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(516, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(527, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel11)
                    .addContainerGap(307, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jLabel12)
                    .addContainerGap(264, Short.MAX_VALUE)))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnIrFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagar.png"))); // NOI18N
        btnIrFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrFacturaActionPerformed(evt);
            }
        });

        btnIrPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/principal.png"))); // NOI18N
        btnIrPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrPrincipalActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir_1.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Ir a Principal");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Salir");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Pagar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnIrPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnIrFactura, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(btnIrPrincipal)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(49, 49, 49)
                .addComponent(btnSalir)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(49, 49, 49)
                .addComponent(btnIrFactura)
                .addGap(49, 49, 49)
                .addComponent(jLabel20)
                .addGap(45, 45, 45))
        );

        jTableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID PRODUCTO", "NOMBRE PRODUCTO", "CANTIDAD", "PRECIO UNIDAD", "PRECIO TOTAL", "IVA PRODUCTO"
            }
        ));
        jTableVenta.setRowHeight(20);
        jScrollPane2.setViewportView(jTableVenta);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("IMPORTE");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CAMBIO");

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        txtCambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCambio.setForeground(new java.awt.Color(0, 255, 255));
        txtCambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCambio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        txtImporte.setBackground(new java.awt.Color(0, 0, 0));
        txtImporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtImporte.setForeground(new java.awt.Color(255, 255, 255));
        txtImporte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtImporteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtImporte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("VALOR VENTA");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("TOTAL A PAGAR");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("IVA");

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        txtValorPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtValorPagar.setForeground(new java.awt.Color(0, 204, 153));
        txtValorPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtValorPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtValorPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        txtIVA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIVA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIVA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtValorVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtValorVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtValorVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(txtValorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel36)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValorVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(0, 159, 240));

        lblSupermercado4.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        lblSupermercado4.setText("Venta de Productos");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSupermercado4)
                .addGap(223, 223, 223))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblSupermercado4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelVentanaStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 51, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jScrollPane2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVentanaStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo btn para ir a VentanaFactura
     *
     * @param evt
     */
    private void btnIrFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrFacturaActionPerformed
        VentanaFactura fact = new VentanaFactura();
        fact.setVisible(true);
    }//GEN-LAST:event_btnIrFacturaActionPerformed
    /**
     * Metodo btn para ir a VentanaPrincipal
     *
     * @param evt
     */
    private void btnIrPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrPrincipalActionPerformed
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIrPrincipalActionPerformed
    /**
     * Metodo btn para salir del programa
     *
     * @param evt
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    /**
     * Metodo btn para Seleccionar producto desde stock a ventas
     *
     * @param evt
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String valor = txtBusquedaVenta.getText();
        for (int i = 0; i < jTableStock.getRowCount(); i++) {
            if (jTableStock.getValueAt(i, 0).equals(valor)) {
                jTableStock.changeSelection(i, 0, false, false);
            }
            if (jTableStock.getValueAt(i, 1).equals(valor)) {
                jTableStock.changeSelection(i, 1, false, false);
            }
        }
        filaSeleccionada = jTableStock.getSelectedRow();
        txtIDVenta.setText(jTableStock.getValueAt(filaSeleccionada, 0).toString());
        txtNombreProductoVenta.setText(jTableStock.getValueAt(filaSeleccionada, 1).toString());
        txtCantidadVenta.setText(jTableStock.getValueAt(filaSeleccionada, 2).toString());
        txtPrecioVenta.setText(jTableStock.getValueAt(filaSeleccionada, 3).toString());
        txtTipoVenta.setText(jTableStock.getValueAt(filaSeleccionada, 4).toString());
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * Metodo que agrega producto a comprar a la jTableVenta
     *
     * @param evt
     */
    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        Venta venta = new Venta(txtIDVenta.getText(), txtNombreProductoVenta.getText(),
                txtCantidadVenta.getText(), txtPrecioVenta.getText());
        listaVenta.add(venta);
        mostrarVenta();
        txtBusquedaVenta.setText("");
        txtIDVenta.setText("");
        txtNombreProductoVenta.setText("");
        txtCantidadVenta.setText("");
        txtPrecioVenta.setText("");
    }//GEN-LAST:event_btnComprarActionPerformed
    /**
     * Metodo void para obtener la fecha del sistema
     */
    public void fecha_actual() {
        Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formateador.format(fechaActual);
        jTextFieldFecha.setText(fecha);
        jTextFieldFecha.setEditable(false);
    }

    /**
     * Metodo para presentar en el textField la fecha actual del Sistema
     *
     * @param evt
     */
    private void jTextFieldFechaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextFieldFechaAncestorAdded
        fecha_actual();
    }//GEN-LAST:event_jTextFieldFechaAncestorAdded
    /**
     * Metodo KeyPressed para activar tecla ENTER
     *
     * @param evt
     */
    private void txtImporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            importe = Double.parseDouble(txtImporte.getText());
            totalCambio = importe - totalPagar;
            txtCambio.setText("" + df.format(totalCambio));
        }
    }//GEN-LAST:event_txtImporteKeyPressed
    /**
     * Metodo eliminar producto de la tabla jTableVenta
     *
     * @param evt
     */
    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        for (int i = 0; i < listaVenta.size(); i++) {
            if (NombreProductoVenta == listaVenta.get(i).getNombreProductoVenta()) {
                listaVenta.remove(i);
            }
        }
        Object matrizV[][] = new Object[listaVenta.size()][6];

        for (int i = 0; i < listaVenta.size(); i++) {
            matrizV[i][0] = listaVenta.get(i).getID_ProductoVenta();
            matrizV[i][1] = listaVenta.get(i).getNombreProductoVenta();
            matrizV[i][2] = listaVenta.get(i).getCantidadVenta();
            matrizV[i][3] = listaVenta.get(i).getPrecioVenta();
            matrizV[i][4] = df.format((Double.parseDouble(listaVenta.get(i).
                    getCantidadVenta()) * Double.parseDouble(listaVenta.get(i).getPrecioVenta())));
            matrizV[i][5] = df.format((Double.parseDouble(listaVenta.get(i).
                    getPrecioVenta()) * 0.12) * Double.parseDouble(listaVenta.get(i).getCantidadVenta()));
        }
        jTableVenta.setModel(new javax.swing.table.DefaultTableModel(
                matrizV,
                new String[]{
                    "ID PRODUCTO", "NOMBRE PRODUCTO", "CANTIDAD", "PRECIO UNIDAD", "PRECIO TOTAL", "IVA PRODUCTO"
                }
        ));
        jTableVenta.setRowHeight(20);
        jScrollPane2.setViewportView(jTableVenta);

        for (int i = 0; i < jTableVenta.getRowCount(); i++) {
            total -= Double.parseDouble(jTableVenta.getValueAt(i, 4).toString());
            ivaTotal -= Double.parseDouble(jTableVenta.getValueAt(i, 5).toString());
        }
        totalPagar = total + ivaTotal;
        txtValorVenta.setText("" + df.format(total));
        txtIVA.setText("" + df.format(ivaTotal));
        txtValorPagar.setText("" + df.format(totalPagar));

    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Stock stock = new Stock(txtIDProducto.getText(),txtNombreProducto.getText(),
                Integer.parseInt(txtCantidad.getText()),Double.parseDouble(txtPrecio.getText()),cbxTipoProducto.getSelectedItem().toString());
        lista.add(stock);
        mostrarStock();
        txtIDProducto.setText("");
        txtNombreProducto.setText("");
        txtCantidad.setText("");
        txtPrecio.setText(""); 
        cbxTipoProducto.setSelectedItem("Seleccione...");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbxTipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoProductoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        for (int i = 0; i < lista.size(); i++) {
            if (NombreProducto.equals(lista.get(i).getNombreProducto())) {
                lista.remove(i);
            }
        }
        // Actualizar Tabla
         Object matriz[][] = new Object[lista.size()][5];

        for (int i = 0; i < lista.size(); i++) {
            matriz[i][0] = lista.get(i).getID_Producto();
            matriz[i][1] = lista.get(i).getNombreProducto();
            matriz[i][2] = lista.get(i).getCantidad();
            matriz[i][3] = lista.get(i).getPrecio();
            matriz[i][4] = lista.get(i).getTipoProducto();           
        }
        jTableStock.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID Producto", "Nombre", "Cantidad", "Precio Unidad","Tipo Producto"
                }
        ));
        jTableStock.setRowHeight(20);
        jScrollPane1.setViewportView(jTableStock);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        txtEditarNombreProducto.setText(NombreProducto);
        txtEditarCantidad.setText(Integer.toString(Cantidad));
        txtEditarPrecio.setText(Double.toString(Precio));
        txtEditarTP.setText(TipoProducto);
          
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnTerminarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarEdicionActionPerformed
        for (int i = 0; i < lista.size(); i++) {
            if (txtEditarNombreProducto.getText().equals(lista.get(i).getNombreProducto())) {
                lista.get(i).setNombreProducto(txtEditarNombreProducto.getText());
                lista.get(i).setCantidad(Integer.parseInt(txtEditarCantidad.getText()));
                lista.get(i).setPrecio(Double.parseDouble(txtEditarPrecio.getText()));
                lista.get(i).setTipoProducto(cbxEditarTipoProducto.getSelectedItem().toString());
               
            }
        }
        txtEditarID.setText("");
        txtEditarNombreProducto.setText("");
        txtEditarCantidad.setText("");
        txtEditarPrecio.setText("");
        txtEditarTP.setText("");
        cbxEditarTipoProducto.setSelectedItem("Seleccione...");
        // Actualizar Tabla
         Object matriz[][] = new Object[lista.size()][5];

        for (int i = 0; i < lista.size(); i++) {
            matriz[i][0] = lista.get(i).getID_Producto();
            matriz[i][1] = lista.get(i).getNombreProducto();
            matriz[i][2] = lista.get(i).getCantidad();
            matriz[i][3] = lista.get(i).getPrecio();
            matriz[i][4] = lista.get(i).getTipoProducto();           
        }
        jTableStock.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID Producto", "Nombre", "Cantidad", "Precio Unidad","Tipo Producto"
                }
        ));
        jTableStock.setRowHeight(20);
        jScrollPane1.setViewportView(jTableStock);
    }//GEN-LAST:event_btnTerminarEdicionActionPerformed
        /**
     * Metodo mostrar jTable de Stock
     */
    public void mostrarStock() {
        Object matriz[][] = new Object[lista.size()][5];

        for (int i = 0; i < lista.size(); i++) {
            matriz[i][0] = lista.get(i).getID_Producto();
            matriz[i][1] = lista.get(i).getNombreProducto();
            matriz[i][2] = lista.get(i).getCantidad();
            matriz[i][3] = lista.get(i).getPrecio();
            matriz[i][4] = lista.get(i).getTipoProducto();           
        }
        jTableStock.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID Producto", "Nombre", "Cantidad", "Precio Unidad","Tipo Producto"
                }
        ));
        jTableStock.setRowHeight(20);
        jScrollPane1.setViewportView(jTableStock);

    }

    /**
     * Metodo mostrar jTable de Venta
     */
    public void mostrarVenta() {
        Object matrizV[][] = new Object[listaVenta.size()][6];

        for (int i = 0; i < listaVenta.size(); i++) {
            matrizV[i][0] = listaVenta.get(i).getID_ProductoVenta();
            matrizV[i][1] = listaVenta.get(i).getNombreProductoVenta();
            matrizV[i][2] = listaVenta.get(i).getCantidadVenta();
            matrizV[i][3] = listaVenta.get(i).getPrecioVenta();
            matrizV[i][4] = df.format((Double.parseDouble(listaVenta.get(i).
                    getCantidadVenta()) * Double.parseDouble(listaVenta.get(i).getPrecioVenta())));
            matrizV[i][5] = df.format((Double.parseDouble(listaVenta.get(i).
                    getPrecioVenta()) * 0.12) * Double.parseDouble(listaVenta.get(i).getCantidadVenta()));
        }
        jTableVenta.setModel(new javax.swing.table.DefaultTableModel(
                matrizV,
                new String[]{
                    "ID PRODUCTO", "NOMBRE PRODUCTO", "CANTIDAD", "PRECIO UNIDAD", "PRECIO TOTAL", "IVA PRODUCTO"
                }
        ));
        jTableVenta.setRowHeight(20);
        jScrollPane2.setViewportView(jTableVenta);
        // Calculo de iva y Precio total
        for (int i = 0; i < jTableVenta.getRowCount(); i++) {
            total += Double.parseDouble(jTableVenta.getValueAt(i, 4).toString());
            ivaTotal += Double.parseDouble(jTableVenta.getValueAt(i, 5).toString());
        }
        // Envio de resultados a Jlabels
        totalPagar = total + ivaTotal;
        txtValorVenta.setText("" + df.format(total));
        txtIVA.setText("" + df.format(ivaTotal));
        txtValorPagar.setText("" + df.format(totalPagar));
    }

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
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnIrFactura;
    private javax.swing.JButton btnIrPrincipal;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTerminarEdicion;
    private javax.swing.JComboBox<String> cbxEditarTipoProducto;
    private javax.swing.JComboBox<String> cbxTipoProducto;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelVentanaStock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableStock;
    private javax.swing.JTable jTableVenta;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSupermercado;
    private javax.swing.JLabel lblSupermercado1;
    private javax.swing.JLabel lblSupermercado2;
    private javax.swing.JLabel lblSupermercado3;
    private javax.swing.JLabel lblSupermercado4;
    private javax.swing.JTextField txtBusquedaVenta;
    private javax.swing.JLabel txtCambio;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEditarCantidad;
    private javax.swing.JLabel txtEditarID;
    private javax.swing.JTextField txtEditarNombreProducto;
    private javax.swing.JTextField txtEditarPrecio;
    private javax.swing.JLabel txtEditarTP;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JLabel txtIDVenta;
    private javax.swing.JLabel txtIVA;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JLabel txtNombreProductoVenta;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JLabel txtPrecioVenta;
    private javax.swing.JLabel txtTipoVenta;
    private javax.swing.JLabel txtValorPagar;
    private javax.swing.JLabel txtValorVenta;
    // End of variables declaration//GEN-END:variables
}
