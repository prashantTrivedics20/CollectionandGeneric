import java.util.*;
//class ComImpl implements Comparator<Integer>
//{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if(o1%10>o2%10)
//        {
//            return 1;
//        }
//        return -1;
//    }
//}
// to perform some logical operation we use comparator interface in java..
class ComparatorInterfaceInJava {
    public static void main(String[] args) {
//        int values[]=new int[4];
//        Object values1[]=new Object[4];// many type of value object type..
//        values1[0]="prashant";
//        values1[2]=7;
        List<Integer> values = new ArrayList<>();// generic representation
        // this concept of mentioning what type of the data in your collection is known as Generic..
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
        values.add(305);
        values.add(998);
        values.add(1,774);
        values.add(236);
        values.add(881);
        Collections.sort(values,com);
        //Collections.reverse(values);
        for (int i : values) {
                System.out.println(i);
            }

        }
    }