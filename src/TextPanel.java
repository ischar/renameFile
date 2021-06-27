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

        addLabel.setBounds(0, 50, 80, 50);
        convertLabel.setBounds(0, 150, 80, 50);
        removeLabel.setBounds(0, 250, 80, 50);

        add(addLabel);
        add(convertLabel);
        add(removeLabel);
        add(addTextField);
        add(originalTextField);
        add(convertTextField);
        add(removeTextField);
    }
}
