package program5D;

import javax.swing.*;
import java.awt.*;

public class program5D extends JFrame {

    public program5D() {
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        tabbedPane.add("Cyan", cyanPanel);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        tabbedPane.add("Magenta", magentaPanel);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        tabbedPane.add("Yellow", yellowPanel);

        add(tabbedPane);
        setTitle("CMY Tabs");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new program5D();
    }
}
