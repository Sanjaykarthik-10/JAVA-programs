import java.util.Scanner;
public class code19 {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.print("Enter a string to check for vowels,consonants,digits,specialchs:");
        String s=var.nextLine();
        char arr[]=s.toCharArray();
        int vow=0,con=0,dig=0,spch=0;
        for(char ch: arr){
            if(Character.isLetter(ch)){
                ch=Character.toLowerCase(ch);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vow=vow+1;
                }
                else{
                    con=con+1;
                }
            }
            else if(Character.isDigit(ch)){
                dig=dig+1;
            }
            else{
                spch=spch+1;
            }
        } 
        System.out.printf("vowel count:%d\n",vow);
        System.out.printf("consonant count:%d\n",con);
        System.out.printf("digit count:%d\n",dig);
        System.out.printf("special character count:%d\n",spch);
        var.close();
    }   
}
