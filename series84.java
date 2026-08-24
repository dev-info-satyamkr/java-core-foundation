import java.io.BufferedReader;
import java.io.InputStreamReader;

public class series84
 {
  public static void main(String a[]) throws NumberFormatException, java.io.IOException
   {
     int num = 0;

     try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in)))
     {
        num = Integer.parseInt(br.readLine());
        System.out.println(num);
     }
   }    
}
