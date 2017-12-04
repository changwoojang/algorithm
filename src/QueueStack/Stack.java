package QueueStack;

import java.util.NoSuchElementException;

public class Stack{

    private int n;
    private Node first;


    private class Node{
        private int item;
        private Node next;
    }


    public Stack(){
        n=0;
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int pop(){
        if(isEmpty()) throw new NoSuchElementException("empty");
        int item = first.item;
        first = first.next;
        n--;
        return item;
    }

    public void push(int item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        n++;
        System.out.println("item : "+item);
    }

    public int peek (){
        if(isEmpty()) throw new NoSuchElementException("empty");
        return first.item;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
    }
}
