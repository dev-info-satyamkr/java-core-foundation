 class A
  {
   public void show1()
   {
    System.out.println("A is a Nigga");
   }   
}

class B extends A
{
  public void show2()
  {
    System.out.println("B is Higher Nigga");
  }
}

public class series59
{
    public static void main(String a[])
    {
       A obj = new B();
       obj.show1();

       B obj1 = (B) obj;
       obj1.show2();
    }
}
