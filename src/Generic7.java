import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Generic7 {
    public static void main(String[] args) {
//        int values[]=new int[4];
//        Object values1[]=new Object[4];// many type of value object type..
//        values1[0]="prashant";
//        values1[2]=7;
        Collection values=new ArrayList();// collection is a collection of the object type
        values.add("prashant");
        values.add(3);
        values.add(5);
        values.add(3.4f);
        //Iterator i=values.iterator();// Iterator is also an interface....
        //System.out.println(i.next());
//        while(i.hasNext())// hasNext() method check the next element in the collection
//        {
//            System.out.println(i.next());
//        }
        for(Object i:values)
        {
            System.out.println(i);
        }


    }

}
// to fetch the value to the collection we use either
// Iterator
//enhanced forloop
