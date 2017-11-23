package Java8;

public class Lambda {
    public static void main(String[] args){
        Thread thread = new Thread(()->{System.out.println("AAAA");});
        thread.start();

        Func test = (int a, int b) -> a + b;
        int aa = test.addFunc(1,3);
        System.out.println(aa);
    }
}
