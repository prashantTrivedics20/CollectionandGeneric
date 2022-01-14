import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Revision2 {
    public static void main(String[] args) {
        HashMap obj=new HashMap();
        obj.put(1,"prashant");
        obj.put(2,"pulkit");
        Set keys=obj.keySet();
        for (Object s:keys) {
            System.out.println(s+" "+obj.get(s));

        }


    }
}
