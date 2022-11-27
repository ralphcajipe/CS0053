/**
 * It tests the three classes that are the main focus of this assignment
 */

import org.junit.Test;
import java.sql.SQLException;

public class UnitTestsForTS3 {
    // Unit tests for MainTS3.java, DatabaseGUI.java, and DatabaseApp.java

    @Test
    public void testMainTS3() throws SQLException {
        // Test MainTS3.java
        MainTS3.main(null);
    }

    @Test
    public void testDatabaseGUI() throws SQLException {
        // Test DatabaseGUI.java
        DatabaseGUI.main(null);
    }

    @Test
    public void testDatabaseApp() throws SQLException {
        // Test DatabaseApp.java
        DatabaseApp.main(null);
    }
}