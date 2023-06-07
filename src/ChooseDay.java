public class ChooseDay extends javax.swing.JFrame {
	static int changer;
    public ChooseDay(int changer) {
    	this.changer = changer;
        initComponents();
    }
    
    private void initComponents() {

        ChangeDayNameComboBox = new javax.swing.JComboBox<>();
        ChooseTheDayLabel = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        SelectButton = new javax.swing.JButton();

        setResizable(false);
        setUndecorated(true);
//        getRootPane().setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        ChangeDayNameComboBox.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        if(changer == 0) {
            ChangeDayNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        }
        else if (changer == 1) {
            ChangeDayNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acryl", "Aero", "Aluminum", "Bernstein", "Fast", "Graphite", "HiFi", "Luna", "Mac", "Mint", "Noire","Smart", "Marble"}));
        }
        
        ChangeDayNameComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChangeDayNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeDayNameComboBoxActionPerformed(evt);
            }
        });

        ChooseTheDayLabel.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        if (changer == 0) {
            ChooseTheDayLabel.setText("Choose the Day");
        }
        else if (changer == 1) {
            ChooseTheDayLabel.setText("Select the Theme");
        }

        CancelButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        SelectButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        SelectButton.setText("Select");
        SelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChangeDayNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ChooseTheDayLabel))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChooseTheDayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChangeDayNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectButton)
                    .addComponent(CancelButton))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void ChangeDayNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {  
    	if (changer == 0) {
        	WeeklySchedulerGUI.dayname = ChangeDayNameComboBox.getSelectedItem().toString();	
    	}
    	else if (changer == 1) {
    		String theme_var = ChangeDayNameComboBox.getSelectedItem().toString();
    		
//    		"Acryl", "Aero", "Aluminum", "Bernstein", "Fast", "Graphite", "HiFi", "Luna", "Mac", "Mint", "Noire","Smart", "Marble"
    	    
    		switch (theme_var){
    			case ("Acryl"):
    				StudentAid.theme = "com.jtattoo.plaf.acryl.AcrylLookAndFeel";
    			break;
    			case ("Aero"):
    				StudentAid.theme = "com.jtattoo.plaf.aero.AeroLookAndFeel";
    			break;
    			case ("Aluminum"):
    				StudentAid.theme = "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel";
    			break;
    			case ("Bernstein"):
    				StudentAid.theme = "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel";
    			break;
    			case ("Fast"):
    				StudentAid.theme = "com.jtattoo.plaf.fast.FastLookAndFeel";
    			break;
    			case ("Graphite"):
    				StudentAid.theme = "com.jtattoo.plaf.graphite.GraphiteLookAndFeel";
    			break;
    			case ("HiFi"):
    				StudentAid.theme = "com.jtattoo.plaf.hifi.HiFiLookAndFeel";
    			break;
    			case ("Luna"):
    				StudentAid.theme = "com.jtattoo.plaf.luna.LunaLookAndFeel";
    			break;
    			case ("Mac"):
    				StudentAid.theme = "com.jtattoo.plaf.mcwin.McWinLookAndFeel";
    			break;
    			case ("Mint"):
    				StudentAid.theme = "com.jtattoo.plaf.mint.MintLookAndFeel";
    			break;
    			case ("Noire"):
    				StudentAid.theme = "com.jtattoo.plaf.noire.NoireLookAndFeel";
    			break;
    			case ("Smart"):
    				StudentAid.theme = "com.jtattoo.plaf.smart.SmartLookAndFeel";
    			break;
    			case ("Marble"):
    				StudentAid.theme = "com.jtattoo.plaf.texture.TextureLookAndFeel";
    			break;
    		}
    	}
    }                                                     

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	if (changer == 0) {
        	setVisible(false);
    	}
    	else if (changer == 1) {
        	setVisible(false);
        	MainGUI obj = new MainGUI();
        	obj.setVisible(true);	
    	}

    }                                            

    private void SelectButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	if (changer == 0) {
        	WeeklySchedulerGUI.DayLabel.setText("Schedule OF " + WeeklySchedulerGUI.dayname);
        	WeeklySchedulerGUI.daynum = WeeklySchedulerGUI.DayNumDeterminer(WeeklySchedulerGUI.dayname);
        	setVisible(false);
        	WeeklySchedulerGUI.Periods = new String[] {"", "", "", "", "", "", ""};
        	WeeklySchedulerGUI.PrintLabels();
        	WeeklySchedulerDB obj = new WeeklySchedulerDB();
        	obj.GetRows(WeeklySchedulerGUI.dayname);
        	WeeklySchedulerGUI.PrintLabels();
    	}
    	else if (changer == 1) {
    		StudentAid.Theme();
    		MainGUI obj = new MainGUI();
    		setVisible(false);
    		obj.setVisible(true);
    	}
    }                                            

    // Variables declaration - do not modify                     
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox<String> ChangeDayNameComboBox;
    private javax.swing.JLabel ChooseTheDayLabel;
    private javax.swing.JButton SelectButton;
    // End of variables declaration                   
}
