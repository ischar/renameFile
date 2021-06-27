import java.awt.*;
import javax.swing.*;

class ButtonPanel extends JPanel {
    public ButtonPanel() {
        setBackground(new Color(255, 205, 63));
        setLayout(null);
        JButton addButton = new JButton("Add");
        JButton convertButton = new JButton("Convert");
        JButton removeButton = new JButton("Remove");

        addButton.setBackground(new Color(177, 175, 168));
        convertButton.setBackground(new Color(177, 175, 168));
        removeButton.setBackground(new Color(177, 175, 168));
        addButton.setBounds(0, 10, 100, 50);
        convertButton.setBounds(0, 70, 100, 50);
        removeButton.setBounds(0, 130, 100, 50);


        add(addButton);
        add(convertButton);
        add(removeButton);
    }
}