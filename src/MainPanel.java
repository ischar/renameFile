import java.awt.*;
import javax.swing.*;

class MainPanel extends JPanel {
    public MainPanel() {
        setBackground(new Color(255, 205, 63));
        setLayout(null);
        TitlePanel titlePanel = new TitlePanel();
        FileListPanel fileListPanel = new FileListPanel();
        titlePanel.setSize(250, 100);
        titlePanel.setLocation(480, 0);
        fileListPanel.setBounds(0, 30, 300, 500);
        add(titlePanel);
        add(fileListPanel);

        setSize(960, 540);
        setVisible(true);
    }
}
