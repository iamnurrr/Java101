public class MatrisToplami {
    public static void main(String[] args) {

        int matris1[][] = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
        int matris2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int toplam[][] = new int[3][3];
        int i, j;
        for (i = 0; i < matris1.length; i++) {
            for (j = 0; j < matris1[i].length; j++) {
                toplam[i][j] = matris1[i][j] + matris2[i][j];
            }

        }
        for (i = 0; i < matris1.length; i++) {
            for (j = 0; j < matris1[i].length; j++) {
                System.out.print(toplam[i][j]+" ");
            }
            System.out.println();

        }
    }
}
