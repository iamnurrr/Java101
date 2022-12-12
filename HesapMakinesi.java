import java.util.Scanner;
public class HesapMakinesi {

    public static void main(String[] args) {
        int  n1,n2,select;
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2=input.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz: ");
        select=input.nextInt();
        if(select==1){
            System.out.println("Toplama n1+n2 = "+(n1+n2));}
            else if(select==2){
                System.out.println("Çıkarma n1-n2 = "+(n1-n2));
            }
                 else if(select==3){
                     System.out.println("Çarpma n1*n2 = "+(n1*n2));
        }         else if (select==4)
                      if(n2!=0){
                          System.out.println("Bölme n1/n2 = "+(n1/n2));}
                      else {
                          System.out.println("Bir sayı sıfıra bölünemez!");}
                      else {
                          System.out.println("Hatalı Giriş yaptınız!");}

        }

    }




