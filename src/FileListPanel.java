import javax.swing.*;
import java.awt.*;

public class FileListPanel extends JPanel {
    public FileListPanel() {
        setBackground(new Color(245, 181, 40));
        JLabel fileListLabel = new JLabel("File List");
        JList fileList = new JList();
        fileList.add(new JScrollPane());
        fileList.setSize(150, 450);
        add(fileListLabel);
        add(fileList);
        setSize(150, 500);
    }
}


