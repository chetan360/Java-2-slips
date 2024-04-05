
import java.util.logging.*;

public class S1Q1 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while(true) {
                for(char ch = 'A'; ch <= 'Z'; ch++)
                    System.out.print(ch + " ");
                System.out.println();
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(S1Q1.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("2 seconds are passed....");
            }
        });
        
        t.start();
    }
}
