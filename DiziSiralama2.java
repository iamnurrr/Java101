import java.util.*;
public class DiziSiralama2 {
    // Bilgisayar 1 ile 100 arasında rastgele 10 sayı üretiyor. Üretilen sayıları bir dizi içerisine kayıt edin.
    // Sonrasında diziye kayıt edilen sayıları herhangi bir sıralama algoritması ile sıralayın ve
    // sonrasında ekrana çıktı verin.
    public static void main(String[] args) {
        int[] dizi = new int[10];
        int i, j, temp;
        Random random = new Random();
        for (i = 0; i < dizi.length; i++) {
            dizi[i] = random.nextInt(101);


        }
        System.out.println("Rastgele gelen sayılar");
        for (i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        for (i = 0; i < dizi.length; i++) {
            for (j = i + 1; j < 10; j++) {
                if (dizi[i] < dizi[j]) {
                    temp = dizi[j];
                    dizi[j] = dizi[i];
                    dizi[i] = temp;


                }
            }
        }
        System.out.println("\ndizinin büyükten küçüğe sıralanmış hali");
        for (i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");

        }

    }
}
