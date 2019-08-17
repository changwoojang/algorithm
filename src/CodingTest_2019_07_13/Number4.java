package CodingTest_2019_07_13;

import java.util.Arrays;

/**
 * Created by changwooj111@gmail.com on 13/07/2019
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Number4 {

    int solution(int[] A, int[] B) {

//        int n = A.length;
//        int m = B.length;
//        Arrays.sort(A);
//        Arrays.sort(B);
//        int i = 0;
//        for (int k = 0; k < n; k++) {
//            if(i < m - 1 && B[i] < A[k])
//                i += 1;
//            for(int j = 0 ; j < m; j++){
//                if (A[k] == B[j])
//                    return A[k];
//            }
//        }
//        return -1;

        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            while(i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

    public static void main(String[] args) {
        Number4 sol = new Number4();
//        System.out.println(sol.solution(new int[]{1,3,2,1}, new int[]{4,2,5,3,2}));
//        System.out.println(sol.solution(new int[]{2, 1}, new int[]{3,3}));
//        System.out.println(sol.solution(new int[]{2,2,2,3}, new int[]{1,1,11,1,1,3,4}));
//        System.out.println(sol.solution(new int[]{2,3}, new int[]{1,1,1,4}));
//        System.out.println(sol.solution(new int[]{5,6,7,5,3,2,6,1,2,3}, new int[]{3,4,5,6,7,8,9,0,2}));
        System.out.println(sol.solution(new int[]{24}, new int[]{11,21,24,44}));
//        System.out.println(sol.solution(new int[]{24,33,51,99}, new int[]{24,21,31,24,44}));
    }
}