public class series78 
{
  public static void main(String a[])
  {
    int i = 0;
    int j = 0;

    int num[] = new int[5];
   

    try
    {
      j = 18/1;
      System.out.println(num[1]);
      System.out.println(num[5]);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Cannot divide by zero");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Stay in your limit");
    }
    catch(Exception e)
    {
         System.err.println("Something went wrong.." + e);
    }

    System.out.println(j);
  }  
}
