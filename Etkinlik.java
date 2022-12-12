import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        /* 5 Öncesi kayak
           5-15 Sinema
           10-25 Piknik
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the program that recommends activity according to the weather!");
        System.out.println("Please enter the weather temperature: ");
        int degree=input.nextInt();
        if (degree<5){
            System.out.println("Ski");}
        else if (5<=degree&& degree<=25){
            if(degree<=15) {
                System.out.println("Cinema");
            }
            if(degree>=10){
                System.out.println("Picnic");
            }
        }else{
            System.out.println("Swim");}
    }
}
