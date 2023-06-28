import java.util.Scanner;

public class HarmonikSeri {

    //Java ile girilen sayının harmonik serisini bulan program yazacağız.

    public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            int n;
            System.out.print("Bir sayi giriniz = ");
            n=input.nextInt();
            double sonuc=0;
            for (double i = 1; i<=n;i++){
                sonuc+=(1/i);
            }
            System.out.println(sonuc);
        }
    }

