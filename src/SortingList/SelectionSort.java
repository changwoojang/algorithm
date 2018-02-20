package SortingList;

/**
 * Created by changwooj111@gmail.com on 2017. 12. 5.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */

public class SelectionSort {
    public static void main(String[] args){
        int[] item = { 5, 4, 7, 1, 8, 3, 2, 6 };
        int i, j, min;
        int temp = 0;

        // i ~ item.length-1 까지
        for (i = 0; i < item.length-1; i++) {
            // 디폴트 값을 저장
            min = i;
            // i+1 ~ item.length 까지
            for (j = i + 1; j < item.length; j++) {
                //제일 작은 값을 찾는다
                if(item[min] > item[j]){
                    min = j;
                }
            }
            //교환
            temp = item[min];
            item[min] = item[i];
            item[i] = temp;
        }

        for (i = 0; i < item.length; i++) {
            System.out.print(item[i] + " ");
        }

    }
}
