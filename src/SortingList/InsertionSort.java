package SortingList;

/**
 * Created by changwooj111@gmail.com on 2017. 12. 5.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class InsertionSort {

    public static void main(String[] args){

        int[] item = {1,5,4,2,6,76};

        for(int j = 1; j < item.length; j++) {

            int key = item[j];
            int i = j-1;

            while(i >= 0 && item[i] > key) {
                item[i+1]=item[i];
                i = i - 1;
            }
            item[i+1]=key;
        }

        for(int i = 0; i < item.length; i++) {
            System.out.print(item[i] + " ");
        }
    }
}
