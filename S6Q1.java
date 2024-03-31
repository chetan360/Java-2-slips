
import java.util.*;

public class S6Q1 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many number:");
        int n = sc.nextInt();
        System.out.println("Eneter " + n + " values:");
        for(int i=0; i<n; i++)
            nums.add(sc.nextInt());
        
        System.out.println(nums);
        
        System.out.println("Enter key to search:");
        int key = sc.nextInt();
        if(nums.contains(key))
            System.out.println("Found.");
        else
            System.out.println("Not found.");
    }
}
