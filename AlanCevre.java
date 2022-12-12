import java.util.Scanner;
public class AlanCevre {
    public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
        System.out.println("Çapı giriniz:");
        int R =scn.nextInt();
        int r=R/2;
        final double pi=3.14;
        double alan=pi*r*r;
        double cevre=2*pi*r;
        System.out.println("Alan: "+alan+ "\nÇevre: "+cevre);


    }
}
