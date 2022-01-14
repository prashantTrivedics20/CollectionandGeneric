import java.util.ArrayList;

class Container2<T extends Number>// because here we are using restriction..
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
    // public void demo(ArrayList<Integer> obj)
   // public void demo(ArrayList<Number> obj)
    // public void demo(ArrayList<? extends Number> obj)
    public void demo(ArrayList<? extends T> obj)

    {
        System.out.println("hello");
    }
}
class Generic4 {
    public static void main(String[] args) {

        Container2<Number> obj = new Container2<>();
        obj.values = 8;
        obj.show();
        obj.demo(new ArrayList<Integer>());
        obj.demo(new ArrayList<Number>());

    }
}
