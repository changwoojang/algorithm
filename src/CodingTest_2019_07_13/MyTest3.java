package CodingTest_2019_07_13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyTest3 {

    public int getResult(List<Integer> positiveNumber, List<Integer> negativeNumber){
        positiveNumber.retainAll(negativeNumber);
        if(positiveNumber.isEmpty()){
            return 0;
        }
        return Collections.max(positiveNumber);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> positiveNumber = Arrays.stream(A).boxed().filter(i -> i > 0).collect(Collectors.toList());
        List<Integer> negativeNumber = Arrays.stream(A).boxed().filter(i -> i < 0).map(Math::abs).collect(Collectors.toList());

        return getResult(positiveNumber,negativeNumber);
    }
}
