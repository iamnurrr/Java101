// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class UcgendeAlan {
    public static void main(String[] args) {
       Scanner scn= new Scanner(System.in);
        int e1,e2,e3;
        int halfcevre;

        System.out.println("enter the first edge: ");
        e1= scn.nextInt();
        System.out.println("enter the second edge: ");
        e2= scn.nextInt();
        System.out.println("enter the third  edge: ");
        e3= scn.nextInt();

        halfcevre=(e1+e2+e3)/2;
        int x =halfcevre*(halfcevre-e1)*(halfcevre-e2)*(halfcevre-e3);
        double area= Math.sqrt(x);
        System.out.println("area: "+area);
    }
}