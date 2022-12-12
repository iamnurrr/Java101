import java.util.Scanner;

public class SignUp3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int password=44;
        int userno =55;
        System.out.println("u:"+userno);
        System.out.println("p:"+password);
        System.out.println("Please enter your userno :");
        userno=scn.nextInt();
        System.out.println("Please enter your password :");
        password= scn.nextInt();

        if(userno==userno && password==password){
            System.out.println("Login.. ");}
        else {
            System.out.println("Wrong userno or password!! ");
        }
        System.out.println("userno:"+userno);
        System.out.println("password"+password);
        }


    }




