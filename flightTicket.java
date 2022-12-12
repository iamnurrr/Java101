import java.util.Scanner;
public class flightTicket {
    public static void main(String[] args) {
        double mesafe,yas ;
        int tip;
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç km yol gideceksiniz? ");
        mesafe=input.nextInt();
        System.out.println("Kaç yaşındasınız? ");
        yas=input.nextInt();
        System.out.println("Yolculuk tipini giriniz: 1-Tek yön 2-Gidiş- dönüş ");
        tip=input.nextInt();

        double normalTutar=( mesafe*0.10);
        double tip2oran=0.20;
       // double yasİndirimi=(normalTutar*yasİndirimOrani);
     //   double indirimliTutar=(normalTutar-yasİndirimi);
       // double GidisDonusİndirimTutarı=(indirimliTutar*GidisDonusİndirimOranı);
        //double Toplam=(indirimliTutar-GidisDonusİndirimTutarı)*2;

        switch (tip){
            case 1:
                if(yas<12){
                    double yasIndirimOrani=0.50;
                   double  yasIndirimi=(normalTutar*yasIndirimOrani);
                  double  ToplamTutar=(normalTutar-yasIndirimi);

                    System.out.println("normal tutar="+normalTutar);
                    System.out.println("Yaş indirimi = "+yasIndirimi);
                    System.out.println("Toplam Tutar= "+ToplamTutar);

                }  if (11<yas&&yas<25) {
                 double   yasIndirimOrani = 0.10;
               double yasIndirimi=(normalTutar*yasIndirimOrani);
              double  ToplamTutar=(normalTutar-yasIndirimi);
                    System.out.println("normal tutar="+normalTutar);

                    System.out.println("Yaş indirimi = " + yasIndirimi);
                    System.out.println("Toplam Tutar= " + ToplamTutar);

                }
                  if(65<yas){
                      double    yasIndirimOrani=0.30;
                      double  yasIndirimi=(normalTutar*yasIndirimOrani);
                      double   ToplamTutar=(normalTutar-yasIndirimi);
                      System.out.println("normal tutar="+normalTutar);
                      System.out.println("Yaş indirimi = " + yasIndirimi);
                      System.out.println("Toplam Tutar= " + ToplamTutar);

                  }
                  break;
            case 2:
                if(yas<12){
                  double  yasIndirimOrani=0.50;
                  double  yasIndirimi=(normalTutar*yasIndirimOrani);
                  double  ToplamTutar=(normalTutar-yasIndirimi);
                  double indimrimlitutar=(ToplamTutar-(ToplamTutar*tip2oran));
                  double   total=(indimrimlitutar*2);

                    System.out.println("normal tutar="+normalTutar);
                    System.out.println("Yaş indirimi = "+yasIndirimi);
                    System.out.println("total:"+total);
                }
                if (11<yas&& yas<25){
                  double  yasIndirimOrani=0.10;
                  double  yasIndirimi=(normalTutar*yasIndirimOrani);
                 double   ToplamTutar=(normalTutar-yasIndirimi);
                 double   indimrimlitutar=(ToplamTutar-(ToplamTutar*tip2oran));
                 double   total=(indimrimlitutar*2);

                    System.out.println("normal tutar="+normalTutar);
                    System.out.println("Yaş indirimi = "+yasIndirimi);
                    System.out.println("total:"+total);

                }if(yas>65){
                double  yasIndirimOrani=0.30;
                double   yasIndirimi=(normalTutar*yasIndirimOrani);
                double   ToplamTutar=(normalTutar-yasIndirimi);
                double  indimrimlitutar=(ToplamTutar-(ToplamTutar*tip2oran));
                double total=(indimrimlitutar*2);

                System.out.println("normal tutar="+normalTutar);
                System.out.println("Yaş İndirimi="+ yasIndirimi);
                System.out.println("total="+total);
        break;
            }
        }
        }


            }


