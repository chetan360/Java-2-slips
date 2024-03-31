
import java.util.Random;
import java.util.logging.*;

class NumGenerator implements Runnable {
    Random rand = new Random();
    int n;

    @Override
    public void run() {
        while(true) {
            n = rand.nextInt(100);
            System.out.println("Generated number: " + n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NumGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class SqrGenerator implements Runnable {
    NumGenerator numGenerator;
    
    SqrGenerator(NumGenerator numGenerator) {
        this.numGenerator = numGenerator;
    }
    
    @Override
    public void run() {
        while(true) {
            int n = numGenerator.n;
            if(n % 2 == 0)
                System.out.println("Square of " + n + " is " + n*n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SqrGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class CubeGenerator implements Runnable {
    NumGenerator numGenerator;
    int n;
    
    CubeGenerator(NumGenerator numGenerator) {
        this.numGenerator = numGenerator;
    }
    
    @Override
    public void run() {
        while(true) {
            int n = numGenerator.n;
            if(n % 2 != 0)
                System.out.println("Cube of " + n + " is " + n*n*n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CubeGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

public class S7Q1 {
    public static void main(String[] args) {
        NumGenerator numGenerator = new NumGenerator();
        Thread t1 = new Thread(numGenerator);
        t1.start();
        
        SqrGenerator sqrGenerator = new SqrGenerator(numGenerator);
        Thread t2 = new Thread(sqrGenerator);
        t2.start();
        
        CubeGenerator cubeGenerator = new CubeGenerator(numGenerator);
        Thread t3 = new Thread(cubeGenerator);
        t3.start();
    }
}