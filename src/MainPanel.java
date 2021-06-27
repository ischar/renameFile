import java.awt.*;
import javax.swing.*;

class MainPanel extends JPanel {
    public MainPanel() {
        setBackground(new Color(255, 205, 63));
        setLayout(null);
        TitlePanel titlePanel = new TitlePanel();
        FileListPanel fileListPanel = new FileListPanel();
        ButtonPanel buttonPanel = new ButtonPanel();
        TextPanel textPanel = new TextPanel();

        buttonPanel.setSize(300, 440);
        buttonPanel.setBounds(700, 60, 200, 440);
        titlePanel.setSize(320, 50);
        titlePanel.setLocation(330, 0);
        fileListPanel.setBounds(0, 60, 300, 440);
        textPanel.setBounds(380, 60, 300, 440);

        add(titlePanel);
        add(fileListPanel);
        add(buttonPanel);
        add(textPanel);

        setSize(960, 540);
        setVisible(true);
    }
}
