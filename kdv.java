import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
double kdv_li , kdv_siz;
Scanner scn= new Scanner(System.in);
System.out.println("kdvsiz fiyat giriniz:");
  kdv_siz =scn.nextInt();
  kdv_li=kdv_siz*0.18+kdv_siz;
  System.out.println("kdvli fiyat:"+kdv_li);
    }

}