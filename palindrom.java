import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n = scn.nextInt();

        if (p(n)) {

        }


    }
    static boolean p(int number) {
        int temp = number;
        int reversenumber = 0;
        int lastnumber;
        while (temp != 0) {
            lastnumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastnumber;
            temp /= 10;
        }
            if (reversenumber == number){
                System.out.println("Girdiğiniz sayı bir palindrom sayıdır.");
                return true;}
            else {
                System.out.println("Girdiğiniz sayı palindrom sayı değildir!!!");
                return true;
            }
        }

    }
