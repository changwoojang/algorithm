package CodingTest_2019_07_13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Problem3 {

    private List<Integer> getDistinctNumbers(int[] A, Predicate<Integer> tester) {
        return Arrays.stream(A).boxed().distinct().filter(tester)
            .collect(Collectors.toList());
    }

    public int solution(int[] A) {
        List<Integer> positiveNumbers = getDistinctNumbers(A, num -> num > 0);
        List<Integer> negativeNumbers = getDistinctNumbers(A, num -> num < 0);

        Collections.sort(positiveNumbers);
        Collections.reverse(positiveNumbers);

        for(Integer num : positiveNumbers){
            if(negativeNumbers.contains(-num))
                return num;
        }

        return 0;
    }

    public static void main(String[] args) {

    }
}
