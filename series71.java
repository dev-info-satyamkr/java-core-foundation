class A
 {
   public void showTheDataForMe()
   {
    System.out.println("in A show");
   }  
}

class B extends A
{
    @Override
    public void showTheDataForMe()
    {
        System.out.println("in B show");
    }

}

public class series71
{
    public static void main(String a[])
    {
        B obj = new B();
        obj.showTheDataForMe();

    }
}
