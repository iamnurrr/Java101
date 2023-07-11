import java.util.Scanner;

public class PalindromikKelime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kelime giriniz: ");
        String kelime=input.nextLine();
        if((isPalindrome(kelime))){
            System.out.println("'" +kelime+"'" +" Palindromik Kelimedir ");
        }
else
            System.out.println("'" +kelime+"'" + " Palindromik kelime değildir! ");

    }
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
           if( str.charAt(i)!=str.charAt(j)){
               return false;
           }
           i++;
           j--;
        }

        return true;
    }

}
