import java.util.Scanner;
public class Array1 {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int arr[]=new int[4];
    int ct=0,tt=0;
    int i;
        System.out.println("4 Adet sayı giriniz");
        for (i=0;i<4;i++){
            arr[i]= scn.nextInt();
        }
        System.out.println("Çift sayılar \n");
        for (i=0;i<4;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            ct+=arr[i];}

            }
        System.out.println("Tek Sayılar:\n");
        for(i=0;i<4;i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
                tt+=arr[i];
            }
        }
        System.out.println("Çiftlerin Toplamı="+ct);
        System.out.println("Teklerin Toplamı="+tt);


        }

    }

