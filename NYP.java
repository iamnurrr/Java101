public class NYP {
    public static void main(String[] args) {
//İstenen çıktı resim olarak eklendi
        
        int dizi[]=new int[]{0,0,0,0,0,0,1,2,4,2,1};
        for (int i=0;i<dizi.length;i++){
            if(i==10){
                System.out.println("100:");
            }
            else{
                System.out.println(i*10+"-"+((i*10)+9)+":");
            }
            for (int j=0;j<dizi[i];j++){
                System.out.println("*");
                //System.out.println("\n");
            }

        }

    }

}
