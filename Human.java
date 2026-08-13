// Encapsulation in java 


 class machine {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}

public class Human {
    public static void main(String[] args) {
        machine obj = new machine();
        obj.setAge(30);
        obj.setName("Yadav"); 

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}