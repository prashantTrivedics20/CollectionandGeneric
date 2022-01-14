import java.util.ArrayList;
public class Revision3 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();// this is the creation of the ArrayList
        al.add(100);
        al.add(200);
        al.add(300);// if you want to add the element in Collection object we use simply add method....
        System.out.println(al);
        ArrayList al2=new ArrayList();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");
        System.out.println(al2);
        al.addAll(al2);
        System.out.println(al);
        System.out.println(al.contains(200));// if 200 present in the ArrayList then it will return 'true' otherwise 'false'
        System.out.println(al.isEmpty());// if Arraylist dose'nt contain any value then it will return 'true' otherwise 'false'
        System.out.println(al.size());// it will return howmany element in the collection object
       // al.remove(100);// it will not treated 100 as a object it will take 100 as index..
        al.remove(0);
        //al.remove(index)
        System.out.println(al);
        ArrayList al3=new ArrayList();
        al3.add("aaa");
        al3.add("ddd");
        al2.removeAll(al3);// ye matching value ko remove kar dega collection object ki
        System.out.println(al2);
        al.clear();// it will clear all the elements  from collection object..(it will return void value)

    }
}
