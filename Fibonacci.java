import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(" Serinin kaç elemanını görmek istiyorsunuz? ");
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int sum =0;
        int s1=0;
        int s2=1;
        for(int i=0;i<n;i++){
            System.out.println(s1+" ");
            sum=s1+s2;
            s1=s2;
            s2=sum;

        }

    }
}
