import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class Container<T>
{
    T values;

    public T getValues() {
        return values;
    }

    public void setValues(T values) {
        this.values = values;
    }

    public void show()
    {
        System.out.println(values.getClass().getName());
        System.out.println(values);
    }
}

public class Generic2 {
    public static void main(String[] args) {
        //int value=5;
        //List<Integer> values=new ArrayList<>();//
        //Container obj=new Container();// Raw use of parameter
        Container<Integer>obj=new Container<>();
        obj.values=8;
        obj.show();

    }
}
