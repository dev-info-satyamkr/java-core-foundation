class A extends Thread
{
            public void run()
            {
                for(int i=1;i<=100;i++)
                {
                    System.out.println(" OG ");
                    try{
                        Thread.sleep(10);
                    } catch(InterruptedException e) { e.printStackTrace();

                    }
                }
            }
}

class B extends Thread
{
            public void run()
            {
                for(int i=1;i<=100;i++)
                {
                    System.out.println(" Are back ");
                    try{
                        Thread.sleep(10);
                    } catch(InterruptedException e) { e.printStackTrace();

                    }
                }
            }
}

public class series87
{
    public static void main(String a[])
    {
    A obj1 = new A();
    B obj2 = new B();

      obj1.start();
      obj2.start();
    }
}
