public class DizideTekrarEdenEleman {
    public static void main(String[] args)

    {
        //Şimdi sıra sende! Bir sayı dizisindeki tekrar eden çift sayıları belirten
        // bir program yazarak GitHub reposunu bizimle paylaşmalısın.

        int list[]={11,14,7,9,55,72,38,42,39,82,64,14,38,11,3,42,48,55};
        int control[]=new int[list.length];
        int i,j;
        int startIndex=0;
        for(i=0;i< list.length;i++){
            for(j=0;j< list.length;j++){
                if(((i!=j) &&  list[i]==list[j]) && list[i]%2==0 && list[j]%2==0){
                    if(!isFind(control,list[i])){
                        control[startIndex++]=list[i];

                    }
                    break;
                }
            }
        }
        System.out.println("Tekrar eden Çift Sayılar: ");
        for(i=0;i< control.length;i++){
            if(control[i]!=0){
                System.out.println(control[i]);

            }
        }
    }

    static boolean isFind(int []list,int value){
        int i;
        for(i=0;i<list.length;i++){
            if(list[i]==value){
                return true;
            }
        }
        return false;
    }
}
