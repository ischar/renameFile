import java.awt.*;
import javax.swing.*;

class TitlePanel extends JPanel {
    public TitlePanel() {
        setBackground(new Color(255, 205, 63));
        JLabel titleLabel = new JLabel("RENAME FILE");
        titleLabel.setFont(new Font("Serif",Font.BOLD, 30));
        add(titleLabel);
        setBounds(0, 0, 960, 100);
        setVisible(true);
    }
}
