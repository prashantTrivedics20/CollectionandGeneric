import java.util.*;
public class Generic1 {
    public static void main(String[] args) {
        int value=5;
        List values=new ArrayList();
        values.add(7);
        values.add("23");
        int i=Integer.parseInt(values.get(1).toString());// because the type is a object that's why we first convert into the
        // string...
        System.out.println(i);// so here we are not achive the type safety..
    }
}