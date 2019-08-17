package CodingTest_2019_07_13;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by changwooj111@gmail.com on 13/07/2019
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Number3 {

    public static void main(String[] args){

        int[] input1 = {3,2,-2,5,-3};
        int[] input2 = {1,1,2,-1,2,-1};
        int[] input3 = {1,2,3,-4};

        Number3 num = new Number3();
        System.out.println(num.solution(input1));
        System.out.println(num.solution(input2));
        System.out.println(num.solution(input3));

    }
    public int getResult(List<Integer> positiveNumber, List<Integer> negativeNumber){
        positiveNumber.retainAll(negativeNumber);
        if(positiveNumber.isEmpty()){
            return 0;
        }
        return Collections.max(positiveNumber);
    }

    public int solution(int[] input){

        List<Integer> positiveNumber = Arrays.stream(input).boxed().filter(i -> i > 0).collect(Collectors.toList());
        List<Integer> negativeNumber = Arrays.stream(input).boxed().filter(i -> i < 0).map(Math::abs).collect(Collectors.toList());

        return getResult(positiveNumber, negativeNumber);
    }
}
