import java.util.HashMap;
import java.util.Map;

public class series94
 {
   public static void main(String a[])
   {
    Map<String, Integer> students = new HashMap<>();

    students.put("Satyam", 89);
    students.put("Ram", 56);
    students.put("Shamm", 83);
    students.put("Rahul", 32);
    students.put("Rudra", 81);
    students.put("Jatin", 86);

    System.out.println(students.keySet());

    for(String key : students.keySet())
    {
        System.out.println(key + " : " + students.get(key));
        
    }
   }    
}
