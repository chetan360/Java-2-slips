
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class S17Q1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many integers:");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " values:");
        for(int i=0; i<n; i++)
            set.add(sc.nextInt());
        
        System.out.println(set);
    }
}
