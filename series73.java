interface A
 {
   void show();  
}

public class series73
{
    public static void main(String a[])
    {
        A obj = new A()                                              //using of Anonymous method 
        {
        public void show()
        {
            System.out.println("Og is back");
        }
        };
        obj.show();
        
    }
}
