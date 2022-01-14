import java.util.Vector;

public class VectorInGeneric {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(4);
        v.add(5);
       v.add(6);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(4);
        v.add(7);
        v.add(6);
        System.out.println(v.capacity());// it will increase the capacity as per the user requirement,...
//        for(Object i: v)
//        {
//            System.out.println(i);
//        }
//
        for(int i: v)
        {
            System.out.println(i);
        }


    }
}
