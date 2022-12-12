public class CollecMethod {

    public static void main(String[] args) {
     /*   System.out.println(Method1(5,3));//Çıktı Toplam:8 0(return)
        int x= Method1(4,8);
        System.out.println(x);// Çıktı Toplam:12 0 (return)
       Method2(8,8); // Çıktı Toplam 16
       Method1(5,5);// Toplam: 10
       */

        int a=1;
        int b=5;
        int c=9;
    Method3(c,b,a);
    Method1(7,9);
    Method2(8,9);
    }
    public static int Method1(int a, int b) {
        System.out.println("Toplam: "+(a+b));
        return 123 ;
    }
    public static void Method2(int a,int b){
        int toplam=a+b;
        System.out.println("Toplam "+toplam);

    }
    public static void Method3(int a,int b,int c){

        int toplam=a+b+c;
        System.out.println(toplam);
        System.out.println("Birinci Sayı "+a +" ikinci Sayı "+b +" Üçüncü sayı  "+c );
    }
}

