enum status
 {
   Running, failed, Pending, Sucess;  
}

public class series69
{
    public static void main(String a[])
    {

        status s = status.Pending;

        switch (s) {
            case Running:
                System.out.println("All good");
                break;
      
            case failed:
                System.out.println("Try again");
                break;
        
            case Pending:
                System.out.println("please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}

    //     if(s == status.Running)
    //         System.out.println("All Good");
    //    else if(s == status.failed)
    //         System.out.println("Try Again");
    //     else if(s == status.Pending)
    //         System.out.println("please wait");
    //     else
    //         System.out.println("Done");
    // 


