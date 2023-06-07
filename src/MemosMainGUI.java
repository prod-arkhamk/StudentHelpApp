public class MemosMainGUI extends javax.swing.JFrame {
	static int row,col;
	
    public MemosMainGUI() {
        initComponents();
    }
    

    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        MemosTable = new javax.swing.JTable();
        MemosMainLabel = new javax.swing.JLabel();
        MemosExitButton = new javax.swing.JButton();
        MemosBackButton = new javax.swing.JButton();
        MemosAddEntryButton = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Memos and Notes");
        setBounds(new java.awt.Rectangle(0, 0, 360, 480));
        setResizable(false);

        MemosTable.setFont(new java.awt.Font("Rondalo", 1, 18)); // NOI18N
        MemosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Your Memos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MemosTable.setRowHeight(30);
        MemosTable.setShowGrid(true);
        MemosTable.getTableHeader().setResizingAllowed(false);
        MemosTable.getTableHeader().setReorderingAllowed(false);
        MemosTable.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(MemosTable);
        if (MemosTable.getColumnModel().getColumnCount() > 0) {
            MemosTable.getColumnModel().getColumn(0).setResizable(false);
            MemosTable.getColumnModel().getColumn(0).setPreferredWidth(200);

        }
        MemosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                row = MemosTable.rowAtPoint(evt.getPoint());
                col = MemosTable.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
                	EditMemosGUI obj = new EditMemosGUI();
                	obj.setVisible(true);
                	EditMemosGUI.EditMemosTextField.setText(MemosEntryGUI.MemosHead.get(row));
                	EditMemosGUI.MemoTextArea.setText(MemosEntryGUI.MemosText.get(row));
                	setVisible(false);
                }
            }
        });

        MemosMainLabel.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        MemosMainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MemosMainLabel.setText("Your Memos and Notes");

        MemosBackButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        MemosBackButton.setText("Back");
        MemosBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemosBackButtonActionPerformed(evt);
            }
        });

        MemosExitButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        MemosExitButton.setText("Exit");
        MemosExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemosExitButtonActionPerformed(evt);
            }
        });

        MemosAddEntryButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        MemosAddEntryButton.setText("Add Entry");
        MemosAddEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemosAddEntryButtonActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(MemosAddEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MemosMainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(MemosExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemosBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(MemosMainLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(MemosAddEntryButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemosBackButton)
                    .addComponent(MemosExitButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void MemosExitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	System.exit(0);
    }                                               

    private void MemosBackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	setVisible(false);
    	MainGUI obj = new MainGUI();
    	obj.setVisible(true);
    }                                               

    private void MemosAddEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
    	MemosEntryGUI obj = new MemosEntryGUI();
    	setVisible(false);
    	obj.setVisible(true);		
    }                                                   

    // Variables declaration - do not modify                     
    private javax.swing.JButton MemosAddEntryButton;
    private javax.swing.JButton MemosBackButton;
    private javax.swing.JButton MemosExitButton;
    private javax.swing.JLabel MemosMainLabel;
    static javax.swing.JTable MemosTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration          


}
