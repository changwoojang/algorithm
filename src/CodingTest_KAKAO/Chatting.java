package CodingTest_KAKAO;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by changwooj111@gmail.com on 13/07/2019
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Chatting {
//    enum Action { Enter, Leave, Change}
    public static void main(String[] args){

        String[] s = {"Enter uid1234 Muzi","Enter uid4567 Prodo","Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

        ArrayList<String> result = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();

        for(int i =0; i< s.length; i++){

            String[] subString = s[i].split(" ");
            String action = "";
            String uid = "";
            String name = "";

            for(int j = 0 ; j < subString.length ; j++){
                if(j==0)
                    action = subString[j];
                else if (j==1)
                    uid = subString[j];
                else if (j==2)
                    name = subString[j];
            }

            switch (action){
                case "Enter" :
                    map.put(uid,name);
                    result.add(uid +"님이 들어왔습니다.");
                    break;
                case "Leave" :
                    result.add(uid + "님이 나갔습니다.");
                    break;
                case "Change" :
                    map.put(uid,name);
                    break;
                default:
                    break;
            }
        }
        ArrayList<String> result2 = new ArrayList<>();

        for(int i=0; i < result.size(); i++){
            for( String key : map.keySet()){
                if(result.get(i).contains(key)){
                    result2.add((result.get(i).replace(key,map.get(key))));
                }
            }
        }

        System.out.println(result2);
    }
}
