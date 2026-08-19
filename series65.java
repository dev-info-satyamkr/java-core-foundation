interface A 
{
 int age =22;                     // final and static 
 String area ="Mumbai";
  
  void show();
  void config();
}

class B implements A
{
    public void show()
    {
    System.out.println("in the show");
    }
    public void config()

    {
    System.out.println("in the config");
    }
}

public class series65
{
    public static void main(String a[])
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area );
        System.out.println(B.age);

        }
}
