
import java.util.logging.*;
import javax.swing.SwingUtilities;

public class S1Q1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            while(true) {
                for(char ch = 'A'; ch <= 'Z'; ch++)
                    System.out.println(ch);
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(S1Q1.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("2 seconds are passed....");
            }
        });
        
    }
}
