package HackerRank;

import java.util.Scanner;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 16.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int swap =0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j =1 ; a_j < n-a_i; a_j++){
                int temp;
                if(a[a_j-1]>a[a_j]){
                    swap++;
                    temp = a[a_j-1];
                    a[a_j-1] = a[a_j];
                    a[a_j] = temp;
                }
            }
        }
        System.out.println("Array is sorted in "+ swap+ " swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: "+ a[a.length-1]);
    }
}
