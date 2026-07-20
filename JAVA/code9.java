import java.util.Scanner;
public class code9 {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int evencount=0,oddcount=0,sum=0;
        int g=0;
        int s=0;
        for(int i=1;i<=10;i++){
            int num=var.nextInt();
            if (num%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
            sum=sum+num;
            if (i==1){
                g=num;
                s=num;
            }
            if(num>g){
                g=num;
            }
            if(num<s){
                s=num;
            }   
        }
        System.out.printf("The number of even numbers is:%d\n",evencount);
        System.out.printf("The number of odd numbers is:%d\n",oddcount);
        System.out.printf("The sum is:%d\n",sum);
        System.out.printf("The largest  number is:%d\n",g);
        System.out.printf("The smallest number is:%d\n",s);
        var.close();
    }     
}
