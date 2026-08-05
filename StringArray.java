class Student 
{
    int rollno;
    java.lang.String name;
    int marks;
}

public class StringArray
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
    s3.name = "Ram";
    s3.marks = 70;

    Student  Students [] = new Student[3];
    Students[0] = s1;
    Students[1] = s2;
    Students[2] = s3;

    for(int i=0;i<Students.length;i++)
    {
        System.out.println(Students[i].name + " . " + Students[i].marks);

    }
}

 }


//     int nums[] = new int [4];
//     nums[0]= 20;
//     nums[1]= 30;
//     nums[2]=40;
//     nums[3]=50;

//     for(int i =0;i<nums.length;i++)
//     {
//         System.out.println(nums[i]);
        
//     }
//   }
// }
