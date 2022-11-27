import org.junit.Test;

public class UnitTestsForClasses {
    // Unit tests for MainTF6.java, OpenDialog.java, and DatabaseApplication.java.

    @Test
    public void testMainTF6() {
        MainTF6 main = new MainTF6();
        MainTF6.main(null);
    }

    @Test
    public void testOpenDialog() {
        OpenDialog open = new OpenDialog(null);
        open.setVisible(true);
    }

    @Test
    public void testDatabaseApplication() {
        DatabaseApplication database = new DatabaseApplication();
        database.setVisible(true);
    }

}


