import java.util.Scanner;
public class code14 {
    static int fact(int x){
        if(x==0){
            return 1;
        }
        return (x)*fact(x-1);

    }
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("enter a number to find factorial:");
        int num=var.nextInt();
        System.err.printf("The factorial of %d is: %d",num,fact(num));
        var.close();
    }
    
}
