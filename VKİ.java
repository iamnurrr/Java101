import java.util.Scanner;
public class VKİ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Kilonuzu Giriniz: ");
        double kilo= scn.nextDouble();
        System.out.println("Boyunuzu Giriniz(metre cinsinden): ");
        double boy=scn.nextDouble();
        double vki=kilo/(boy*boy);
        System.out.println("Vucüt Kütle İndeksiniz: "+vki);
    }
}
