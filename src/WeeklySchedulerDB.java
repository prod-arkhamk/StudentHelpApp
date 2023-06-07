
import java.sql.*;

import javax.swing.JOptionPane;

public class WeeklySchedulerDB {
	
	//@return the Connection object
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:Data_Storage/StudentAidData.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    
    public void update( int ID,int dayfilldeter, String day , String t_9_955, String t_10_1055, String t_11_1155,
    		String t_12_1255, String t_1_155, String t_2_255, String t_3_355) {
//    	System.out.println(t_9_955+t_10_1055 +t_11_1155 +t_12_1255+ t_1_155 +t_2_255 +t_3_355);
    	
    	
    	System.out.println( ID+  day +  t_9_955+  t_10_1055+  t_11_1155+
        		 t_12_1255+  t_1_155+  t_2_255+  t_3_355+  dayfilldeter);
        String sql = "UPDATE WeeklySchedulerDataTable SET Days = ? , T_9_955 = ? , "
                + "T_10_1055 = ? ," + "T_11_1155 = ? ," + "T_12_1255 = ? ," + "T_1_155= ? ,"
                + "T_2_255 = ? ," + "T_3_355 = ? ," +"FillNum = ? "
                + "WHERE ID = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, day);
            pstmt.setString(2, t_9_955);
            pstmt.setString(3, t_10_1055);
            pstmt.setString(4, t_11_1155);
            pstmt.setString(5, t_12_1255);
            pstmt.setString(6, t_1_155);
            pstmt.setString(7, t_2_255);
            pstmt.setString(8, t_3_355);
            pstmt.setInt(9, dayfilldeter);
            pstmt.setInt(10, ID);

            // update 
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Schedule Updated");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error Updating");
        }
    }
    
    public void GetRows(String daynamestring) {
    	    try (Connection conn = this.connect();) {
    	            System.out.println("Connection success");
    	            String query = "SELECT * FROM WeeklySchedulerDataTable WHERE Days ='" + daynamestring + "'";
    	            Statement stm = conn.createStatement();
    	            ResultSet rs = stm.executeQuery(query);
    	            while (rs.next()) {
    	            	WeeklySchedulerGUI.daynum = rs.getInt(10);
    	            	WeeklySchedulerGUI.dayname = rs.getString(1);
    	            	WeeklySchedulerGUI.Periods[0] = rs.getString(2);
    	            	WeeklySchedulerGUI.Periods[1] = rs.getString(3);
    	            	WeeklySchedulerGUI.Periods[2] = rs.getString(4);
    	            	WeeklySchedulerGUI.Periods[3] = rs.getString(5);
    	            	WeeklySchedulerGUI.Periods[4] = rs.getString(6);
    	            	WeeklySchedulerGUI.Periods[5] = rs.getString(7);
    	            	WeeklySchedulerGUI.Periods[6] = rs.getString(8);
    	            	WeeklySchedulerGUI.PeriodsNum[WeeklySchedulerGUI.daynum-1] = rs.getInt(9);
    	            	
    	            	WeeklySchedulerGUI.PrintLabels();
    	            	WeeklySchedulerGUI.DayLabel.setText("Schedule OF " + WeeklySchedulerGUI.dayname);
    	            }
    	        } catch (Exception e) {
    	        System.out.println("Error GetRows");
    	        }
    }

}




