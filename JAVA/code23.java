import java.util.Scanner;
public class code23{
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.print("enter a string to reverse:");
        String str=var.nextLine();
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            for(int j=word.length()-1;j>=0;j--){
                System.out.print(word.charAt(j));
            }
            System.err.print(" ");
        }
        var.close();
    }
}
