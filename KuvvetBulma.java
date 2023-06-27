import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Scanner scn = new Scanner(System.in);
        System.out.println("25'den büyük bir sayı giriniz");
        int n= scn.nextInt();

        System.out.println("4'ün kuvvetleri: ");
        for(int i=1;i<n;i*=4){
            System.out.println(i);
        }
        System.out.println("5'in Kuvvetleri: ");
        for(int i=1;i<n;i*=5){
            System.out.println(i);
        }
    }
}
