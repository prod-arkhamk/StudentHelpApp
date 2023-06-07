import java.util.*;
import javax.swing.*;


public class PMH_CheckerGUI extends javax.swing.JFrame {
	static String PMH_Changer, P_Data_Storage="null";
	static float p_wholerate=10, m_wholerate=10 ;
		
	Scanner ip = new Scanner(System.in);	

    public PMH_CheckerGUI(String PMH_Changer) {
    	this.PMH_Changer = PMH_Changer;
        initComponents();
    }
    
    private void initComponents() {

        PHC_Rating = new javax.swing.JLabel();
        PHC_MainLabel1 = new javax.swing.JLabel();
        PHC_ProblemInputTextField = new javax.swing.JTextField();
        PHC_RatePrompt = new javax.swing.JLabel();
        PHC_ProbPrompt = new javax.swing.JLabel();
        PHC_YourEntryButton = new javax.swing.JButton();
        PHC_ExitPhyCheckerButton = new javax.swing.JButton();
        RatingComboBox = new javax.swing.JComboBox<>();
        PHC_BackPhyCheckerButton = new javax.swing.JButton();
        PHC_SaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student "+PMH_Changer+" Health Checker");
        setBounds(new java.awt.Rectangle(0, 0, 360, 480));
        setResizable(false);

        PHC_Rating.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        PHC_Rating.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
    	if(PMH_Changer.equals("Physical")){
            PHC_Rating.setText("Your "+PMH_Changer+" Health is rated "+p_wholerate+"/10");
    	}
    	else if(PMH_Changer.equals("Mental")){
            PHC_Rating.setText("Your "+PMH_Changer+" Health is rated "+m_wholerate+"/10");
    	}
    	
        PHC_MainLabel1.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        PHC_MainLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PHC_MainLabel1.setText(PMH_Changer+" Health Checker");

        PHC_ProblemInputTextField.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        PHC_ProblemInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHC_ProblemInputTextFieldActionPerformed(evt);
            }
        });

        PHC_RatePrompt.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        PHC_RatePrompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        PHC_RatePrompt.setText("Rate your problem (1-10)");
        PHC_RatePrompt.setText("Rate your issue/problem");


        PHC_ProbPrompt.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        PHC_ProbPrompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PHC_ProbPrompt.setText("Tell us what happened?");

        PHC_YourEntryButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        PHC_YourEntryButton.setText("Your Entries");
        PHC_YourEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHC_YourEntryButtonActionPerformed(evt);
            }
        });

        PHC_ExitPhyCheckerButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        PHC_ExitPhyCheckerButton.setText("Exit ");
        PHC_ExitPhyCheckerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHC_ExitPhyCheckerButtonActionPerformed(evt);
            }
        });
        
        RatingComboBox.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        RatingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", }));
        RatingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatingComboBoxActionPerformed(evt);
            }
        });

        PHC_BackPhyCheckerButton.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        PHC_BackPhyCheckerButton.setText("Back");
        PHC_BackPhyCheckerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHC_BackPhyCheckerButtonActionPerformed(evt);
            }
        });
        
        PHC_SaveButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        PHC_SaveButton.setText("Save");
        PHC_SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHC_SaveButtonActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PHC_Rating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PHC_MainLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PHC_ProbPrompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PHC_ExitPhyCheckerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PHC_BackPhyCheckerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PHC_ProblemInputTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PHC_RatePrompt)
                        .addGap(18, 18, 18)
                        .addComponent(RatingComboBox, 0, 70, Short.MAX_VALUE))
                    .addComponent(PHC_SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PHC_YourEntryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(PHC_MainLabel1)
                .addGap(18, 18, 18)
                .addComponent(PHC_Rating)
                .addGap(18, 18, 18)
                .addComponent(PHC_ProbPrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHC_ProblemInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RatingComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(PHC_RatePrompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PHC_SaveButton)
                .addGap(18, 18, 18)
                .addComponent(PHC_YourEntryButton)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PHC_BackPhyCheckerButton)
                    .addComponent(PHC_ExitPhyCheckerButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
        }// </editor-fold>                                                                       

    private void PHC_YourEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {    
    	System.out.println(StudentAid.p_probs);
    	
    	for(int i = 0; i<10 ;  i++) {
        	System.out.println(StudentAid.p_probs_ratings[i]);
    	}

        if (PMH_Changer.equals("Physical")) {
        	setVisible(false);
        	EntryTabGUI obj = new EntryTabGUI("Physical");
        	obj.setVisible(true);
        	}
        else if (PMH_Changer.equals("Mental")) {
        	setVisible(false);
        	EntryTabGUI obj = new EntryTabGUI("Mental");
        	obj.setVisible(true);
        }	
    }                                                   

    private void PHC_ExitPhyCheckerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                         
    	System.exit(0);
    }                                                        

    private void PHC_ProblemInputTextFieldActionPerformed(java.awt.event.ActionEvent evt){                                                          
		
    }                                                         
    
    private void PHC_BackPhyCheckerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        	setVisible(false);
        	HealthCheckerGUI obj = new HealthCheckerGUI();
        	obj.setVisible(true);
    }  
    
    private void RatingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                       // TODO add your handling code here:
    }                                              

    private void PHC_SaveButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        //Problems
    	String inputprobs = PHC_ProblemInputTextField.getText();   //receive input from text field

    	System.out.println(inputprobs);
        if (PMH_Changer.equals("Physical")) {
        	StudentAid.p_probs.add(inputprobs);      	
		    if (P_Data_Storage.equals("null")) {
    		    P_Data_Storage=inputprobs;
    		    P_Data_Storage += ", ";
		    }
		    else {
       		    P_Data_Storage += inputprobs;
    		    P_Data_Storage += ", ";
		    }
    	}
        else if (PMH_Changer.equals("Mental")) {
        	StudentAid.m_probs.add(inputprobs);
		    System.out.print("\nYour list: \n");
    		for (String list : StudentAid.m_probs) {
    		    System.out.print(list + " ");
    		}
        }
        System.out.println(P_Data_Storage);

        //Ratings
    	String inputratings = RatingComboBox.getSelectedItem().toString();  
        System.out.println(inputratings);
        inputratings = inputratings.replaceAll("\\s", "");
        
        int number = Integer.parseInt(inputratings);

        if (PMH_Changer.equals("Physical")) {
        	int i=0;
           	do {
               	if (StudentAid.p_probs_ratings[i] == 0) {
               		StudentAid.p_probs_ratings[i] = number;
               		StudentAid.p_avgcount = i;
                   	StudentAid.avg_p_health_sum += StudentAid.p_probs_ratings[i];
        		    System.out.print("\nYour ratings: \n");
        		    System.out.print(StudentAid.p_probs_ratings[i]);
                   	break;
               	}
               	else {
               		i++;
               	}
           	} while (i<=10);
    	}
        else if (PMH_Changer.equals("Mental")) {
        	int i=0;
           	do {
               	if (StudentAid.m_probs_ratings[i] == 0) {
               		StudentAid.m_probs_ratings[i] = number;
               		StudentAid.m_avgcount = i;
               		StudentAid.avg_m_health_sum += StudentAid.m_probs_ratings[i];
        		    System.out.print("\nYour ratings: \n");
        		    System.out.print(StudentAid.m_probs_ratings[i]);
                   	break;
               	}
               	else {
               		i++;
               	}
           	} while (i<=10);
    	}

        //Calculations
    	if(PMH_Changer.equals("Physical")){
    		StudentAid.P_AvgCalc();
        	p_wholerate = StudentAid.avg_p_health;
            PHC_Rating.setText("Your "+PMH_Changer+" Health is rated "+p_wholerate+"/10");

            if (p_wholerate <= 4) {
                JOptionPane.showMessageDialog(this, "You should check in with a doctor, really...","Advice", JOptionPane.WARNING_MESSAGE);
           	}
           	else if (p_wholerate > 4 && p_wholerate <= 8) {
                JOptionPane.showMessageDialog(this, "Take care of yourself, you're in good shape but can be better!","Advice", JOptionPane.WARNING_MESSAGE);
            }
           	else if (p_wholerate > 8 && p_wholerate <= 10) {
                JOptionPane.showMessageDialog(this, "You're in perfect health. That's great!","Advice", JOptionPane.WARNING_MESSAGE);
            }	
    	}
    	else if (PMH_Changer.equals("Mental")) {
    		StudentAid.M_AvgCalc();
        	m_wholerate = StudentAid.avg_m_health;
            PHC_Rating.setText("Your "+PMH_Changer+" Health is rated "+m_wholerate+"/10");

            if (m_wholerate <= 4) {
                JOptionPane.showMessageDialog(this, "You should check in with a therapist, really...","Advice", JOptionPane.WARNING_MESSAGE);
           	}
           	else if (m_wholerate > 4 && m_wholerate <= 8) {
                JOptionPane.showMessageDialog(this, "Take care of yourself, you're in good shape but can be better!","Advice", JOptionPane.WARNING_MESSAGE);
            }
           	else if (m_wholerate > 8 && m_wholerate <= 10) {
                JOptionPane.showMessageDialog(this, "You're in perfect health. That's great!","Advice", JOptionPane.WARNING_MESSAGE);
            }	
    	}
    	
    	//Database
    	HealthCheckerDB obj = new HealthCheckerDB();
    	obj.update();
    }  
    
    // Variables declaration - do not modify
    private javax.swing.JButton PHC_BackPhyCheckerButton;
    static private javax.swing.JComboBox<String> RatingComboBox;
    private javax.swing.JButton PHC_ExitPhyCheckerButton;
    private javax.swing.JLabel PHC_MainLabel1;
    private javax.swing.JLabel PHC_ProbPrompt;
    private javax.swing.JTextField PHC_ProblemInputTextField;
    private javax.swing.JLabel PHC_RatePrompt;
    static javax.swing.JLabel PHC_Rating;
    private javax.swing.JButton PHC_YourEntryButton;
    private javax.swing.JButton PHC_SaveButton;
    // End of variables declaration                   
}