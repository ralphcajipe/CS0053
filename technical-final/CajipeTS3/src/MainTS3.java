/**
 * It creates an instance of the DatabaseApp class and makes it visible
 *
 * @author: Ralph Cajipe
 */

import javax.swing.*;
import java.sql.SQLException;

// For MainTS3.java
public class MainTS3 {
    public static void main(String[] args) throws SQLException {
        DatabaseApp app = new DatabaseApp();
        app.setTitle("Book Database");

        // Set app icon instead of default Java icon
        app.setIconImage(new ImageIcon("assets/book-icon.png").getImage());

        app.setResizable(false);
        app.setVisible(true);
    }
}










