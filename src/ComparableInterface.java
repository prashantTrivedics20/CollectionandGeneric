// comparable interface.....(by using comparable we dosen't require the comprator)
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student1<T> implements Comparable<Student1>
{
    int rollno;
    int marks;
    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
    public Student1(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student1 o) {
        return this.marks>o.marks?-1:this.marks<o.marks?1:0;
    }
}
public class ComparableInterface {
    public static void main(String[] args) {
        List<Student1> studs=new ArrayList<>();
        studs.add(new Student1(1,55));
        studs.add(new Student1(2,95));
        studs.add(new Student1(3,35));
        studs.add(new Student1(4,45));
        studs.add(new Student1(5,85));
        Collections.sort(studs);
        for (Student1 s:studs) {
            System.out.println(s);
        }

    }
}
