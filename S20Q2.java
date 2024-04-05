import javax.swing.*;
import java.awt.*;

class TempleDrawing extends JFrame {

    public TempleDrawing() {
        setTitle("Simple Temple Drawing");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        TemplePanel templePanel = new TemplePanel();
        add(templePanel);
        setVisible(true);
    }
}

class TemplePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTemple(g);
    }

    private void drawTemple(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(100, 100, 100, 100); // Main structure
        
        g.setColor(Color.WHITE);
        g.fillRect(130, 150, 40, 50); // Main Door
        
        g.setColor(Color.RED);
        int[] xPoints = {100, 150, 200}; // Triangle for roof
        int[] yPoints = {100, 50, 100};
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(Color.ORANGE);
        g.fillRect(150, 40, 20, 10); // Flag
    }
}

public class S20Q2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TempleDrawing();
        });
    }
}
