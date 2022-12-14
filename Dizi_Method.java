import java.util.*;
public class Dizi_Method {
    public static void main(String[] args) {

        //Bir diziyi parametre alıp, Dizinin gönderilen elemanını 2 katı ile değiştirsin
        // ile değiştirdikten sonra diziyi geri döndüren bir mtd tasarlayın
        System.out.println("Hoşgeldiniz bu program oluşturacağınız dizinin seçtiğiniz bir elemanını 2 katına çıkararak diziyi güncellemektedir!");
        Scanner scn = new Scanner(System.in);
        System.out.println("Dizinin kaç elemanlı olacağını giriniz:");

        int sayi = scn.nextInt();
        if (sayi < 0) {
            System.out.println("Hatalı giriş yaptınız! Dizi sayısı 0'dan küçük olamaz!");
        } else {
            int[] dizi = new int[sayi];
            for (int i = 0; i < dizi.length; i++) {
                System.out.println("Dizinin " + (i + 1) + ". elemanını giriniz.");
                int gir = scn.nextInt();
                dizi[i] = gir;

            }

            System.out.println("Dizinin elemanları:");
            for (int i = 0; i < dizi.length; i++) {
                System.out.print(dizi[i] + " ");
            }
            System.out.println("\n");
            System.out.println("Dizinin hangi indexinin değişeceğini giriniz:");
            int x = scn.nextInt();

            if (x > dizi.length || x==dizi.length) {
                System.out.println("Hatalı giriş yaptınız! İndex sınırları dışarısına çıkmayınız!");
            } else {
                System.out.println("Değişen dizinin elemanları:");
                dizi[x] = change(dizi, x);
                for (int i = 0; i < dizi.length; i++) {
                    System.out.print(dizi[i] + " ");
                }
            }
        }
    }
        public static int change ( int d[], int a){

            d[a] = d[a] * 2;
            return d[a];

        }


}