
public class HealthCheckerGUI extends javax.swing.JFrame {
	
    public HealthCheckerGUI() {
    	initComponents();
    }
                       
    private void initComponents() {
        HC_MainLabel = new javax.swing.JLabel();
        HC_MentalHealthButton = new javax.swing.JButton();
        HC_PhysicalHealthButton = new javax.swing.JButton();
        HC_ExitCheckerButton = new javax.swing.JButton();
        HC_PromptLabel = new javax.swing.JLabel();
        HC_BackCheckerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 360, 480));
        setTitle("Student Health Checker");
        setResizable(false);
        
        HC_MainLabel.setFont(new java.awt.Font("Rondalo", 0, 48)); // NOI18N
        HC_MainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HC_MainLabel.setText("HEALTH CHECKER");

        HC_MentalHealthButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        HC_MentalHealthButton.setText("Mental Health");
        HC_MentalHealthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HC_MentalHealthButtonActionPerformed(evt);
            }
        });

        HC_PhysicalHealthButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        HC_PhysicalHealthButton.setText("Physical Health");
        HC_PhysicalHealthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HC_PhysicalHealthButtonActionPerformed(evt);
            }
        });

        HC_ExitCheckerButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        HC_ExitCheckerButton.setText("Exit");
        HC_ExitCheckerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HC_ExitCheckerButtonActionPerformed(evt);
            }
        });
        
        HC_BackCheckerButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        HC_BackCheckerButton.setText("Back");
        HC_BackCheckerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HC_BackCheckerButtonActionPerformed(evt);
            }
        });

        HC_PromptLabel.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        HC_PromptLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HC_PromptLabel.setText("Select the type of Health");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HC_MainLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HC_PhysicalHealthButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HC_MentalHealthButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(HC_ExitCheckerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HC_BackCheckerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(HC_PromptLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(HC_MainLabel)
                .addGap(50, 50, 50)
                .addComponent(HC_PromptLabel)
                .addGap(50, 50, 50)
                .addComponent(HC_PhysicalHealthButton)
                .addGap(18, 18, 18)
                .addComponent(HC_MentalHealthButton)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HC_BackCheckerButton)
                    .addComponent(HC_ExitCheckerButton))
                .addContainerGap())
        );

        pack();

        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void HC_ExitCheckerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    	System.exit(0);
    }                                                    

    private void HC_MentalHealthButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        PMH_CheckerGUI obj = new PMH_CheckerGUI("Mental");
        HealthCheckerDB obj2 = new HealthCheckerDB();
        obj2.ShowTable();
        	
        System.out.println(StudentAid.m_probs);
        StudentAid.m_avgcount=0;
        StudentAid.avg_m_health_sum=0;
        	
        for (int i = 0; i<10; i++) {
            System.out.println(StudentAid.m_probs_ratings[i]);
        }
        for (int i = 0; i < StudentAid.m_probs.size(); i++) {
           	StudentAid.m_avgcount = i;
           	StudentAid.avg_m_health_sum += StudentAid.m_probs_ratings[i];
        }
        StudentAid.M_AvgCalc();
        PMH_CheckerGUI.m_wholerate = StudentAid.avg_m_health;
        System.out.println(StudentAid.avg_m_health);
      	PMH_CheckerGUI.PHC_Rating.setText("Your Physical Health is rated "+PMH_CheckerGUI.m_wholerate+"/10");	
        obj.setVisible(true);
        
    	HealthCheckerDB obj3 = new HealthCheckerDB();
    	obj3.ShowTable();

    }                                                     

    private void HC_PhysicalHealthButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        setVisible(false);
        PMH_CheckerGUI obj = new PMH_CheckerGUI("Physical");
        HealthCheckerDB obj2 = new HealthCheckerDB();
        obj2.ShowTable();
        	
        System.out.println(StudentAid.p_probs);
        StudentAid.p_avgcount=0;
        StudentAid.avg_p_health_sum=0;
        	
        for (int i = 0; i<10; i++) {
            System.out.println(StudentAid.p_probs_ratings[i]);
        }
        for (int i = 0; i < StudentAid.p_probs.size(); i++) {
           	StudentAid.p_avgcount = i;
           	StudentAid.avg_p_health_sum += StudentAid.p_probs_ratings[i];
        }
        StudentAid.P_AvgCalc();
        PMH_CheckerGUI.p_wholerate = StudentAid.avg_p_health;
        System.out.println(StudentAid.avg_p_health);
      	PMH_CheckerGUI.PHC_Rating.setText("Your Physical Health is rated "+PMH_CheckerGUI.p_wholerate+"/10");	
        obj.setVisible(true);
        
    	HealthCheckerDB obj3 = new HealthCheckerDB();
    	obj3.ShowTable();

    }                                                        

    private void HC_BackCheckerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    	setVisible(false);
    	MainGUI obj = new MainGUI();
    	obj.setVisible(true);
    } 
    

    // Variables declaration - do not modify  
    private javax.swing.JButton HC_BackCheckerButton;
    private javax.swing.JButton HC_ExitCheckerButton;
    private javax.swing.JLabel HC_MainLabel;
    private javax.swing.JButton HC_MentalHealthButton;
    private javax.swing.JButton HC_PhysicalHealthButton;
    private javax.swing.JLabel HC_PromptLabel;
    // End of variables declaration                   
}
