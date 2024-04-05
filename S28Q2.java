public class S28Q2 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Name of the thread: " + Thread.currentThread().getName());
        });

        t.start();
    }
}
