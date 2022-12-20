public class MatrisCarpimi {
    public static void main(String[] args) {
        int[][]matris1={{1,2},{3,4}};   //     1 2     10 20
        int[][]matris2={{10,20},{30,40}};//    3 4     30 40
        int i,j;
        int carpim[][];
        carpim=carp(matris1,matris2);
        for(i=0;i<2;i++){
            for (j=0;j<2;j++){
                System.out.print(carpim[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int [][]carp(int[][]m1,int[][]m2){
        int i,j,k;
        int [][] sonuc=new int[m1[0].length][m2.length];
        for(i=0;i<2;i++){
                for (k=0;k<2;k++){
                    for (j=0;j< 2;j++){
                        sonuc[i][k]+=m1[i][j]*m2[j][k];
                    }
            }
        }
return sonuc;
    }
}
