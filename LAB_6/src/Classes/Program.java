package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Program extends JFrame {

    public Program() {
        super("My Program");
        setSize(640, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel text = new JLabel("Добро пожаловать в");

        JPanel north =  new JPanel();
        north.add(text, BorderLayout.CENTER);
        north.setBackground(Color.WHITE);
        north.addMouseListener(new MyMouseListener(text));
        add(north, BorderLayout.NORTH);

        text = new JLabel("Добро пожаловать в");
        JPanel center = new JPanel();
        text.setVerticalAlignment(SwingConstants.CENTER);
        center.add(text, BorderLayout.CENTER);
        center.setBackground(Color.WHITE);
        center.addMouseListener(new MyMouseListener(text));
        add(center, BorderLayout.CENTER);

        text = new JLabel("Добро пожаловать в Абха");
        JPanel south = new JPanel();
        south.add(text, BorderLayout.CENTER);
        south.setBackground(Color.WHITE);
        south.addMouseListener(new MyMouseListener(text));
        add(south, BorderLayout.SOUTH);

        text = new JLabel("Добро пожаловать в Дахране");
        JPanel east = new JPanel();
        east.add(text, BorderLayout.CENTER);
        east.setBackground(Color.WHITE);
        east.addMouseListener(new MyMouseListener(text));
        add(east, BorderLayout.EAST);

        text = new JLabel("Добро пожаловать в Джидда");
        JPanel west = new JPanel();
        west.add(text, BorderLayout.CENTER);
        west.setBackground(Color.WHITE);
        west.addMouseListener(new MyMouseListener(text));
        add(west, BorderLayout.WEST);

        setVisible(true);
    }
}
