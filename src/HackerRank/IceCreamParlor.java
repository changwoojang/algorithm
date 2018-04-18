package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 18.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public interface IceCreamParlor {
    static void solve(int[] arr, int money) {
        // Complete this function
        HashMap<Integer,Integer> result = new HashMap<>();
        int temp =0 ;
        for(int i = 0 ; i < arr.length; i++){
            temp = money - arr[i];
            if(arr[i] < money){
                if(result.containsKey(temp)){
                    System.out.println(result.get(temp) + " " + (i+1));
                    break;
                }
                else{
                    result.put(arr[i],i+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int money = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            solve(arr, money);
        }
        in.close();
    }
}
