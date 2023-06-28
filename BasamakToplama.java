import java.util.Scanner;

public class BasamakToplama {
    public static void main(String[] args) {
       // int a = 2451, basamakSayisi = 0, numberCounter = 0;
        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0
        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14
        Scanner scn =new Scanner(System.in);
        int sum=0;
        System.out.println("Bir sayı giriniz: ");
        int n= scn.nextInt();
        int temp=n;
        int basnumber=0;
        int basvalue;
        while(temp!=0){
            temp/=10;
            basnumber++;
        }
        temp=n;
        while (temp!=0){
            basvalue=temp%10;
            System.out.println(+basvalue);
            temp/=10;
            sum+=basvalue;
        }
        System.out.println("Toplam: "+sum);

    }
}