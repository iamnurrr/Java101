import java.util.Scanner;
public class arrays {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int dizi[]=new int[100];
        int i, n ,eb=0;
        System.out.println( "Dizi Boyutunu giriniz:");
        n=inp.nextInt();
        System.out.println("Dizi elemanlarını giriniz:");
        for(i=0;i<n;i++){
            dizi[i]=inp.nextInt();
        }
        for (i=0;i<n;i++){
            if(eb<=dizi[i]){
                eb=dizi[i];
            }
        }
        System.out.println("En büyük sayı:"+eb);
    }

    }

