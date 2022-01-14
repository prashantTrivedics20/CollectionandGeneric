import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTricks {
    public static void main(String[] args) {
       // List<Integer> values=new ArrayList<Integer>();
        List<Integer> values= Arrays.asList(24,34,60,50);// it is only applicable if you know the value...
//        values.add(24);
//        values.add(34);
//        values.add(60);
//        values.add(50);
        for (int i:values) {
            System.out.println(i);
        }

    }
}
