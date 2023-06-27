import java.util.Scanner;

public class Kombinasyon {
// KOMBİNASYON
    //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu
    // olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    //Java ile kombinasyon hesaplayan program yazınız.
    //Kombinasyon formülü:
    //C(n,r) = n! / (r! * (n-r)!)
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kaç elemanlı bir dizi olacak?");
        int n = scn.nextInt();
        System.out.println("Kaç elemanlı gruplara ayrılacak ?");
        int r = scn.nextInt();
        int i, t = 1, c, s = 1, k = 1;
        for (i = 1; i <= n; i++) {
            t *= i;
        }
        for (i = 1; i <= r; i++) {
            s *= i;
        }
        for (i = 1; i <= n - r; i++) {
            k *= i;
        }
        c = t / (s * (k));
        System.out.println("Kombinasyon = " +c);

    }
}