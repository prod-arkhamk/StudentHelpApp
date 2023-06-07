
import java.sql.*;

import javax.swing.*;
import javax.swing.table.*;


public class MemosDB {

	//@return the Connection object
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:Data_Storage/StudentAidData.db";	//Linking URL
        Connection conn = null;	//Making a conn variable to save the connection status
        try {
            conn = DriverManager.getConnection(url);	//
        } catch (SQLException e) {
            System.out.println(e.getMessage());	
        }
        return conn;
    }
    
    
    public void update() {
    	    try (Connection conn = this.connect();) {
    	            // Database connection Query
    	            Statement st = conn.createStatement();
    	            
    	            // Insert Query
    	            String insert_query = " insert into MemosNotesDataTable (Memos, MemoDeets, IDNUM)"
    	            +  " values ('"+MemosEntryGUI.MemosHead.get(MemosEntryGUI.MemosHead.size()-1)+"','"+MemosEntryGUI.MemosText.get(MemosEntryGUI.MemosText.size()-1)+"','"+MemosEntryGUI.MemosText.size()+"')";
    	            
    	            st.executeUpdate(insert_query);
    	            
    	            JOptionPane.showMessageDialog(null, "Inserted");
    	        }  
        	catch(Exception e){
        	    JOptionPane.showMessageDialog(null, "Error in update", "ALERT", JOptionPane.ERROR_MESSAGE);
        	}	    
    }

    public void ShowTable() {
    	try(Connection conn = this.connect();){
    	            String QUERY = "select * from MemosNotesDataTable";
    	            // Database connection Query
    	            Statement st = conn.createStatement();
    	            ResultSet rs = (ResultSet) st.executeQuery(QUERY);
    	            
                    MemosEntryGUI.MemosHead.clear();
                    MemosEntryGUI.MemosText.clear(); 
    	            
    	            while(rs.next()){
    	            	
    	            	MemosEntryGUI.MemosHead.add(rs.getString("Memos"));
    	            	MemosEntryGUI.MemosText.add(rs.getString("MemoDeets"));
    	            	
    	                DefaultTableModel tbl = (DefaultTableModel) MemosMainGUI.MemosTable.getModel();
    	            	Object obj[]={rs.getString("Memos")};
    	            	tbl.addRow(obj);
    	            }    	            
    	}
    	catch(Exception e){
    	    JOptionPane.showMessageDialog(null, "Error in showing table", "ALERT!!!", JOptionPane.ERROR_MESSAGE);
    	}     
    }
    
        public void delete(String Memo) {
            String sql = "DELETE FROM MemosNotesDataTable WHERE Memos = ?";

            try (Connection conn = this.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)) {

                // set the corresponding param
                pstmt.setString(1, Memo);
                // execute the delete statement
                pstmt.executeUpdate();
                                
                ShowTable();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        
        public void edit() {
	        System.out.println(MemosMainGUI.row+1);

        	String query = String.format("update MemosNotesDataTable set Memos = ?,  MemoDeets = ? where IDNUM = %d",MemosMainGUI.row+1);
        	
    	    try (Connection conn = this.connect();
    	    		PreparedStatement pstmt = conn.prepareStatement(query)) {
	            // Database connection Query

    	        System.out.println(MemosMainGUI.row+1);
    	        System.out.println(MemosEntryGUI.MemosHead);
    	        System.out.println(MemosEntryGUI.MemosText);

	            
    	        pstmt.setString(1, MemosEntryGUI.MemosHead.get(MemosMainGUI.row));	
    	        pstmt.setString(2, MemosEntryGUI.MemosText.get(MemosMainGUI.row));
                pstmt.executeUpdate();

                ShowTable();
    	        

	            JOptionPane.showMessageDialog(null, "Updated");
	        }  
    	catch(Exception e){
    	    JOptionPane.showMessageDialog(null, "Error in update", "ALERT", JOptionPane.ERROR_MESSAGE);
    	}	    
        }
        
        public void ResetTable() {
            String sql = "DELETE FROM MemosNotesDataTable";
            try (Connection conn = this.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.executeUpdate();
                } catch (SQLException e) {
            		JOptionPane.showMessageDialog(null, "Error in deletion of whole Memos and Notes table", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            
            for (int i = 0; i < MemosEntryGUI.MemosHead.size(); i++) {
        	    try (Connection conn = this.connect();) {
                    // Database connection Query
                    Statement st = conn.createStatement();
                    
                    // Insert Query
    	            String insert_query = " insert into MemosNotesDataTable (Memos, MemoDeets, IDNUM)"
    	            +  " values ('"+MemosEntryGUI.MemosHead.get(i)+"','"+MemosEntryGUI.MemosText.get(i)+"','"+(i+1)+"')";
    	            
                    st.executeUpdate(insert_query);
                    
                }  
        	    catch(Exception e) {
        	    	JOptionPane.showMessageDialog(null, "Error in reinserting physical table", "ALERT", JOptionPane.ERROR_MESSAGE);
        	    }	    
            }


        }

}



