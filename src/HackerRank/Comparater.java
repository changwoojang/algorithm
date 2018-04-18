package HackerRank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 16.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Comparater {
    static class Player{
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }
    }
    static class Checker implements Comparator<Player> {
        @Override
        public int compare(Player a, Player b) {

            if(a.score != b.score) {
                return b.score - a.score;
            }
            return a.name.compareTo(b.name);
        }
    }
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            Player[] player = new Player[n];
            Checker checker = new Checker();

            for(int i = 0; i < n; i++){
                player[i] = new Player(scan.next(), scan.nextInt());
            }
            scan.close();

            Arrays.sort(player, checker);
            for(int i = 0; i < player.length; i++){
                System.out.printf("%s %s\n", player[i].name, player[i].score);
            }
    }
}
