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
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int swap =0;
        for(int i=0; i < n; i++){
            for(int j =1 ; j < n-i; j++){
                int temp;
                if(a[j-1]>a[j]){
                    swap++;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array is sorted in "+ swap+ " swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: "+ a[a.length-1]);
    }
}
