package Codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 9.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class ArrayRightRotation {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


        public int[] solution(int[] A, int K) {

            // write your code in Java SE 8
            int[] emtpy = {};

            HashMap<Integer,Boolean> hashMap = new HashMap<Integer,Boolean>();

            for(int i = 0 ; i < A.length; i++){
                HashMap.put(new Integer(i),false);
            }
            Arrays.sort(A);
            S
            if(A == null){
                return Collections.emptyList();
            }

            if( K > A.length){

                K = K % A.length;

            }



            int[] result = new int[A.length];



            for( int i =0; i < K ; i++){

                result[i] = A[ A.length - K + i];

            }

            int j = 0;

            for( int i = K; i < A.length ; i++){

                result[i] = A[j];

                j++;

            }

            return result;

        }

}
