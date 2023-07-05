import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSorting {
    public static void main(String[] args) {

    //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
        Scanner scn=new Scanner(System.in);
    int[]dizi={-800,54,11,90,26,188,41,74,800,8,35,42,150,225,330,600,-550};
    Arrays.sort(dizi);

    int i,j;
    int little=0;
    int big=0;
        System.out.println("Bir sayı giriniz");
        int n=scn.nextInt();

    for(i=0;i< dizi.length;i++){
        if(dizi[i]<n){
            little=dizi[i];
        }
    }
        System.out.println("En yakın küçük sayı : "+little);
int a= dizi.length-1;
        for(i= a ;i>=0;i--) {
            if(n<dizi[i]){
                big=dizi[i];
            }
        }
        System.out.println("En yakın büyük sayı : "+big);




        }


}

