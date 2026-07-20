import java.util.Scanner;
public class code15 {
    static int countoc(int target,int...numbers){
        int count=0;
        for (int num:numbers){
            if (num==target){
                count=count+1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("enter the target to search:");
        int target=var.nextInt();
        int res=countoc(target,5,8,5,10,9,5,13,90,77,7,8,5,51,05,8);
        System.out.printf("The number %d appears %d times.",target,res);
    }
    
}
