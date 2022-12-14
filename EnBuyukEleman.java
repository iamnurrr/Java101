import java.util.*;

public class EnBuyukEleman {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int i,j;
        int eb=0;
        System.out.println("Kaç elemanlı bir dizi olacak?");
        int n=scn.nextInt();
        int []dizi=new int[n];
        for(i=0;i<n;i++){
            System.out.println("Dizinin "+(i+1)+"."+"sayısını giriniz");
            dizi[i]=scn.nextInt();
        }
        for(i=0;i<n;i++){
            if(dizi[i]>eb){
                eb=dizi[i];
            }
        }
        System.out.println("Dizinin En Büyük elemanı :"+eb);
    }

    }
