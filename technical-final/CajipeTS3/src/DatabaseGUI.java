/**
 * It's a GUI that allows you to add, delete, and view records in a database.
 *
 * @author: Ralph Cajipe
 */

import javax.swing.*;
import java.awt.*;
import java.io.Serial;
import java.sql.*;

public class DatabaseGUI extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    String database_path = "database/MLbooks.db";
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

    private final Connection conn;
    private final PreparedStatement insertRecord;
    private final PreparedStatement deleteRecord;
    private final PreparedStatement viewRecords;

    public DatabaseGUI() throws SQLException {
        conn = DriverManager.getConnection("jdbc:sqlite:" + database_path);
        insertRecord = conn.prepareStatement(INSERT_RECORD);
        deleteRecord = conn.prepareStatement(DELETE_RECORD);
        viewRecords = conn.prepareStatement(VIEW_RECORDS);
        initGUI();
    }

    private void initGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Book Database");
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        JLabel titleLabel = new JLabel("Title:");
        JLabel authorLabel = new JLabel("Author:");
        JLabel yearLabel = new JLabel("Year:");
        JLabel isbnLabel = new JLabel("ISBN:");
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField yearField = new JTextField();
        JTextField isbnField = new JTextField();
        JButton addRecordButton = new JButton("Add Record");
        JButton deleteRecordButton = new JButton("Delete Record");
        JButton viewRecordsButton = new JButton("View Records");
        JButton exitButton = new JButton("Exit");
        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(authorLabel);
        panel.add(authorField);
        panel.add(yearLabel);
        panel.add(yearField);
        panel.add(isbnLabel);
        panel.add(isbnField);
        panel.add(addRecordButton);
        panel.add(deleteRecordButton);
        panel.add(viewRecordsButton);
        panel.add(exitButton);
        add(panel, BorderLayout.CENTER);
        addRecordButton.addActionListener(e -> {
            try {
                insertRecord.setString(1, titleField.getText());
                insertRecord.setString(2, authorField.getText());
                insertRecord.setInt(3, Integer.parseInt(yearField.getText()));
                insertRecord.setString(4, isbnField.getText());
                insertRecord.executeUpdate();
                JOptionPane.showMessageDialog(DatabaseGUI.this, "Record added successfully");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(DatabaseGUI.this, "Error adding record");
            }
        });

        deleteRecordButton.addActionListener(e -> {
            try {
                deleteRecord.setString(1, titleField.getText());
                deleteRecord.executeUpdate();
                JOptionPane.showMessageDialog(DatabaseGUI.this, "Record deleted successfully");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(DatabaseGUI.this, "Error deleting record");
            }
        });

        viewRecordsButton.addActionListener(e -> {
            try {
                ResultSet rs = viewRecords.executeQuery();
                StringBuilder builder = new StringBuilder();
                builder.append(String.format("%-20s %-20s %-20s %-20s", TITLE, AUTHOR, YEAR, ISBN));
                builder.append("\r \n");
                while (rs.next()) {
                    builder.append(String.format("%-20s %-20s %-20s %-20s", rs.getString(TITLE), rs.getString(AUTHOR), rs.getInt(YEAR), rs.getString(ISBN)));
                    builder.append("\r \n");
                }
                JOptionPane.showMessageDialog(DatabaseGUI.this, builder.toString());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(DatabaseGUI.this, "Error viewing records");
            }
        });

        exitButton.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        try {
            DatabaseGUI gui = new DatabaseGUI();
            gui.createTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTable() throws SQLException {
        Statement statement = conn.createStatement();
        statement.execute(CREATE_TABLE);
    }
}