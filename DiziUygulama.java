import java.util.*;
public class DiziUygulama {
    public static void main(String[] args) {
         //0-500 arasında 10 sayıdan
        // A)100-200 arasındaki sayıların adedini
        // B)100'den küçük sayıların toplamını
        // C)200'den büyük sayıların 4 'e bölünenlerin adedini ekrana yazdıran programı yazınız.
        Random r=new Random();
        int sayac1=0;
        int sayac2=0;
        int toplam =0;
        int[]dizi=new int[10];
        int i;
        for (i=0;i<dizi.length;i++){
            dizi[i]=r.nextInt(500);
        }
        System.out.println("Rastgele Oluşan Dizi:");
        for (i=0;i<dizi.length;i++){
            System.out.print(dizi[i]+" ");
            }
        System.out.println("\n100-200 Arasında Gelen Sayılar:");
        for (i=0;i<dizi.length;i++){
            if(dizi[i]<=200&&dizi[i]>=100) {
                System.out.println(dizi[i]);
                sayac1++;}
            }
        System.out.println("100'den küçük sayılar:");
        for (i=0;i<dizi.length;i++){
            if (dizi[i]<100){
                System.out.println(dizi[i]);
                toplam+=dizi[i];
            }
        }
        System.out.println("200'den büyük 4'bölünen sayılar:");
        for (i=0;i<dizi.length;i++){
        if (dizi[i]>200&&dizi[i]%4==0){
            System.out.println(dizi[i]);
            sayac2++;

        }
        }
        System.out.println("100-200 arasında gelen sayıların adedi: "+sayac1);
        System.out.println("100'den küçük sayıların toplamı: "+toplam);
        System.out.println("200'den büyük 4'bölünen sayıların adedi: "+sayac2);
        System.out.println("Program bitti");
        }

}
