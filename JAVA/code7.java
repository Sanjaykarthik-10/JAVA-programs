import java.util.Scanner;
public class code7 {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("Enter two operands");
        double a=var.nextDouble();
        double b=var.nextDouble();
        System.out.println("Enter and operation(+,-,/,*,)");
        char op=var.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("ADDITION");
                double sum=a+b;
                System.out.printf("The sum is: %.2f\n",sum);
                break;
            case '-':
                    System.out.println("SUBTRACTION");
                    double diff=a-b;
                    System.out.printf("The difference is: %.2f\n",diff);
                    break;
            case '*':
                System.out.println("MULTIPLY");
                double product=a*b;
                System.out.printf("The product is: %.2f\n",product);
                break;
            case '/':
                System.out.println("DIVISION");
                double quotient=a/b;
                System.out.printf("The quotient is: %.2f\n",quotient);
                break;
            default:
                System.out.println("Enter a valid operation");
                break;
        }
    }
}



    

