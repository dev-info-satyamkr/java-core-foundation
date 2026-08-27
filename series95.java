import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "Student[age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that)
    {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

class series95
{
    public static void main(String a[])
    {
        Comparator<Student> com = (Student i, Student j) ->
        {
            if(i.age > j.age)
                return 1;
            else
                return -1;
        };

        List<Student> Studs = new ArrayList<>();
        Studs.add(new Student(21, "Satyam"));
        Studs.add(new Student(19, "Jatin"));
        Studs.add(new Student(18, "ritik"));
        Studs.add(new Student(17, "Sameer"));

        Collections.sort(Studs, com);
        for(Student s : Studs)
            System.out.println(s);
    }
}
