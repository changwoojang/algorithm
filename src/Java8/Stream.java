package Java8;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args){

        System.out.println(Arrays.asList(1,2,3).stream()
                .min(Integer::compare).get());
        System.out.println(Arrays.asList(1,2,3).stream()
                .max(Integer::compare).get());
    }
}
