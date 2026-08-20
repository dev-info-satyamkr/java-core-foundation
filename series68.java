enum status
 {
   Running, Failed, pending , sucess; 
}

public class series68
{
    public static void main(String a[])
    {
        int i = 5;
        status[] ss = status.values();
        
        for(status s : ss)
             {
                System.out.println(s + " : " + s.ordinal());
             }  
        } 
}