import java.awt.*;
import javax.swing.*;

class ButtonPanel extends JPanel {
    public ButtonPanel() {
        setBackground(new Color(255, 205, 63));
        setLayout(null);
        JButton addButton = new JButton("Add");
        JButton convertButton = new JButton("Convert");
        JButton removeButton = new JButton("Remove");


        Color color = new Color(0, 108, 227);

        addButton.setBounds(0, 0, 100, 50);
        convertButton.setBounds(0, 60, 100, 50);
        removeButton.setBounds(0, 120, 100, 50);
        addButton.setBackground(Color.BLUE);
        convertButton.setBackground(new Color(123, 128, 133));
        removeButton.setBackground(new Color(123, 128, 133));


        add(addButton);
        add(convertButton);
        add(removeButton);


    }
}