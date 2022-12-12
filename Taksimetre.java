import java.util.Scanner;
public class Taksimetre{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int bas=10;
        System.out.println("Gideceğiniz KM'yi giriniz");
        int km = scn.nextInt();
        double total;
       total= km*2.20+bas;
       total=(total<20) ? 20:total;
        System.out.println("toplam:"+total);









    }
}