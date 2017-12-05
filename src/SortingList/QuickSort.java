package SortingList;

/**
 * Created by changwooj111@gmail.com on 2017. 12. 5.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */

public class QuickSort {
    public static void main(String[] args){
        int[] item = {1,5,4,2,6,76};

        QuickSort quick = new QuickSort();
        quick.sort(item, 0, item.length - 1);
        
        for(int i=0; i<item.length; i++){
            System.out.println("data["+i+"] : "+item[i]);
        }

    }
    public void sort(int[] item, int l, int r){

        int left = l;
        int right = r;
        
        // 가운데를 pivot으로 지정
        int pivot = item[(l+r)/2];

        do{
            while(item[left] < pivot) left++; // pivot보다 왼쪽이 클때까지 이동
            while(item[right] > pivot) right--; // Pivot보다 오른쪽이 작을때 까지 이동
            if(left <= right){  // 오른쪽 index가 더 클 경우에 교환하다고 왼쪽과 오른쪽 index를 증가/감소 시킨다.
                int temp = item[left];
                item[left] = item[right];
                item[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);

        // 왼쪽 포인터 인덱스보다 오른쪽 인덱스가 작을때 재귀 호출
        if(l < right) sort(item, l, right);

        // 오른쪽 포인터 인덱스보다 왼쪽 익덱스가 클때 재귀 호출
        if(r > left) sort(item, left, r);
    }
}
