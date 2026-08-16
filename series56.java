class A
 {
 public void fast ()   
{
    System.out.println("Fast in Area A");
}
 }

 class B extends A 
 {
    public void fast()
  {
    System.out.println("Fast in city B");
  }
 }

 class C extends A
 {
   public void fast()
   {
    System.out.println("fast in State C");
   }
 }

 public class series56
 {
  public static  void main(String a[])
  {
    A obj = new A();
    obj.fast();

    obj = new B();
    obj.fast();
    
    obj = new C();
    obj.fast();

  }
 }