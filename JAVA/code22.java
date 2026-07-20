
import java.util.Scanner;

public class code22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
            else if (Character.isLowerCase(ch)) {
                hasLower = true;
            }
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            else {
                hasSpecial = true;
            }
        }

        boolean strong = true;

        if (password.length() < 8) {
            System.out.println("Missing: Minimum Length (8)");
            strong = false;
        }

        if (!hasUpper) {
            System.out.println("Missing: Uppercase Letter");
            strong = false;
        }

        if (!hasLower) {
            System.out.println("Missing: Lowercase Letter");
            strong = false;
        }

        if (!hasDigit) {
            System.out.println("Missing: Digit");
            strong = false;
        }

        if (!hasSpecial) {
            System.out.println("Missing: Special Character");
            strong = false;
        }

        if (strong) {
            System.out.println("Strong Password");
        }

        sc.close();
    }
}