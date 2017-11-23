package CodingList;

public class fibo {
    public static void main(String[] args){

        for(int i = 1; i < 9; i++){
            System.out.println(fib(i));

        }
    }
    public static int fib(int n){

        if (n <= 1){
            return n ;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }
}
