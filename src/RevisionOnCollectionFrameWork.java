import java.util.*;

public class RevisionOnCollectionFrameWork {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();//ArrayList is a class
        al.add(10);
        al.add("prashant");
        al.add('c');
        HashSet obj=new HashSet();
        obj.add("surendra");
        obj.add(20);
        List l=new ArrayList();// Here List interface hold the reference of the 'ArrayList Class'
        List l2=new LinkedList();// here List interface hold the reference of the 'LinkedList Class'
        Set l3=new HashSet();// // here Set interface hold the reference of thr 'HashSet Class''
        Iterator i=al.iterator();// Iterator is also an interface....
        System.out.println(i.next());
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
