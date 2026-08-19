class computer
 {
  public void code()
  {

  }  
}

class Laptop extends computer
{
    public void code ()
    {
        System.out.println("code, compile, run ");
    }
}

class Desktop extends computer
{
    public void code()
    {
        System.out.println(" code , compile, run : Faster");
    }
}

class Developer 
{
    public void devApp(computer lap)
    {
        lap.code();
    }
}


public class series66
{
    public static void main(String a[])
    {
      computer lap = new Laptop();
      computer desk = new Desktop();

      Developer navin = new Developer();
      navin.devApp(lap);

    }
}
