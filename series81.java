class SatyamException extends Exception
{
    public SatyamException(String string)
    {
        super(string);
    }
}
public class series81
 {
   public static void main(String a[])
   {
    int i = 20;
    int j = 0;

    try 
    {
        j = 18/i;
        if(j==0)
            throw new SatyamException("I don't want zero to be printed");
    }

    catch(SatyamException e)
        {
            j = 18/1;
            System.out.println("It is default value" + e);
        }

    catch(Exception e)
        {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
        System.out.println("Bye");

   }
}
