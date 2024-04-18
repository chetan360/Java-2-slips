
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

class TrafficPanel extends JPanel {
    String light;
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g, light);
    }
    
    public void setLight(String light) {
        this.light = light;
        repaint();
    }
    
    void draw(Graphics g, String light) {
        switch(light) {
            case "red":
                g.setColor(Color.red);
                break;
            case "green":
                g.setColor(Color.green);
                break;
            case "yellow":
                g.setColor(Color.yellow);
                break;
            default:
                g.setColor(Color.gray);
        }
        g.fillOval(25, 25, 50, 50);
    }
}


public class S6Q2 {
    private JFrame frame;
    private String[] lights = {"red", "green", "yellow"};
    private Thread light;
    private TrafficPanel trafficPanel;
    
    s6q2() {
        frame = new JFrame();
        frame.setSize(100, 150);
        
        trafficPanel = new TrafficPanel();
        if(light == null || !light.isAlive()) {
            light = new Thread(() -> {
                int idx = 0;
                while(true) {
                    trafficPanel.setLight(lights[idx]);
                    try {
                        Thread.sleep(getDuration(lights[idx]) * 1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(s6q2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    idx = (idx+1)%lights.length;
                }
            });
            
            light.start();
        }
        
        frame.setLayout(new BorderLayout());
        frame.add(trafficPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    private int getDuration(String light) {
        switch(light) {
            case "red": return 4;
            case "green": return 7;
            case "yellow": return 2;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        new S6Q2();
    }
}
