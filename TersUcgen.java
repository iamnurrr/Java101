import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
        // yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for the digits");
        int n = scanner.nextInt();
        int i, j;

        for (i = n; i >0; i--) {
            for (j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
