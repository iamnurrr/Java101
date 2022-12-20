import java.util.*;
public class MatrisTranspozu {
    public static void main(String[] args) {
        //Elemanları rastgele belirlenen matrisin transpozunu bulan programı kodlayınız.
        
        Scanner input = new Scanner(System.in);
        int[][] matris = new int[2][3];
        int i, j;
        for (i = 0; i < matris.length; i++) {
            for (j = 0; j < matris[0].length; j++) {
                System.out.println((i + 1) + ". Satır " + (j + 1) + ". Sutunu Giriniz: ");
                matris[i][j] = input.nextInt();
            }
        }
        System.out.println("Oluşan Matrisiniz: ");
        for (i = 0; i < matris.length; i++) {
            for (j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Oluşan Matrisin Traspozu:");
        for (i = 0; i <matris[0].length ; i++) {
            for (j = 0; j <matris.length ; j++) {
                System.out.print(matris[j][i] + " ");
            }
            System.out.println();


        }

    }
}