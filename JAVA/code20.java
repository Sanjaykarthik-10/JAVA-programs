import java.util.Scanner;
public class code20 {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.print("Enter string to check for palindrome:");
        String s=var.nextLine();
        int l=s.length();
        boolean opt=true;
        for(int i=0;i<l;i++){
            if((s.charAt(i))==(s.charAt(l-1-i))){
                opt=true;
            }
            else{
                opt=false;
                break;
            }
        }
        if(opt==true){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
    
}
