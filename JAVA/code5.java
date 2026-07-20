import java.util.Scanner;
public class code5 {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("Enter the name of the product:");
        String item=var.nextLine();
        System.out.println("Enter the quantity of the product:");
        int quan=var.nextInt();
        System.out.println("Enter the price of single item:");
        double price=var.nextDouble();
        System.out.println("Do you have store membership?");
        String member=var.next();
        double subtotal=quan*price;
        double tax=0.065;
        double total=subtotal+(subtotal*tax);
        System.out.printf("The subtotal is:%.2f\n",subtotal);
        System.out.printf("The tax is:%.2f\n",tax*100);
        System.out.printf("Final total is:%.2f\n",total);
        var.close();
    }
}





        




    

