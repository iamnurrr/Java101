import java.util.Scanner;
public class ArtikYil {
    public static void main(String[]Args){

        Scanner input=new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        int year= input.nextInt();
        if (year%4==0) {
            System.out.println(year + "Artık yıl!");
        }
        else if (year%100==0&&year%400==0)
                System.out.println(year +" Artık yıl!");
        else{
            System.out.println(year+"Artık yıl değil!");

        }
    }


}
