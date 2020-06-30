/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Registro;
import Modelo.Grua;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class principalPanel extends javax.swing.JFrame implements ActionListener {

    public principalPanel() {
        initComponents();
        setSize(1200, 720);
        setLocationRelativeTo(null);
        setTitle("Dashboard Grúas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        btnAddGrua = new javax.swing.JButton();
        btnListGrua = new javax.swing.JButton();
        btnEditGrua = new javax.swing.JButton();
        btnDeleteGrua = new javax.swing.JButton();
        btnDisableGrua = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        userConnect = new javax.swing.JLabel();
        logoNombre = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        formAddPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        listPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        editPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        containerPanel.setBackground(new java.awt.Color(248, 249, 253));
        containerPanel.setLayout(new java.awt.BorderLayout());

        sidePanel.setBackground(new java.awt.Color(54, 185, 205));

        btnAddGrua.setBackground(new java.awt.Color(54, 185, 205));
        btnAddGrua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAddGrua.setForeground(new java.awt.Color(255, 255, 255));
        btnAddGrua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_plus_math_32px_1.png"))); // NOI18N
        btnAddGrua.setText("Agregar Grúa");
        btnAddGrua.setBorderPainted(false);
        btnAddGrua.setContentAreaFilled(false);
        btnAddGrua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddGrua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddGrua.setOpaque(true);
        btnAddGrua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddGruaMousePressed(evt);
            }
        });

        btnListGrua.setBackground(new java.awt.Color(54, 185, 205));
        btnListGrua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnListGrua.setForeground(new java.awt.Color(255, 255, 255));
        btnListGrua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_search_32px.png"))); // NOI18N
        btnListGrua.setText("Listar Grúas");
        btnListGrua.setBorderPainted(false);
        btnListGrua.setContentAreaFilled(false);
        btnListGrua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListGrua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListGrua.setOpaque(true);
        btnListGrua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnListGruaMousePressed(evt);
            }
        });

        btnEditGrua.setBackground(new java.awt.Color(54, 185, 205));
        btnEditGrua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEditGrua.setForeground(new java.awt.Color(255, 255, 255));
        btnEditGrua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_edit_32px.png"))); // NOI18N
        btnEditGrua.setText("Modificar Grúas");
        btnEditGrua.setBorderPainted(false);
        btnEditGrua.setContentAreaFilled(false);
        btnEditGrua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditGrua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditGrua.setOpaque(true);
        btnEditGrua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditGruaMousePressed(evt);
            }
        });

        btnDeleteGrua.setBackground(new java.awt.Color(54, 185, 205));
        btnDeleteGrua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnDeleteGrua.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteGrua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_waste_32px.png"))); // NOI18N
        btnDeleteGrua.setText("Eliminar Grúas");
        btnDeleteGrua.setBorderPainted(false);
        btnDeleteGrua.setContentAreaFilled(false);
        btnDeleteGrua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteGrua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDeleteGrua.setOpaque(true);
        btnDeleteGrua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteGruaMousePressed(evt);
            }
        });

        btnDisableGrua.setBackground(new java.awt.Color(54, 185, 205));
        btnDisableGrua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnDisableGrua.setForeground(new java.awt.Color(255, 255, 255));
        btnDisableGrua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_unavailable_32px.png"))); // NOI18N
        btnDisableGrua.setText("Grúas Deshabilitadas");
        btnDisableGrua.setBorderPainted(false);
        btnDisableGrua.setContentAreaFilled(false);
        btnDisableGrua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisableGrua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDisableGrua.setOpaque(true);

        jLabel9.setText("   ");
        jLabel9.setToolTipText("SKT1");

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAddGrua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListGrua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEditGrua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDisableGrua)
                    .addComponent(btnDeleteGrua, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(btnAddGrua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListGrua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditGrua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteGrua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDisableGrua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        containerPanel.add(sidePanel, java.awt.BorderLayout.WEST);

        headerPanel.setBackground(new java.awt.Color(53, 58, 64));
        headerPanel.setLayout(new java.awt.BorderLayout());

        userConnect.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        userConnect.setForeground(new java.awt.Color(255, 255, 255));
        userConnect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userConnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_person_32px.png"))); // NOI18N
        userConnect.setText("User  ");
        headerPanel.add(userConnect, java.awt.BorderLayout.EAST);

        logoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoNombre.setForeground(new java.awt.Color(240, 240, 240));
        logoNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/seguro-icon (1).png"))); // NOI18N
        logoNombre.setText("Seguros Virgolini");
        logoNombre.setToolTipText("Home");
        logoNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoNombreMousePressed(evt);
            }
        });
        headerPanel.add(logoNombre, java.awt.BorderLayout.WEST);

        containerPanel.add(headerPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(248, 249, 253));
        homePanel.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido (a)");
        homePanel.add(jLabel2, java.awt.BorderLayout.CENTER);

        bodyPanel.add(homePanel, "card4");

        addPanel.setBackground(new java.awt.Color(248, 249, 253));

        formAddPanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patente grúa");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton2.setText("Agregar");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setText("Limpiar");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Marca");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona marca", "NISSAN", "CHEVROLET", "MERCEDEZ-BENZ", "VOLKSWAGEN", "TOYOTA", "MITSUBISHI", "VOLVO" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Modelo");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tipo");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tipo", "CAMILLA", "GANCHO", "ARRASTRE" }));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Año");

        javax.swing.GroupLayout formAddPanelLayout = new javax.swing.GroupLayout(formAddPanel);
        formAddPanel.setLayout(formAddPanelLayout);
        formAddPanelLayout.setHorizontalGroup(
            formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formAddPanelLayout.createSequentialGroup()
                        .addGroup(formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(39, 39, 39)
                        .addGroup(formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(formAddPanelLayout.createSequentialGroup()
                        .addGroup(formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(formAddPanelLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))))
        );
        formAddPanelLayout.setVerticalGroup(
            formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAddPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formAddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formAddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formAddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formAddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addGroup(formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        addPanel.add(formAddPanel);

        bodyPanel.add(addPanel, "card2");

        listPanel.setBackground(new java.awt.Color(248, 249, 253));
        listPanel.setLayout(new java.awt.BorderLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PATENTE", "MARCA", "MODELO ", "TIPO","AÑO","ESTADO"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        listPanel.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel5.setText(" ");
        listPanel.add(jLabel5, java.awt.BorderLayout.PAGE_END);

        jLabel6.setText(" ");
        listPanel.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        jLabel7.setText("               ");
        listPanel.add(jLabel7, java.awt.BorderLayout.LINE_END);

        jLabel8.setText("               ");
        listPanel.add(jLabel8, java.awt.BorderLayout.LINE_START);

        bodyPanel.add(listPanel, "card3");

        editPanel.setBackground(new java.awt.Color(248, 249, 253));

        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese patente de grúa que desea modificar");

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton4.setText("Limpiar");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona marca", "NISSAN", "CHEVROLET", "MERCEDEZ-BENZ", "VOLKSWAGEN", "TOYOTA", "MITSUBISHI", "VOLVO" }));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Marca");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Modelo");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tipo", "CAMILLA", "GANCHO", "ARRASTRE" }));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tipo");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Año");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        bodyPanel.add(editPanel, "card5");

        deletePanel.setBackground(new java.awt.Color(248, 249, 253));

        jPanel2.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese patente de grúa que desea eliminar");

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton5.setText("Eliminar");

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton6.setText("Limpiar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5)))
        );

        deletePanel.add(jPanel2);

        bodyPanel.add(deletePanel, "card6");

        containerPanel.add(bodyPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(containerPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoNombreMousePressed
        // TODO add your handling code here:
        addPanel.setVisible(false);
        homePanel.setVisible(true);
        listPanel.setVisible(false);
        editPanel.setVisible(false);
        deletePanel.setVisible(false);
        btnAddGrua.setBackground(new Color(54, 185, 205));
        btnListGrua.setBackground(new Color(54, 185, 205));
        btnEditGrua.setBackground(new Color(54, 185, 205));
        btnDeleteGrua.setBackground(new Color(54, 185, 205));
    }//GEN-LAST:event_logoNombreMousePressed

    private void btnAddGruaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddGruaMousePressed
        // TODO add your handling code here:
        addPanel.setVisible(true);
        homePanel.setVisible(false);
        listPanel.setVisible(false);
        editPanel.setVisible(false);
        deletePanel.setVisible(false);
        btnAddGrua.setBackground(new Color(18, 118, 129));
        btnListGrua.setBackground(new Color(54, 185, 205));
        btnEditGrua.setBackground(new Color(54, 185, 205));
        btnDeleteGrua.setBackground(new Color(54, 185, 205));
    }//GEN-LAST:event_btnAddGruaMousePressed

    private void btnListGruaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListGruaMousePressed
        // TODO add your handling code here:
        addPanel.setVisible(false);
        homePanel.setVisible(false);
        listPanel.setVisible(true);
        editPanel.setVisible(false);
        deletePanel.setVisible(false);
        btnListGrua.setBackground(new Color(18, 118, 129));
        btnAddGrua.setBackground(new Color(54, 185, 205));
        btnEditGrua.setBackground(new Color(54, 185, 205));
        btnDeleteGrua.setBackground(new Color(54, 185, 205));

        String PATENTE_GRUA,MARCA,MODELO,TIPO,ANIO,estadoFinal;
        int SERVICIO_GRUA_ID_SERVICIO,USUARIO_RUT_USUARIO;
        boolean ESTADO ;
        boolean ESTADO_DELETE;

        Registro rg = new Registro();
        DefaultTableModel tabla = (DefaultTableModel) jTable2.getModel();
        tabla.setRowCount(0);
        ArrayList<Grua> lista = rg.listarTodasGruas();
        for (Grua tmp:lista){
            PATENTE_GRUA=tmp.getPATENTE_GRUA();
            MARCA=tmp.getMARCA();
            MODELO=tmp.getMODELO();
            TIPO=tmp.getTIPO();
            ANIO= tmp.getANIO();
            ESTADO= tmp.getESTADO();
            if (ESTADO==true){
                estadoFinal = "DISPONIBLE";
            }else {
                estadoFinal= "NO DISPONIBLE";
            }

            tabla.addRow(new Object[]{PATENTE_GRUA,MARCA,MODELO,TIPO,ANIO,estadoFinal});

        }
    }//GEN-LAST:event_btnListGruaMousePressed

    private void btnEditGruaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditGruaMousePressed
        // TODO add your handling code here:
        addPanel.setVisible(false);
        homePanel.setVisible(false);
        listPanel.setVisible(false);
        editPanel.setVisible(true);
        deletePanel.setVisible(false);
        btnEditGrua.setBackground(new Color(18, 118, 129));
        btnListGrua.setBackground(new Color(54, 185, 205));
        btnAddGrua.setBackground(new Color(54, 185, 205));
        btnDeleteGrua.setBackground(new Color(54, 185, 205));
    }//GEN-LAST:event_btnEditGruaMousePressed

    private void btnDeleteGruaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteGruaMousePressed
        // TODO add your handling code here:
        addPanel.setVisible(false);
        homePanel.setVisible(false);
        listPanel.setVisible(false);
        editPanel.setVisible(false);
        deletePanel.setVisible(true);
        btnDeleteGrua.setBackground(new Color(18, 118, 129));
        btnListGrua.setBackground(new Color(54, 185, 205));
        btnEditGrua.setBackground(new Color(54, 185, 205));
        btnAddGrua.setBackground(new Color(54, 185, 205));
    }//GEN-LAST:event_btnDeleteGruaMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnAddGrua;
    private javax.swing.JButton btnDeleteGrua;
    private javax.swing.JButton btnDisableGrua;
    private javax.swing.JButton btnEditGrua;
    private javax.swing.JButton btnListGrua;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JPanel editPanel;
    private javax.swing.JPanel formAddPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel listPanel;
    private javax.swing.JLabel logoNombre;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel userConnect;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
