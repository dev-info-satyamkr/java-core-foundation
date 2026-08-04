 class Method 
{
    public void  playmusic()
    {
    System.out.println("Music is Playing.. ");
    }
    public String getMeAPen(int cost)
    {
        if (cost >=10)
        return "Pen";
        else
        return "Nothing";
    }
}


class demo
{

    public static void main(String a[])
    {
        Method obj = new Method();
        obj.playmusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);

    }

    
}

