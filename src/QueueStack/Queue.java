package QueueStack;

import java.util.NoSuchElementException;

public class Queue {

    private int n;
    private Node first;
    private Node last;

    private class Node {
        private int item;
        private Node next;
    }

    public Queue() {
        n = 0;
        first = null;
        last = null;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Empty");
        int item = first.item;
        first = first.next;
        n--;

        if (isEmpty()) last = null;
        System.out.println("dequeue " + item);

        return item;
    }

    public void enqueue(int item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        n++;

        if (isEmpty()) first = last;
        else oldLast.next = last;

        System.out.println("enqueue " + item);
    }

    public int peek() {
        if (isEmpty()) throw new NoSuchElementException("empty");
        System.out.print("PEEK " + first.item);
        return first.item;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();

        queue.peek();

//        QueueStack.Queue queue = new QueueStack.Queue();
//        Scanner StdIn = new Scanner(System.in);
//        while (StdIn.) {
//            int item = StdIn.nextInt();
//            if (!item.equals("-")) queue.enqueue(item);
//            else if (!queue.isEmpty()) StdOut.print(queue.dequeue() + " ");
//        }
//
//        StdOut.println("(" + queue.size() + " left on queue)");


    }

}
