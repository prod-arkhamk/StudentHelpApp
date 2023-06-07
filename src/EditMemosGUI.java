
public class EditMemosGUI extends javax.swing.JFrame {

	public EditMemosGUI() {
        initComponents();
    }

    private void initComponents() {

        EditMemosTextField = new javax.swing.JTextField();
        EditMemoMainLabel = new javax.swing.JLabel();
        EditMemoSaveButton = new javax.swing.JButton();
        EditMemoDeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MemoTextArea = new javax.swing.JTextArea();
        EditMemoBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit the Memo/Note");
        setResizable(false);

        EditMemosTextField.setFont(new java.awt.Font("Rondalo", 1, 24)); // NOI18N
        EditMemosTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EditMemosTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMemosTextFieldActionPerformed(evt);
            }
        });

        EditMemoMainLabel.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        EditMemoMainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditMemoMainLabel.setText("Edit your Memo");

        EditMemoSaveButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        EditMemoSaveButton.setText("Save");
        EditMemoSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMemoSaveButtonActionPerformed(evt);
            }
        });

        EditMemoDeleteButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        EditMemoDeleteButton.setText("Delete");
        EditMemoDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMemoDeleteButtonActionPerformed(evt);
            }
        });

        MemoTextArea.setColumns(20);
        MemoTextArea.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        MemoTextArea.setLineWrap(true);
        MemoTextArea.setRows(5);
        MemoTextArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        MemoTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(MemoTextArea);

        EditMemoBackButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        EditMemoBackButton.setText("Back");
        EditMemoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMemoBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditMemoMainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditMemoBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(EditMemosTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(EditMemoSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EditMemoDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditMemoMainLabel)
                .addGap(18, 18, 18)
                .addComponent(EditMemosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditMemoDeleteButton)
                    .addComponent(EditMemoSaveButton))
                .addGap(14, 14, 14)
                .addComponent(EditMemoBackButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        	

    private void EditMemoDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    	MemosDB obj = new MemosDB();
    	MemosMainGUI obj1 = new MemosMainGUI();

    	obj.delete(EditMemosTextField.getText());
    	obj.ResetTable();
    	
    	obj1.setVisible(true);
    	setVisible(false);
    	}                                                    

    private void EditMemosTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void EditMemoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	MemosMainGUI obj = new MemosMainGUI();
    	obj.setVisible(true);
    	setVisible(false);
    	MemosDB obj2 = new MemosDB();
    	obj2.ShowTable();
    }                                                  

    private void EditMemoSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    	MemosEntryGUI.MemosHead.set(MemosMainGUI.row, EditMemosTextField.getText());
    	MemosEntryGUI.MemosText.set(MemosMainGUI.row, MemoTextArea.getText());
    	System.out.println(MemosEntryGUI.MemosHead);
    	System.out.println(MemosEntryGUI.MemosText);

    	MemosDB obj = new MemosDB();
    	obj.edit();
    }                                                  

    // Variables declaration - do not modify                     
    private javax.swing.JButton EditMemoBackButton;
    private javax.swing.JButton EditMemoDeleteButton;
    private javax.swing.JLabel EditMemoMainLabel;
    private javax.swing.JButton EditMemoSaveButton;
    static javax.swing.JTextField EditMemosTextField;
    static javax.swing.JTextArea MemoTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
