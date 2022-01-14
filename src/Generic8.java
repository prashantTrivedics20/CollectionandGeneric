import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Generic8 {
    public static void main(String[] args) {
//        int values[]=new int[4];
//        Object values1[]=new Object[4];// many type of value object type..
//        values1[0]="prashant";
//        values1[2]=7;
        Collection<Number> values = new ArrayList<>();// generic representation
        // this concept of mentioning what type of the data in your collection is known as Generic..
        values.add(3);
        values.add(5);
        values.remove(3);// in  Collection interface the remove method contains object type value
        // but if we create ArrayList class object then the behaviour of remove method will change it will contain index value..
        values.add(3.5f);
        //Iterator i=values.iterator();// Iterator is also an interface....
        //System.out.println(i.next());
//        while(i.hasNext())// hasNext() method check the next element in the collection
//        {
//            System.out.println(i.next());
//        }
//        for (Object i : values) {
//            System.out.println(i);
//        }

//        for (Integer i : values) {
//            System.out.println(i);
//        }
        for (Object i : values) {
            System.out.println(i);
        }

    }
}