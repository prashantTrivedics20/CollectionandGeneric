import java.util.ArrayList;
class Container3<T extends Number>// because here we are using restriction..
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
    public void demo(ArrayList<? super T> obj)// require superInteger
    {
        System.out.println("hello");
    }
}
class Generic5 {
    public static void main(String[] args) {

        Container3<Integer>obj = new Container3<>();
        obj.values = 8;
        obj.show();
        obj.demo(new ArrayList<Integer>());
        obj.demo(new ArrayList<Number>());// number class is the super class of the all the wrapper classes
        //obj.demo(new ArrayList<Double>()); so it is not feasibal

    }
}
