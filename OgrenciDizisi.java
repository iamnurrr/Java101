import java.util.*;
public class OgrenciDizisi {
    public static void main(String[] args) {
        // Öğrencilerin almış olduğu notların ortalaması hesaplayan bir ortalama methodu yazın.
        // Notları dizi içerisinde tutup methoda diziyi gönderin.
        Scanner inp = new Scanner(System.in);

        int n, i;
        int not;
        System.out.println("kaç öğrenci olduğunu giriniz: ");
        n = inp.nextInt();
        int dizi[] = new int[n];

        System.out.println("Notları giriniz:");
        for (i = 0; i < n; i++) {
            System.out.println(i + 1 + ".notu giriniz");
            dizi[i] = inp.nextInt();

        }
        for (i = 0; i < n; i++) {
            System.out.println(dizi[i]);

        }

        System.out.println("Öğrencilerin toplam not ortalaması:"+OgrenciDizisi.ort(dizi));
    }

    public static double ort(int[] dizi) {
        int ort=0,i,toplam=0;
        for(i=0;i< dizi.length;i++){
            toplam=dizi[i]+toplam;
            ort=toplam/ dizi.length;
        }
        
    return ort;
    }


    }
