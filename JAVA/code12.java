import java.util.Scanner;
public class code12 {
    static void primecheck(int a, int b){
        int count=0;
        System.out.println("Prime numbers:-");
        for(int i=a;i<=b;i++){
            int fc=0;
            for(int j=1;j<=b;j++){
                if(i%j==0){
                    fc=fc+1;
                }
            }
            if(fc==2){
                System.out.printf("%d\n",i);
                count=count+1;
            }
        }
        System.out.printf("  prime numbers from %d to %d are: %d\n",a,b,count);
        System.out.printf("  non prime numbers from %d to %d are: %d\n",a,b,b-a-count+1);
    }
    public static void main(String[] args){
        Scanner var= new Scanner(System.in);
        System.out.println("enter the start number:");
        int start=var.nextInt();
        System.out.println("enter the end number:");
        int end=var.nextInt();
        primecheck(start,end);
        var.close();
    }

    
}
