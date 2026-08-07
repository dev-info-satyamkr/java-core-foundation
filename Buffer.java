public class Buffer
 {
   public static void main(String a[])
   {
    StringBuffer sb = new StringBuffer("Satyam");
    sb.append(" Kumar ");
    sb.append(" Yadav");

    sb.insert(6, " java");
    sb.setLength(30);

    System.out.println(sb);

   }   
}