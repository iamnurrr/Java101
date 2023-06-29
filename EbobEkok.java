import java.util.*;
public class EbobEkok {
    public static void main(String[] args) {

//Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
int ebob=1;
        Scanner scn = new Scanner(System.in);
        System.out.println("İlk Sayıyı giriniz: ");
        int n1 = scn.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        int n2 = scn.nextInt();
        int i, j, k;
        System.out.println("\nn1 Bölenler:");
        for (i = 2; i <= n1; i++) {
            if ((n1 % i) == 0) {
                System.out.print( i + ",");


            }
        }
        System.out.println("\nn2 Bölenler:");
        for (i = 2; i <= n2; i++) {
            if ((n2 % i) == 0) {
                System.out.print( i + " ,");


            }
        }
        //ebob:EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin
        // en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
        System.out.println("\nOrtak Bölenler:");
        if (n1 > n2) {
            for (i = 2; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob=i;
                    System.out.println(ebob);

                }
            }
        }
            if (n2 > n1) {
                for (i = 2; i <= n2; i++) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        System.out.println( i);
                    ebob=i;
                    }

                }
            }
        System.out.println("Ebob: "+ebob);

            //ekok : EKOK : İki ya da daha fazla doğal sayının ortak katlarının
        // en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
        //EKOK = (n1*n2) / EBOB

        for(i=1;i<=n1*n2;i++){
            if(i%n1==0&&i%n2==0){
                System.out.println("Ekok: "+i);
                break;
            }
        }
        }
    }

