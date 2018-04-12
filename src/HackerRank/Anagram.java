package HackerRank;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by changwooj111@gmail.com on 2018. 4. 10.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Anagram {

        public static int numberNeeded(String first, String second) {
            int[] temp = new int[26];

            for(char a : first.toCharArray()){
                temp[a-'a']++;
            }
            for(char a : second.toCharArray()){
                temp[a-'a']--;
            }
            int result =0 ;
            for(int i : temp){
                result += Math.abs(i);
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String a = in.next();
            String b = in.next();
            System.out.println(numberNeeded(a, b));
        }


}
