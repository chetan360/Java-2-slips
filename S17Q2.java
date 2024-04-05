
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.logging.*;
import javax.swing.*;

public class S17Q2 {
    private JFrame frame;
    private JTextField tf;
    private JButton print;
    private Thread intThread;
    
    S17Q2() {
        frame = new JFrame("Integer printing App");
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(2,1));
        
        tf = new JTextField();
        print = new JButton("Print");
        
        frame.add(tf);
        frame.add(print);
        
        print.addActionListener((ActionEvent e) -> {
            tf.setText("");
            if(intThread == null || !intThread.isAlive()) {
                intThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(true) {
                            for(int i=1; i<=100; i++) {
                                tf.setText(String.valueOf(i));
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(S17Q2.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            tf.setText("");
                        }
                    }
                });
                intThread.start();
            }
        });
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new S17Q2();
    }
}
