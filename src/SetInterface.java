import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<Integer>();
        values.add(5);
        values.add(6);
        values.add(9);
        values.add(6);
        for (int i:values) {
            System.out.println(i);

        }


        }
    }