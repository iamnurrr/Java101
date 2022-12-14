import java.util.*;
public class DiziMethod1 {
    public static void main(String[] args) {

        // Bir diziyi parametre alıp, dizinin tüm elemanlarını 3 katı ile değiştirdikten sonra diziyi geri döndüren bir mtd tasarlayın

        Scanner inp = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz");
        int n = inp.nextInt();
        int dizi[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dizinin " + (i + 1 )+ "." + "Elemanını giriniz");
            int g=inp.nextInt();
            dizi[i] = g;}

            System.out.println("Diziniz:");
            for (int i = 0; i < n; i++) {
                System.out.print(dizi[i]+" ");

            }


        System.out.println("\nMetota giden elemanların oluşturduğu yeni dizi: ");
        method(dizi);
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i]+" ");
        }

    }

    public static int[] method(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 3;

        }
        return a;
    }
}



