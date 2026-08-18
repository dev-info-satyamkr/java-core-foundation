abstract class A  
{
 public abstract void  show();   
}

public class series64
{
    public static void main(String a[])
    {
        A obj = new A() {
            public void show()
            {
                System.out.println("in a new show");
            }
        };
        obj.show();
    }
}

