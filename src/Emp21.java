import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Emp21 {
    public String name;
    public int  id;
    Emp21(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp21{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
class Sortbyname1 implements Comparator<Emp21>
{
    @Override
    public int compare(Emp21 o1, Emp21 o2) {
        return o1.name.compareTo(o2.name);
    }
}
class Sortbyid1 implements Comparator<Emp21>
{
    @Override
    public int compare(Emp21 o1, Emp21 o2) {
        if(o1.id> o2.id)
        {
            return 1;
        }
        if (o1.id< o2.id)
        {
            return -1;
        }
        return 0;
    }
}
class ComExample2 {
    public static void main(String[] args) {
        ArrayList<Emp21> obj=  new ArrayList<>();
        obj.add(new Emp21("Aman", 102));
        obj.add(new Emp21("Rahul", 106));
        obj.add(new Emp21("Saurabh", 104));
        obj.add(new Emp21("Kamal", 103));
        // Collections.sort(obj,new Sortbyid());

        // used Collections class sort method to sort and passing two parameters one is for
        // collection object and other is for another class object that implements Compaator interface

        Collections.sort(obj,new Sortbyname1());
        System.out.println(obj);

    }
}

