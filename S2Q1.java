
import java.util.*;

public class S2Q1 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many names:");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter three names:");
        for(int i=0; i<n; i++)
            names.add(sc.nextLine());
        
        TreeSet<String> sortedNames = new TreeSet<>(names);
        System.out.println(sortedNames);       
    }
}
