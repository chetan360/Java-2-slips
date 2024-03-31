
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.*;
import javax.swing.*;

class BallPanel extends JPanel {
    private int yDelta = 0;
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(175, yDelta, 50, 50);
        repaint();
    }

    void setBallPos(int y) {
        this.yDelta = y;
    }
}

public class S9Q1 {
    private Thread ballThread;
    private BallPanel ballPanel;
    private JFrame frame;
    private JButton start;
    
    S9Q1() {
        frame = new JFrame("Ball Movement App");
        frame.setSize(400, 400);
        
        ballPanel = new BallPanel();
        
        start = new JButton("Start");
        start.addActionListener((ActionEvent e) -> {
            startBallMovement();
        });
        
        frame.setLayout(new BorderLayout());
        frame.add(ballPanel, BorderLayout.CENTER);
        frame.add(start, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    private void startBallMovement() {
        if(ballThread == null || !ballThread.isAlive()) {
            ballThread = new Thread(() -> {
                moveBallVertically();
            });
            ballThread.start();
        }
    }
    
    
    private void moveBallVertically() {
        int y = 0;
        int dir = 1;
        while(true) {
            try {
                Thread.sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(S9Q1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            y += 5 * dir;
            
            if(y > ballPanel.getHeight() - 50)
                dir = -1;
            
            if(y <= 0)
                dir = 1;
            
            ballPanel.setBallPos(y);
        }
    }
    
    public static void main(String[] args) {
        new S9Q1();
    }
}
