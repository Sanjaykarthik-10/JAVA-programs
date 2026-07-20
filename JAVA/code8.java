import java.util.Scanner;
public class code8 {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("Enter operands:");
        double a=var.nextDouble();
        double b=var.nextDouble();
        System.out.println("Enter operator:");
        char op=var.next().charAt(0);
        double value=switch(op){
            case '+' -> a+b;
            case '-' -> a-b;
            case '*' -> a*b;
            case '/' -> a/b;
            default -> {
                System.out.println("Invalid operator");
                yield 0;
                
            }
        };
        System.out.printf("The result is:%.2f\n",value);
        var.close();
    }
    
}
