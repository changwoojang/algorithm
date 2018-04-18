package HackerRank;

import java.util.*;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 16.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Contacts {
    private static Map<String,Integer> contact_list = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<String> contact_list = new ArrayList<>();


        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")){
                add_contact(contact);
            }else if(op.equals("find")){
                System.out.println(find_contact(contact));
            }
        }
    }
    public static void add_contact(String contact){
        for(int i = 1 ; i <= contact.length(); i++){
            String temp = contact.substring(0,i);

            if(contact_list.containsKey(temp)){
                // System.out.println("contains");
                contact_list.put(temp,contact_list.get(temp)+1);
            }else{
                contact_list.put(temp,1);
            }
        }
    }

    public static int find_contact(String contact){
        int result = 0 ;
        if(contact_list.containsKey(contact)){
            result = contact_list.get(contact);
        }
        return result;
    }
}
