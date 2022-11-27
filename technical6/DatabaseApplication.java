import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * This is the DatabaseApplication class.
 * @author Ralph Cajipe
 */

public class DatabaseApplication extends JFrame implements ActionListener, WindowListener, MouseListener {

    private JMenuBar menuBar = new JMenuBar();

    private JMenu fileMenu = new JMenu("File");
    private JMenu editMenu = new JMenu("Edit");
    private JMenu viewMenu = new JMenu("View");

    private JMenuItem openFile = new JMenuItem("Open");
    private JMenuItem exitApp = new JMenuItem("Exit");


    // This is the constructor of the DatabaseApplication class.
    public DatabaseApplication() {
        setTitle("My Technical Formative 6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(800,800);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setJMenuBar(menuBar);

        //Add Menu to the MenuBar
        fileMenu.setMnemonic('F');
        editMenu.setMnemonic('E');
        viewMenu.setMnemonic('V');
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        fileMenu.add(openFile);
        fileMenu.addSeparator();
        fileMenu.add(exitApp);

        exitApp.addActionListener(this);
        openFile.addActionListener(this);

        addWindowListener(this);
        addMouseListener(this);
    }

    /**
     * If the user clicks the exitApp button, then the program exits. Otherwise, the user is presented with a dialog box to
     * open a new dialog box for the OpenDialog class.
     *
     * @param e The ActionEvent object that contains information about the event.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == exitApp) {
            // JOptionPane.showMessageDialog(this, "You clicked Exit....");
            System.exit(0);
        } else {
            // JOptionPane.showMessageDialog(this, "Open....");
            OpenDialog openDialog = new OpenDialog(this);
            openDialog.setVisible(true);
        }

    }

    // This is a mouse listener.
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    // This is a window listener.
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
