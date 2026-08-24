 class A extends Thread 
{
    public void run()
    {
        for(int i=1;1<=10;i++)
        {
        System.out.println(" OG ");
        }
    }
}

class B extends Thread
{
            public void run()
            {
                for(int i=1;i<=10;i++)
                {
                    System.out.println(" Are back ");
                }
            }
}

public class series86
{
    public static void main(String a[])
    {
    A obj1 = new A();
    B obj2 = new B();

      obj1.start();
      obj2.start();
    }
}
