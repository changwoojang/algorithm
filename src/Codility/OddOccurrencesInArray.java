package Codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 9.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Set<Integer> hs = new HashSet<>();

        for(int each : A){
            if(hs.contains(each)){
                hs.remove(each);
            }else{
                hs.add(each);
            }
        }
        return hs.iterator().next();

    }
}
