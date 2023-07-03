public class DiziHarmonikOrtalaması {
    public static void main(String[] args) {
    //Ödev:
        //Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

        int [] dizi ={1,2,3,4,5,6,7,9};
        double sum=0;
double b;

        for (int i=0;i< dizi.length;i++){
            b=dizi[i];
            sum+=(1/b);
        }
        double a=dizi.length;
        double ort= (a/sum);

    System.out.println("Harmonik Ortalama: "+ort );

    }
}
