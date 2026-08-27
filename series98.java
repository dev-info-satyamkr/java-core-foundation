import java.util.Arrays;
import java.util.List;

public class series98 {
    public static void main(String a[])
    {
        List<Integer> nums = Arrays.asList(4,8,9,10,45);

        int result = nums.stream()
                         .filter(n -> n%2==0)
                         .map(n -> n*4)
                         .reduce(0, (c,e) -> c+e);

         System.out.println(result);

    }
    
}
