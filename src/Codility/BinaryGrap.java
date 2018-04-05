package Codility;


/**
 * Created by changwooj111@gmail.com on 2018. 4. 5.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
import java.util.List;
import java.util.ArrayList;

public class BinaryGrap {

    public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        List<Integer> resultList = new ArrayList<>();
        int result = 0;
        boolean flag = false;

        // binaryGap 찾기
        for(int i=0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                if(flag){
                    flag = false;
                    resultList.add(result);
                    result = 0;
                }
                flag=true;
            }else{
                result ++;
            }

        }

        //제일 큰 binaryGap찾기
        int biggestResult = 0;
        for(int temp : resultList){
            if(biggestResult < temp)
            {
                biggestResult = temp;
            }
        }

        // 닫혀있지 않는 binaryGap이 있는지 확인하기
        if(flag && resultList.isEmpty()){
            return 0;
        }

        return biggestResult;
    }
}

