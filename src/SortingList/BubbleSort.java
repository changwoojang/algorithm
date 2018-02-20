package SortingList;

/**
 * Created by changwooj111@gmail.com on 2017. 12. 5.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] item = {1, 2, 5, 0, 3, 6, 7};
        int i, j, temp = 0;

        System.out.println("Length : "+item.length);

        //처음부터 끝까지
        for (i = 0; i < item.length - 1; i++) {
            // 처음부터 끝 - 1 - i 까지
            for (j = 0; j < item.length - 1 - i ; j++) {
                //이전 숫자 보다 다음 숫자보다 클 경우 교환
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
    }
}
