import java.util.*;
public class ColdHot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random r=new Random();
        int randomSayi=r.nextInt(11);
        int kalanHak=2;
        int kullanilanHak=0;

        while(kullanilanHak<3){
            System.out.println("Tahminizi Giriniz: ");
            int tahmin=input.nextInt();
            if(tahmin<randomSayi){
                System.out.println("Daha büyük düşün!");
                if(kalanHak==0){
                    System.out.println("Hakkın Kalmadı!");
                }
                else {
                    System.out.println(kalanHak+" Hakkın kaldı");
                }
            } else if (tahmin>randomSayi) {
                System.out.println("Daha küçük düşün!");
                if (kalanHak==0){
                    System.out.println("Hakkın kalmadı");
                }
                else {
                    System.out.println(kalanHak+" Hakkın kaldı");
                }


                }
            else {
                System.out.println("BİLDİN!!!");
                break;

            }
            kalanHak--;
            kullanilanHak++;
        }
        System.out.println("Aranan sayı: "+randomSayi+" idi");

    }
}
