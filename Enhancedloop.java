class Student 
{
    int rollno;
    java.lang.String name;
    int marks;
}

public class Enhancedloop
 {
  public static void main(String a[])  
  {
    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "Satyam";
    s1.marks = 90;

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Sam";
    s2.marks = 81;


    Student s3 = new Student();
    s3.rollno = 3;
    s3.name = "swayam";
    s3.marks = 70;

    Student  Students [] = new Student[3];
    Students[0] = s1;
    Students[1] = s2;
    Students[2] = s3;


  for(Student stud : Students)
  {
    System.out.println( stud.name + " . " + stud.marks + " . " + stud.rollno);
  }

    // for(int i=0;i<Students.length;i++)
    // {
    //     System.out.println(Students[i].name + " . " + Students[i].marks);

    // }
}

 }