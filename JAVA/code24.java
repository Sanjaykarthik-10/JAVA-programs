import java.util.Scanner;
class student {
    String name;
    int age;
    double marks;
    char grade;
    void displayinfo(){
        System.out.println("-------STUDENT DETAILS-------");
        System.out.printf("Name: %s\n",name);
        System.out.printf("Age: %d\n",age);
        System.out.printf("Marks: %.2f\n",marks);
        System.out.printf("Grade: %c\n",grade);
    }
}
public class code24{
    public static void main(String[] args){
        student s1=new student();
        student s2=new student();
        s1.name="Alex";
        s1.age=18;
        s1.marks=75.8;
        s1.grade='C';
        s2.name="John";
        s2.age=19;
        s2.marks=85.81;
        s2.grade='A';
        s1.displayinfo();
        s2.displayinfo();
    }
}

    

