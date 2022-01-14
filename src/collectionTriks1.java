import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class CollectionTriks1 {
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<Integer>()// if you want to add the value while creating the object itself..
        {{// instance initialization
            Scanner readme=new Scanner(System.in);
            add(readme.nextInt());
            add(readme.nextInt());
            add(readme.nextInt());
        }};

//        values.add(24);
//        values.add(34);
//        values.add(60);
//        values.add(50);
        for (int i:values) {
            System.out.println(i);
        }

    }
}