import java.util.*;
public class MukemmelSayi {

    public static void main(String[] args) {
        //Matematikte bazı pozitif tam sayıların pozitif bölenleri toplamı,
        // sayının kendisinin iki katına eşittir. Bu tür sayılara “mükemmel sayı” denir.
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int total=0;
        int sayi=input.nextInt();
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                total+=i;
            }
        }
        if(total==sayi){
            System.out.println(sayi+" Mükemmel Sayıdır!");
        }
        else {
            System.out.println(sayi+" Mükemmel Sayı Değildir!");
        }
    }

}
