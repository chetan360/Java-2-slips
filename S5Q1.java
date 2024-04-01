import java.util.*;

public class S5Q1 {
    public static void main(String[] args) {
        Hashtable<String, String> studentTable = new Hashtable<>();

        studentTable.put("1234567890", "john");
        studentTable.put("1239874560", "carry");

        Enumeration<String> moblieNumbers = studentTable.keys();
        while(moblieNumbers.hasMoreElements()) {
            String no = moblieNumbers.nextElement();
            String name = studentTable.get(no);
            System.out.println("Student name: " + name + ", Mobile no: " + no);
        }
    }
}