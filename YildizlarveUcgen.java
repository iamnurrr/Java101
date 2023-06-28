import java.util.Scanner;

public class YildizlarveUcgen {

    //Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.
    /*
      *
     ***
    *****
   *******
  *********

     */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Basamak sayısı giriniz : ");
        int n = scn.nextInt();
        int i, k, j;
        for (i = 1; i <=n; i++) {

            for (k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (2*i)-1; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
    }





