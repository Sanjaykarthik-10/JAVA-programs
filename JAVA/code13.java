import java.util.Scanner;
public class code13{
    static int sumofdig(int a){
        if(a==0){
            return 0;
        }
        return (a%10)+sumofdig(a/10);
    }
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=var.nextInt();
        int res=sumofdig(num);
        System.err.printf("The sum of digigts of %d is: %d",num,res);
        var.close();
    }
}
