 class BasicCalc
{
public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1+ n2;
    }
}



 class AdvCalculator extends BasicCalc
{
    public int multi (int n1, int n2)
    {
        return n1 *n2;
    }
    public int div (int n1,int n2 )
    {
        return n1/n2;
    }
}





public class Clac {
    
    public static void main(String a[])
    {
        AdvCalculator obj = new AdvCalculator();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(5, 10);
        int r3 = obj.multi(9, 18);
        int r4 = obj.div(56, 2);

        System.out.println(r1 + " " + r2 +" " + r3 + " " + r4 + " ");
    }

}
