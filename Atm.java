import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String username,password;
        int right=3;
        int balance=6500;

        Scanner scn =new Scanner(System.in);


        while ( right>0) {

            System.out.println("please enter your username: ");
            username=scn.nextLine();
            System.out.println("Please enter your password: ");
            password= scn.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Hi! Welcome to Kodluyoruz Bank!");

                System.out.println("1-Para yatırma \n 2-Para Çekme \n 3-Bakiye Sorgulama \n 4-Çıkış yapma");
                System.out.println("Please select your choice");
                int select = scn.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("enter the amount of money");
                        int price = scn.nextInt();
                        balance += price;
                        System.out.println("New balance: " + balance);
                        break;
                    case 2:
                        System.out.println("Enter the amount of money");
                        price = scn.nextInt();
                        if (balance < price) {
                            System.out.println("insufficient balance");
                        } else {
                            balance -= price;
                            System.out.println("Balance: " + balance);
                        }
                        break;
                    case 3:
                        System.out.println("Balance: " + balance);
                        break;
                    case 4:
                        System.out.println("See you again.");
                        break;
                }
            } else {
                right--;
                System.out.println("Incorrect username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank");
                } else {
                    System.out.println("Your remaining right:" + right);
                }
            }
        }
    }
}
