
import java.sql.*;

import javax.swing.*;
import javax.swing.table.*;


public class HealthCheckerDB {

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:Data_Storage/StudentAidData.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
        	System.out.println("Error in connection");
        }
        return conn;
    }
    
    public void update() {
    	if(PMH_CheckerGUI.PMH_Changer.equals("Physical")) {
    	    try (Connection conn = this.connect();) {
	            // Database connection Query
	            Statement st = conn.createStatement();
	            
	            // Insert Query
	            String insert_query = "insert into PhysicalHealthTable (Problems, Ratings, IDNUM) values ('"+StudentAid.p_probs.get(StudentAid.p_probs.size()-1)+"','"+StudentAid.p_probs_ratings[StudentAid.p_probs.size()-1]+"','"+StudentAid.p_probs.size()+"')";
	            
	            st.executeUpdate(insert_query);
	            
	            JOptionPane.showMessageDialog(null, "Entry Saved");
	        }  
    	    catch(Exception e){
    	    	JOptionPane.showMessageDialog(null, "Error in updating physical table", "ALERT", JOptionPane.ERROR_MESSAGE);
    	    }	    
    	}
    	else if(PMH_CheckerGUI.PMH_Changer.equals("Mental")) {
    	    try (Connection conn = this.connect();) {
	            // Database connection Query
	            Statement st = conn.createStatement();
	            
	            // Insert Query
	            String insert_query = " insert into MentalHealthTable (Problems, Ratings, IDNUM)"
	            +  " values ('"+StudentAid.m_probs.get(StudentAid.m_probs.size()-1)+"','"+StudentAid.m_probs_ratings[StudentAid.m_probs.size()-1]+"','"+StudentAid.m_probs.size()+"')";
	            
	            st.executeUpdate(insert_query);
	            
	            JOptionPane.showMessageDialog(null, "Entry Saved");
	        }  
    	    catch(Exception e){
    	    	JOptionPane.showMessageDialog(null, "Error in updating mental table", "ALERT", JOptionPane.ERROR_MESSAGE);
    	    }	    

    	}

    }
    
    public void ShowTable() {
    	if(PMH_CheckerGUI.PMH_Changer.equals("Physical")) {
        	try(Connection conn = this.connect();){
	            String QUERY = "select * from PhysicalHealthTable";
	            
	            StudentAid.p_probs.clear();
            	StudentAid.p_probs_ratings= new int[10];
	            
	            Statement st = conn.createStatement();
	            ResultSet rs = (ResultSet) st.executeQuery(QUERY);
	            int i = 0;           
	            while(rs.next()){
	            	StudentAid.p_probs.add(rs.getString("Problems"));
	            	StudentAid.p_probs_ratings[i] = rs.getInt("Ratings");
	            	i++;
	            }    	            
        	}
        	catch(Exception e){
        		JOptionPane.showMessageDialog(null, "Error in showing physical table", "ERROR", JOptionPane.ERROR_MESSAGE);
        	}     
    	}
    	else if (PMH_CheckerGUI.PMH_Changer.equals("Mental")) {
        	try(Connection conn = this.connect();){
	            String QUERY = "select * from MentalHealthTable";
	            
	            StudentAid.m_probs.clear();
            	StudentAid.m_probs_ratings= new int[10];
	            
	            // Database connection Query
	            Statement st = conn.createStatement();
	            ResultSet rs = (ResultSet) st.executeQuery(QUERY);
	            int i = 0;          
	            while(rs.next()){
	            	StudentAid.m_probs.add(rs.getString("Problems"));
	            	StudentAid.m_probs_ratings[i] = rs.getInt("Ratings");
	            	i++;
	            }    	            
        	}
        	catch(Exception e){
        		JOptionPane.showMessageDialog(null, "Error in showing mental table", "ERROR", JOptionPane.ERROR_MESSAGE);
        	}     
    	}
    }

    public void delete() {
    	
    	if(PMH_CheckerGUI.PMH_Changer.equals("Physical")) {            
            //Removing elements from array
        	StudentAid.p_probs.remove(EntryTabGUI.entry_del_num-1);
        	StudentAid.p_probs_ratings = StudentAid.removeTheElement(StudentAid.p_probs_ratings, EntryTabGUI.entry_del_num-1);
        	
        	//Emptying the whole table
            String sql2 = "DELETE FROM PhysicalHealthTable";
            try (Connection conn = this.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql2)) {
                pstmt.executeUpdate();
                } catch (SQLException e) {
            		JOptionPane.showMessageDialog(null, "Error in deletion of whole physical table", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            
            //Re-entering new formed array in the empty table
            for (int i = 0; i < StudentAid.p_probs.size(); i++) {
        	    try (Connection conn = this.connect();) {
                    // Database connection Query
                    Statement st = conn.createStatement();
                    
                    // Insert Query
                    String insert_query = " insert into PhysicalHealthTable (Problems, Ratings, IDNUM)"
                    +  " values ('"+StudentAid.p_probs.get(i)+"','"+StudentAid.p_probs_ratings[i]+"','"+(i+1)+"')";
                    
                    st.executeUpdate(insert_query);
                    
                }  
        	    catch(Exception e){
        	    	JOptionPane.showMessageDialog(null, "Error in reinserting physical table", "ALERT", JOptionPane.ERROR_MESSAGE);
        	    }	    
            }

            JOptionPane.showMessageDialog(null, "Deleted");
    	}
    	else if (PMH_CheckerGUI.PMH_Changer.equals("Mental")) {
            //Removing elements from array
        	StudentAid.m_probs.remove(EntryTabGUI.entry_del_num-1);
        	StudentAid.m_probs_ratings = StudentAid.removeTheElement(StudentAid.m_probs_ratings, EntryTabGUI.entry_del_num-1);
        	
        	//Emptying the whole table
            String sql2 = "DELETE FROM MentalHealthTable";
            try (Connection conn = this.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql2)) {
                pstmt.executeUpdate();
                } catch (SQLException e) {
            		JOptionPane.showMessageDialog(null, "Error in deletion of whole mental table", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            
            //Re-entering new formed array in the empty table
            for (int i = 0; i < StudentAid.m_probs.size(); i++) {
        	    try (Connection conn = this.connect();) {
                    Statement st = conn.createStatement();
                    
                    String insert_query = " insert into MentalHealthTable (Problems, Ratings, IDNUM)"
                    +  " values ('"+StudentAid.m_probs.get(i)+"','"+StudentAid.m_probs_ratings[i]+"','"+(i+1)+"')";
                    
                    st.executeUpdate(insert_query);
                    
                }  
        	    catch(Exception e){
        	    	JOptionPane.showMessageDialog(null, "Error in reinserting mental table", "ALERT", JOptionPane.ERROR_MESSAGE);
        	    }	    
            }

            JOptionPane.showMessageDialog(null, "Deleted");
    	}        
    }
 
}


