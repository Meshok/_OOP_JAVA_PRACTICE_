package Classes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyProgram extends JFrame {

    public MyProgram(String path) {
        super("My Program");
        setSize(640, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();

        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File(path));
        } catch (IOException e) {
            jPanel.add(new JLabel("Image " + path + " is not found!"));
        }
        if (myPicture != null) {
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            jPanel.add(picLabel);
        }

        add(jPanel, BorderLayout.CENTER);

        setVisible(true);
    }

}
