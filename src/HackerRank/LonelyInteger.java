package HackerRank;

import java.util.*;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 26.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class LonelyInteger {
    public static int lonelyInteger(int[] a) {

        Set<Integer> results = new HashSet<>();
        int result = 0 ;

        for(int each : a){
            if(results.contains(each)){
                results.remove(each);
            }else{
                results.add(each);
            }
        }

        for(int each :  results.toArray(new Integer[1])){
            result = each;
        }

        return result;
    }
//    public static int lonelyInteger(int[] a) {
//        int value = 0;
//
//        for (int i : a) {
//            value ^= i;
//        }
//        return value;
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
