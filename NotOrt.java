
import java.util.Scanner;
public class NotOrt {
    public static void main(String[] args) {
    int numberOfLesson=0;
        int avange=0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your math grade: ");
        int math = scn.nextInt();

        System.out.println("Enter your Turkish grade: ");
        int Turkish = scn.nextInt();

        System.out.println("Enter your physic grade: ");
        int phy = scn.nextInt();

        System.out.println("Enter your biology grade: ");
        int bio = scn.nextInt();

        System.out.println("Enter your chemistry grade: ");
        int che = scn.nextInt();

        if (math!=0&&math!=100) {
            avange+=math;
            numberOfLesson++;}
            if (phy!=0&&phy!=100) {
               avange+=phy;
                numberOfLesson++;}
                if (Turkish!=0&&Turkish!=100) {
                   avange+=Turkish;
                numberOfLesson++;}
                if ((bio!=0&&bio!=100)){
                    avange+=bio;
                    numberOfLesson++;}
                if(che!=0&&che!=100) {
                    avange += che;
                    numberOfLesson++;
                    System.out.println("Derslerin Ortalaması: " + (avange / numberOfLesson));}
                else {
                    System.out.println("Ortalamanız Hesaplanamaz!!");



               }


               }


                }






