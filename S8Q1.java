class T1 extends Thread {
    String msg;
    
    T1(String msg) {
        this.msg = msg;
    }
    
    public void run() {
        for(int i=0; i<10; i++)    
            System.out.println(msg);
    }
}

class T2 extends Thread {
    String msg;
    
    T2(String msg) {
        this.msg = msg;
    }
    
    public void run() {
        for(int i=0; i<20; i++)
            System.out.println(msg);
    }
}
class T3 extends Thread {
    String msg;
    
    T3(String msg) {
        this.msg = msg;
    }
    
    public void run() {
        for(int i=0; i<30; i++)
            System.out.println(msg);
    }
}
        
public class S8Q1 {
    public static void main(String[] args) {
        T1 t1 = new T1("COVID19");
        T2 t2 = new T2("LOCKDOWN2020");
        T3 t3 = new T3("VACCINATED2021");
        
        t1.start();
        t2.start();
        t3.start();
    }
}
