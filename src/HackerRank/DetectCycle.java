package HackerRank;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 12.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class DetectCycle {
    class Node {
        int data;
        Node next;
    }
    boolean hasCycle(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head.next;
        while (slow != fast) {
            if (fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
