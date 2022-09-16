package Classes;

import javax.swing.*;
import java.awt.*;

public class Program extends JFrame {
    private int Milan = 0;
    private int Madrid = 0;

    public Program() {
        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 2));
        setTitle("My program");
        setSize(new Dimension(640, 480));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c.add(new JButton("Milan"), 0);
        c.add(new JButton("Madrid"), 1);

        setVisible(true);
    }
}
