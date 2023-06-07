
import javax.swing.JOptionPane;

public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }

                     
    private void initComponents() {

        MainLabel = new javax.swing.JLabel();
        MemoButton = new javax.swing.JButton();
        WeekSchedButton = new javax.swing.JButton();
        HealthCheckButton = new javax.swing.JButton();
        ExitAppButton = new javax.swing.JButton();
        ThemesButton = new javax.swing.JButton();
        InfoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Aid App");
        setResizable(false);
        setBounds(new java.awt.Rectangle(0, 0, 360, 480));

        MainLabel.setFont(new java.awt.Font("Rondalo", 0, 48)); // NOI18N
        MainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainLabel.setText("STUDENT AID APP");

        MemoButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        MemoButton.setText("Memo and Notes");
        MemoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemoButtonActionPerformed(evt);
            }
        });

        WeekSchedButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        WeekSchedButton.setText("Week Scheduler");
        WeekSchedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeekSchedButtonActionPerformed(evt);
            }
        });

        HealthCheckButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        HealthCheckButton.setText("Health Checker");
        HealthCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthCheckButtonActionPerformed(evt);
            }
        });

        ExitAppButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        ExitAppButton.setText("Exit App");
        ExitAppButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitAppButtonActionPerformed(evt);
            }
        });
        
        ThemesButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        ThemesButton.setText("Themes");
        ThemesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemesButtonActionPerformed(evt);
            }
        });

        InfoButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        InfoButton.setText("Info");
        InfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WeekSchedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MemoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HealthCheckButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ExitAppButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ThemesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(InfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(MainLabel)
                .addGap(100, 100, 100)
                .addComponent(MemoButton)
                .addGap(18, 18, 18)
                .addComponent(WeekSchedButton)
                .addGap(18, 18, 18)
                .addComponent(HealthCheckButton)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitAppButton)
                    .addComponent(ThemesButton)
                    .addComponent(InfoButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void ExitAppButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	System.exit(0);
    }                                             

    private void MemoButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	setVisible(false);
    	MemosMainGUI obj = new MemosMainGUI();
    	MemosDB obj2 = new MemosDB();
    	obj2.ShowTable();
    	obj.setVisible(true);
    }                                          

    private void WeekSchedButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	setVisible(false);
    	WeeklySchedulerGUI obj2 = new WeeklySchedulerGUI();

    	WeeklySchedulerDB obj3 = new WeeklySchedulerDB();
    	obj3.GetRows(WeeklySchedulerGUI.dayname);
    	if (WeeklySchedulerGUI.PeriodsNum[WeeklySchedulerGUI.daynum-1] == 1) {
    		WeeklySchedulerGUI.PrintLabels();
    	}
    	else if (WeeklySchedulerGUI.PeriodsNum[WeeklySchedulerGUI.daynum-1] == 0){
        	WeeklySchedulerGUI.Periods = new String[] {"", "", "", "", "", "", ""};
        	WeeklySchedulerGUI.PrintLabels();    		
    	}   	
    	obj2.setVisible(true);    	
    }                                               

    private void HealthCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	setVisible(false);    	
    	HealthCheckerGUI obj2 = new HealthCheckerGUI();
    	obj2.setVisible(true);
    }                                                 
    
    private void ThemesButtonActionPerformed(java.awt.event.ActionEvent evt) {    
    	setVisible(false);
    	ChooseDay obj = new ChooseDay(1);
    	obj.setVisible(true);
    }                                            

    private void InfoButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	javax.swing.JLabel Info = new javax.swing.JLabel("Student Aid Application made by 20/F-CS-19");
    	Info.setFont(new java.awt.Font("Rondalo", 0, 18));
    	
	    JOptionPane.showMessageDialog(null, Info, "INFO", JOptionPane.INFORMATION_MESSAGE);
    }                                          

    // Variables declaration - do not modify                     
    private javax.swing.JButton ExitAppButton;
    private javax.swing.JButton HealthCheckButton;
    private javax.swing.JButton InfoButton;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JButton MemoButton;
    private javax.swing.JButton ThemesButton;
    private javax.swing.JButton WeekSchedButton;
    // End of variables declaration                   
}
