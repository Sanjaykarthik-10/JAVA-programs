import java.util.Scanner;
public class code10 {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("What are you saving for?");
        String item=var.nextLine();
        System.out.println("What is the cost of your item:");
        double cost=var.nextDouble();
        double savings=0.0;
        while (savings<cost){
            System.out.printf("Your current savings: %.2f\n",savings);
            System.out.println("Enter the amount you want to deposit\n:");
            double deposit=var.nextDouble();
            savings=savings+deposit;
            System.out.printf("Your new savings: %.2f\n",savings);
        }
        System.out.printf("You have saved enough for %s\n",item);
        if (savings>cost){
            double remaining=savings-cost;
            System.out.printf("You have %.2f extra money",remaining);
        }
        var.close();
    } 
}
