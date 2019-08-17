package CodingTest_KAKAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by changwooj111@gmail.com on 13/07/2019
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Sorting {
    public static void main(String[] args){

        String[] s = {"4","4","4","4"};
        String[] s1 = {"2","1","2","6","2","4","3","3"};
        String[] s2 = {"4","4","4","5"};
        Sorting sort = new Sorting();
//        String[] s2 = {"0.0","1.0","2.0","6.0","2.0","4.0","3.0","3.0"};

        sort.solution(s2);
//        sort.solution(s);
//        sort.solution(s1);
//        sort.solution(s2);
    }

    public Float[] solution(String[] input){

        List<String> al = Arrays.asList(input);

        Collections.sort(al);

        ArrayList<String> result = new ArrayList<>();
        int total = 0;
        int stages = input.length;

        for(int i = 0 ; i < input.length; i=total){
            int count = 1 ;
            for(int j = i; j <input.length-1; j ++) {
                if(al.get(i) == al.get(j+1))
                    count++;
                else{
                    break;
                }
            }
            if(stages == 1 && count == 1){
                result.add("0");
            }else {
                if (count / stages == 1 && stages == input.length) {
                    result.add(""+input.length);
                } else {
                    result.add(""+(float) count / (float) stages);
                }
            }
            stages = stages - count;
            total = total + count ;
        }

        int countingZero = 0 ;
        for(int i = 0 ; i< result.size(); i++){
            if(result.get(i) == "0"){
                result.remove(i);
                countingZero++;
            }
        }
        ArrayList<String> result2 = new ArrayList<>(result);
        Collections.reverse(result);
        for( int i = 0 ; i < countingZero; i++){
            result2.add("0");
            result.add("0");
        }

        int[] index = new int[result.size()];
        System.out.println("result"+ result);
        System.out.println("result2" + result2);
        for(int i = 0 ; i< result.size(); i++){
            index[i] = result2.indexOf(result.get(i))+1;
            result2.set(result2.indexOf(result.get(i)),"-1");
        }
        System.out.println(Arrays.toString(index));

        return result2.toArray(new Float[0]);
    }
}
