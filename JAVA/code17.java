import java.util.Scanner;
public class code17 {
    public static void main(String[] args){
    Scanner var=new Scanner(System.in);
    System.out.println("Enter the number of elemnets in you array:");
    int n=var.nextInt();
    int[] arr=new int [n];
    for(int i=0;i<n;i++){
        System.out.printf("Enter element %d:\n",(i+1));
        arr[i]=var.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
        int fc=0;
        for(int j=1;j<=arr[i];j++){
            if(arr[i]%j==0){
                fc=fc+1;
            }
        }
        if(fc==2){
            System.out.printf("%d is a prime number.\n",arr[i]);
            sum=sum+arr[i];
        }
    }
    System.out.printf("The sum of prime numbers in the given array is: %d\n",sum);
    var.close();     
    }
}
