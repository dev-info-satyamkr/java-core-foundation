class Demo
{
  String brand;
  int price;
   String name;

  public void show()
  {
    System.out.println(brand + " : " + price + " : " + name);
  }
}
class Mobile extends Demo
{
    public static void main (String a[])
    {
      Mobile obj1 = new Mobile();
      obj1.brand = " Samsung ";
      obj1.price = 300000;
      obj1.name = " Smartphone";


      Mobile obj2 = new Mobile();
      obj2.brand = " Iphone ";
      obj2.price = 200000;
      obj2.name = " Smartphone";
      
      obj1.name = " Phone ";
      

      obj1.show();
      obj2.show();
    }
}
