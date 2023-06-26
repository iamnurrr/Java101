import java.util.*;
public class bolunebilme {
    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n=scanner.nextInt();
        int i,s=0;
        int t=0;
        for(i=n;i>0;i--){
            if(i%3==0 && i%4==0){
                System.out.println(i+ " ");
                t+=i;
                s++;
            }
        }
        int ort=(t/s);
        System.out.println("Ortalama: "+ort);
    }
}
