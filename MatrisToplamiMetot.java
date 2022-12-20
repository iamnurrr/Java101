public class MatrisToplamiMetot {
    public static void main(String[] args) {
        int matris1[][] = {{40, 50, 30}, {80, 70, 90}};
        int matris2[][] = {{35, 75, 25}, {65, 45, 95}};
        int toplam[][];
        int i, j;
        toplam = matrisTopla(matris1, matris2);
        for (i = 0; i < matris1.length; i++) {
            for (j = 0; j < matris1[i].length; j++) {
                System.out.print(toplam[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] matrisTopla(int m[][], int m1[][]) {
        int i, j;
        int sonuc[][] = new int[m.length][m[0].length];
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                sonuc[i][j] = m[i][j] + m1[i][j];
            }
        }
        return sonuc;
    }
}
