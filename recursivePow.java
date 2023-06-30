import java.util.Scanner;
    public class recursivePow { static int pow(int a, int b) {
            if(b==0) {
                return 1;
            }
            else {
                return a * pow(a,b-1);
            }
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean devamEt=true;

            while (devamEt) {
                System.out.print("Taban Değeri:");
                int n1 = input.nextInt();
                System.out.print("Üs:");
                int n2 = input.nextInt();
                System.out.println("SONUÇ => " + pow(n1, n2));

                System.out.println("Devam etmek istiyor musunuz? (Evet/Hayır) ");
                String devam= input.next();

                if(devam.equalsIgnoreCase("H")){
                    devamEt=false;
                }
            }
        }
    }