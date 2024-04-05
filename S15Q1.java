class MyThread extends Thread {
    
    public void run() {
        System.out.println("Name of the thread: " + Thread.currentThread().getName());
        System.out.println("Priority of the thread: " + Thread.currentThread().getPriority());
    }
}

public class S15Q1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.start();
        t2.start();
    }
}
