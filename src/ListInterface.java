import java.util.*;

class Listinterface {
    public static void main(String[] args) {
//        int values[]=new int[4];
//        Object values1[]=new Object[4];// many type of value object type..
//        values1[0]="prashant";
//        values1[2]=7;
        List<Integer> values = new ArrayList<>();// generic representation
        // this concept of mentioning what type of the data in your collection is known as Generic..

        values.add(3);
        values.add(5);
        values.add(1,4);//
        values.add(1);
        Collections.sort(values);

        values.forEach(System.out::println);// this is a Stream API ..Lambda Expression..
        // this is avaliable in a List interface..


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

    }
}