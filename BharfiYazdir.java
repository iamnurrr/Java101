public class BharfiYazdir {
    public static void main(String[] args) {
        String list[][] = new String[7][4];
        int i, j;
        for (i = 0; i < list.length; i++) {
            for (j = 0; j < list[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    list[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    list[i][j] = " * ";


                } else
                    list[i][j] = "   ";
            }
        }
        for (i = 0; i < list.length; i++) {
            System.out.println();
            for (j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j]);
            }

        }
    }
}