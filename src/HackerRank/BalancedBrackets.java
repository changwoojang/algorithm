package HackerRank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 13.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
        char[] temp = expression.toCharArray();

//        Stack<Character> result = new Stack<>();
        Deque<Character> result = new ArrayDeque<>();
        for(char each : temp){
            if(each == '(') result.push(')');
            else if(each == '{') result.push('}');
            else if(each == '[') result.push(']');
            else{
                if(each == result.peek() || result.isEmpty())
                    return false;
                result.pop();
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
