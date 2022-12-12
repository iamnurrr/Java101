import java.util.Scanner;
public class Manav {

    public static void main(String[] args) {

        //Armut kg : 20,14 TL
        //Elma kg : 13,67 TL
        //Domates kg : 10,11 TL
        Scanner scn= new Scanner(System.in);
        double a=20.14 ,e=13.67,d=10.67;

        System.out.println("Manavdan aldığınız armut kaç kg?");
        double armut=scn.nextDouble();
        System.out.println("Armut fiyatı: "+armut*a);

        System.out.println("Manavdan aldığınız elma kaç kg?");
        double elma=scn.nextDouble();
        System.out.println("Elma fiyatı: "+elma*e);

        System.out.println("Manavdan aldığınız domates kaç kg?");
        double domates=scn.nextDouble();
        System.out.println("Domates fiyatı : "+domates*d);
        double toplam=(armut*a)+(elma*e)+(domates*d);

        System.out.println("Manava ödenecek toplam fiyat: "+toplam);



    }
}