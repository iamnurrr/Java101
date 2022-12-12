import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        //Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        // eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini
        // kontrol edip
        // , şifreler aynı ise ekrana "Şifre oluşturulamadı,
        // lütfen başka şifre giriniz.
        // " sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

        Scanner input= new Scanner(System.in);
        String username,password;

        System.out.println("Enter your username:");

        username=input.nextLine();
        System.out.println("Enter your password:");
        password=input.nextLine();

        if (username.equals("iamnur")&& password.equals("12345")){
            System.out.println("Login..");}
         if(!(username.equals("iamnur"))&&(password.equals("12345"))){
        System.out.println("Wrong username!!");}
        if (!(username.equals("iamnur"))&&!(password.equals("12345"))){
            System.out.println("Wrong username and wrong password!!!");
        }
            if ((username.equals("iamnur" )&& !(password.equals("12345")))) {
            System.out.println("Wrong password");
            System.out.println("Would you like to reset your password?\n 1-Reset password 2-Don't Reset passaword");
        int select =input.nextInt();

           switch (select){
               case 1: {
                   Scanner i=new Scanner(System.in);
                   System.out.println("Enter New Password: ");
                   String newPassword = i.nextLine();

                   if (newPassword.equals("12345")) {
                       System.out.println("The password could not be created, please enter another password. ");
                   } else {
                       System.out.println("New password created!");
                   }break;
               }
                       case 2:{
                           System.out.println("Giriş Yapılamadı Sisteme yeniden giriniz!");}
                       break;
                   }

               }
           }





        }





