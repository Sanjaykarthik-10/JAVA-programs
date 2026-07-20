import java.util.Scanner;
public class code4{
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=var.nextLine();
        System.out.println("Enter your age:");
        int age=var.nextInt();
        System.out.println("Enter your gender(male or female):");
        String gender=var.next();
        System.out.println("---User date---");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        var.close();
    }
}






  

    

