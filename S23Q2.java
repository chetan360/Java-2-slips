
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class S23Q2 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        
        if(args.length == 0) {
            System.out.println("Please provide at least one argument..");
            return;
        }
        
        for(String name: args)
            names.add(name);
        
        System.out.println("Traversing using Iterator");
        Iterator itr = names.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
        System.out.println("Traversing using ListIterator");
        ListIterator lItr = names.listIterator();
        while(lItr.hasPrevious())
            System.out.println(lItr.previous());
    }
}
