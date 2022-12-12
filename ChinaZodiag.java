import java.util.Scanner;
public class ChinaZodiag {
    public static void main(String[] args) {
      /*  Doğum Tarihi %12 = 0 ➜ Maymun

        Doğum Tarihi %12 = 1 ➜ Horoz

        Doğum Tarihi %12 = 2 ➜ Köpek

        Doğum Tarihi %12 = 3 ➜ Domuz

        Doğum Tarihi %12 = 4 ➜ Fare

        Doğum Tarihi %12 = 5 ➜ Öküz

        Doğum Tarihi %12 = 6 ➜ Kaplan

        Doğum Tarihi %12 = 7 ➜ Tavşan

        Doğum Tarihi %12 = 8 ➜ Ejderha

        Doğum Tarihi %12 = 9 ➜ Yılan

        Doğum Tarihi %12 = 10 ➜ At

        Doğum Tarihi %12 = 11 ➜ Koyun /*
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Doğum tarihini giriniz:");
        int year=input.nextInt();

        if(year%12==0){
            System.out.println("Çin zodyağı burcunuz: Maymun");

        }
        if (year%12==1){
            System.out.println("Çin zodyağı burcunuz: Horoz");
        }
        if (year%12==2) {
            System.out.println("Çin zodyağı burcunuz:Köpek ");
        }
        if (year%12==3) {
            System.out.println("Çin zodyağı burcunuz: Domuz");
        }
        if (year%12==4) {
            System.out.println("Çin zodyağı burcunuz: Fare");
        }
        if (year%12==5) {
            System.out.println("Çin zodyağı burcunuz: Öküz");
        }
        if (year%12==6) {
            System.out.println("Çin zodyağı burcunuz: Kaplan");
        }
        if (year%12==7) {
            System.out.println("Çin zodyağı burcunuz: Tavşan");
        }
        if (year%12==8) {
            System.out.println("Çin zodyağı burcunuz: Ejderha");
        }
        if (year%12==9) {
            System.out.println("Çin zodyağı burcunuz: Yılan");
        }
        if (year%12==10) {
            System.out.println("Çin zodyağı burcunuz: At");
        }
        if (year%12==11) {
            System.out.println("Çin zodyağı burcunuz: Koyun");
        }




    }
}
