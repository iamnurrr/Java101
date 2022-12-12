import java.util.Scanner;
public class HesapMakinesi2 {
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int n1=input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int n2=input.nextInt();
        System.out.println("İşlem Seçiniz: \n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme ");
        int select= input.nextInt();
         switch (select){
             case 1:
                 System.out.println("Toplama n1+n2 = "+(n1+n2));
                 break;
             case 2:
                 System.out.println("Çıkarma n1-n2 ="+(n1-n2));
                  break;
             case 3:
                 System.out.println("Çarpma n1*n2 ="+(n1*n2));
                 break;
             case 4:
                 if (n2!=0)
                 System.out.println("bölme n1/n2 = "+(n1/n2));

                 else
                     System.out.println("Bir sayı sıfıra bölünemez!!!");
                 break;
             default:
                 System.out.println("Hatalı işlem sayısı girdiniz!!");

         }

        }
}
