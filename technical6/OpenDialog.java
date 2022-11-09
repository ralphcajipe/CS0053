import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * This is the OpenDialog class.
 * @author Ralph Cajipe
 */

public class OpenDialog extends JDialog implements ActionListener {
    // Text 1
    private JLabel label = new JLabel("Text 1:");
    private JTextField textField = new JTextField("CS0053", 15);

    // Text 2
    private JLabel label2 = new JLabel("Text 2:");
    // Initial Text field for Text 2 will contain an empty string upon opening of the dialog box.
    // Provide the same width as the Text 1 field.
    private JTextField textField2 = new JTextField("", 15);
    private JButton switchButton = new JButton("Switch");
    private JButton closeButton = new JButton("Close");

    // This is the constructor of the OpenDialog class.
    // It is called when an instance of the class is created.
    public OpenDialog(JFrame owner) {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(450, 105);
        setResizable(false);
        setTitle("Technical Formative 6 - Switch Text Fields");
        setLayout(new FlowLayout());

        add(label);
        add(textField);
        add(label2);
        add(textField2);

        // Add some spacing between the text fields and the buttons.
        add(new JLabel(" "));
        add(new JLabel(" "));

        add(switchButton);
        switchButton.addActionListener(this);

        add(closeButton);
        closeButton.addActionListener(this);
        closeButton.addActionListener(new ActionListener() {
            /**
             * This function is called when the user clicks the "Close" button. It closes the window.
             *
             * @param e The event that triggered the action.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Setting the location of the dialog box to the center of the screen.
        setLocationRelativeTo(null);
    }

    /**
     * When the button is pressed, switch the text in the text fields.
     *
     * @param e The ActionEvent object that contains information about the event.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String temp = textField.getText();
        textField.setText(textField2.getText());
        textField2.setText(temp);
    }
}
