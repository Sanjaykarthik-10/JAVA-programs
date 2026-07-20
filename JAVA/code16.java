import java.util.Scanner;
public class code16 {
    //PRIME NUMBER
    static void prime(int a){
        int fc=0;
        for(int i=1;i<=a;i++){
            if (a%i==0){
                fc=fc+1;
            }
        }
        if(fc==2){
            System.err.printf("%d is a prime number\n",a);
        }
        else{
            System.out.printf("%d is not a prime number\n",a);
        }
    }

    //PALINDROME
    static void palindrome(int a){
        int newnum=0;
        int b=a;
        while(b!=0){
            int dig=b%10;
            newnum=(newnum*10)+dig;
            b=b/10;   
        }
        if (newnum==a){
            System.out.printf("%d is a Palindrome\n",a);
        }
        else{
            System.out.printf("%d is not a Palindrome\n",a);
        }
    }

    //ARMSTRONG NUMBER
    static int countdig(int n){
        int l=0;
        while (n!=0){
            n=n/10;
            l=l+1;
        }
        return l;
    }

    static void armstrong(int a){
        int len=countdig(a);
        int temp1=a;
        int sum=0;
        while(temp1!=0){
            int dig=temp1%10;
            int digpow=1;
            for(int i=1;i<=len;i++){
                digpow=digpow*dig;
            }
            sum=sum+digpow;
            temp1=temp1/10;
        }
        if(sum==a){
            System.out.printf("%d is a armstrong number\n",a);
        }
        else{
            System.out.printf("%d is a not an armstrong number\n",a);
        }
    }

    //SPY NUMBER
    static void spy(int a){
        int temp=a;
        int sum=0;
        int pro=1;
        while(a!=0){
            int dig=a%10;
            sum=sum+dig;
            pro=pro*dig;
            a=a/10;
        }
        if (sum==pro){
            System.out.printf("%d is a Spy number\n",temp);
        }
        else{
            System.out.printf("%d is not a Spy armstrong number\n",temp);
        }
    }

    //STRONG NUMBER
    static int digfact(int n){
        if(n==0){
            return 1;
        }
        return (n)*(digfact(n-1));
        
    }
    static void strong(int a){
        int temp2=a;
        int factsum=0;
        while(temp2!=0){
            int dig=temp2%10;
            int fact=digfact(dig);
            factsum=factsum+fact;
            temp2=temp2/10;
        }
        if(factsum==a){
            System.out.printf("%d is a strong number\n",a);
        }        
        else{
            System.out.printf("%d is not a strong number\n",a);
        }
    }

    //HAPPY NUMBER
    static void happy(int a){
        int temp3=a;
        while((a!=1)&&(a!=4)){
            int digsum=0;
            while(a!=0){
                int dig=a%10;
                digsum=digsum+(dig*dig);
                a=a/10;
            }
            a=digsum;
        }
        if (a==1){
             System.out.printf("%d is a happy number\n",temp3);
        }
        else{
             System.out.printf("%d is not a happy number\n",temp3);
        }
    }
    
    //NEON NUMBER
    static void neon(int a){
        int sqnum=a*a;
        int sum=0;
        while(sqnum!=0){
            int dig=sqnum%10;
            sum=sum+dig;
            sqnum=sqnum/10;
        }
        if(sum==a){
            System.out.printf("%d is a neon number\n",a); 
        }
        else{
            System.out.printf("%d is not a neon number\n",a);
        }
    }

    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        while(true){
            System.out.println("Enter which operation \n1.Prime\n2.Palindrom\n3.Armstrong\n4.Spy\n5.Strong\n6.Happy\n7.Neon\n8.Exit\n");
            System.out.println("Enter your choice of operation:");
            int choice=var.nextInt();
            if(choice==8){
                System.out.println("Exiting");
                break;
            }
            System.out.println("Enter a number to operate:");
            int num=var.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Prime number check");
                    prime(num);
                    break;
                case 2:
                    System.out.println("Palindrome check");
                    palindrome(num);
                    break;
                case 3:
                    System.out.println("Armstrong  check");
                    armstrong(num);
                    break;
                case 4:
                    System.out.println("Spy number check");
                    spy(num);
                    break;
                case 5:
                    System.out.println("Strong number check");
                    strong(num);
                    break;
                case 6:
                    System.out.println("Happy number check");
                    happy(num);
                    break;
                case 7:
                    System.out.println("Neon number check");
                    neon(num);
                    break;
                case 8:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Opertaion not available");   
            }
        }
    }
}

