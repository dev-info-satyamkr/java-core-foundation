import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class series93
 {
  public static void main(String a[])
  {
    Collection<Integer> nums = new TreeSet<Integer>();
    nums.add(6);
    nums.add(9);
    nums.add(10);
    nums.add(45);

    Iterator<Integer> values = nums.iterator();

    while(values.hasNext())
        System.out.println(values.next());
   }
 }
    
