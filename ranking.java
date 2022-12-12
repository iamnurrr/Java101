import java.util.Scanner;
public class  ranking{

    public static void main(String[] args) {
        int smallest;

        Scanner input= new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1=input.nextInt();

        System.out.println("Enter second number: ");
        int n2=input.nextInt();

        System.out.println("Enter third number: ");
        int n3=input.nextInt();

        if((n1<n2) &&( n1<n3)){
            if(n2<n3){
                System.out.println("n1<n2<n3");}
                else {
                System.out.println("n1<n3<n2");
            }


        } else if ((n2<n3)&&(n2<n1)) {
            if(n1<n3){
            System.out.println("n2<n1<n3");}
            else{
                System.out.println("n2<n3<n1");
            }


        } else if ((n3<n2)&&(n3<n1)) {
            if (n1<n2){
                System.out.println("n3<n1<n2");}
                else{
                System.out.println("n3<n2<n3");
            }

        }


    }

}
