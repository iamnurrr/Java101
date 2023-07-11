import java.util.*;
import java.util.Scanner;

public class SayiTahminEtme {
    public static void main(String[] args) {
        //Java dilinde programın 0-100 arasında rastgele seçtiği bir
        // sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.

        Scanner scn = new Scanner(System.in);
        Random r = new Random();
        System.out.println(" Tahmin Etme Oyununa Hoşgeldiniz! ");
        int right=0;
        int tahmin;
        int sayi = r.nextInt(100);
        int can = 5;
        int[] tahminler = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (can > 0) {
            System.out.println("0-100 Arası Tahmininizi Giriniz: ");
            tahmin = scn.nextInt();
            if (tahmin < 0 || tahmin > 99) {
                System.out.println(" Hatalı Giriş! Lütfen Belirtilen Aralıkda (0-100) Bir Sayı Giriniz !");
            }
            if (tahmin == sayi) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + tahmin);
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                can--;
                if (tahmin > sayi) {
                    System.out.println(tahmin + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(tahmin + " sayısı, gizli sayıdan küçüktür.");
                }
                tahminler[right++] = tahmin;
                System.out.println("Kalan hakkı : " + can);
                  }

        }
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(tahminler));
                System.out.println("Gizli sayi: "+ sayi);
            }
        }
    }
}
