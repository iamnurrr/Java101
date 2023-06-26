public class AsalSayi {
    public static void main(String[] args) {
        //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
        int i, j, k;

        for(i=2;i<=100;i++){
            int a = 0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    a++;
                }

            }
            if(a<=2){
                System.out.println(i);
            }
        }
    }
}
