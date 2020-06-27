/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        addGruaPanel = new javax.swing.JPanel();
        addIndicatorPanel = new javax.swing.JPanel();
        addGrua = new javax.swing.JLabel();
        listGruaPanel = new javax.swing.JPanel();
        listIndicatorPanel = new javax.swing.JPanel();
        listGrua = new javax.swing.JLabel();
        editGruaPanel = new javax.swing.JPanel();
        editIndicatorPanel = new javax.swing.JPanel();
        editGrua = new javax.swing.JLabel();
        deleteGruaPanel = new javax.swing.JPanel();
        deleteIndicatorPanel = new javax.swing.JPanel();
        deleteGrua = new javax.swing.JLabel();
        disableGruaPanel = new javax.swing.JPanel();
        disableIndicatorPanel = new javax.swing.JPanel();
        disableGrua = new javax.swing.JLabel();
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

        addGruaPanel.setBackground(new java.awt.Color(54, 185, 205));
        addGruaPanel.setOpaque(false);

        addIndicatorPanel.setOpaque(false);
        addIndicatorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addGrua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        addGrua.setForeground(new java.awt.Color(255, 255, 255));
        addGrua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addGrua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_plus_math_32px_1.png"))); // NOI18N
        addGrua.setText("Agregar Grúas");
        addGrua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addGrua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addGruaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout addGruaPanelLayout = new javax.swing.GroupLayout(addGruaPanel);
        addGruaPanel.setLayout(addGruaPanelLayout);
        addGruaPanelLayout.setHorizontalGroup(
            addGruaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addGruaPanelLayout.createSequentialGroup()
                .addComponent(addIndicatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addGrua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        addGruaPanelLayout.setVerticalGroup(
            addGruaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addIndicatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addGruaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addGrua)
                .addContainerGap())
        );

        listGruaPanel.setBackground(new java.awt.Color(54, 185, 205));
        listGruaPanel.setOpaque(false);

        listIndicatorPanel.setOpaque(false);
        listIndicatorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listGrua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        listGrua.setForeground(new java.awt.Color(255, 255, 255));
        listGrua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        listGrua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_search_32px.png"))); // NOI18N
        listGrua.setText("Listar Grúas");
        listGrua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listGrua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listGruaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout listGruaPanelLayout = new javax.swing.GroupLayout(listGruaPanel);
        listGruaPanel.setLayout(listGruaPanelLayout);
        listGruaPanelLayout.setHorizontalGroup(
            listGruaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listGruaPanelLayout.createSequentialGroup()
                .addComponent(listIndicatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listGrua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        listGruaPanelLayout.setVerticalGroup(
            listGruaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listIndicatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listGruaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listGrua)
                .addContainerGap())
        );

        editGruaPanel.setBackground(new java.awt.Color(54, 185, 205));
        editGruaPanel.setOpaque(false);

        editIndicatorPanel.setOpaque(false);
        editIndicatorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editGrua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        editGrua.setForeground(new java.awt.Color(255, 255, 255));
        editGrua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editGrua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_edit_32px.png"))); // NOI18N
        editGrua.setText("Modificar Grúas");
        editGrua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editGrua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editGruaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout editGruaPanelLayout = new javax.swing.GroupLayout(editGruaPanel);
        editGruaPanel.setLayout(editGruaPanelLayout);
        editGruaPanelLayout.setHorizontalGroup(
            editGruaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editGruaPanelLayout.createSequentialGroup()
                .addComponent(editIndicatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editGrua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        editGruaPanelLayout.setVerticalGroup(
            editGruaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editIndicatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editGruaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editGrua)
                .addContainerGap())
        );

        deleteGruaPanel.setBackground(new java.awt.Color(54, 185, 205));
        deleteGruaPanel.setOpaque(false);

        deleteIndicatorPanel.setOpaque(false);
        deleteIndicatorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteGrua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        deleteGrua.setForeground(new java.awt.Color(255, 255, 255));
        deleteGrua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        deleteGrua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_waste_32px.png"))); // NOI18N
        deleteGrua.setText("Eliminar Grúas");
        deleteGrua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteGrua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteGruaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout deleteGruaPanelLayout = new javax.swing.GroupLayout(deleteGruaPanel);
        deleteGruaPanel.setLayout(deleteGruaPanelLayout);
        deleteGruaPanelLayout.setHorizontalGroup(
            deleteGruaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteGruaPanelLayout.createSequentialGroup()
                .addComponent(deleteIndicatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteGrua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        deleteGruaPanelLayout.setVerticalGroup(
            deleteGruaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteIndicatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(deleteGruaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteGrua)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        disableGruaPanel.setBackground(new java.awt.Color(54, 185, 205));
        disableGruaPanel.setOpaque(false);

        disableIndicatorPanel.setOpaque(false);
        disableIndicatorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        disableGrua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        disableGrua.setForeground(new java.awt.Color(255, 255, 255));
        disableGrua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        disableGrua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_unavailable_32px.png"))); // NOI18N
        disableGrua.setText("Grúas Deshabilitadas");
        disableGrua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout disableGruaPanelLayout = new javax.swing.GroupLayout(disableGruaPanel);
        disableGruaPanel.setLayout(disableGruaPanelLayout);
        disableGruaPanelLayout.setHorizontalGroup(
            disableGruaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disableGruaPanelLayout.createSequentialGroup()
                .addComponent(disableIndicatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disableGrua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        disableGruaPanelLayout.setVerticalGroup(
            disableGruaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(disableIndicatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, disableGruaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(disableGrua)
                .addContainerGap())
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addGruaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deleteGruaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editGruaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(disableGruaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listGruaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addGruaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listGruaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(editGruaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteGruaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disableGruaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 238, Short.MAX_VALUE))
        );

        containerPanel.add(sidePanel, java.awt.BorderLayout.WEST);

        headerPanel.setBackground(new java.awt.Color(53, 58, 64));
        headerPanel.setLayout(new java.awt.BorderLayout());

        userConnect.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        userConnect.setForeground(new java.awt.Color(255, 255, 255));
        userConnect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userConnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/icons8_person_32px.png"))); // NOI18N
        userConnect.setText("User   ");
        headerPanel.add(userConnect, java.awt.BorderLayout.EAST);

        logoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoNombre.setForeground(new java.awt.Color(240, 240, 240));
        logoNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/seguro-icon (1).png"))); // NOI18N
        logoNombre.setText("Seguros Virgolini");
        logoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoNombreMousePressed(evt);
            }
        });
        headerPanel.add(logoNombre, java.awt.BorderLayout.CENTER);

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

        javax.swing.GroupLayout formAddPanelLayout = new javax.swing.GroupLayout(formAddPanel);
        formAddPanel.setLayout(formAddPanelLayout);
        formAddPanelLayout.setHorizontalGroup(
            formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAddPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formAddPanelLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(formAddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formAddPanelLayout.setVerticalGroup(
            formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAddPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
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
                "Title 1", "Title 2", "Title 3", "Title 4"
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

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton4.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editPanel.add(jPanel1);

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

    private void addGruaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addGruaMousePressed
        // TODO add your handling code here:
        addPanel.setVisible(true);
        homePanel.setVisible(false);
        listPanel.setVisible(false);
        editPanel.setVisible(false);
        deletePanel.setVisible(false);
    }//GEN-LAST:event_addGruaMousePressed

    private void logoNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoNombreMousePressed
        // TODO add your handling code here:
        addPanel.setVisible(false);
        homePanel.setVisible(true);
        listPanel.setVisible(false);
        editPanel.setVisible(false);
        deletePanel.setVisible(false);
    }//GEN-LAST:event_logoNombreMousePressed

    private void listGruaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listGruaMousePressed
        // TODO add your handling code here:
        addPanel.setVisible(false);
        homePanel.setVisible(false);
        listPanel.setVisible(true);
        editPanel.setVisible(false);
        deletePanel.setVisible(false);
    }//GEN-LAST:event_listGruaMousePressed

    private void editGruaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editGruaMousePressed
        // TODO add your handling code here:
        addPanel.setVisible(false);
        homePanel.setVisible(false);
        listPanel.setVisible(false);
        editPanel.setVisible(true);
        deletePanel.setVisible(false);
    }//GEN-LAST:event_editGruaMousePressed

    private void deleteGruaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteGruaMousePressed
        // TODO add your handling code here:
        addPanel.setVisible(false);
        homePanel.setVisible(false);
        listPanel.setVisible(false);
        editPanel.setVisible(false);
        deletePanel.setVisible(true);
    }//GEN-LAST:event_deleteGruaMousePressed

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
    private javax.swing.JLabel addGrua;
    private javax.swing.JPanel addGruaPanel;
    private javax.swing.JPanel addIndicatorPanel;
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel deleteGrua;
    private javax.swing.JPanel deleteGruaPanel;
    private javax.swing.JPanel deleteIndicatorPanel;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JLabel disableGrua;
    private javax.swing.JPanel disableGruaPanel;
    private javax.swing.JPanel disableIndicatorPanel;
    private javax.swing.JLabel editGrua;
    private javax.swing.JPanel editGruaPanel;
    private javax.swing.JPanel editIndicatorPanel;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel listGrua;
    private javax.swing.JPanel listGruaPanel;
    private javax.swing.JPanel listIndicatorPanel;
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
