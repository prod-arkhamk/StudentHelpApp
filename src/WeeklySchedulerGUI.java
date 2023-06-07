import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;

@SuppressWarnings ("deprecation")
public class WeeklySchedulerGUI extends javax.swing.JFrame {
		
	static String dayname = "Monday";
	static int daynum = DayNumDeterminer(dayname),det;
	
	static String[] Periods = {"", "", "", "", "", "", ""};
	static int[] PeriodsNum = {0, 0, 0, 0, 0};


	static int DayNumDeterminer(String daynamestring) {
		int daynumdet=0;
		switch (daynamestring) {
		case "Monday":
			daynumdet = 1;
			break;
		case "Tuesday":
			daynumdet = 2;
			break;
		case "Wednesday":
			daynumdet = 3;
			break;
		case "Thursday":
			daynumdet = 4;
			break;
		case "Friday":
			daynumdet = 5;
			break;
		}
		return daynumdet;						
	}
	
    public WeeklySchedulerGUI() {
        initComponents();
    }

    static void PrintLabels() {
        Per1Label.setText(Periods[0]);
        Per2Label.setText(Periods[1]);
        Per3Label.setText(Periods[2]);
        Per4Label.setText(Periods[3]);
        Per5Label.setText(Periods[4]);
        Per6Label.setText(Periods[5]);
        Per7Label.setText(Periods[6]);
    }
    
    static void SetAlarm(int hh, int mm, int ss, int activation, String classname) {
    	ActionListener timerListener = new ActionListener(){     	
            public void actionPerformed(ActionEvent e){           	
                Date date = new Date();
				int sc = date.getSeconds();
                int mn = date.getMinutes();
                int hr = date.getHours();
        	    Component Jframe = null;
                if (sc == ss && mn == mm && hr == hh){
                	switch (activation) {
                	case 1:
                        WindowsNotification.displayTray(classname);
                        break;
                	case 0:
                        JOptionPane.showMessageDialog(Jframe,"Alarm is now off","Alarm Setting",JOptionPane.PLAIN_MESSAGE);
                    	break;
                	}
                    	
                }   
            }
        };
        Timer timer = new Timer(1000, timerListener);
        // to make sure it doesn't wait one second at the start
        timer.setInitialDelay(0);
        timer.start();
    }
    
    private void initComponents() {
    	
        Per3Label = new javax.swing.JLabel();
        Per1Label = new javax.swing.JLabel();
        Per2Label = new javax.swing.JLabel();
        Per4Label = new javax.swing.JLabel();
        Per7Label = new javax.swing.JLabel();
        Per6Label = new javax.swing.JLabel();
        Per5Label = new javax.swing.JLabel();
        MainWeeklySchedLabel = new javax.swing.JLabel();
        Time1Label = new javax.swing.JLabel();
        Time2Label = new javax.swing.JLabel();
        Time4Label = new javax.swing.JLabel();
        Time3Label = new javax.swing.JLabel();
        Time5Label = new javax.swing.JLabel();
        Time7Label = new javax.swing.JLabel();
        Time6Label = new javax.swing.JLabel();
        EnterSubTextField = new javax.swing.JTextField();
        DayLabel = new javax.swing.JLabel();
        ExitButtonWeeklyScheduler = new javax.swing.JButton();
        DelDayButton = new javax.swing.JButton();
        EnterSubLabel = new javax.swing.JLabel();
        ChangeDayButton = new javax.swing.JButton();
        BackButtonWeeklyScheduler = new javax.swing.JButton();
        SaveAllEntriesButton = new javax.swing.JButton();
        Alarm9AMCheckBox = new javax.swing.JCheckBox();
        Alarm10AMCheckBox = new javax.swing.JCheckBox();
        Alarm11AMCheckBox = new javax.swing.JCheckBox();
        Alarm2PMCheckBox = new javax.swing.JCheckBox();
        Alarm1PMCheckBox = new javax.swing.JCheckBox();
        Alarm12PMCheckBox = new javax.swing.JCheckBox();
        Alarm3PMCheckBox = new javax.swing.JCheckBox();
        Period1Label = new javax.swing.JLabel();
        Period2Label = new javax.swing.JLabel();
        Period4Label = new javax.swing.JLabel();
        Period3Label = new javax.swing.JLabel();
        Period7Label = new javax.swing.JLabel();
        Period6Label = new javax.swing.JLabel();
        Period5Label = new javax.swing.JLabel();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Weekly Scheduler");
        setResizable(false);

        Per1Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Per1Label.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        Per1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Per2Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Per2Label.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        Per2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        Per3Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Per3Label.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        Per3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Per4Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Per4Label.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        Per4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Per5Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Per5Label.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        Per5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Per6Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Per6Label.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        Per6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Per7Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Per7Label.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        Per7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        Period1Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Period1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Period1Label.setText("Period 1");
        Period1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Period2Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Period2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Period2Label.setText("Period 2");
        Period2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Period4Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Period4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Period4Label.setText("Period 4");
        Period4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Period3Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Period3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Period3Label.setText("Period 3");
        Period3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Period7Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Period7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Period7Label.setText("Period 7");
        Period7Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Period6Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Period6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Period6Label.setText("Period 6");
        Period6Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Period5Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Period5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Period5Label.setText("Period 5");
        Period5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
        MainWeeklySchedLabel.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        MainWeeklySchedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainWeeklySchedLabel.setText("Weekly Scheduler");
    	
        Time1Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Time1Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Time1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Label.setText("9:00AM");

        Time2Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Time2Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Time2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Label.setText("10:00AM");
        
        Time3Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Time3Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Time3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time3Label.setText("11:00AM");

        Time4Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Time4Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Time4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time4Label.setText("12:00PM");

        Time5Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Time5Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Time5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time5Label.setText("1:00PM");
        
        Time6Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Time6Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Time6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time6Label.setText("2:00PM");

        Time7Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Time7Label.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        Time7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time7Label.setText("3:00PM");
        
        SaveAllEntriesButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        SaveAllEntriesButton.setText("Save All Entries");
        SaveAllEntriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAllEntriesButtonActionPerformed(evt);
            }
        });
        
        EnterSubTextField.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        EnterSubTextField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterSubTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterSubTextFieldActionPerformed(evt);
            }
        });

        DayLabel.setFont(new java.awt.Font("Rondalo", 0, 20)); // NOI18N
        DayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DayLabel.setText("Schedule OF " + dayname);
        DayLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ExitButtonWeeklyScheduler.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        ExitButtonWeeklyScheduler.setText("Exit");
        ExitButtonWeeklyScheduler.setPreferredSize(new java.awt.Dimension(96, 50));
        ExitButtonWeeklyScheduler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonWeeklySchedulerActionPerformed(evt);
            }
        });

        BackButtonWeeklyScheduler.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        BackButtonWeeklyScheduler.setText("Back");
        BackButtonWeeklyScheduler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonWeeklySchedulerActionPerformed(evt);
            }
        });

        DelDayButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        DelDayButton.setText("Delete Day");
        DelDayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelDayButtonActionPerformed(evt);
            }
        });

        EnterSubLabel.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        EnterSubLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterSubLabel.setText("Enter Subject");

        ChangeDayButton.setFont(new java.awt.Font("Rondalo", 0, 24)); // NOI18N
        ChangeDayButton.setText("Change Day");
        ChangeDayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeDayButtonActionPerformed(evt);
            }
        });

        Alarm9AMCheckBox.setFont(new java.awt.Font("Rondalo", 0, 13)); // NOI18N
        Alarm9AMCheckBox.setText("Set Alarm");
        Alarm9AMCheckBox.addItemListener(new ItemListener(){
        	public void itemStateChanged(ItemEvent e) {
        		if (e.getStateChange()==1) {
        			System.out.println("Alarm Set for 9");
        			SetAlarm(011,00,00,1,Periods[0]);	
        		}
        		else {
                    Date date = new Date();
        			SetAlarm(date.getHours(),date.getMinutes(),date.getSeconds(),0,Periods[0]);
        		}
        	}
        });

        Alarm10AMCheckBox.setFont(new java.awt.Font("Rondalo", 0, 13)); // NOI18N
        Alarm10AMCheckBox.setText("Set Alarm");
        Alarm10AMCheckBox.addItemListener(new ItemListener(){
        	public void itemStateChanged(ItemEvent e) {
        		if (e.getStateChange()==1) {
        			System.out.println("Alarm Set for 10");
        			SetAlarm(10,00,00,1,Periods[1]);

        		}
        		else {
                    Date date = new Date();
        			SetAlarm(date.getHours(),date.getMinutes(),date.getSeconds(),0,Periods[1]);
        		}
        	}
        });

        Alarm11AMCheckBox.setFont(new java.awt.Font("Rondalo", 0, 13)); // NOI18N
        Alarm11AMCheckBox.setText("Set Alarm");
        Alarm11AMCheckBox.addItemListener(new ItemListener(){
        	public void itemStateChanged(ItemEvent e) {
        		if (e.getStateChange()==1) {
        			System.out.println("Alarm Set for 11");
        			SetAlarm(11,00,00,1,Periods[2]);

        		}
        		else {
                    Date date = new Date();
        			SetAlarm(date.getHours(),date.getMinutes(),date.getSeconds(),0,Periods[2]);
        		}
        	}
        });
        
        Alarm12PMCheckBox.setFont(new java.awt.Font("Rondalo", 0, 13)); // NOI18N
        Alarm12PMCheckBox.setText("Set Alarm");
        Alarm12PMCheckBox.addItemListener(new ItemListener(){
        	public void itemStateChanged(ItemEvent e) {
        		if (e.getStateChange()==1) {
        			System.out.println("Alarm Set for 12");
        			SetAlarm(12,00,00,1,Periods[3]);

        		}
        		else {
                    Date date = new Date();
        			SetAlarm(date.getHours(),date.getMinutes(),date.getSeconds(),0,Periods[3]);
        		}
        	}
        });
                
        Alarm1PMCheckBox.setFont(new java.awt.Font("Rondalo", 0, 13)); // NOI18N
        Alarm1PMCheckBox.setText("Set Alarm");
        Alarm1PMCheckBox.addItemListener(new ItemListener(){
        	public void itemStateChanged(ItemEvent e) {
        		if (e.getStateChange()==1) {
        			System.out.println("Alarm Set for 1");
        			SetAlarm(13,00,00,1,Periods[4]);

        		}
        		else {
                    Date date = new Date();
        			SetAlarm(date.getHours(),date.getMinutes(),date.getSeconds(),0,Periods[4]);
        		}
        	}
        });

        Alarm2PMCheckBox.setFont(new java.awt.Font("Rondalo", 0, 13)); // NOI18N
        Alarm2PMCheckBox.setText("Set Alarm");
        Alarm2PMCheckBox.addItemListener(new ItemListener(){
        	public void itemStateChanged(ItemEvent e) {
        		if (e.getStateChange()==1) {
        			System.out.println("Alarm Set for 2");
        			SetAlarm(14,00,00,1,Periods[5]);

        		}
        		else {
                    Date date = new Date();
        			SetAlarm(date.getHours(),date.getMinutes(),date.getSeconds(),0,Periods[5]);
        		}
        	}
        });


        Alarm3PMCheckBox.setFont(new java.awt.Font("Rondalo", 0, 13)); // NOI18N
        Alarm3PMCheckBox.setText("Set Alarm");
        Alarm3PMCheckBox.addItemListener(new ItemListener(){
        	public void itemStateChanged(ItemEvent e) {
        		if (e.getStateChange()==1) {
        			System.out.println("Alarm Set for 3");
        			SetAlarm(15,00,00,1,Periods[6]);

        		}
        		else {
                    Date date = new Date();
        			SetAlarm(date.getHours(),date.getMinutes(),date.getSeconds(),0,Periods[6]);
        		}
        	}
        });
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ChangeDayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SaveAllEntriesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(DelDayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Per1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Alarm9AMCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Time1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Per2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Alarm10AMCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Time2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Per3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Per4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Per5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Per6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Per7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Time3Label, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(Alarm11AMCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Time4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Time5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Alarm12PMCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Alarm1PMCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Time6Label, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(Alarm2PMCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Time7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Alarm3PMCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ExitButtonWeeklyScheduler, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EnterSubTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(EnterSubLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(161, 161, 161)
                                .addComponent(BackButtonWeeklyScheduler))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Period1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Period2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Period3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Period4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Period5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Period6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Period7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainWeeklySchedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(MainWeeklySchedLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Period1Label)
                    .addComponent(Period2Label)
                    .addComponent(Period3Label)
                    .addComponent(Period4Label)
                    .addComponent(Period5Label)
                    .addComponent(Period6Label)
                    .addComponent(Period7Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Per7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Per5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Per6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Per4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Per3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Per1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Per2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Time1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Time3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Time4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Time5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Time6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Time7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Alarm12PMCheckBox)
                                .addComponent(Alarm1PMCheckBox)
                                .addComponent(Alarm2PMCheckBox)
                                .addComponent(Alarm3PMCheckBox))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Alarm9AMCheckBox)
                                .addComponent(Alarm11AMCheckBox))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Time2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alarm10AMCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveAllEntriesButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangeDayButton)
                    .addComponent(DelDayButton))
                .addGap(18, 18, 18)
                .addComponent(EnterSubLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterSubTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButtonWeeklyScheduler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButtonWeeklyScheduler))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);

    }// </editor-fold>                        

    private void EnterSubTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	String input = EnterSubTextField.getText();
    	int i = 0;
    	do {
    		if (Periods[i].equals("")) {
    			Periods[i] = input;
    			System.out.println(Periods[i]);
    			i++;
    			break;
	       	}
	       	else {
	       		i++;
	       	}
	   	} while (i<=6);
        PrintLabels();
    }                                                                                                  
                                                                                                        

    private void DelDayButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	Periods = new String[] {"", "", "", "", "", "", ""};
    	
    	PeriodsNum[daynum-1] = 0;
    	WeeklySchedulerDB obj = new WeeklySchedulerDB();
    	obj.update(daynum, PeriodsNum[daynum-1],dayname , Periods[0], Periods[1], Periods[2],
    			Periods[3], Periods[4], Periods[5], Periods[6]);
    	PrintLabels();
    }                                            

    private void ChangeDayButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    	ChooseDay obj = new ChooseDay(0);
    	obj.setVisible(true);
    }                                                

    private void ExitButtonWeeklySchedulerActionPerformed(java.awt.event.ActionEvent evt) {                                                          
    	System.exit(0);
    }  

    private void BackButtonWeeklySchedulerActionPerformed(java.awt.event.ActionEvent evt) {                                                          
    	setVisible(false);
    	MainGUI obj = new MainGUI();
    	obj.setVisible(true);
    }     
    
    private void SaveAllEntriesButtonActionPerformed(java.awt.event.ActionEvent evt) {   
    	WeeklySchedulerDB obj = new WeeklySchedulerDB();
    	
    	if (Periods[0].equals("")) {
        	PeriodsNum[daynum-1]=0;
        	System.out.println("0");
    	} 
    	else {
        	PeriodsNum[daynum-1]=1;
        	System.out.println(PeriodsNum[daynum-1]);
        	System.out.println(daynum);
    	}
    	
    	obj.update(daynum,PeriodsNum[daynum-1], dayname , Periods[0], Periods[1], Periods[2],
    			Periods[3], Periods[4], Periods[5], Periods[6]);
    }                                             

                                                                                               
    
    // Variables declaration - do not modify        
    private javax.swing.JButton SaveAllEntriesButton;
    private javax.swing.JButton BackButtonWeeklyScheduler;
    private javax.swing.JButton ChangeDayButton;
    static javax.swing.JLabel DayLabel;
    private javax.swing.JButton DelDayButton;
    private javax.swing.JLabel EnterSubLabel;
    private javax.swing.JTextField EnterSubTextField;
    private javax.swing.JButton ExitButtonWeeklyScheduler;
    private javax.swing.JLabel MainWeeklySchedLabel;
    static private javax.swing.JLabel Per1Label;
    static private javax.swing.JLabel Per2Label;
    static private javax.swing.JLabel Per3Label;
    static private javax.swing.JLabel Per4Label;
    static private javax.swing.JLabel Per5Label;
    static private javax.swing.JLabel Per6Label;
    static private javax.swing.JLabel Per7Label;
    private javax.swing.JLabel Time1Label;
    private javax.swing.JLabel Time2Label;
    private javax.swing.JLabel Time3Label;
    private javax.swing.JLabel Time4Label;
    private javax.swing.JLabel Time5Label;
    private javax.swing.JLabel Time6Label;
    private javax.swing.JLabel Time7Label;
    private javax.swing.JCheckBox Alarm10AMCheckBox;
    private javax.swing.JCheckBox Alarm11AMCheckBox;
    private javax.swing.JCheckBox Alarm12PMCheckBox;
    private javax.swing.JCheckBox Alarm1PMCheckBox;
    private javax.swing.JCheckBox Alarm2PMCheckBox;
    private javax.swing.JCheckBox Alarm3PMCheckBox;
    private javax.swing.JCheckBox Alarm9AMCheckBox;
    private javax.swing.JLabel Period1Label;
    private javax.swing.JLabel Period2Label;
    private javax.swing.JLabel Period3Label;
    private javax.swing.JLabel Period4Label;
    private javax.swing.JLabel Period5Label;
    private javax.swing.JLabel Period6Label;
    private javax.swing.JLabel Period7Label;
    
    //taskname, description, priority, duedate, category
}