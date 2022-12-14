import java.util.*;
public class Diziler {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random r = new Random();
        boolean x=true;
        int[] dizi = new int[5];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = r.nextInt(9);
        }
        System.out.println("Sayı Giriniz: ");
        int sayi = scn.nextInt();
        for (int i = 0; i < dizi.length; i++) {
            if (sayi == dizi[i]) {
               x=true;
            }
            else {
             x=false;

            }
        }
        if(x==true) {
            System.out.println("Girdiğiniz Sayı Dizide Mevcuttur!");
        }

        else {
            System.out.println("Girdiğiniz Sayı Dizide Mevcut Değildir!");
        }
        System.out.println("Dizideki  sayılar:");
            for (int i = 0; i < dizi.length; i++) {

                System.out.println(dizi[i]);
            }
        }

    }


