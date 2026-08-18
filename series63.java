class A
 {
  public void show()
  {
        System.out.println("in a show");
  }  
}

public class series63
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
