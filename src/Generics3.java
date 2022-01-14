import java.util.ArrayList;

class Container1<T extends Number>// because here we are using restriction..
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
   public void demo(ArrayList<T> obj)

    {
        System.out.println("hello");
    }
}
class Generic3 {
    public static void main(String[] args) {
        //int value=5;
        //List<Integer> values=new ArrayList<>();//
        //Container obj=new Container();// Raw use of parameter
        Container1<Number> obj = new Container1<>();// only we specify wrapper class or Number itself not even Object class
        //Container1<Student> obj1 = new Container1<>(); if we use this here then it will give error...
        //Container1<Object> obj1 = new Container1<>(); it will also give error

        obj.values = 8;
        obj.show();
        obj.demo(new ArrayList<Number>());
        //obj.demo(new ArrayList<Integer>());

    }
}
