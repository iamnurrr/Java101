import java.util.Scanner;

public class DizideSiralama {
    public static void main(String[] args) {
        //dizideki elemanları küçükten büyüğe sıralayan program.
        
        int temp;
          Scanner  scn=new Scanner(System.in);
        System.out.println("Dizi kaç elemanlı olacak giriniz : ");
        int n= scn.nextInt();
        int []dizi=new int[n];

        int i ,j;
        for (i=0;i< dizi.length;i++){
            System.out.println("Dizinin "+(i+1)+". elemanını giriniz: ");
            dizi[i]=scn.nextInt();
        }
        for (i=0;i< dizi.length-1;i++){
            for (j=i+1;j< dizi.length;j++){
                if(dizi[i]>dizi[j]){
                    temp=dizi[j];
                    dizi[j]=dizi[i];
                    dizi[i]=temp;
            }
            }
        }
        System.out.println("Küçükten büyüğe sıralanmış dizi: ");
        for (i=0;i< dizi.length;i++){
            System.out.println(dizi[i]);
        }
    }
}
