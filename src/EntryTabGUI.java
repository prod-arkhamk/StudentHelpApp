import java.awt.*;
import javax.swing.*;

public class EntryTabGUI extends javax.swing.JFrame {
	static String del_input, typechanger;
	static int entry_del_num;

    public EntryTabGUI(String typechanger) {
    	this.typechanger = typechanger;
        initComponents();
    }
    
    static void P_Calculator() {
    	StudentAid.avg_p_health_sum -= StudentAid.p_probs_ratings[entry_del_num-1];
    	StudentAid.p_avgcount -= 1;
    } 
    static void P_RatingLabel() {
    	PMH_CheckerGUI.p_wholerate = StudentAid.avg_p_health;
    	HE_Rating.setText("Your "+PMH_CheckerGUI.PMH_Changer+" Health is rated "+PMH_CheckerGUI.p_wholerate+"/10");
    }
    
    static void M_Calculator() {
    	StudentAid.avg_m_health_sum -= StudentAid.m_probs_ratings[entry_del_num-1];
    	StudentAid.m_avgcount -= 1;
    }
    static void M_RatingLabel() {
    	PMH_CheckerGUI.m_wholerate = StudentAid.avg_m_health;
    	HE_Rating.setText("Your "+PMH_CheckerGUI.PMH_Changer+" Health is rated "+PMH_CheckerGUI.m_wholerate+"/10");
    }
    

    
    static void TableCreation(String typechanger2) {
        ProbsTable.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        if (typechanger2.equals("Physical")) {
            ProbsTable.setModel(new javax.swing.table.DefaultTableModel(
            		StudentAid.GetP_TableRows() ,
                new String [] { "Sr. No.", "Problems/Sickness", "Rating" }
            ) {
                Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            ProbsTable.setRowHeight(30);
            ProbsTable.setShowGrid(false);
            ProbsTable.setShowHorizontalLines(true);
            ProbsTable.setShowVerticalLines(true);
            ProbsTable.getTableHeader().setResizingAllowed(false);
            ProbsTable.getTableHeader().setReorderingAllowed(false);
            jScrollPane1.setViewportView(ProbsTable);
            if (ProbsTable.getColumnModel().getColumnCount() > 0) {
                ProbsTable.getColumnModel().getColumn(0).setResizable(false);
                ProbsTable.getColumnModel().getColumn(0).setPreferredWidth(60);
                ProbsTable.getColumnModel().getColumn(1).setResizable(false);
                ProbsTable.getColumnModel().getColumn(1).setPreferredWidth(150);
                ProbsTable.getColumnModel().getColumn(2).setResizable(false);
                ProbsTable.getColumnModel().getColumn(2).setPreferredWidth(60);
            }
        }
        else if (typechanger2.equals("Mental")) {
            ProbsTable.setModel(new javax.swing.table.DefaultTableModel(
            		StudentAid.GetM_TableRows() ,
                new String [] { "Sr. No.", "Problems/Sickness", "Rating" }
            ) {
                Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            ProbsTable.setRowHeight(30);
            ProbsTable.setShowGrid(false);
            ProbsTable.setShowHorizontalLines(true);
            ProbsTable.setShowVerticalLines(true);
            ProbsTable.getTableHeader().setResizingAllowed(false);
            ProbsTable.getTableHeader().setReorderingAllowed(false);
            jScrollPane1.setViewportView(ProbsTable);
            if (ProbsTable.getColumnModel().getColumnCount() > 0) {
                ProbsTable.getColumnModel().getColumn(0).setResizable(false);
                ProbsTable.getColumnModel().getColumn(0).setPreferredWidth(60);
                ProbsTable.getColumnModel().getColumn(1).setResizable(false);
                ProbsTable.getColumnModel().getColumn(1).setPreferredWidth(150);
                ProbsTable.getColumnModel().getColumn(2).setResizable(false);
                ProbsTable.getColumnModel().getColumn(2).setPreferredWidth(60);
            }
        }
    }   

    
    private void initComponents() {

        HE_BackEntryButton = new javax.swing.JButton();
        HE_Rating = new javax.swing.JLabel();
        HE_MainLabel = new javax.swing.JLabel();
        HE_DelPrompt = new javax.swing.JLabel();
        HE_DelInputTextField = new javax.swing.JTextField();
        HE_ExitEntryButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProbsTable = new javax.swing.JTable();

 	    add(new JScrollPane(ProbsTable), BorderLayout.CENTER);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student "+typechanger+" Health Entries");
        setResizable(false);
        setBounds(new java.awt.Rectangle(0, 0, 360, 480));


    	HE_Rating.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        HE_Rating.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    	if (typechanger.equals("Physical")) {
        	HE_Rating.setText("Your Physical Health is rated " +StudentAid.avg_p_health+"/10");
    	}	
    	else if (typechanger.equals("Mental")) {
        	HE_Rating.setText("Your Mental Health is rated " +StudentAid.avg_m_health+"/10");
    	}        
     
        HE_MainLabel.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        HE_MainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    	if (typechanger.equals("Physical")) {
    		HE_MainLabel.setText("Physical Health Entries");
    	}	
    	else if (typechanger.equals("Mental")) {
    		HE_MainLabel.setText("Mental Health Entries");
    	} 
        HE_DelPrompt.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        HE_DelPrompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HE_DelPrompt.setText("Delete the following entry:");

        HE_DelInputTextField.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        HE_DelInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HE_DelInputTextFieldActionPerformed(evt);
            }
        });
        
    	if (typechanger.equals("Physical")) {
        	TableCreation("Physical");
    	}
    	else if (typechanger.equals("Mental")) {
        	TableCreation("Mental");
    	}
    	
        HE_ExitEntryButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        HE_ExitEntryButton.setText("Exit");
        HE_ExitEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HE_ExitEntryButtonActionPerformed(evt);
            }
        });   
    	
        HE_BackEntryButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        HE_BackEntryButton.setText("Back");
        HE_BackEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HE_BackEntryButtonActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HE_Rating, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addComponent(HE_MainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(HE_DelPrompt)
                        .addGap(18, 18, 18)
                        .addComponent(HE_DelInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(HE_ExitEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HE_BackEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(HE_MainLabel)
                .addGap(18, 18, 18)
                .addComponent(HE_Rating)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HE_DelPrompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HE_DelInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HE_ExitEntryButton)
                    .addComponent(HE_BackEntryButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);

        }// </editor-fold>                        

    private void HE_DelInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    	del_input = HE_DelInputTextField.getText();   //receive input from text field
    	entry_del_num = Integer.parseInt(del_input);
    	HealthCheckerDB obj = new HealthCheckerDB();

    	if (typechanger.equals("Physical")) {
        	P_Calculator();
        	StudentAid.P_AvgCalc();
        	P_RatingLabel();
        	obj.delete();
        	TableCreation("Physical");
    	}	
    	else if (typechanger.equals("Mental")) {
        	M_Calculator();
        	StudentAid.M_AvgCalc();
        	M_RatingLabel();
        	obj.delete();
        	TableCreation("Mental");
    	}
    	
    }                                                    

    private void HE_ExitEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {       
    	System.exit(0);
   }
    
    private void HE_BackEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    	if (typechanger.equals("Physical")) {
        	setVisible(false);
        	PMH_CheckerGUI obj = new PMH_CheckerGUI("Physical");
        	obj.setVisible(true);
    	}	
    	else if (typechanger.equals("Mental")) {
        	setVisible(false);
        	PMH_CheckerGUI obj = new PMH_CheckerGUI("Mental");
        	obj.setVisible(true);
    	}
    }  

    // Variables declaration - do not modify  
    private javax.swing.JButton HE_BackEntryButton;
    private javax.swing.JTextField HE_DelInputTextField;
    private javax.swing.JLabel HE_DelPrompt;
    private javax.swing.JButton HE_ExitEntryButton;
    private javax.swing.JLabel HE_MainLabel;
    static private javax.swing.JLabel HE_Rating;
    static private javax.swing.JScrollPane jScrollPane1;
    static private javax.swing.JTable ProbsTable;
    // End of variables declaration                   
}
