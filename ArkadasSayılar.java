import java.util.*;
public class ArkadasSayılar {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        //İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir.
        // Örnek:
        // 220 ve 284 220: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
        // 284: 1 + 2 + 4 + 71 + 142 = 220
        System.out.println("Birinci sayıyı giriniz: ");
        int n1=scn.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        int n2=scn.nextInt();
        int t1=0,t2=0;
        for (int i=1;i<n1;i++){
            if(n1%i==0){
                t1+=i;

            }
        }
        for (int i=1;i<n2;i++) {
            if (n2% i == 0) {
                t2 += i;
            }
        }
        if(n1==t2 && n2==t1)
        {
            System.out.println("Bu sayılar Arkadaştır");

        }
        else {
            System.out.println("Bu sayılar Arkadaş değildir");
        }
    }
}
