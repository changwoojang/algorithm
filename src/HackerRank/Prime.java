package HackerRank;

import java.util.Scanner;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 20.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int temp = 0 ;
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            int sqrt = (int)Math.sqrt(n);
            boolean check = true;
            if( n ==1 ) { System.out.println("Not prime");  }
            else{
                for (int i = 2 ; i <= sqrt; i++){
                    if(n%i ==0){
                        check = false;
                        break;
                    }
                }
                if(check){
                    System.out.println("Prime");
                }else{
                    System.out.println("Not prime");
                }
            }
        }
    }
}
