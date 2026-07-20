import java.util.Scanner;
public class code21 {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.print("Enter a sentence to find the largest word:");
        String sent=var.nextLine();
        String arr[]=sent.split(" ");
        String l_word=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>l_word.length()){
                l_word=arr[i];
            }
        }
        System.err.printf("The largest word in the given string is: %s",l_word);
        var.close();       
    }  
}
