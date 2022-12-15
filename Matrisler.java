public class Matrisler {
    public static void main(String[] args) {


        int n = 1;
        int matris[][] = new int[3][4];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {

                matris[i][j] = n;
                n++;

            }
        }
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j]+" ");

            }
            System.out.print("\n");
        }
    }
}
/*  int[][] matris = {{1, 3, 5}, {7, 9, 11}};
        int[][] matris2 = new int[3][3];
        matris2[0][0] = 5;
        matris2[1][1] = 6;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.print("\n");
        }
        */