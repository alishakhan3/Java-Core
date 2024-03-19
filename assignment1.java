import java.util.*;
public class assignment1 {
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(9);
        set.add(2);
        System.out.println("Sorted List:");
        for (int i : set) {
            System.out.println(i);
        }
    }
}