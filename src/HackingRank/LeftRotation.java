package HackingRank;

/**
 * Created by changwooj111@gmail.com on 2017. 12. 5.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */

import java.util.*;

public class LeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {

        int[] result = new int[n];

        for(int i =0; i < n; i++){
            result[(i + n - k) % n] = a [i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];

        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];

        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
