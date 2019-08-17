package CodingTest_KAKAO;

import java.util.*;

/**
 * Created by changwooj111@gmail.com on 16/07/2019
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Sorting2 {
    public static void main(String[] args){
        int[] s = {2,1,2,6,2,4,3,3};
        int[] s11 = {4,4,4,4};

        Sorting2 s2 = new Sorting2();
        s2.solution(s);
        s2.solution(s11);
    }
    public String[] solution(int[] input){

        Map<Integer,Integer> stages = new HashMap<>();
        Map<Integer,Double> stageFail = new HashMap<>();
        int userCount = input.length;

        for(int each : input){
            int count = stages.containsKey(each) ? stages.get(each) + 1 : 1;
            stages.put(each,count);
        }

        for(int i = 1; i <= input.length; i++){
            if(stages.containsKey(i)){
                int cnt = stages.get(i);
                stageFail.put(i,(double)cnt/userCount);
                userCount -= cnt;
            }else {

                stageFail.put(i,0.0);
                if(userCount == 1){
                    break;
                }
            }
        }
        System.out.println(stages);
        System.out.println(stageFail);

        List<Integer> rr = sortByValue(stageFail);
        int[] answer = new int[rr.size()];
        for (int i = 0; i < rr.size(); i++) {
            answer[i] = rr.get(i);
            System.out.println(answer[i]);
        }

        return null;
    }
    public static List<Integer> sortByValue(final Map<Integer,Double> map) {
        List<Integer> result = new ArrayList();
        result.addAll(map.keySet());
        Collections.sort(result, (Comparator) (o1, o2) -> {
            Object v1 = map.get(o1);
            Object v2 = map.get(o2);
            return ((Comparable) v2).compareTo(v1);
        });
        return result;
    }
}
