public class IkiBoyutluDizi {
    public static void main(String[] args) {
        //4 öğrencinin 3 adet notu var . Her bir öğrencinin not ortalamasını hesaplayıp bunları geri döndüren bir
        //metot olsun .Hesaplanan ortalamalar bir tek boyutlu dizide tutulsun ve ekrana yazdırılsın.
        int [][]notlar={{55,85,90},{75,95,100},{90,80,70},{45,30,55}};
        float[] ort=ortHesapla(notlar);
        for (int i=0;i< ort.length;i++){

            System.out.println((i+1)+". öğrencinin ortalaması "+ort[i]);
        }
    }
    public static float[]ortHesapla(int not[][]){
        float ortTut[]=new float[not.length];
        int i,j,top=0;
        for (i=0;i<not.length;i++){
            for(j=0;j<not[i].length;j++){
                top+=not[i][j];
            }
            ortTut[i]=top/j;
            top=0;
        }
        return ortTut;
    }
}
