abstract class car
 {
  public abstract void drive();
  public abstract void fly();
  
    public void playMusic()
    {
        System.out.println("play music based on mood");
    }
  }
  
  class Mahindra extends car
  {
    public void fly()
    {
        System.out.println("Flying...");
    }
    public void drive()
    {
         System.out.println("Drive the car to city");
    }
  }
 
  public class series61
  {
    public static void main(String a[])
    {
        car obj = new Mahindra();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
  }

