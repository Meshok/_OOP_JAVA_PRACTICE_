package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyMouseListener implements MouseListener {
    private JLabel text;

    MyMouseListener(JLabel text) {
        this.text = text;
        text.setForeground(Color.WHITE);
    }

    @Override
    final public void mouseClicked(MouseEvent e) {}

    @Override
    final public void mousePressed(MouseEvent e) {}

    @Override
    final public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
        text.setForeground(Color.BLACK);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        text.setForeground(Color.WHITE);
    }
}
