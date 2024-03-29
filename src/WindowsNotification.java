

import java.awt.*;
import java.awt.TrayIcon.MessageType;

public class WindowsNotification {
    
    static void displayTray(String classname) {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Java AWT Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        try {
			tray.add(trayIcon);
		} catch (AWTException e) {
			System.out.print("Error in Windows Notification");
		}

        trayIcon.displayMessage("Your "+classname+" class has started!" , "Attend it soon.", MessageType.WARNING);
    }
}