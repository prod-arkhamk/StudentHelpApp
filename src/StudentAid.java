import java.util.*;

public class StudentAid {
	
	static String theme="com.jtattoo.plaf.graphite.GraphiteLookAndFeel";
	
	static int p_avgcount, avg_p_health_sum;
	static float avg_p_health = 10;
	static ArrayList<String> p_probs = new ArrayList<>();
	static int[] p_probs_ratings = new int[10];
	
	static int m_avgcount, avg_m_health_sum;
	static float avg_m_health = 10;
	static ArrayList<String> m_probs = new ArrayList<>();
	static int[] m_probs_ratings = new int[10];
	
    static void Theme() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(theme);
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemosMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemosMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemosMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemosMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public static Object[][] GetP_TableRows(){
    	Object[][] result = new Object[p_probs.size()][3];
    	for (int i = 0; i < p_probs.size(); i++) {
    		Object[] row = {(i+1), p_probs.get(i), p_probs_ratings[i]};
    		result[i] = row;
    	}
    	return result;
    }    
    
    public static Object[][] GetM_TableRows(){
    	Object[][] result = new Object[m_probs.size()][3];
    	for (int i = 0; i < m_probs.size(); i++) {
    		Object[] row = {(i+1), m_probs.get(i), m_probs_ratings[i]};
    		result[i] = row;
    	}
    	return result;
    }

	static void P_AvgCalc() {
		if (p_probs_ratings[0] == 0) {
			avg_p_health = 10;
		}
		else {
			int decimal_remover = (avg_p_health_sum*10)/(p_avgcount+1);
			avg_p_health = (float)decimal_remover/10;
		}
	}	

	static void M_AvgCalc() {
		if (m_probs_ratings[0] == 0) {
			avg_m_health = 10;
		}
		else {
			int decimal_remover = (avg_m_health_sum*10)/(m_avgcount+1);
			avg_m_health = (float)decimal_remover/10;
		}
	}

	static int[] removeTheElement(int[] arr, int index){
 
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
            || index >= arr.length) {
 
            return arr;
        }
 
        // Create another array of size one less
        int[] anotherArray = new int[arr.length];
 
        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
 
            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }
 
            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }
 
        // return the resultant array
        return anotherArray;
    }
	
    public static void main(String args[]){ 
    		Theme();
	    	MainGUI gui = new MainGUI();  	
	    	gui.setVisible(true);   	
    }
}
