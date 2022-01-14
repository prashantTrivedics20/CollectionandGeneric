import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface1 {
    public static void main(String[] args) {
        Map<String,String> map=new Hashtable();// for type safety we use generic(
        // here Hashtable is a class which implements the Map interface..
        map.put("myname","prashant");
        map.put("actor","john");
        map.put("ceo","Marisa");
        map.put("actor","Akshay");
        System.out.println(map);// so in this case sequence is different..
        // System.out.println(map.get("myname"));
        // for any key if it is not avaliable it will give the null value......
        // it will not generate the exception
        Set<String> keys=map.keySet();// keySet() it will give a set of keys...
        for (String key:keys) {
            System.out.println(key +" "+map.get(key));
        }
        // we can repeat the value but we can't repeat the keys///


    }
}
