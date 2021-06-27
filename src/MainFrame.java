import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("RENAME FILE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();

        MainPanel mainpanel = new MainPanel();
        container.add(mainpanel);
        setBounds(0, 0, 960, 540);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MainFrame();
    }
}
