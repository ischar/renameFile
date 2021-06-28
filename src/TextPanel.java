import java.awt.*;
import javax.swing.*;

class TextPanel extends JPanel {
    public TextPanel() {
        setLayout(null);
        setBackground(new Color(255, 255, 255));
        JLabel addLabel = new JLabel("Add");
        JLabel convertLabel = new JLabel("Convert");
        JLabel removeLabel = new JLabel("Remove");

        JTextField addTextField = new JTextField();
        JTextField originalTextField = new JTextField();
        JTextField convertTextField = new JTextField();
        JTextField removeTextField = new JTextField();

        addLabel.setBounds(0, 50, 50, 30);
        convertLabel.setBounds(0, 150, 50, 30);
        removeLabel.setBounds(0, 250, 50, 30);
        addTextField.setBounds(80, 50, 100, 30);
        originalTextField.setBounds(80, 150, 100, 30);
        convertTextField.setBounds(200, 150, 100, 30);
        removeTextField.setBounds(80, 250, 100, 30);

        add(addLabel);
        add(convertLabel);
        add(removeLabel);
        add(addTextField);
        add(originalTextField);
        add(convertTextField);
        add(removeTextField);
    }
}
