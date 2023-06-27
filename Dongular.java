import java.util.*;
public class Dongular {
    public static void main(String[] args) {
       // java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift
        // ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
    Scanner scn=new Scanner(System.in);
    int n,t=0;
        do{
            System.out.println("Bir Sayı Giriniz: ");
             n= scn.nextInt();
            if(n%4==0){

                t+=n;}
        }
        while (n%2==0);
        
        System.out.println("Toplam: "+t);
    }
}
