import java.util.ArrayList;

public class MemosEntryGUI extends javax.swing.JFrame {

	static ArrayList<String> MemosHead = new ArrayList<>();
	static ArrayList<String> MemosText = new ArrayList<>();


    public MemosEntryGUI() {
        initComponents();
    }
    private void initComponents() {

        EnterMemosTextField = new javax.swing.JTextField();
        EnterMemoMainLabel = new javax.swing.JLabel();
        EnterMemoExitButton = new javax.swing.JButton();
        EnterMemoBackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MemoTextArea = new javax.swing.JTextArea();
        SaveEntriesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Save a new Memo/Note");
        setBounds(new java.awt.Rectangle(0, 0, 360, 480));
        setResizable(false);

        EnterMemosTextField.setFont(new java.awt.Font("Rondalo", 1, 24)); // NOI18N
        EnterMemosTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnterMemosTextField.setText("Enter memo title here");
        EnterMemosTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterMemosTextFieldActionPerformed(evt);
            }
        });

        EnterMemoMainLabel.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        EnterMemoMainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterMemoMainLabel.setText("Save a Memo/Note");

        EnterMemoExitButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        EnterMemoExitButton.setText("Exit");
        EnterMemoExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterMemoExitButtonActionPerformed(evt);
            }
        });

        EnterMemoBackButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        EnterMemoBackButton.setText("Back");
        EnterMemoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterMemoBackButtonActionPerformed(evt);
            }
        });
        
        SaveEntriesButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        SaveEntriesButton.setText("Save Entry");
        SaveEntriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveEntriesButtonActionPerformed(evt);
            }
        });

        MemoTextArea.setColumns(20);
        MemoTextArea.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        MemoTextArea.setLineWrap(true);
        MemoTextArea.setRows(5);
        MemoTextArea.setText("Enter Memo text here");
        MemoTextArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        MemoTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(MemoTextArea);

        SaveEntriesButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        SaveEntriesButton.setText("Save Entry");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnterMemoMainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EnterMemoExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnterMemoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(EnterMemosTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(SaveEntriesButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnterMemoMainLabel)
                .addGap(18, 18, 18)
                .addComponent(EnterMemosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SaveEntriesButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterMemoBackButton)
                    .addComponent(EnterMemoExitButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);    
    }// </editor-fold>                        

    private void EnterMemoExitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
    	System.exit(0);
    }                                                   

    private void EnterMemoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
    	setVisible(false);
    	MemosMainGUI obj = new MemosMainGUI();
    	MemosDB obj2 = new MemosDB();
    	obj2.ShowTable();
    	obj.setVisible(true);

    }                                                   

    private void EnterMemosTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                    
    }    
    
    private void SaveEntriesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    	MemosHead.add(EnterMemosTextField.getText());
    	MemosText.add(MemoTextArea.getText());
    	System.out.println(MemosHead);
    	System.out.println(MemosText);

    	MemosDB obj = new MemosDB();
    	obj.update();
    	
    	setVisible(false);
    	MemosMainGUI obj1 = new MemosMainGUI();

    	obj.ShowTable();
    	obj1.setVisible(true);
    }                                                 

    // Variables declaration - do not modify                     
    private javax.swing.JButton EnterMemoBackButton;
    private javax.swing.JButton EnterMemoExitButton;
    private javax.swing.JLabel EnterMemoMainLabel;
    static javax.swing.JTextField EnterMemosTextField;
    static javax.swing.JTextArea MemoTextArea;
    private javax.swing.JButton SaveEntriesButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
