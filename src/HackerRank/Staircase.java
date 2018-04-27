package HackerRank;

import java.util.Scanner;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 25.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            int result = calcWays(n);
            System.out.println(result);
        }

    }
    public static int calcWays(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        int[] ways = new int[] {1,2,4};

        for (int i = 4; i < n; i++) {
            int idx = (i - 1) % 3;
            ways[idx] = ways[0] + ways[1] + ways[2];
        }
        return ways[0] + ways[1] + ways[2];
    }
}
