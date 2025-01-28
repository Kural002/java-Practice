class Student {

    String name;
    int rollno;
    int marks;

}

public class ArrayofObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Luffy";
        s1.rollno = 01;
        s1.marks=50;

        Student s2 = new Student();
        s2.name = "Zoro";
        s2.rollno = 02;
        s2.marks=40;

        Student s3 = new Student();
        s3.name = "Sanji";
        s3.rollno = 03;
        s3.marks=80;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student std : students) {
            System.out.println(std.name + " : " + std.rollno + " : " + std.marks);
        }


        // for (int i = 0; i < students.length; i++) {

        //     System.out.println(students[i].name+" : " + students[i].marks);

        //}
        // int nums[] = new int [4];
        // nums[0] = 1 ;
        // nums[1] = 2 ;
        // nums[2] = 3 ;
        // nums[3] = 4 ;
     
        

        // for (int n : nums) {
        //     System.out.println(n);
        // }
    }
}
