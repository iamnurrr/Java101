import java.util.Scanner;
public class Zodiag {
    public static void main(String[] args) {
        /* Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart*/
        int day, month;
        String burc = "";
        boolean error = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı sayı olarak giriniz: ");
        month = input.nextInt();

        System.out.println("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "oğlak";
                    } else {
                        burc = "kova";
                    }
                } else error = true;

                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "kova";
                    } else burc = "balık";
                } else {
                    error = true;

                }
                break;

            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "balık";
                    } else burc = "koç";
                } else {
                    error = true;

                }
                break;
            case 4:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "koç";
                    } else {
                        burc = "boğa";

                    }
                } else
                    error = true;
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "boğa";
                    } else burc = "ikizler";
                } else
                    error = true;
                break;
            case 6:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "ikizler";
                    } else burc = "yengeç";
                } else
                    error = true;
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "yengeç";
                    } else burc = "aslan";
                } else error = true;
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "aslan";
                    } else burc = "başak";
                } else error = true;
                break;
            case 9:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "başak";
                    } else burc = "terazi";
                } else error = true;
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "terazi";
                    } else burc = "akrep";
                } else error = true;
                break;
            case 11:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "akrep";
                    } else burc = "yay";
                } else error = true;
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "yay";
                    } else burc = "oğlak";
                } else error = true;
                break;
            default:
                error = true;
        }

                if (error) {
                    System.out.println("Hatalı giriş yaptınız!");
                } else {
                    System.out.println("Burcunuz: " + burc);
                }



    }
}