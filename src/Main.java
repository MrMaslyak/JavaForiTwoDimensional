import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        left();
        System.out.println();
        right();
        System.out.println();
        up();
        down();
        System.out.println();
bubble();
        System.out.println();
select();
        System.out.println();
        InsertSort();
    }
    public static void left(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0 || i + j == 9 && j<5 || i == j && j<5){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void right(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 9 || i + j == 9 && j>4 || i == j && j>4 ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void up(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == j && i<5 || j + i == 9 && i<5 ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void down(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 9 || i == j && i>4 || j + i == 9 && i>4 ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void bubble (){
        int[] bubbleArr= {3,1,5,6,4,2,8,10,9,7};
        System.out.println(Arrays.toString(bubbleArr));
        for (int i = 0; i < bubbleArr.length; i++) {
            for (int j = 0; j < bubbleArr.length-1; j++) {
                if (bubbleArr[j]>bubbleArr[j+1]){
                    int tmp = bubbleArr[j];
                    bubbleArr[j]=bubbleArr[j+1];
                    bubbleArr[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(bubbleArr));
    }
    public static void select (){
        int[] selectArr= {3,1,5,6,4,2,8,10,9,7};
        System.out.println(Arrays.toString(selectArr));
        for (int i = 0; i < selectArr.length; i++) {
            for (int j = i+1; j < selectArr.length; j++) {
                if(selectArr[i] > selectArr[j]) {
                    int tmp = selectArr[j];
                    selectArr[j] = selectArr[i];
                    selectArr[i] = tmp;
                }
                }
        }
        System.out.println(Arrays.toString(selectArr));
    }

    public static void InsertSort (){
        int[] insertSortArr= {3,1,5,6,4,2,8,10,9,7};
        System.out.println(Arrays.toString(insertSortArr));
        for (int i = 0; i < insertSortArr.length; i++) {
            int tmp = insertSortArr[i];
            int j = i-1 ;
            while (j>=0 && insertSortArr[j]>tmp) {
            insertSortArr[j+1] =  insertSortArr[j];
            j -- ;
            }
            insertSortArr[j+1] = tmp;
        }

        System.out.println(Arrays.toString(insertSortArr));
    }
}
