package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 11.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class RansomNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        Map<String,Integer> mag = new HashMap<String,Integer>();
        Map<String,Boolean> ran = new HashMap<String,Boolean>();

        for(String each : magazine){
            if(mag.get(each) != null){
                mag.put(each,mag.get(each)+1);
            }else{
                mag.put(each,1);
            }
        }

        for(String each : ransom){
            ran.put(each,false);
        }

        for(int i = 0 ; i < ransom.length; i++){
            if(mag.containsKey(ransom[i])){
                if(mag.get(ransom[i]) > 0){
                    ran.put(ransom[i],true);
                    mag.put(ransom[i],mag.get(ransom[i])-1);
                }else {
                    ran.put(ransom[i],false);
                }
            }
        }
        Boolean result = true;
        for(String each : ran.keySet()){
            if(!ran.get(each)){
                result = false;
            }
        }
        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
