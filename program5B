package program5B;

import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane extends JFrame {

    public ColorTabbedPane() {
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        tabbedPane.add("RED", redPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        tabbedPane.add("BLUE", bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        tabbedPane.add("GREEN", greenPanel);

        add(tabbedPane);
        setTitle("Color Tabs");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}
