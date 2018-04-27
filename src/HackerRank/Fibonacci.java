package HackerRank;

import java.util.Scanner;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 23.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Fibonacci {
    public static int fibonacci(int n) {
        // Complete the function.
        if(n == 0 ){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
