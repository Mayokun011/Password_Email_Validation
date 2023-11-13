import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidation {

    public static void main(String[] args) {
        myPassword mypassword = new myPassword();
        mypassword.getInfo();
    }
}


class myPassword {
    private static String username;
    private static String email;
    private static String password;
    private static char c;
    private static boolean hasNum = false;
    private static boolean hasUpper = false;
    private static boolean hasLower = false;
    private static boolean hasEmail = false;
    private static boolean hasLenght = false;

    public static void getInfo(){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter your Username: ");
        username = scanner.next();
        System.out.print("Enter your email: ");
        email = scanner.next();
        System.out.print("Enter your password: ");
        password = scanner.next();
        System.out.println(myRole(password));
    }

    public static String myRole(String password){
        Pattern mySum =Pattern.compile("(a-zA-ZO-9)*");
        for(int i = 0; i < password.length(); i++) {
            c = password.charAt(i);


            if (password.length() > 0){
                hasLenght = true;
            }
            if (Character.isUpperCase(c)){
                hasUpper = true;
            }
            if (Character.isLowerCase(c)){
                hasLower = true;
            }
           if (Character.isDigit(c)){
                hasNum = true;
            }
            if (email.charAt(0)!='@' && email.contains("@") && email.endsWith(".com")){
                hasEmail = true;
            }
        }

        if(hasLenght && hasUpper && hasLower && hasNum && hasEmail){
            return "You have a strong Password";
        }
        return "Your password must contain at least @ Character\nYour password must contain at least an Uppercase or Lowercase Character\nyour email must be correct";
    }
}
