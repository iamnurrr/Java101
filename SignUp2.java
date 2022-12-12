import java.util.Scanner;
public class SignUp2 {
    public static void main(String[] args) {
        String username, password;
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your username: ");
        username=input.nextLine();

        System.out.println("Enter your password: ");
         password=input.nextLine();

        if(username.equals("Merve")&& password.equals("12345")) {
            System.out.println("Login..: ");}
            else {
            System.out.println("!Wrong username or password!!");

        }


    }
}
