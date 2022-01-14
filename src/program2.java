
// comparator
import java.util.*;
import java.util.concurrent.Callable;
class numcompare implements Comparator<Integer>
{ @Override
public int compare(Integer o1, Integer o2) {
    if(o1%10>o2%10)
    {
        return 1;
    }
    return -1;
}
}


public class program2 {
    public static void main(String[] args) {
        List<Integer> c=new ArrayList<>();
        Random r=new Random();
        for (int i = 1; i < 100; i++) {
            c.add(r.nextInt(1000));
        }
        Comparator numco=new numcompare();
        Collections.sort(c,numco);
        for (Integer a:c) {
            System.out.println(a);


        }

    }
}
