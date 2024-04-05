
import java.util.*;

public class S19Q1 {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many values:");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " values:");
        for(int i=0; i<n; i++)
            l.add(sc.nextInt());
        
        System.out.println("Negative integers are:");
        Iterator itr = l.iterator();
        while(itr.hasNext()) {
            int num = (int)itr.next();
            if(num < 0)
                System.out.println(num);
        }
    }
}
