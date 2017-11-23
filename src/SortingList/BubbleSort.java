package SortingList;

public class BubbleSort {
    public static void main(String[] args) {
        int[] item = {1, 2, 5, 0, 3, 6, 7};
        int i, j, temp = 0;

        System.out.println("Length : "+item.length);

        for (i = 0; i < item.length - 1; i++) {
            for (j = 0; j < item.length - 1 - i ; j++) {
                if (item[j] > item[j + 1]) {
                    temp = item[j];
                    item[j] = item[j + 1];
                    item[j + 1] = temp;
                }
            }
        }
        for( i = 0 ; i < item.length; i++){
            System.out.println(item[i]);
        }

//        for(int i = 0 ; i < item.length -1; i ++){
//            for(int j = 0 ; j <item.length - i - 1; j++){
//                if(item[j] > item[j+1]){
//                    temp = item[j];
//                    item[j] = item[j+1];
//                    item[j+1] = temp;
//                }
//            }
//        }

    }
}
