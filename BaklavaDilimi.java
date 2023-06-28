import java.util.Scanner;

public class BaklavaDilimi {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Baklava Diliminin Boyutunu Giriniz: ");
        int n = scn.nextInt();
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (k = 0; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=0;i<=n;i++){
            for(k=0;k<=i-1;k++){
                System.out.print(" ");
            }
            for(j=i*2;j<=(n*2);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}