import java.util.*;

public class SetInterface1 {
    public static void main(String[] args) {
        Set<Integer> values = new TreeSet<Integer>();// TreeSet is use to print the number in an accending order..
        values.add(8);
        values.add(5);
        values.add(6);
        values.add(9);
        values.add(6);
        for (int i:values) {
            System.out.println(i);

        }


    }
}