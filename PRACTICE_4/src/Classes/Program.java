package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Program extends JFrame {
    private Team milan = new Team();
    private Team madrid = new Team();
    private Team milanPrev = new Team();
    private Team madridPrev = new Team();

    private JLabel lastScorer = new JLabel("LastScorer: N/A");
    private JLabel score = new JLabel(milan + ":" + madrid);
    private JLabel winner = new JLabel("Winner: DRAW");

    public Program() {
        setLayout(new GridLayout(1, 3));
        setTitle("My program");
        setSize(new Dimension(640, 480));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton firstButton = new JButton("AC Milan");
        firstButton.addMouseListener(new MyMouseListener(this, milan));
        JButton secondButton = new JButton("Real Madrid");
        secondButton.addMouseListener(new MyMouseListener(this, madrid));

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(lastScorer, BorderLayout.NORTH);
        panel.add(score, BorderLayout.CENTER);
        panel.add(winner, BorderLayout.SOUTH);

        add(firstButton);
        add(panel);
        add(secondButton);

        lastScorer.setHorizontalAlignment(SwingConstants.CENTER);
        score.setHorizontalAlignment(SwingConstants.CENTER);
        winner.setHorizontalAlignment(SwingConstants.CENTER);

        setVisible(true);
    }

    public void updateLastScorer() {
        if (milan.getGoals() != milanPrev.getGoals()) {
            milanPrev.setGoals(milan.getGoals());
            lastScorer.setText("LastScorer: AC Milan");
        } else  {
            madridPrev.setGoals(madrid.getGoals());
            lastScorer.setText("LastScorer: Real Madrid");
        }
    }

    public void updateWinner() {
        if (milan.getGoals() > madrid.getGoals()) {
            winner.setText("Winner: AC Milan");
        } else if (milan.getGoals() < madrid.getGoals()) {
            winner.setText("Winner: Real Madrid");
        } else  {
            winner.setText("Winner: DRAW");
        }
    }

    public void updateScore() {
        score.setText(milan + ":" + madrid);
        updateLastScorer();
        updateWinner();
    }
}

class Team {
    private int goals;

    Team() {
        goals = 0;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return Integer.toString(goals);
    }
}

class MyMouseListener implements MouseListener {
    Team team;
    Program program;

    MyMouseListener(Program program, Team team) {
        this.program = program;
        this.team = team;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        team.setGoals(team.getGoals() + 1);
        program.updateScore();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

