import java.util.Scanner;
public class code6 {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("Enter the movie name:");
        String movie=var.nextLine();
        System.out.println("Enter the customer age:");
        int age=var.nextInt();
        System.out.println("Enter the screening time(0-24 hrs):");
        int time=var.nextInt();
        System.out.println("Do you have a discount coupon(yes or no):");
        String coupon=var.next();
        //determing ticket price
        double ticket_price;
        if (age<=5){
            System.out.println("Free tickets for age 5 or under");
            ticket_price=0.00;
        }
        else if ((age>5)&&(age<62)){
            if (time<16){
                System.out.println("It is not rush hour");
                ticket_price=100.00;
            }
            else {
                System.out.println("It is rush hour");
                ticket_price=200.00;
            }
        }
        else{
            System.out.println("You get a senior rate");
            ticket_price=75.00;
        }
        //finding discount price
        double discounted_price;
        if (coupon.equals("yes")){
            discounted_price=ticket_price*0.8;
            System.out.printf("The final ticket price is: %.2f\n",discounted_price);
        }
        else{
            System.out.printf("The final ticket price is: %.2f\n",ticket_price);
        }

    }
    
}
