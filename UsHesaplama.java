import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        Scanner scn = new Scanner(System.in);
        
        while (true) {
            System.out.println("Taban Giriniz : ");
            int t = scn.nextInt();
            System.out.println("Üs Giriniz: ");
            int u = scn.nextInt();

            int i, s = 1;

            for (i = 1; i <= u; i++) {
                s *= t;
            }
            System.out.println("Sonuç = " + s);
        }

    }

}