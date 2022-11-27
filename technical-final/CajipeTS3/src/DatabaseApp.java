/**
 * It's a JFrame with a JMenuBar with 4 JMenuItems: Add Record, View Records, Delete Record, and Exit
 *
 * @author: Ralph Cajipe
 */

import javax.swing.*;
import java.awt.*;
import java.io.Serial;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseApp extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    private static final String TABLE_NAME = "books";
    private static final String TITLE = "title";
    private static final String AUTHOR = "author";
    private static final String YEAR = "year";
    private static final String ISBN = "isbn";
    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "("
            + TITLE + " TEXT, "
            + AUTHOR + " TEXT, "
            + YEAR + " INTEGER, "
            + ISBN + " TEXT PRIMARY KEY)";
    private static final String INSERT_RECORD = "INSERT INTO " + TABLE_NAME + " VALUES(?, ?, ?, ?)";
    private static final String DELETE_RECORD = "DELETE FROM " + TABLE_NAME + " WHERE " + TITLE + " = ?";

    private static final String VIEW_RECORDS = "SELECT * FROM " + TABLE_NAME;

    private final PreparedStatement insertRecord;
    private final PreparedStatement deleteRecord;
    private final PreparedStatement viewRecords;

    // The database_path is the path to the database file. You can change this to your own path.
    String database_path = "database/MLbooks.db";

    public DatabaseApp() throws SQLException {
        // Set a background image for the JFrame, fill the entire JFrame
        ImageIcon image = new ImageIcon("assets/background.jpg");
        JLabel label = new JLabel(image);
        label.setBounds(0, 0, image.getIconWidth(), image.getIconHeight());
        JPanel imagePanel = (JPanel) this.getContentPane();
        imagePanel.setOpaque(false);
        // DEPRECATED AND MARKED FOR REMOVAL:
        // this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        this.getLayeredPane().add(label, Integer.valueOf(Integer.MIN_VALUE));
        this.setSize(image.getIconWidth(), image.getIconHeight());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(true);


        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + database_path);
        insertRecord = conn.prepareStatement(INSERT_RECORD);
        deleteRecord = conn.prepareStatement(DELETE_RECORD);
        viewRecords = conn.prepareStatement(VIEW_RECORDS);

        try (Statement statement = conn.createStatement()) {
            statement.execute(CREATE_TABLE);
        }

        setLayout(new BorderLayout());
        setSize(530, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem addRecord = new JMenuItem("Add Record");
        fileMenu.add(addRecord);

        JMenuItem viewRecord = new JMenuItem("View Records");
        fileMenu.add(viewRecord);

        JMenuItem deleteRecord = new JMenuItem("Delete Record");
        fileMenu.add(deleteRecord);

        JMenuItem exit = new JMenuItem("Exit");
        fileMenu.add(exit);

        addRecord.addActionListener(e -> {
            String title = JOptionPane.showInputDialog("Enter Title");
            String author = JOptionPane.showInputDialog("Enter Author");
            String year = JOptionPane.showInputDialog("Enter Year");
            String isbn = JOptionPane.showInputDialog("Enter ISBN");

            try {
                insertRecord.setString(1, title);
                insertRecord.setString(2, author);
                insertRecord.setInt(3, Integer.parseInt(year));
                insertRecord.setString(4, isbn);
                insertRecord.execute();
                // Show a message dialog box when a record is added
                JOptionPane.showMessageDialog(null, "Book Added");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });

        viewRecord.addActionListener(e -> {
            try {
                ResultSet rs = viewRecords.executeQuery();
                ArrayList<String> records = new ArrayList<>();
                // Display in bold and uppercase the column names
                records.add(String.format("%-20s %-20s %-20s %-20s", TITLE.toUpperCase(), AUTHOR.toUpperCase(), YEAR.toUpperCase(), ISBN.toUpperCase()));
                while (rs.next()) {
                    records.add(rs.getString(TITLE) + " - " + rs.getString(AUTHOR) + " - " + rs.getInt(YEAR) + " - " + rs.getString(ISBN));
                }
                JTextArea textArea = new JTextArea();
                textArea.setText(String.join("\n", records));
                textArea.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(1024, 400));
                JOptionPane.showMessageDialog(null, scrollPane, "Records", JOptionPane.PLAIN_MESSAGE);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });

        deleteRecord.addActionListener(e -> {
            String title = JOptionPane.showInputDialog("Enter Title");
            try {
                // Show a message dialog to confirm the deletion
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Warning", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    DatabaseApp.this.deleteRecord.setString(1, title);
                    DatabaseApp.this.deleteRecord.execute();
                    // Show a message dialog to confirm the deletion
                    JOptionPane.showMessageDialog(null, "Book deleted successfully");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });

        exit.addActionListener(e -> System.exit(0));

        setVisible(true);

    }

    public static void main(String[] args) throws SQLException {
        new DatabaseApp();
    }
}