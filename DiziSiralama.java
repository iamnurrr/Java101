import java.util.*;
public class DiziSiralama {
    public static void main(String[] args) {
        // Bilgisayar 1 ile 100 arasında rastgele 10 sayı üretiyor. Üretilen sayıları bir dizi içerisine kayıt edin.
        // Sonrasında diziye kayıt edilen sayıları herhangi bir sıralama algoritması ile sıralayın ve
        // sonrasında ekrana çıktı verin.
        int []dizi =new int[10];
        int i,g,j;
        for(i=0;i<10;i++){
            Random rastgele=new Random();
            int sayi = rastgele.nextInt(101);
            dizi[i]=sayi;
            }
        System.out.println("Dizinin küçükten büyüğe dizilmiş hali:");
        for (i=0;i<10;i++){ //dizi={5,4,7,8,9,1};
            for (j=i+1;j<10;j++){
                if(dizi[j]<dizi[i]){
                    g=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=g;
                }
            }
        }
        for (i=0;i<10;i++){
            System.out.print(dizi[i]+" ");
        }





        }
}
