import java.util.Scanner;
public class Matrisler1{
    public static void main(String[] args) {
       // Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
        Scanner scn=new Scanner(System.in);
        int [][] matris= new int[3][2];
        int i,j;
        for(i=0;i< matris.length;i++){
            for(j=0;j< matris[0].length;j++){
                System.out.println("["+i+"]"+"["+j+"] giriniz:");
                matris[i][j]=scn.nextInt();
            }
        }
        for(i=0;i< matris.length;i++) {
            for (j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }







    }

}