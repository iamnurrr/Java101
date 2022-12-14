import java.util.*;
public class DiziMethod {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int [] dizi={12,15,17,22};
        int index;
        System.out.println("Dizinin Hangi İndex Elemanı Değişsin?");
        index=inp.nextInt();
        dizi[index]=degis(dizi[index]);

        for(int i=0;i< dizi.length;i++){
            System.out.println(dizi[i]);
        }
    }

    public static int degis (int a){
        return a*2;

    }

}

