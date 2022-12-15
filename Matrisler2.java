import java.util.*;
public class Matrisler2 {
    public static void main(String[] args) {

      //  İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.
        Random r=new Random();
        int [][]matris=new int[4][3];
        int i,j;
        for(i=0;i< matris.length;i++){
            for(j=0;j<matris[0].length;j++){
                matris[i][j]=r.nextInt(100);
            }
        }
        for(i=0;i< matris.length;i++) {
            for (j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
